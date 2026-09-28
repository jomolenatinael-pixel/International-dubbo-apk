package com.areka.app.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.areka.app.data.model.UserProfile

@Entity(tableName = "user_profile")
data class UserProfileEntity(
    @PrimaryKey val id: Int = 1,
    val name: String = "Student",
    val grade: String = "Grade 10",
    val streakDays: Int = 0,
    val totalQuizzes: Int = 0,
    val averageScore: Int = 0,
    val timeStudiedHours: Int = 0,
    val globalRank: Int = 11,
    val totalPoints: Int = 0,
    val isDarkTheme: Boolean = true,
    val lastActiveDateEpochDay: Long = 0L
) {
    fun toUserProfile(): UserProfile = UserProfile(
        name = name,
        grade = grade,
        streakDays = streakDays,
        totalQuizzes = totalQuizzes,
        averageScore = averageScore,
        timeStudiedHours = timeStudiedHours,
        globalRank = globalRank,
        totalPoints = totalPoints
    )

    companion object {
        fun default(): UserProfileEntity = UserProfileEntity()
    }
}
