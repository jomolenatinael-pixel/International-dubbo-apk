package com.areka.app.data.local

import androidx.room.Entity

enum class CardStatus { NEW, LEARNING, REVIEW, RELEARNING }
enum class ReviewGrade { AGAIN, HARD, GOOD, EASY }

@Entity(tableName = "flashcard_schedules", primaryKeys = ["ownerUserId", "cardId"])
data class FlashcardScheduleEntity(
    val ownerUserId: String = GUEST_OWNER_ID,
    val cardId: String,
    val subjectId: String,
    val unitId: String,
    val status: String = CardStatus.NEW.name,
    val dueAtEpochMillis: Long = System.currentTimeMillis(),
    val intervalDays: Float = 0f,
    val ease: Float = 2.5f,
    val repetitions: Int = 0,
    val lapses: Int = 0,
    val learningStepIndex: Int = 0,
    val lastReviewedAtEpochMillis: Long? = null,
    val updatedAtEpochMillis: Long = System.currentTimeMillis()
)

@Entity(tableName = "flashcard_review_logs", indices = [androidx.room.Index(value = ["ownerUserId", "reviewedAtEpochMillis"])])
data class ReviewLogEntity(
    val ownerUserId: String = GUEST_OWNER_ID,
    @androidx.room.PrimaryKey(autoGenerate = true) val id: Long = 0,
    val cardId: String,
    val unitId: String,
    val grade: String,
    val previousStatus: String,
    val newStatus: String,
    val previousIntervalDays: Float,
    val newIntervalDays: Float,
    val reviewedAtEpochMillis: Long = System.currentTimeMillis()
)
