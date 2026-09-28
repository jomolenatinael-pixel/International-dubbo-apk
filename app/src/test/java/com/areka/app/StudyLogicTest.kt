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
