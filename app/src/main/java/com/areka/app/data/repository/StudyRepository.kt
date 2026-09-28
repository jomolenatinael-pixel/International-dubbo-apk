package com.areka.app.data.repository

import android.content.Context
import com.areka.app.data.local.AppDatabase
import com.areka.app.data.local.CardStatus
import com.areka.app.data.local.FlashcardProgressEntity
import com.areka.app.data.local.FlashcardScheduleEntity
import com.areka.app.data.local.RecentActivityEntity
import com.areka.app.data.local.ReviewGrade
import com.areka.app.data.local.UserProfileEntity
import com.areka.app.data.model.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch
import java.time.LocalDate

object StudyRepository {

    private val repositoryScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private var database: AppDatabase? = null

    private val _isDarkTheme = MutableStateFlow(true)
    val isDarkTheme: StateFlow<Boolean> = _isDarkTheme.asStateFlow()

    private val _userProfile = MutableStateFlow(
        UserProfile(
            name = "Student",
            grade = "Grade 10",
            streakDays = 1,
            totalQuizzes = 0,
            averageScore = 0,
            timeStudiedHours = 0,
            globalRank = 10,
            totalPoints = 0
        )
    )
    val userProfile: StateFlow<UserProfile> = _userProfile.asStateFlow()

    fun initialize(context: Context) {
        if (database != null) return
        val db = AppDatabase.getInstance(context)
        database = db

        repositoryScope.launch {
            // Seed default profile if empty
            val existingProfile = db.userProfileDao().getUserProfileOnce()
            if (existingProfile == null) {
                db.userProfileDao().insertOrUpdate(UserProfileEntity.default())
            }

            // Observe UserProfile changes
            launch {
                db.userProfileDao().getUserProfile().collectLatest { entity ->
                    if (entity != null) {
                        _userProfile.value = entity.toUserProfile()
                        _isDarkTheme.value = entity.isDarkTheme
                    }
                }
            }

            // Observe RecentActivity changes
            launch {
                db.recentActivityDao().getRecentActivities().collectLatest { entities ->
                    _recentActivities.value = entities.map { it.toRecentActivity() }
                }
            }
        }
    }

    val streakBadges = listOf(
        DailyStreakBadge(7, "7 Days Star", 0xFF00D2FF, true),
        DailyStreakBadge(14, "14 Days Shield", 0xFFF59E0B, true),
        DailyStreakBadge(30, "30 Days Ribbon", 0xFF8B5CF6, true),
        DailyStreakBadge(60, "Master Badge", 0xFF10B981, false),
        DailyStreakBadge(100, "Century Crown", 0xFFEC4899, false)
    )

    val subjects: List<SubjectItem> = CurriculumData.subjects
    val units: List<SubjectUnit> = CurriculumData.units
    val allFlashcards: List<Flashcard> = CurriculumData.flashcards

    fun getUnitsForSubject(subjectId: String): List<SubjectUnit> = CurriculumData.getUnitsForSubject(subjectId)
    fun getFlashcardsForUnit(unitId: String): List<Flashcard> = CurriculumData.getFlashcardsForUnit(unitId)
    fun getQuizForUnit(unitId: String): Quiz = CurriculumData.getQuizForUnit(unitId)

    val allQuizzes: List<Quiz> by lazy {
        CurriculumData.units.map { CurriculumData.getQuizForUnit(it.id) }
    }

    private val _recentActivities = MutableStateFlow<List<RecentActivity>>(emptyList())
    val recentActivities: StateFlow<List<RecentActivity>> = _recentActivities.asStateFlow()

