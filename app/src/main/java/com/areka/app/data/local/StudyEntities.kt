package com.areka.app.data.local

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "quiz_attempts",
    indices = [Index(value = ["unitId", "completedAtEpochMillis"])]
)
data class QuizAttemptEntity(
    @PrimaryKey val id: String,
    val quizId: String,
    val quizTitle: String,
    val subjectId: String,
    val unitId: String,
    val scorePercent: Int,
    val correctAnswers: Int,
    val totalQuestions: Int,
    val timeSpentSeconds: Int,
    val completedAtEpochMillis: Long = System.currentTimeMillis()
)

@Entity(
    tableName = "mistakes",
    primaryKeys = ["quizId", "questionId"],
    indices = [Index(value = ["unitId"])]
)
data class MistakeEntity(
    val quizId: String,
    val questionId: Int,
    val questionText: String,
    val selectedAnswer: String,
    val correctAnswer: String,
    val subjectId: String,
    val unitId: String,
    val explanation: String,
    val createdAtEpochMillis: Long = System.currentTimeMillis(),
    val reviewedAtEpochMillis: Long? = null
)
