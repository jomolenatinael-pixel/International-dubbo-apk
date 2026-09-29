package com.areka.app.data.repository

import com.areka.app.data.model.Achievement
import com.areka.app.data.model.UserProfile

/**
 * Calculates user achievement statuses based honestly on actual statistics and milestones.
 */
object AchievementCalculator {

    fun calculate(
        profile: UserProfile,
        perfectQuizzesCount: Int = 0,
        biologyUnitsMastered: Boolean = false,
        hasSpeedDemonQuiz: Boolean = false
    ): List<Achievement> = listOf(
        Achievement(
            id = "ach1",
            title = "Quiz Master",
            description = "Complete 100+ quizzes across all STEM subjects",
            iconType = "trophy",
            unlocked = profile.totalQuizzes >= 100
        ),
        Achievement(
            id = "ach2",
            title = "Perfect Score",
            description = "Attain 100% accuracy on 10 consecutive tests",
            iconType = "star",
            unlocked = perfectQuizzesCount >= 10
        ),
        Achievement(
            id = "ach3",
            title = "Biology Expert",
            description = "Master all Grade 10 cellular biology units",
            iconType = "leaf",
            unlocked = biologyUnitsMastered
        ),
        Achievement(
            id = "ach4",
            title = "Speed Demon",
            description = "Finish a timed quiz in under 3 minutes with >90% score",
            iconType = "lightning",
            unlocked = hasSpeedDemonQuiz
        ),
        Achievement(
            id = "ach5",
            title = "Streak Champion",
            description = "Maintain an unbroken daily streak of 60 days",
            iconType = "flame",
            unlocked = profile.streakDays >= 60
        )
    )
}
