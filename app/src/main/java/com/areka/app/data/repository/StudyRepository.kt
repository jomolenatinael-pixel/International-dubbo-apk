package com.areka.app.data.repository

import android.content.Context
import com.areka.app.data.local.AppDatabase
import com.areka.app.data.local.CardStatus
import com.areka.app.data.local.FlashcardProgressEntity
import com.areka.app.data.local.MistakeEntity
import com.areka.app.data.local.QuizAttemptEntity
import com.areka.app.data.local.FlashcardScheduleEntity
import com.areka.app.data.local.RecentActivityEntity
import com.areka.app.data.local.ReviewGrade
import com.areka.app.data.local.UserProfileEntity
import com.areka.app.data.model.*
import com.areka.app.data.remote.SupabaseQuestionSync
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

    private val _dueFlashcardsCount = MutableStateFlow(0)
    val dueFlashcardsCount: StateFlow<Int> = _dueFlashcardsCount.asStateFlow()

    private val _openMistakes = MutableStateFlow<List<MistakeEntity>>(emptyList())
    val openMistakes: StateFlow<List<MistakeEntity>> = _openMistakes.asStateFlow()

    private val _userProfile = MutableStateFlow(
        UserProfile(
            name = "Student",
            grade = "Grade 10",
            streakDays = 0,
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
            // Refresh the remote bank in the background; bundled content remains the fallback.
            SupabaseQuestionSync.sync(context.applicationContext)

            // Seed default profile if empty
            val existingProfile = db.userProfileDao().getUserProfileOnce()
            if (existingProfile == null) {
                db.userProfileDao().insertOrUpdate(UserProfileEntity.default())
            }

            // Seed flashcard schedules if empty
            val scheduleCount = db.flashcardScheduleDao().getScheduleCount()
            if (scheduleCount == 0) {
                val now = System.currentTimeMillis()
                val initialSchedules = CurriculumData.flashcards.map { card ->
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
                db.flashcardScheduleDao().insertAll(initialSchedules)
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

            // Observe flashcard schedules for due count
            launch {
                db.flashcardScheduleDao().getAllSchedules().collectLatest { schedules ->
                    val now = System.currentTimeMillis()
                    _dueFlashcardsCount.value = schedules.count { it.dueAtEpochMillis <= now }
                }
            }

            // Observe open mistakes
            launch {
                db.studyDao().getOpenMistakes().collectLatest { mistakes ->
                    _openMistakes.value = mistakes
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
        get() = getStreakBadges(_userProfile.value.streakDays)

    val subjects: List<SubjectItem> = CurriculumData.subjects
    val units: List<SubjectUnit> = CurriculumData.units
    val allFlashcards: List<Flashcard> = CurriculumData.flashcards

    fun getUnitsForSubject(subjectId: String): List<SubjectUnit> = CurriculumData.getUnitsForSubject(subjectId)
    fun getFlashcardsForUnit(unitId: String): List<Flashcard> = CurriculumData.getFlashcardsForUnit(unitId)
    fun getQuizForUnit(unitId: String): Quiz = CurriculumData.getQuizForUnit(unitId)

    val chemistryPeriodicQuiz = Quiz(
        id = "chem_periodic_101",
        title = "Chemistry: Periodic Trends",
        subject = "Chemistry",
        durationMinutes = 15,
        gradeLevel = "Grade 10",
        iconName = "chemistry",
        unitId = "chem_u5",
        subjectId = "chemistry",
        questions = listOf(
            Question(
                id = 1,
                questionNumber = 1,
                totalQuestions = 5,
                text = "Which element has the highest electronegativity?",
                options = listOf(
                    QuestionOption("F", "Fluorine (F)"),
                    QuestionOption("O", "Oxygen (O)"),
                    QuestionOption("Cl", "Chlorine (Cl)"),
                    QuestionOption("N", "Nitrogen (N)")
                ),
                correctOptionId = "F",
                explanation = "Fluorine has the highest electronegativity value (3.98 Pauling) due to its high nuclear charge relative to its small atomic radius."
            ),
            Question(
                id = 2,
                questionNumber = 2,
                totalQuestions = 5,
                text = "What is the general trend for atomic radius across a period from left to right?",
                options = listOf(
                    QuestionOption("inc", "It increases steadily"),
                    QuestionOption("dec", "It decreases steadily"),
                    QuestionOption("same", "It remains unchanged"),
                    QuestionOption("rand", "It fluctuates erratically")
                ),
                correctOptionId = "dec",
                explanation = "Across a period, effective nuclear charge increases while electrons are added to the same energy level, pulling electrons closer to the nucleus."
            ),
            Question(
                id = 3,
                questionNumber = 3,
                totalQuestions = 5,
                text = "Which group in the periodic table possesses elements with the highest first ionization energies?",
                options = listOf(
                    QuestionOption("alk", "Alkali Metals (Group 1)"),
                    QuestionOption("hal", "Halogens (Group 17)"),
                    QuestionOption("nob", "Noble Gases (Group 18)"),
                    QuestionOption("tra", "Transition Metals")
                ),
                correctOptionId = "nob",
                explanation = "Noble gases have complete valence shells, creating maximum stability and requiring the greatest energy to remove an electron."
            ),
            Question(
                id = 4,
                questionNumber = 4,
                totalQuestions = 5,
                text = "When an atom forms a positive cation, how does its ionic radius compare to its neutral atomic radius?",
                options = listOf(
                    QuestionOption("larger", "The cation is always larger"),
                    QuestionOption("smaller", "The cation is smaller than the neutral atom"),
                    QuestionOption("equal", "The radius remains the exact same"),
                    QuestionOption("double", "The radius doubles in size")
                ),
                correctOptionId = "smaller",
                explanation = "Loss of electrons reduces electron-electron repulsion and often loses a valence shell, causing remaining electrons to be pulled closer."
            ),
            Question(
                id = 5,
                questionNumber = 5,
                totalQuestions = 5,
                text = "Which element among these is a metalloid located in period 3?",
                options = listOf(
                    QuestionOption("si", "Silicon (Si)"),
                    QuestionOption("al", "Aluminum (Al)"),
                    QuestionOption("p", "Phosphorus (P)"),
                    QuestionOption("s", "Sulfur (S)")
                ),
                correctOptionId = "si",
                explanation = "Silicon is a prominent metalloid (semiconductor) situated along the periodic divide in period 3, group 14."
            )
        )
    )

    val algebraReviewQuiz = Quiz(
        id = "math_algebra_102",
        title = "Algebra Review Quiz",
        subject = "Math",
        durationMinutes = 12,
        gradeLevel = "Grade 10",
        iconName = "math",
        unitId = "math_u1",
        subjectId = "math",
        questions = listOf(
            Question(
                id = 101,
                questionNumber = 1,
                totalQuestions = 3,
                text = "Solve for x in the quadratic equation: x² - 5x + 6 = 0",
                options = listOf(
                    QuestionOption("a", "x = 2 or x = 3"),
                    QuestionOption("b", "x = -2 or x = -3"),
                    QuestionOption("c", "x = 1 or x = 6"),
                    QuestionOption("d", "x = -1 or x = 5")
                ),
                correctOptionId = "a",
                explanation = "(x - 2)(x - 3) = 0 gives roots x = 2 and x = 3."
            ),
            Question(
                id = 102,
                questionNumber = 2,
                totalQuestions = 3,
                text = "What is the slope of the line passing through (2, 4) and (6, 12)?",
                options = listOf(
                    QuestionOption("a", "m = 2"),
                    QuestionOption("b", "m = 3"),
                    QuestionOption("c", "m = 1/2"),
                    QuestionOption("d", "m = 4")
                ),
                correctOptionId = "a",
                explanation = "Slope m = (12 - 4) / (6 - 2) = 8 / 4 = 2."
            ),
            Question(
                id = 103,
                questionNumber = 3,
                totalQuestions = 3,
                text = "If f(x) = 3x² - 2x + 4, what is f(2)?",
                options = listOf(
                    QuestionOption("a", "12"),
                    QuestionOption("b", "10"),
                    QuestionOption("c", "16"),
                    QuestionOption("d", "8")
                ),
                correctOptionId = "a",
                explanation = "f(2) = 3(4) - 2(2) + 4 = 12 - 4 + 4 = 12."
            )
        )
    )

    val biologyCellQuiz = Quiz(
        id = "bio_cells_103",
        title = "Cellular Respiration & Energy",
        subject = "Biology",
        durationMinutes = 10,
        gradeLevel = "Grade 10",
        iconName = "biology",
        unitId = "bio_u4",
        subjectId = "biology",
        questions = listOf(
            Question(
                id = 201,
                questionNumber = 1,
                totalQuestions = 3,
                text = "In which organelle does the majority of ATP synthesis occur via aerobic respiration?",
                options = listOf(
                    QuestionOption("a", "Mitochondria"),
                    QuestionOption("b", "Ribosome"),
                    QuestionOption("c", "Golgi Apparatus"),
                    QuestionOption("d", "Nucleus")
                ),
                correctOptionId = "a",
                explanation = "Mitochondria are the powerhouses of eukaryotic cells where the Krebs cycle and electron transport chain generate ATP."
            ),
            Question(
                id = 202,
                questionNumber = 2,
                totalQuestions = 3,
                text = "What is the primary product of glycolysis that enters the mitochondrial matrix?",
                options = listOf(
                    QuestionOption("a", "Pyruvate"),
                    QuestionOption("b", "Glucose"),
                    QuestionOption("c", "Lactate"),
                    QuestionOption("d", "Ethanol")
                ),
                correctOptionId = "a",
                explanation = "One 6-carbon glucose molecule is broken down into two 3-carbon pyruvate molecules during glycolysis in the cytoplasm."
            ),
            Question(
                id = 203,
                questionNumber = 3,
                totalQuestions = 3,
                text = "Which molecule serves as the final electron acceptor in the electron transport chain?",
                options = listOf(
                    QuestionOption("a", "Oxygen (O₂)"),
                    QuestionOption("b", "Carbon Dioxide (CO₂)"),
                    QuestionOption("c", "Water (H₂O)"),
                    QuestionOption("d", "NAD+")
                ),
                correctOptionId = "a",
                explanation = "Oxygen is the terminal electron acceptor and combines with free protons to form water."
            )
        )
    )

    val mathRelationsQuiz = CurriculumData.getQuizForUnit("math_u1")
    val chemistryStoichiometryQuiz = CurriculumData.getQuizForUnit("chem_u1")
    val biologyPlantsQuiz = CurriculumData.getQuizForUnit("bio_u2")

    val allQuizzes: List<Quiz> = CurriculumData.quizzes

    private val _recentActivities = MutableStateFlow<List<RecentActivity>>(emptyList())
    val recentActivities: StateFlow<List<RecentActivity>> = _recentActivities.asStateFlow()

    private val leaderboardRepository = LeaderboardRepository(MockLeaderboardDataSource())

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

    fun getGlobalLeaderboard(userProfile: UserProfile): List<LeaderboardEntry> =
        leaderboardRepository.global(userProfile)

    fun getGlobalLeaderboard(userPoints: Int): List<LeaderboardEntry> =
        getGlobalLeaderboard(_userProfile.value.copy(totalPoints = userPoints))

    fun getClassALeaderboard(userProfile: UserProfile): List<LeaderboardEntry> =
        leaderboardRepository.classA(userProfile)

    fun getClassALeaderboard(userPoints: Int): List<LeaderboardEntry> =
        getClassALeaderboard(_userProfile.value.copy(totalPoints = userPoints))

    fun getUserRankSublist(userProfile: UserProfile): List<LeaderboardEntry> =
        leaderboardRepository.userRank(userProfile)

    fun getUserRankSublist(userPoints: Int): List<LeaderboardEntry> =
        getUserRankSublist(_userProfile.value.copy(totalPoints = userPoints))

    fun getUserAchievements(profile: UserProfile): List<Achievement> = listOf(
        Achievement("ach1", "Quiz Master", "Complete 100+ quizzes across all STEM subjects", "trophy", profile.totalQuizzes >= 100),
        Achievement("ach2", "Perfect Score", "Attain 100% accuracy on 10 consecutive tests", "star", false),
        Achievement("ach3", "Biology Expert", "Master all Grade 10 cellular biology units", "leaf", false),
        Achievement("ach4", "Speed Demon", "Finish a timed quiz in under 3 minutes with >90% score", "lightning", false),
        Achievement("ach5", "Streak Champion", "Maintain an unbroken daily streak of 60 days", "flame", profile.streakDays >= 60)
    )

    val userAchievements: List<Achievement>
        get() = getUserAchievements(_userProfile.value)

    fun recordQuizResult(
        quiz: Quiz,
        score: QuizScore,
        timeSpentSeconds: Int = 0,
        mistakes: List<MistakeEntity> = emptyList()
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

        repositoryScope.launch {
            val db = database ?: return@launch
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
            if (mistakes.isNotEmpty()) db.studyDao().insertMistakes(mistakes)

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
            // Persist the same rank that Profile displays instead of assigning
            // rank 2 to every learner who is not at the top score.
            val computedRank = leaderboardRepository
                .global(profileWithUpdatedStats.toUserProfile())
                .firstOrNull { it.isCurrentUser }
                ?.rank
                ?: profileWithUpdatedStats.globalRank
            val saved = profileWithUpdatedStats.copy(globalRank = computedRank)
            db.userProfileDao().insertOrUpdate(saved)
            db.recentActivityDao().insert(RecentActivityEntity(
                id = activity.id, title = activity.title, subtitle = activity.subtitle,
                progressPercent = activity.progressPercent, isCompleted = true,
                iconType = activity.iconType, timestamp = now
            ))
        }
    }

    fun getOpenMistakes(): Flow<List<MistakeEntity>> =
        database?.studyDao()?.getOpenMistakes() ?: flowOf(emptyList())

    fun markMistakeReviewed(quizId: String, questionId: Int) {
        repositoryScope.launch {
            database?.studyDao()?.markMistakeReviewed(quizId, questionId)
        }
    }

    fun markAllMistakesReviewed() {
        repositoryScope.launch {
            database?.studyDao()?.markAllMistakesReviewed()
        }
    }

    suspend fun getUnitProgress(unitId: String): UnitProgress {
        val db = database ?: return UnitProgress(unitId, 0, 0, 0, 0, null)
        val attempts = db.studyDao().getAttemptsForUnit(unitId)
        val schedules = db.flashcardScheduleDao().getSchedulesForUnitOnce(unitId)
        val reviewed = schedules.count { it.repetitions > 0 || it.lastReviewedAtEpochMillis != null }
        val accuracy = if (attempts.isEmpty()) 0 else
            ((attempts.sumOf { it.correctAnswers }.toFloat() / attempts.sumOf { it.totalQuestions }.coerceAtLeast(1)) * 100).toInt()
        val mastery = ((accuracy * 0.7f) + (reviewed.coerceAtMost(10) / 10f * 30f)).toInt().coerceIn(0, 100)
        return UnitProgress(unitId, attempts.size, accuracy, reviewed, mastery,
            attempts.maxOfOrNull { it.completedAtEpochMillis })
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
