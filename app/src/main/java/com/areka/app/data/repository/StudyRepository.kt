package com.areka.app.data.repository

import android.content.Context
import com.areka.app.data.local.AppDatabase
import com.areka.app.data.local.FlashcardProgressEntity
import com.areka.app.data.local.FlashcardScheduleEntity
import com.areka.app.data.local.MistakeEntity
import com.areka.app.data.local.ReviewGrade
import com.areka.app.data.local.ownerIdFlow
import com.areka.app.data.model.*
import com.areka.app.data.remote.SupabaseAuth
import com.areka.app.data.remote.SupabaseCloudSync
import com.areka.app.data.remote.SupabaseQuestionSync
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.launch

/**
 * Backwards-compatible facade coordinating domain repositories:
 * - ProfileRepository
 * - QuizRepository
 * - FlashcardRepository
 * - MistakeRepository
 * - LeaderboardRepository
 */
object StudyRepository {

    private val repositoryScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private var database: AppDatabase? = null

    val leaderboardRepository = LeaderboardRepository(LocalMockLeaderboardDataSource())
    val profileRepository = ProfileRepository({ database?.userProfileDao() }, repositoryScope)
    val mistakeRepository = MistakeRepository({ database?.studyDao() }, repositoryScope)
    val flashcardRepository = FlashcardRepository(
        scheduleDao = { database?.flashcardScheduleDao() },
        progressDao = { database?.flashcardProgressDao() },
        scope = repositoryScope
    )
    val quizRepository = QuizRepository(
        databaseProvider = { database },
        leaderboardRepository = leaderboardRepository,
        scope = repositoryScope
    )

    val isDarkTheme: StateFlow<Boolean> get() = profileRepository.isDarkTheme
    val userProfile: StateFlow<UserProfile> get() = profileRepository.userProfile
    val dueFlashcardsCount: StateFlow<Int> get() = flashcardRepository.dueFlashcardsCount
    val openMistakes: StateFlow<List<MistakeEntity>> get() = mistakeRepository.openMistakes
    val recentActivities: StateFlow<List<RecentActivity>> get() = quizRepository.recentActivities

    @OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
    fun initialize(context: Context) {
        if (database != null) return
        val db = AppDatabase.getInstance(context)
        database = db
        SupabaseAuth.initialize(context.applicationContext)
        SupabaseCloudSync.initialize(context.applicationContext)
        SupabaseQuestionSync.loadCachedQuizzesIntoCurriculum(context.applicationContext)

        // Attach DAOs to focused repositories
        profileRepository.attachDao(db.userProfileDao())
        mistakeRepository.attachDao(db.studyDao())
        flashcardRepository.attachDao(db.flashcardScheduleDao())

        repositoryScope.launch {
            // Background remote sync
            SupabaseQuestionSync.sync(context.applicationContext)

            // Forward recent activities into QuizRepository
            launch {
                ownerIdFlow().flatMapLatest { owner -> db.recentActivityDao().getRecentActivities(owner) }.collectLatest { entities ->
                    quizRepository.updateActivities(entities.map { it.toRecentActivity() })
                }
            }
        }
    }

    fun getStreakBadges(streakDays: Int): List<DailyStreakBadge> = listOf(
        DailyStreakBadge(7, "7 Days Star", 0xFF00D2FF, streakDays >= 7),
        DailyStreakBadge(14, "14 Days Shield", 0xFFF59E0B, streakDays >= 14),
        DailyStreakBadge(30, "30 Days Ribbon", 0xFF8B5CF6, streakDays >= 30),
        DailyStreakBadge(60, "Master Badge", 0xFF10B981, streakDays >= 60),
        DailyStreakBadge(100, "Century Crown", 0xFFEC4899, streakDays >= 100)
    )

    val streakBadges: List<DailyStreakBadge>
        get() = getStreakBadges(userProfile.value.streakDays)

    val subjects: List<SubjectItem> = CurriculumData.subjects
    val units: List<SubjectUnit> = CurriculumData.units
    val allFlashcards: List<Flashcard> = CurriculumData.flashcards

    fun getUnitsForSubject(subjectId: String): List<SubjectUnit> = CurriculumData.getUnitsForSubject(subjectId)
    fun getFlashcardsForUnit(unitId: String): List<Flashcard> = CurriculumData.getFlashcardsForUnit(unitId)
    fun getQuizForUnit(unitId: String): Quiz = quizRepository.getQuizForUnit(unitId)

