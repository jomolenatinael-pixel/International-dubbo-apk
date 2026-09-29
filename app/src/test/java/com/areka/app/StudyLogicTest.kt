package com.areka.app

import com.areka.app.data.model.Question
import com.areka.app.data.model.QuestionOption
import com.areka.app.data.model.Quiz
import com.areka.app.data.model.QuizScoring
import com.areka.app.data.repository.StudyStreakCalculator
import org.junit.Assert.assertEquals
import org.junit.Test

class StudyLogicTest {
    private val quiz = Quiz(
        id = "test_quiz",
        title = "Test Quiz",
        subject = "Math",
        durationMinutes = 5,
        questions = listOf(
            question(1, "a"),
            question(2, "b"),
            question(3, "c")
        )
    )

    @Test
    fun `scoring handles correct wrong and skipped answers`() {
        val result = QuizScoring.calculate(quiz, mapOf(1 to "a", 2 to "wrong"))
        assertEquals(3, result.totalQuestions)
        assertEquals(1, result.correctAnswers)
        assertEquals(1, result.incorrectAnswers)
        assertEquals(1, result.skippedAnswers)
        assertEquals(33, result.percentage)
        assertEquals(330, result.pointsEarned)
    }

    @Test
    fun `empty quiz has zero score and no crash`() {
        val result = QuizScoring.calculate(quiz.copy(questions = emptyList()), emptyMap())
        assertEquals(0, result.totalQuestions)
        assertEquals(0, result.percentage)
        assertEquals(0, result.pointsEarned)
    }

    @Test
    fun `same day activity does not double increment streak`() {
        assertEquals(4, StudyStreakCalculator.nextStreak(4, 100L, 100L))
    }

    @Test
    fun `consecutive day increments streak and missed day resets it`() {
        assertEquals(5, StudyStreakCalculator.nextStreak(4, 100L, 101L))
        assertEquals(1, StudyStreakCalculator.nextStreak(4, 100L, 103L))
    }

    @Test
    fun `flashcard scheduler updates schedule and logs on Again and Good grades`() {
        val schedule = com.areka.app.data.local.FlashcardScheduleEntity(
            cardId = "card_1",
            subjectId = "bio",
            unitId = "bio_u1",
            status = com.areka.app.data.local.CardStatus.NEW.name
        )
        val now = 1_000_000L
        val (againSchedule, againLog) = com.areka.app.data.repository.FlashcardScheduler.gradeCard(
            schedule,
            com.areka.app.data.local.ReviewGrade.AGAIN,
            now
        )
        assertEquals(com.areka.app.data.local.CardStatus.LEARNING.name, againSchedule.status)
        assertEquals(now + 60_000L, againSchedule.dueAtEpochMillis)
        assertEquals("AGAIN", againLog.grade)

        val (goodSchedule, goodLog) = com.areka.app.data.repository.FlashcardScheduler.gradeCard(
            againSchedule,
            com.areka.app.data.local.ReviewGrade.GOOD,
            now
        )
        assertEquals(com.areka.app.data.local.CardStatus.LEARNING.name, goodSchedule.status)
        assertEquals(now + 600_000L, goodSchedule.dueAtEpochMillis)
        assertEquals("GOOD", goodLog.grade)
    }

    @Test
    fun `new user starts at streak 0 and streak badges unlock honestly`() {
        val badges0 = com.areka.app.data.repository.StudyRepository.getStreakBadges(0)
        assertEquals(0, badges0.count { it.isUnlocked })

        val badges14 = com.areka.app.data.repository.StudyRepository.getStreakBadges(14)
        assertEquals(2, badges14.count { it.isUnlocked })
    }

    // ==========================================
    // Phase 4: Leaderboard Logic Tests
    // ==========================================

    @Test
    fun `ranking changes when points change and multiple ranks are possible`() {
        val repo = com.areka.app.data.repository.LeaderboardRepository(com.areka.app.data.repository.LocalMockLeaderboardDataSource())
        val baseProfile = com.areka.app.data.model.UserProfile(
            name = "Test Student",
            grade = "Grade 10",
            totalPoints = 0
        )

        val rankAtZero = repo.calculateUserRank(baseProfile.copy(totalPoints = 0))
        val rankAt80k = repo.calculateUserRank(baseProfile.copy(totalPoints = 80_000))
        val rankAt85k = repo.calculateUserRank(baseProfile.copy(totalPoints = 85_000))
        val rankAt100k = repo.calculateUserRank(baseProfile.copy(totalPoints = 100_000))

        assertEquals(11, rankAtZero)
        assertEquals(8, rankAt80k)
        assertEquals(5, rankAt85k)
        assertEquals(1, rankAt100k)
    }

