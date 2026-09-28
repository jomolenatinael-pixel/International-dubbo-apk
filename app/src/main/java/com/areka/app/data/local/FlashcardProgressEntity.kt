package com.areka.app.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "flashcard_progress")
data class FlashcardProgressEntity(
    @PrimaryKey val cardId: String,
    val unitId: String,
    val isKnown: Boolean,
    val updatedAt: Long = System.currentTimeMillis()
)
