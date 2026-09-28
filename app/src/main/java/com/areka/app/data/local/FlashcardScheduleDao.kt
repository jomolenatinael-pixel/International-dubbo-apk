package com.areka.app.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface FlashcardScheduleDao {
    @Query("SELECT * FROM flashcard_schedules WHERE unitId = :unitId")
    fun getSchedulesForUnit(unitId: String): Flow<List<FlashcardScheduleEntity>>

    @Query("SELECT * FROM flashcard_schedules WHERE unitId = :unitId")
    suspend fun getSchedulesForUnitOnce(unitId: String): List<FlashcardScheduleEntity>

    @Query("SELECT * FROM flashcard_schedules WHERE cardId = :cardId LIMIT 1")
    suspend fun getScheduleForCard(cardId: String): FlashcardScheduleEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdate(schedule: FlashcardScheduleEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(schedules: List<FlashcardScheduleEntity>)

    @Query("DELETE FROM flashcard_schedules WHERE unitId = :unitId")
    suspend fun deleteSchedulesForUnit(unitId: String)

    @Insert
    suspend fun insertReviewLog(log: ReviewLogEntity)

    @Query("SELECT * FROM flashcard_review_logs WHERE unitId = :unitId ORDER BY reviewedAtEpochMillis DESC")
    fun getReviewLogsForUnit(unitId: String): Flow<List<ReviewLogEntity>>

    @Query("SELECT * FROM flashcard_review_logs WHERE cardId = :cardId ORDER BY reviewedAtEpochMillis DESC")
    fun getReviewLogsForCard(cardId: String): Flow<List<ReviewLogEntity>>
}
