package com.areka.app.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface FlashcardProgressDao {
    @Query("SELECT * FROM flashcard_progress WHERE ownerUserId = :ownerUserId AND unitId = :unitId")
    fun getProgressForUnit(ownerUserId: String, unitId: String): Flow<List<FlashcardProgressEntity>>

    @Query("SELECT * FROM flashcard_progress WHERE ownerUserId = :ownerUserId AND unitId = :unitId")
    suspend fun getProgressForUnitOnce(ownerUserId: String, unitId: String): List<FlashcardProgressEntity>

    @Query("SELECT * FROM flashcard_progress WHERE ownerUserId = :ownerUserId")
    fun getAllProgress(ownerUserId: String): Flow<List<FlashcardProgressEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun setCardProgress(progress: FlashcardProgressEntity)

    @Query("DELETE FROM flashcard_progress WHERE ownerUserId = :ownerUserId AND unitId = :unitId")
    suspend fun clearUnitProgress(ownerUserId: String, unitId: String)
}
