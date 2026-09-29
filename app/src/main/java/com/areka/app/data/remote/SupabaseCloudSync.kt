package com.areka.app.data.remote

import android.content.Context
import com.areka.app.BuildConfig
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
import java.net.HttpURLConnection
import java.net.URL

/** Cloud sync is best-effort; Room remains the source of truth for offline study. */
object SupabaseCloudSync {
    private const val PREFS = "areka_cloud_sync"
    private const val PENDING_ATTEMPTS = "pending_attempts"
    private var appContext: Context? = null

    private val _leaderboard = MutableStateFlow<List<LeaderboardEntry>>(emptyList())
    val leaderboard: StateFlow<List<LeaderboardEntry>> = _leaderboard.asStateFlow()

    fun initialize(context: Context) {
        if (appContext == null) appContext = context.applicationContext
    }

    suspend fun syncProfile(profile: UserProfile): Result<Unit> = withContext(Dispatchers.IO) {
        val auth = SupabaseAuth.state.value as? AuthState.SignedIn
            ?: return@withContext Result.failure(SyncException("Not authenticated"))
        try {
            val remote = request(
                "/rest/v1/profiles?id=eq.${auth.user.id}&select=total_points,streak_days",
                "GET",
                null
            )
            val current = if (remote is JSONArray && remote.length() > 0) remote.getJSONObject(0) else JSONObject()
            val body = JSONObject()
                .put("id", auth.user.id)
                .put("full_name", profile.name)
                .put("display_name", profile.name)
                .put("grade", profile.grade)
                // Conflict policy: server wins only when its monotonic stats are higher.
                .put("total_points", maxOf(profile.totalPoints, current.optInt("total_points", 0)))
                .put("streak_days", maxOf(profile.streakDays, current.optInt("streak_days", 0)))
                .put("avatar_color", JSONObject.NULL)
            request(
                "/rest/v1/profiles",
                "POST",
                body,
                prefer = "resolution=merge-duplicates,return=minimal"
            )
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(SyncException(e.message ?: "Profile sync failed", e))
        }
    }

    suspend fun pushQuizAttempt(
        quiz: Quiz,
        score: QuizScore,
        completedAtIso: String
    ): Result<Unit> = withContext(Dispatchers.IO) {
        val auth = SupabaseAuth.state.value as? AuthState.SignedIn
            ?: return@withContext Result.failure(SyncException("Not authenticated"))
        val body = JSONObject()
                .put("user_id", auth.user.id)
                .put("subject_id", quiz.subjectId ?: quiz.subject.lowercase())
                .put("unit_id", quiz.unitId ?: "unknown")
                .put("quiz_id", quiz.id)
                .put("score", score.percentage)
                .put("total_questions", score.totalQuestions)
                .put("points_earned", score.pointsEarned)
                .put("completed_at", completedAtIso)
        try {
            request(
                "/rest/v1/quiz_attempts",
                "POST",
                body,
                prefer = "return=minimal"
            )
            Result.success(Unit)
        } catch (e: Exception) {
            enqueueAttempt(body)
            Result.failure(SyncException(e.message ?: "Quiz attempt sync failed", e))
        }
    }

    suspend fun drainPendingAttempts() = withContext(Dispatchers.IO) {
        val auth = SupabaseAuth.state.value as? AuthState.SignedIn ?: return@withContext
        val prefs = appContext?.getSharedPreferences(PREFS, Context.MODE_PRIVATE) ?: return@withContext
        val pending = try { JSONArray(prefs.getString(PENDING_ATTEMPTS, "[]") ?: "[]") } catch (_: Exception) { JSONArray() }
        val remaining = JSONArray()
        for (index in 0 until pending.length()) {
            val body = pending.optJSONObject(index) ?: continue
            try {
                request("/rest/v1/quiz_attempts", "POST", body, prefer = "return=minimal")
            } catch (_: Exception) {
                remaining.put(body)
            }
        }
        prefs.edit().putString(PENDING_ATTEMPTS, remaining.toString()).apply()
    }

    suspend fun refreshLeaderboard(): Result<List<LeaderboardEntry>> = withContext(Dispatchers.IO) {
        val auth = SupabaseAuth.state.value as? AuthState.SignedIn
            ?: return@withContext Result.failure(SyncException("Not authenticated"))
        try {
            val rows = request(
                "/rest/v1/areka_leaderboard?select=id,display_name,grade,total_points,streak_days&order=total_points.desc&limit=50",
                "GET",
                null
            ) as JSONArray
            val entries = buildList {
                for (index in 0 until rows.length()) {
                    val row = rows.getJSONObject(index)
                    val id = row.optString("id")
                    add(
                        LeaderboardEntry(
                            id = id,
                            rank = index + 1,
                            name = row.optString("display_name").ifBlank { "Student" },
                            grade = row.optString("grade").ifBlank { "Grade 10" },
                            points = row.optInt("total_points", 0),
                            isCurrentUser = id == auth.user.id
                        )
                    )
                }
            }
            _leaderboard.value = entries
            Result.success(entries)
        } catch (e: Exception) {
            Result.failure(SyncException(e.message ?: "Leaderboard refresh failed", e))
        }
    }

    private fun request(
        path: String,
        method: String,
        body: JSONObject?,
        prefer: String? = null
    ): Any {
        val token = SupabaseAuth.currentAccessToken()
            ?: throw SyncException("Session expired")
        if (BuildConfig.SUPABASE_URL.isBlank() || BuildConfig.SUPABASE_ANON_KEY.isBlank()) {
            throw SyncException("Supabase is not configured")
        }
        val connection = (URL(BuildConfig.SUPABASE_URL.trimEnd('/') + path).openConnection() as HttpURLConnection).apply {
            requestMethod = method
            connectTimeout = 12_000
            readTimeout = 20_000
            doInput = true
            if (body != null) doOutput = true
            setRequestProperty("apikey", BuildConfig.SUPABASE_ANON_KEY)
            setRequestProperty("Authorization", "Bearer $token")
            setRequestProperty("Accept", "application/json")
            if (body != null) setRequestProperty("Content-Type", "application/json")
            if (prefer != null) setRequestProperty("Prefer", prefer)
        }
        return try {
            if (body != null) connection.outputStream.use { it.write(body.toString().toByteArray(Charsets.UTF_8)) }
            val code = connection.responseCode
            val stream = if (code in 200..299) connection.inputStream else connection.errorStream
            val text = stream?.bufferedReader()?.use { it.readText() }.orEmpty()
            if (code !in 200..299) throw SyncException("Supabase returned HTTP $code: $text")
            when {
                text.isBlank() -> JSONObject()
                text.trimStart().startsWith("[") -> JSONArray(text)
                else -> JSONObject(text)
            }
        } finally {
            connection.disconnect()
        }
    }

    private fun enqueueAttempt(body: JSONObject) {
        val prefs = appContext?.getSharedPreferences(PREFS, Context.MODE_PRIVATE) ?: return
        val pending = try { JSONArray(prefs.getString(PENDING_ATTEMPTS, "[]") ?: "[]") } catch (_: Exception) { JSONArray() }
        pending.put(body)
        prefs.edit().putString(PENDING_ATTEMPTS, pending.toString()).apply()
    }
}

class SyncException(message: String, cause: Throwable? = null) : IOException(message, cause)