    // Hand-authored sample quizzes kept for demos and featured displays
    val mathRelationsQuiz = CurriculumData.getQuizForUnit("math_u1")
    val algebraReviewQuiz: Quiz = mathRelationsQuiz
    val chemistryStoichiometryQuiz = CurriculumData.getQuizForUnit("chem_u1")
    val biologyPlantsQuiz = CurriculumData.getQuizForUnit("bio_u2")

    val sampleQuizzes: List<Quiz> = listOf(mathRelationsQuiz, chemistryStoichiometryQuiz, biologyPlantsQuiz)

    /**
     * Resolves all available curriculum quizzes across all 9 Grade 10 subjects.
     */
    val allQuizzes: List<Quiz>
        get() = quizRepository.getAllQuizzes()

    fun updateProfile(name: String, grade: String) {
        profileRepository.updateProfile(name, grade)
    }

    fun toggleTheme() {
        profileRepository.toggleTheme()
    }

    val globalLeaderboard: List<LeaderboardEntry>
        get() = getGlobalLeaderboard(userProfile.value)

    val classALeaderboard: List<LeaderboardEntry>
        get() = getClassALeaderboard(userProfile.value)

    val userRankSublist: List<LeaderboardEntry>
        get() = getUserRankSublist(userProfile.value)

    fun getGlobalLeaderboard(userProfile: UserProfile): List<LeaderboardEntry> =
        leaderboardRepository.global(userProfile)

    fun getGlobalLeaderboard(userPoints: Int): List<LeaderboardEntry> =
        getGlobalLeaderboard(userProfile.value.copy(totalPoints = userPoints))

    fun getClassALeaderboard(userProfile: UserProfile): List<LeaderboardEntry> =
        leaderboardRepository.classA(userProfile)

    fun getClassALeaderboard(userPoints: Int): List<LeaderboardEntry> =
        getClassALeaderboard(userProfile.value.copy(totalPoints = userPoints))

    fun getUserRankSublist(userProfile: UserProfile): List<LeaderboardEntry> =
        leaderboardRepository.userRank(userProfile)

    fun getUserRankSublist(userPoints: Int): List<LeaderboardEntry> =
        getUserRankSublist(userProfile.value.copy(totalPoints = userPoints))

    fun getUserAchievements(profile: UserProfile): List<Achievement> =
        AchievementCalculator.calculate(profile)

    val userAchievements: List<Achievement>
        get() = getUserAchievements(userProfile.value)

    fun recordQuizResult(
        quiz: Quiz,
        score: QuizScore,
        timeSpentSeconds: Int = 0,
        mistakes: List<MistakeEntity> = emptyList()
    ) {
        quizRepository.recordQuizResult(quiz, score, timeSpentSeconds, mistakes)
    }

    fun getOpenMistakes(): Flow<List<MistakeEntity>> =
        mistakeRepository.getOpenMistakes()

    fun markMistakeReviewed(quizId: String, questionId: Int) {
        mistakeRepository.markMistakeReviewed(quizId, questionId)
    }

    fun markAllMistakesReviewed() {
        mistakeRepository.markAllMistakesReviewed()
    }

    suspend fun getUnitProgress(unitId: String): UnitProgress =
        quizRepository.getUnitProgress(unitId)

    fun getFlashcardProgressForUnit(unitId: String): Flow<List<FlashcardProgressEntity>> =
        flashcardRepository.getFlashcardProgressForUnit(unitId)

    fun setFlashcardStatus(cardId: String, unitId: String, isKnown: Boolean) {
        flashcardRepository.setFlashcardStatus(cardId, unitId, isKnown)
    }

    fun getSchedulesForUnit(unitId: String): Flow<List<FlashcardScheduleEntity>> =
        flashcardRepository.getSchedulesForUnit(unitId)

    suspend fun ensureSchedulesForUnit(unitId: String): List<FlashcardScheduleEntity> =
        flashcardRepository.ensureSchedulesForUnit(unitId)

    fun answerCard(cardId: String, grade: ReviewGrade, onAnswered: (() -> Unit)? = null) {
        flashcardRepository.answerCard(cardId, grade, onAnswered)
    }

    fun resetUnitSchedules(unitId: String) {
        flashcardRepository.resetUnitSchedules(unitId)
    }
}
