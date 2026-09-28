package com.areka.app.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface FlashcardProgressDao {
    @Query("SELECT * FROM flashcard_progress WHERE unitId = :unitId")
    fun getProgressForUnit(unitId: String): Flow<List<FlashcardProgressEntity>>

    @Query("SELECT * FROM flashcard_progress WHERE unitId = :unitId")
    suspend fun getProgressForUnitOnce(unitId: String): List<FlashcardProgressEntity>

    @Query("SELECT * FROM flashcard_progress")
    fun getAllProgress(): Flow<List<FlashcardProgressEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun setCardProgress(progress: FlashcardProgressEntity)

    @Query("DELETE FROM flashcard_progress WHERE unitId = :unitId")
    suspend fun clearUnitProgress(unitId: String)
}