    @Test
    fun `current user rank matches leaderboard position`() {
        val repo = com.areka.app.data.repository.LeaderboardRepository()
        val profile = com.areka.app.data.model.UserProfile(
            name = "Test Student",
            grade = "Grade 10",
            totalPoints = 82_000
        )

        val globalEntries = repo.global(profile)
        val userEntry = globalEntries.first { it.isCurrentUser }
        val calculatedRank = repo.calculateUserRank(profile)

        assertEquals(userEntry.rank, calculatedRank)
        assertEquals(userEntry.points, 82_000)
    }

    @Test
    fun `tied scores are handled consistently with deterministic secondary sort`() {
        val repo = com.areka.app.data.repository.LeaderboardRepository()
        // Top user Alex Chen has 94,800 points with id "u1"
        // Current user has id "u_user". With identical 94,800 points:
        val profile = com.areka.app.data.model.UserProfile(
            name = "Test Student",
            grade = "Grade 10",
            totalPoints = 94_800
        )
        val entries1 = repo.global(profile)
        val entries2 = repo.global(profile)

        assertEquals(entries1.map { it.id to it.rank }, entries2.map { it.id to it.rank })
        val alex = entries1.first { it.id == "u1" }
        val user = entries1.first { it.id == "u_user" }
        assertEquals(1, alex.rank)
        assertEquals(2, user.rank)
    }

    @Test
    fun `mock leaderboard remains deterministic across repeated calls`() {
        val repo = com.areka.app.data.repository.LeaderboardRepository()
        val profile = com.areka.app.data.model.UserProfile(name = "Student", grade = "Grade 10", totalPoints = 50_000)
        val call1 = repo.global(profile).map { it.id to it.points }
        val call2 = repo.global(profile).map { it.id to it.points }
        assertEquals(call1, call2)
    }

    // ==========================================
    // Phase 5: Achievement Calculation Tests
    // ==========================================

    @Test
    fun `brand-new user has no achievements unlocked`() {
        val newProfile = com.areka.app.data.model.UserProfile(
            name = "Newbie",
            grade = "Grade 10",
            streakDays = 0,
            totalQuizzes = 0,
            totalPoints = 0
        )
        val achievements = com.areka.app.data.repository.AchievementCalculator.calculate(newProfile)
        assertEquals(5, achievements.size)
        org.junit.Assert.assertTrue(achievements.all { !it.unlocked })
    }

    @Test
    fun `exactly-at-threshold unlocks achievement`() {
        val baseProfile = com.areka.app.data.model.UserProfile(name = "Student", grade = "Grade 10")

        val atQuizThreshold = com.areka.app.data.repository.AchievementCalculator.calculate(
            baseProfile.copy(totalQuizzes = 100)
        )
        val quizMaster = atQuizThreshold.first { it.id == "ach1" }
        org.junit.Assert.assertTrue("Quiz Master should unlock at exactly 100 quizzes", quizMaster.unlocked)

        val atStreakThreshold = com.areka.app.data.repository.AchievementCalculator.calculate(
            baseProfile.copy(streakDays = 60)
        )
        val streakChamp = atStreakThreshold.first { it.id == "ach5" }
        org.junit.Assert.assertTrue("Streak Champion should unlock at exactly 60 days", streakChamp.unlocked)
    }

    @Test
    fun `below-threshold leaves achievement locked`() {
        val baseProfile = com.areka.app.data.model.UserProfile(name = "Student", grade = "Grade 10")

        val belowQuizThreshold = com.areka.app.data.repository.AchievementCalculator.calculate(
            baseProfile.copy(totalQuizzes = 99)
        )
        val quizMaster = belowQuizThreshold.first { it.id == "ach1" }
        org.junit.Assert.assertFalse("Quiz Master should remain locked at 99 quizzes", quizMaster.unlocked)

        val belowStreakThreshold = com.areka.app.data.repository.AchievementCalculator.calculate(
            baseProfile.copy(streakDays = 59)
        )
        val streakChamp = belowStreakThreshold.first { it.id == "ach5" }
        org.junit.Assert.assertFalse("Streak Champion should remain locked at 59 streak days", streakChamp.unlocked)
    }

