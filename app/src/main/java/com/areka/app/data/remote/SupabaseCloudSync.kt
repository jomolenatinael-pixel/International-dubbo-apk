package com.areka.app.data.remote

import android.content.Context
import com.areka.app.data.model.LeaderboardEntry
import com.areka.app.data.model.Quiz
import com.areka.app.data.model.QuizScore
import com.areka.app.data.model.UserProfile
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException
import java.util.UUID

/** Cloud sync is best-effort and idempotent; Room remains the source of truth for offline study. */
object SupabaseCloudSync {
    private const val PREFS = "areka_cloud_sync"
    private const val PENDING_ATTEMPTS = "pending_attempts"
    private var appContext: Context? = null

    private val _leaderboard = MutableStateFlow<List<LeaderboardEntry>>(emptyList())
    val leaderboard: StateFlow<List<LeaderboardEntry>> = _leaderboard.asStateFlow()

    fun initialize(context: Context) {
        if (appContext == null) appContext = context.applicationContext
    }

    suspend fun syncAdminFlag(): Result<Boolean> = withContext(Dispatchers.IO) {
        if (SupabaseAuth.state.value !is AuthState.SignedIn) {
            return@withContext Result.failure(SyncException("Not authenticated"))
        }
        try {
            val result = SupabaseAuth.authenticatedRequest("/rest/v1/rpc/sync_current_user_admin", "POST", JSONObject())
            val rows = result as? JSONArray ?: throw SyncException("Admin sync returned an invalid response")
            val isAdmin = rows.optJSONObject(0)?.optBoolean("is_admin", false) == true
            SupabaseAuth.setServerAdminFlag(isAdmin)
            Result.success(isAdmin)
        } catch (e: Exception) {
            Result.failure(SyncException("Admin sync failed", e))
        }
    }

    suspend fun syncProfile(profile: UserProfile): Result<Unit> = withContext(Dispatchers.IO) {
        val auth = SupabaseAuth.state.value as? AuthState.SignedIn
            ?: return@withContext Result.failure(SyncException("Not authenticated"))
        try {
            val remote = SupabaseAuth.authenticatedRequest(
                "/rest/v1/profiles?id=eq.${auth.user.id}&select=total_points,streak_days",
                "GET"
            )
            val current = if (remote is JSONArray && remote.length() > 0) remote.getJSONObject(0) else JSONObject()
            val body = JSONObject()
                .put("id", auth.user.id)
                .put("email", auth.user.email)
                .put("full_name", profile.name)
                .put("display_name", profile.name)
                .put("grade", profile.grade)
                .put("is_admin", auth.user.isAdmin)
                .put("total_points", maxOf(profile.totalPoints, current.optInt("total_points", 0)))
                .put("streak_days", maxOf(profile.streakDays, current.optInt("streak_days", 0)))
            SupabaseAuth.authenticatedRequest(
                "/rest/v1/profiles",
                "POST",
                body,
                prefer = "resolution=merge-duplicates,return=minimal"
            )
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(SyncException("Profile sync failed", e))
        }
    }

    /**
     * Idempotent push of a quiz attempt.
     * Uses a stable UUID derived deterministically from the user and attempt identities.
     * Guaranteed not to create duplicate rows on retries or network drops.
     */
    suspend fun pushQuizAttempt(
        quiz: Quiz,
        score: QuizScore,
        completedAtIso: String,
        localAttemptId: String? = null
    ): Result<Unit> = withContext(Dispatchers.IO) {
        val auth = SupabaseAuth.state.value as? AuthState.SignedIn
            ?: return@withContext Result.failure(SyncException("Not authenticated"))

        val seed = "${auth.user.id}_${localAttemptId ?: "${quiz.id}_$completedAtIso"}"
        val attemptUuid = UUID.nameUUIDFromBytes(seed.toByteArray(Charsets.UTF_8)).toString()

        val body = JSONObject()
            .put("id", attemptUuid)
            .put("user_id", auth.user.id)
            .put("subject_id", quiz.subjectId ?: quiz.subject.lowercase())
            .put("unit_id", quiz.unitId ?: "unknown")
            .put("quiz_id", quiz.id)
            .put("score", score.percentage)
            .put("total_questions", score.totalQuestions)
            .put("points_earned", score.pointsEarned)
            .put("completed_at", completedAtIso)
        try {
            SupabaseAuth.authenticatedRequest(
                path = "/rest/v1/quiz_attempts",
                method = "POST",
                body = body,
                prefer = "resolution=merge-duplicates,return=minimal"
            )
            Result.success(Unit)
        } catch (e: Exception) {
            enqueueAttempt(body)
            Result.failure(SyncException("Quiz attempt sync failed", e))
        }
    }

