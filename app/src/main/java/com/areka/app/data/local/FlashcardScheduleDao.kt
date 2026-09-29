package com.areka.app.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface FlashcardScheduleDao {
    @Query("SELECT * FROM flashcard_schedules WHERE ownerUserId = :ownerUserId AND unitId = :unitId")
    fun getSchedulesForUnit(ownerUserId: String, unitId: String): Flow<List<FlashcardScheduleEntity>>

    @Query("SELECT * FROM flashcard_schedules WHERE ownerUserId = :ownerUserId AND unitId = :unitId")
    suspend fun getSchedulesForUnitOnce(ownerUserId: String, unitId: String): List<FlashcardScheduleEntity>

    @Query("SELECT * FROM flashcard_schedules WHERE ownerUserId = :ownerUserId AND cardId = :cardId LIMIT 1")
    suspend fun getScheduleForCard(ownerUserId: String, cardId: String): FlashcardScheduleEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdate(schedule: FlashcardScheduleEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(schedules: List<FlashcardScheduleEntity>)

    @Query("DELETE FROM flashcard_schedules WHERE ownerUserId = :ownerUserId AND unitId = :unitId")
    suspend fun deleteSchedulesForUnit(ownerUserId: String, unitId: String)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertReviewLog(log: ReviewLogEntity)

    @Query("SELECT * FROM flashcard_review_logs WHERE ownerUserId = :ownerUserId AND unitId = :unitId ORDER BY reviewedAtEpochMillis DESC")
    fun getReviewLogsForUnit(ownerUserId: String, unitId: String): Flow<List<ReviewLogEntity>>

    @Query("SELECT * FROM flashcard_review_logs WHERE ownerUserId = :ownerUserId AND cardId = :cardId ORDER BY reviewedAtEpochMillis DESC")
    fun getReviewLogsForCard(ownerUserId: String, cardId: String): Flow<List<ReviewLogEntity>>

    @Query("SELECT * FROM flashcard_schedules WHERE ownerUserId = :ownerUserId")
    fun getAllSchedules(ownerUserId: String): Flow<List<FlashcardScheduleEntity>>

    @Query("SELECT COUNT(*) FROM flashcard_schedules WHERE ownerUserId = :ownerUserId")
    suspend fun getScheduleCount(ownerUserId: String): Int
}