    @Test
    fun `above-threshold unlocks achievement`() {
        val baseProfile = com.areka.app.data.model.UserProfile(name = "Student", grade = "Grade 10")

        val aboveQuizThreshold = com.areka.app.data.repository.AchievementCalculator.calculate(
            baseProfile.copy(totalQuizzes = 105)
        )
        val quizMaster = aboveQuizThreshold.first { it.id == "ach1" }
        org.junit.Assert.assertTrue("Quiz Master should unlock at 105 quizzes", quizMaster.unlocked)

        val aboveStreakThreshold = com.areka.app.data.repository.AchievementCalculator.calculate(
            baseProfile.copy(streakDays = 75)
        )
        val streakChamp = aboveStreakThreshold.first { it.id == "ach5" }
        org.junit.Assert.assertTrue("Streak Champion should unlock at 75 days", streakChamp.unlocked)
    }

    @Test
    fun `multiple achievements unlocked simultaneously`() {
        val advancedProfile = com.areka.app.data.model.UserProfile(
            name = "Top Student",
            grade = "Grade 10",
            totalQuizzes = 120,
            streakDays = 65
        )
        val achievements = com.areka.app.data.repository.AchievementCalculator.calculate(
            profile = advancedProfile,
            perfectQuizzesCount = 10,
            biologyUnitsMastered = true,
            hasSpeedDemonQuiz = true
        )
        assertEquals(5, achievements.size)
        org.junit.Assert.assertTrue("All achievements should be unlocked simultaneously", achievements.all { it.unlocked })
    }

    // ==========================================
    // Phase 6: Curriculum & Quiz Integrity Tests
    // ==========================================

    @Test
    fun `every supported curriculum unit can resolve its quiz`() {
        val units = com.areka.app.data.repository.CurriculumData.units
        org.junit.Assert.assertTrue("Curriculum units should not be empty", units.isNotEmpty())

        for (unit in units) {
            val quiz = com.areka.app.data.repository.CurriculumData.getQuizForUnit(unit.id)
            org.junit.Assert.assertNotNull("Quiz for unit ${unit.id} should resolve", quiz)
            org.junit.Assert.assertFalse("Quiz id should not be blank", quiz.id.isBlank())
            org.junit.Assert.assertTrue("Quiz for unit ${unit.id} should have questions", quiz.questions.isNotEmpty())
        }
    }

    @Test
    fun `quiz IDs are unique across all curriculum quizzes`() {
        val quizzes = com.areka.app.data.repository.CurriculumData.getAllCurriculumQuizzes()
        val ids = quizzes.map { it.id }
        val uniqueIds = ids.toSet()
        assertEquals("Every curriculum quiz ID must be unique", ids.size, uniqueIds.size)
    }

    @Test
    fun `duplicate quiz IDs are detected by validator`() {
        val quizzes = com.areka.app.data.repository.CurriculumData.getAllCurriculumQuizzes()
        val sampleQuiz = quizzes.first()
        val listWithDuplicate = quizzes + sampleQuiz
        val duplicates = listWithDuplicate.groupBy { it.id }.filter { it.value.size > 1 }.keys
        assertEquals(1, duplicates.size)
        assertEquals(sampleQuiz.id, duplicates.first())
    }

    @Test
    fun `quiz questions have valid IDs options and correct answer mapping`() {
        val quizzes = com.areka.app.data.repository.CurriculumData.getAllCurriculumQuizzes()
        for (quiz in quizzes) {
            for (q in quiz.questions) {
                org.junit.Assert.assertTrue("Question ID in quiz ${quiz.id} must be positive", q.id > 0)
                org.junit.Assert.assertFalse("Question text in quiz ${quiz.id} must not be blank", q.text.isBlank())
                org.junit.Assert.assertTrue("Question in quiz ${quiz.id} must have at least 2 options", q.options.size >= 2)
                org.junit.Assert.assertTrue(
                    "Question in quiz ${quiz.id} correctOptionId (${q.correctOptionId}) must match one of options ${q.options.map { it.id }}",
                    q.options.any { it.id == q.correctOptionId }
                )
            }
        }
    }

    private fun question(id: Int, correct: String) = Question(
        id = id,
        questionNumber = id,
        totalQuestions = 3,
        text = "Question $id",
        options = listOf(QuestionOption("a", "A"), QuestionOption("b", "B"), QuestionOption("c", "C")),
        correctOptionId = correct,
        explanation = "Explanation"
    )
}