    private val baseGlobalLeaderboard = listOf(
        LeaderboardEntry("u1", 1, "Alex Chen", "Grade 10", 94800, false, BadgeType.GOLD, 0xFF3B82F6),
        LeaderboardEntry("u2", 2, "Sarah Johnson", "Grade 10", 91200, false, BadgeType.SILVER, 0xFFEC4899),
        LeaderboardEntry("u3", 3, "Fatima Khan", "Grade 10", 88900, false, BadgeType.BRONZE, 0xFF8B5CF6),
        LeaderboardEntry("u4", 4, "John Doe", "Grade 10", 86200, false, BadgeType.REGULAR, 0xFF10B981),
        LeaderboardEntry("u5", 5, "John Doe Jr", "Grade 10", 84500, false, BadgeType.REGULAR, 0xFFF59E0B),
        LeaderboardEntry("u6", 6, "Tanya Ross", "Grade 10", 83000, false, BadgeType.REGULAR, 0xFF00D2FF),
        LeaderboardEntry("u7", 7, "Soph Ehen", "Grade 10", 81500, false, BadgeType.REGULAR, 0xFF6366F1),
        LeaderboardEntry("u8", 8, "Marcus Wright", "Grade 10", 79200, false, BadgeType.REGULAR, 0xFF14B8A6),
        LeaderboardEntry("u9", 9, "Emma Wilson", "Grade 10", 78100, false, BadgeType.REGULAR, 0xFFF43F5E),
        LeaderboardEntry("u10", 10, "Liam Davis", "Grade 10", 76400, false, BadgeType.REGULAR, 0xFF84CC16),
        LeaderboardEntry("u_user", 11, "Student", "Grade 10", 0, true, BadgeType.REGULAR, 0xFF00D2FF)
    )

    fun updateProfile(name: String, grade: String) {
        val trimmedName = name.trim().ifBlank { _userProfile.value.name }
        val trimmedGrade = grade.trim().ifBlank { _userProfile.value.grade }

        val current = _userProfile.value
        _userProfile.value = current.copy(name = trimmedName, grade = trimmedGrade)

        repositoryScope.launch {
            val db = database
            if (db != null) {
                db.userProfileDao().updateNameAndGrade(trimmedName, trimmedGrade)
            }
        }
    }

    fun toggleTheme() {
        val newTheme = !_isDarkTheme.value
        _isDarkTheme.value = newTheme
        repositoryScope.launch {
            val db = database
            if (db != null) {
                db.userProfileDao().updateTheme(newTheme)
            }
        }
    }

    val globalLeaderboard: List<LeaderboardEntry>
        get() = getGlobalLeaderboard(_userProfile.value)

    val classALeaderboard: List<LeaderboardEntry>
        get() = getClassALeaderboard(_userProfile.value)

    val userRankSublist: List<LeaderboardEntry>
        get() = getUserRankSublist(_userProfile.value)

    fun getGlobalLeaderboard(userProfile: UserProfile): List<LeaderboardEntry> {
        val updated = baseGlobalLeaderboard.map { entry ->
            if (entry.isCurrentUser) {
                entry.copy(
                    name = userProfile.name,
                    grade = userProfile.grade,
                    points = userProfile.totalPoints
                )
            } else {
                entry
            }
        }.sortedByDescending { it.points }

        return updated.mapIndexed { index, entry ->
            val rank = index + 1
            val badge = when (rank) {
                1 -> BadgeType.GOLD
                2 -> BadgeType.SILVER
                3 -> BadgeType.BRONZE
                else -> BadgeType.REGULAR
            }
            entry.copy(rank = rank, badgeType = badge)
        }
    }

    fun getGlobalLeaderboard(userPoints: Int): List<LeaderboardEntry> {
        return getGlobalLeaderboard(_userProfile.value.copy(totalPoints = userPoints))
    }

    fun getClassALeaderboard(userProfile: UserProfile): List<LeaderboardEntry> {
        val baseClassA = listOf(
            LeaderboardEntry("u2", 1, userProfile.name, "Class A", userProfile.totalPoints, true, BadgeType.GOLD, 0xFF00D2FF),
            LeaderboardEntry("u3", 2, "Fatima Khan", "Class A", 88900, false, BadgeType.SILVER, 0xFF8B5CF6),
            LeaderboardEntry("u4", 3, "John Doe", "Class A", 86200, false, BadgeType.BRONZE, 0xFF10B981),
            LeaderboardEntry("u7", 4, "Soph Ehen", "Class A", 81500, false, BadgeType.REGULAR, 0xFF6366F1),
            LeaderboardEntry("u8", 5, "Marcus Wright", "Class A", 79200, false, BadgeType.REGULAR, 0xFF14B8A6)
        )
        return baseClassA.sortedByDescending { it.points }.mapIndexed { index, entry ->
            val rank = index + 1
            val badge = when (rank) {
                1 -> BadgeType.GOLD
                2 -> BadgeType.SILVER
                3 -> BadgeType.BRONZE
                else -> BadgeType.REGULAR
            }
            entry.copy(rank = rank, badgeType = badge)
        }
    }

