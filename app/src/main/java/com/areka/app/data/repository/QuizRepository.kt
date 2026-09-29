package com.areka.app.data.repository

import com.areka.app.data.local.AppDatabase
import com.areka.app.data.local.MistakeEntity
import com.areka.app.data.local.QuizAttemptEntity
import com.areka.app.data.local.RecentActivityEntity
import com.areka.app.data.local.UserProfileEntity
import com.areka.app.data.model.Quiz
import com.areka.app.data.model.QuizScore
import com.areka.app.data.model.RecentActivity
import com.areka.app.data.model.UnitProgress
import com.areka.app.data.model.UserProfile
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.time.LocalDate

class QuizRepository(
    private val databaseProvider: () -> AppDatabase?,
    private val leaderboardRepository: LeaderboardRepository = LeaderboardRepository(),
    private val scope: CoroutineScope = CoroutineScope(Dispatchers.IO)
) {
    private val _recentActivities = MutableStateFlow<List<RecentActivity>>(emptyList())
    val recentActivities: StateFlow<List<RecentActivity>> = _recentActivities.asStateFlow()

    fun updateActivities(list: List<RecentActivity>) {
        _recentActivities.value = list
    }

    fun getQuizForUnit(unitId: String): Quiz = CurriculumData.getQuizForUnit(unitId)

    fun getAllQuizzes(): List<Quiz> = CurriculumData.getAllCurriculumQuizzes()

    suspend fun getUnitProgress(unitId: String): UnitProgress {
        val db = databaseProvider() ?: return UnitProgress(unitId, 0, 0, 0, 0, null)
        val attempts = db.studyDao().getAttemptsForUnit(unitId)
        val schedules = db.flashcardScheduleDao().getSchedulesForUnitOnce(unitId)
        val reviewed = schedules.count { it.repetitions > 0 || it.lastReviewedAtEpochMillis != null }
        val accuracy = if (attempts.isEmpty()) 0 else
            ((attempts.sumOf { it.correctAnswers }.toFloat() / attempts.sumOf { it.totalQuestions }.coerceAtLeast(1)) * 100).toInt()
        val mastery = ((accuracy * 0.7f) + (reviewed.coerceAtMost(10) / 10f * 30f)).toInt().coerceIn(0, 100)
        return UnitProgress(
            unitId = unitId,
            quizAttempts = attempts.size,
            quizAccuracyPercent = accuracy,
            flashcardsReviewed = reviewed,
            masteryPercent = mastery,
            lastStudiedAtEpochMillis = attempts.maxOfOrNull { it.completedAtEpochMillis }
        )
    }

    fun recordQuizResult(
        quiz: Quiz,
        score: QuizScore,
        timeSpentSeconds: Int = 0,
        mistakes: List<MistakeEntity> = emptyList(),
        onRecorded: ((UserProfile) -> Unit)? = null
    ) {
        val now = System.currentTimeMillis()
        val activity = RecentActivity(
            id = "act_$now",
            title = "Completed Quiz",
            subtitle = "${quiz.title} - ${score.percentage}%",
            progressPercent = score.percentage,
            isCompleted = true,
            iconType = quiz.iconName
        )
        _recentActivities.value = listOf(activity) + _recentActivities.value.take(19)

        scope.launch {
            val db = databaseProvider() ?: return@launch
            val existing = db.userProfileDao().getUserProfileOnce() ?: UserProfileEntity.default()
            val attempt = QuizAttemptEntity(
                id = "attempt_${quiz.id}_$now",
                quizId = quiz.id,
                quizTitle = quiz.title,
                subjectId = quiz.subjectId ?: "",
                unitId = quiz.unitId ?: "",
                scorePercent = score.percentage,
                correctAnswers = score.correctAnswers,
                totalQuestions = score.totalQuestions,
                timeSpentSeconds = timeSpentSeconds.coerceAtLeast(0),
                completedAtEpochMillis = now
            )
            db.studyDao().insertAttempt(attempt)
            if (mistakes.isNotEmpty()) {
                db.studyDao().insertMistakes(mistakes)
            }

            val today = try { LocalDate.now().toEpochDay() } catch (_: Exception) { now / 86_400_000L }
            val lastActive = existing.lastActiveDateEpochDay
            val streak = StudyStreakCalculator.nextStreak(existing.streakDays, lastActive, today)
            val attempts = db.studyDao().getAttemptCount()
            val points = existing.totalPoints + score.pointsEarned
            val profileWithUpdatedStats = existing.copy(
                totalQuizzes = attempts,
                averageScore = db.studyDao().getAverageScore(),
                timeStudiedHours = (db.studyDao().getStudyTimeSeconds() / 3600L).toInt(),
                totalPoints = points,
                streakDays = streak,
                lastActiveDateEpochDay = today
            )
            val computedRank = leaderboardRepository
                .global(profileWithUpdatedStats.toUserProfile())
                .firstOrNull { it.isCurrentUser }
                ?.rank
                ?: profileWithUpdatedStats.globalRank
            val saved = profileWithUpdatedStats.copy(globalRank = computedRank)
            db.userProfileDao().insertOrUpdate(saved)
            db.recentActivityDao().insert(
                RecentActivityEntity(
                    id = activity.id,
                    title = activity.title,
                    subtitle = activity.subtitle,
                    progressPercent = activity.progressPercent,
                    isCompleted = true,
                    iconType = activity.iconType,
                    timestamp = now
                )
            )
            onRecorded?.invoke(saved.toUserProfile())
        }
    }
}
