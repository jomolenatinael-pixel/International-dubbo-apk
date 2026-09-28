package com.areka.app.data.model

/** Pure scoring rules shared by the quiz UI, persistence, and tests. */
data class QuizScore(
    val totalQuestions: Int,
    val correctAnswers: Int,
    val incorrectAnswers: Int,
    val skippedAnswers: Int,
    val percentage: Int,
    val pointsEarned: Int
)

object QuizScoring {
    fun calculate(quiz: Quiz, answers: Map<Int, String>): QuizScore {
        val total = quiz.questions.size
        val correct = quiz.questions.count { question ->
            answers[question.id] == question.correctOptionId
        }
        val answered = quiz.questions.count { answers.containsKey(it.id) }
        val skipped = (total - answered).coerceAtLeast(0)
        val incorrect = (answered - correct).coerceAtLeast(0)
        val percentage = if (total == 0) 0 else (correct * 100 / total).coerceIn(0, 100)
        return QuizScore(
            totalQuestions = total,
            correctAnswers = correct,
            incorrectAnswers = incorrect,
            skippedAnswers = skipped,
            percentage = percentage,
            pointsEarned = percentage * 10
        )
    }
}
