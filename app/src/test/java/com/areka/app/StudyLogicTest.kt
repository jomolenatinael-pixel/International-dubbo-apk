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
