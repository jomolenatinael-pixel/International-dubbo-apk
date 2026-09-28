package com.areka.app.data.model

data class UnitProgress(
    val unitId: String,
    val quizAttempts: Int,
    val quizAccuracyPercent: Int,
    val flashcardsReviewed: Int,
    val masteryPercent: Int,
    val lastStudiedAtEpochMillis: Long?
)