    fun getClassALeaderboard(userPoints: Int): List<LeaderboardEntry> {
        return getClassALeaderboard(_userProfile.value.copy(totalPoints = userPoints))
    }

    fun getUserRankSublist(userProfile: UserProfile): List<LeaderboardEntry> {
        return getGlobalLeaderboard(userProfile).take(3)
    }

    fun getUserRankSublist(userPoints: Int): List<LeaderboardEntry> {
        return getUserRankSublist(_userProfile.value.copy(totalPoints = userPoints))
    }

    val userAchievements = listOf(
        Achievement("ach1", "Quiz Master", "Complete 100+ quizzes across all STEM subjects", "trophy", true),
        Achievement("ach2", "Perfect Score", "Attain 100% accuracy on 10 consecutive tests", "star", true),
        Achievement("ach3", "Biology Expert", "Master all Grade 10 cellular biology units", "leaf", true),
        Achievement("ach4", "Speed Demon", "Finish a timed quiz in under 3 minutes with >90% score", "lightning", true),
        Achievement("ach5", "Streak Champion", "Maintain an unbroken daily streak of 60 days", "flame", false)
    )

    fun recordQuizResult(quizTitle: String, scorePercent: Int, correct: Int, total: Int) {
        val current = _userProfile.value
        val todayEpochDay = try {
            LocalDate.now().toEpochDay()
        } catch (e: Exception) {
            System.currentTimeMillis() / (1000 * 60 * 60 * 24)
        }

        val newTotal = current.totalQuizzes + 1
        val newAvg = if (newTotal > 0) {
            ((current.averageScore * current.totalQuizzes) + scorePercent) / newTotal
        } else {
            scorePercent
        }
        val pointsToAdd = scorePercent * 10
        val updatedTotalPoints = current.totalPoints + pointsToAdd
        val updatedRank = if (updatedTotalPoints >= 94800) 1 else 2
        val newStudyHours = current.timeStudiedHours + (if (newTotal % 4 == 0) 1 else 0)

        // Streak calculation
        val currentStreak = current.streakDays
        val updatedStreak = currentStreak + (if (scorePercent >= 60) 1 else 0)

        val updatedProfile = current.copy(
            totalQuizzes = newTotal,
            averageScore = newAvg,
            totalPoints = updatedTotalPoints,
            globalRank = updatedRank,
            timeStudiedHours = newStudyHours,
            streakDays = updatedStreak
        )
        _userProfile.value = updatedProfile

        // Prepend new activity item so dashboard and profile stay up to date
        val iconType = when {
            quizTitle.contains("Math", ignoreCase = true) || quizTitle.contains("Algebra", ignoreCase = true) -> "math"
            quizTitle.contains("Bio", ignoreCase = true) -> "biology"
            quizTitle.contains("Phys", ignoreCase = true) -> "physics"
            else -> "chemistry"
        }
        val newActivity = RecentActivity(
            id = "act_${System.currentTimeMillis()}",
            title = "Completed Quiz",
            subtitle = "$quizTitle - $scorePercent%",
            progressPercent = scorePercent,
            isCompleted = true,
            iconType = iconType
        )
        val currentActivities = _recentActivities.value
        _recentActivities.value = listOf(newActivity) + currentActivities.take(19)

        // Persist to Room SQLite database
        repositoryScope.launch {
            val db = database ?: return@launch
            val existingEntity = db.userProfileDao().getUserProfileOnce() ?: UserProfileEntity.default()
            val lastActive = existingEntity.lastActiveDateEpochDay

            // Consecutive day logic:
            val calculatedStreak = when {
                lastActive == 0L -> existingEntity.streakDays + 1
                lastActive == todayEpochDay -> existingEntity.streakDays // Already counted for today
                lastActive == todayEpochDay - 1L -> existingEntity.streakDays + 1 // Consecutive day!
                else -> 1 // Streak broken
            }

            val entityToSave = existingEntity.copy(
                streakDays = calculatedStreak,
                totalQuizzes = newTotal,
                averageScore = newAvg,
                totalPoints = updatedTotalPoints,
                globalRank = updatedRank,
                timeStudiedHours = newStudyHours,
                lastActiveDateEpochDay = todayEpochDay
            )
            db.userProfileDao().insertOrUpdate(entityToSave)

            val activityEntity = RecentActivityEntity(
                id = newActivity.id,
                title = newActivity.title,
                subtitle = newActivity.subtitle,
                progressPercent = newActivity.progressPercent,
                isCompleted = newActivity.isCompleted,
                iconType = newActivity.iconType,
                timestamp = System.currentTimeMillis()
            )
            db.recentActivityDao().insert(activityEntity)
        }
    }

