package com.areka.app.data.model

data class QuestionOption(
    val id: String,
    val text: String
)

enum class QuestionType {
    MULTIPLE_CHOICE,
    FILL_IN_THE_BLANK
}

data class Question(
    val id: Int,
    val questionNumber: Int,
    val totalQuestions: Int,
    val text: String,
    val options: List<QuestionOption>,
    val correctOptionId: String,
    val explanation: String,
    val type: QuestionType = QuestionType.MULTIPLE_CHOICE
)

data class Quiz(
    val id: String,
    val title: String,
    val subject: String,
    val durationMinutes: Int,
    val questions: List<Question>,
    val gradeLevel: String = "Grade 10",
    val iconName: String = "quiz",
    val unitId: String? = null,
    val subjectId: String? = null
)

data class QuizResult(
    val quizTitle: String,
    val totalQuestions: Int,
    val correctAnswers: Int,
    val scorePercentage: Int,
    val timeSpentSeconds: Int,
    val pointsEarned: Int
)

data class SubjectItem(
    val id: String,
    val name: String,
    val iconType: String,
    val quizCount: Int,
    val accentColorHex: Long,
    val description: String = ""
)

data class SubjectUnit(
    val id: String,
    val subjectId: String,
    val unitNumber: Int,
    val title: String,
    val description: String,
    val flashcardCount: Int = 0,
    val quizCount: Int = 1
)

data class Flashcard(
    val id: String,
    val subjectId: String,
    val unitId: String,
    val front: String,
    val back: String
)

data class LeaderboardEntry(
    val id: String,
    val rank: Int,
    val name: String,
    val grade: String,
    val points: Int,
    val isCurrentUser: Boolean = false,
    val badgeType: BadgeType = BadgeType.REGULAR,
    val avatarColorHex: Long = 0xFF3B82F6
)

enum class BadgeType {
    GOLD,
    SILVER,
    BRONZE,
    REGULAR
}

data class UserProfile(
    val name: String = "Student",
    val grade: String = "Grade 10",
    val streakDays: Int = 0,
    val totalQuizzes: Int = 0,
    val averageScore: Int = 0,
    val timeStudiedHours: Int = 0,
    val globalRank: Int = 11,
    val totalPoints: Int = 0
)

data class Achievement(
    val id: String,
    val title: String,
    val description: String,
    val iconType: String,
    val unlocked: Boolean = false
)

data class RecentActivity(
    val id: String,
    val title: String,
    val subtitle: String,
    val progressPercent: Int,
    val isCompleted: Boolean = true,
    val iconType: String = "quiz"
)

data class DailyStreakBadge(
    val daysRequired: Int,
    val title: String,
    val colorHex: Long,
    val isUnlocked: Boolean
)
