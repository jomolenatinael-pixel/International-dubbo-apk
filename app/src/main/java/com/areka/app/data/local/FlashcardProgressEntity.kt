package com.areka.app.data.local

import androidx.room.Entity

@Entity(tableName = "flashcard_progress", primaryKeys = ["ownerUserId", "cardId"])
data class FlashcardProgressEntity(
    val ownerUserId: String = GUEST_OWNER_ID,
    val cardId: String,
    val unitId: String,
    val isKnown: Boolean,
    val updatedAt: Long = System.currentTimeMillis()
)