    fun getFlashcardProgressForUnit(unitId: String): Flow<List<FlashcardProgressEntity>> {
        val db = database
        return db?.flashcardProgressDao()?.getProgressForUnit(unitId) ?: flowOf(emptyList())
    }

    fun setFlashcardStatus(cardId: String, unitId: String, isKnown: Boolean) {
        repositoryScope.launch {
            val db = database ?: return@launch
            db.flashcardProgressDao().setCardProgress(
                FlashcardProgressEntity(
                    cardId = cardId,
                    unitId = unitId,
                    isKnown = isKnown,
                    updatedAt = System.currentTimeMillis()
                )
            )
        }
    }

    fun getSchedulesForUnit(unitId: String): Flow<List<FlashcardScheduleEntity>> {
        val db = database
        return db?.flashcardScheduleDao()?.getSchedulesForUnit(unitId) ?: flowOf(emptyList())
    }

    suspend fun ensureSchedulesForUnit(unitId: String): List<FlashcardScheduleEntity> {
        val db = database ?: return emptyList()
        val cards = CurriculumData.getFlashcardsForUnit(unitId)
        val existing = db.flashcardScheduleDao().getSchedulesForUnitOnce(unitId)
        val existingCardIds = existing.map { it.cardId }.toSet()
        val now = System.currentTimeMillis()

        val missing = cards.filter { it.id !in existingCardIds }
        if (missing.isNotEmpty()) {
            val newSchedules = missing.map { card ->
                FlashcardScheduleEntity(
                    cardId = card.id,
                    subjectId = card.subjectId,
                    unitId = card.unitId,
                    status = CardStatus.NEW.name,
                    dueAtEpochMillis = now,
                    intervalDays = 0f,
                    ease = 2.5f,
                    repetitions = 0,
                    lapses = 0,
                    learningStepIndex = 0,
                    lastReviewedAtEpochMillis = null,
                    updatedAtEpochMillis = now
                )
            }
            db.flashcardScheduleDao().insertAll(newSchedules)
            return db.flashcardScheduleDao().getSchedulesForUnitOnce(unitId)
        }
        return existing
    }

    fun answerCard(cardId: String, grade: ReviewGrade, onAnswered: (() -> Unit)? = null) {
        repositoryScope.launch {
            val db = database ?: return@launch
            val schedule = db.flashcardScheduleDao().getScheduleForCard(cardId) ?: return@launch
            val (updatedSchedule, log) = FlashcardScheduler.gradeCard(schedule, grade)
            db.flashcardScheduleDao().insertOrUpdate(updatedSchedule)
            db.flashcardScheduleDao().insertReviewLog(log)
            onAnswered?.invoke()
        }
    }

    fun resetUnitSchedules(unitId: String) {
        repositoryScope.launch {
            val db = database ?: return@launch
            db.flashcardScheduleDao().deleteSchedulesForUnit(unitId)
            ensureSchedulesForUnit(unitId)
        }
    }
}