    /**
     * Drains queued offline quiz attempts idempotently.
     * Only deletes an attempt after successful server acknowledgement.
     * Strictly verifies that attempts belong to the currently authenticated user.
     */
    suspend fun drainPendingAttempts() = withContext(Dispatchers.IO) {
        val auth = SupabaseAuth.state.value as? AuthState.SignedIn ?: return@withContext
        val prefs = appContext?.getSharedPreferences(PREFS, Context.MODE_PRIVATE) ?: return@withContext
        val pending = try { JSONArray(prefs.getString(PENDING_ATTEMPTS, "[]") ?: "[]") } catch (_: Exception) { JSONArray() }
        val remaining = JSONArray()
        for (index in 0 until pending.length()) {
            val body = pending.optJSONObject(index) ?: continue
            val attemptUserId = body.optString("user_id")
            if (attemptUserId != auth.user.id) {
                // Do not attempt to sync another user's attempt; retain for proper owner
                remaining.put(body)
                continue
            }
            try {
                SupabaseAuth.authenticatedRequest(
                    path = "/rest/v1/quiz_attempts",
                    method = "POST",
                    body = body,
                    prefer = "resolution=merge-duplicates,return=minimal"
                )
                // Successfully acknowledged by server -> safely removed from queue
            } catch (_: Exception) {
                // Failed -> retain for future retry
                remaining.put(body)
            }
        }
        prefs.edit().putString(PENDING_ATTEMPTS, remaining.toString()).apply()
    }

    suspend fun refreshLeaderboard(): Result<List<LeaderboardEntry>> = withContext(Dispatchers.IO) {
        val auth = SupabaseAuth.state.value as? AuthState.SignedIn
            ?: return@withContext Result.failure(SyncException("Not authenticated"))
        try {
            val rows = SupabaseAuth.authenticatedRequest(
                "/rest/v1/areka_leaderboard?select=id,display_name,grade,total_points,streak_days&order=total_points.desc&limit=50",
                "GET"
            ) as JSONArray
            val entries = buildList {
                for (index in 0 until rows.length()) {
                    val row = rows.getJSONObject(index)
                    val id = row.optString("id")
                    add(LeaderboardEntry(
                        id = id,
                        rank = index + 1,
                        name = row.optString("display_name").ifBlank { "Student" },
                        grade = row.optString("grade").ifBlank { "Grade 10" },
                        points = row.optInt("total_points", 0),
                        isCurrentUser = id == auth.user.id
                    ))
                }
            }
            _leaderboard.value = entries
            Result.success(entries)
        } catch (e: Exception) {
            Result.failure(SyncException("Leaderboard refresh failed", e))
        }
    }

    private fun enqueueAttempt(body: JSONObject) {
        val prefs = appContext?.getSharedPreferences(PREFS, Context.MODE_PRIVATE) ?: return
        val pending = try { JSONArray(prefs.getString(PENDING_ATTEMPTS, "[]") ?: "[]") } catch (_: Exception) { JSONArray() }
        
        // Prevent duplicate queuing of the exact same attempt id
        val idToQueue = body.optString("id")
        for (i in 0 until pending.length()) {
            if (pending.optJSONObject(i)?.optString("id") == idToQueue) {
                return
            }
        }

        pending.put(body)
        prefs.edit().putString(PENDING_ATTEMPTS, pending.toString()).apply()
    }
}

class SyncException(message: String, cause: Throwable? = null) : IOException(message, cause)
