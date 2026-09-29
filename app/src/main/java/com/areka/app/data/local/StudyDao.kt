package com.areka.app.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface StudyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAttempt(attempt: QuizAttemptEntity)

    @Query("SELECT * FROM quiz_attempts WHERE ownerUserId = :ownerUserId ORDER BY completedAtEpochMillis DESC")
    fun getAttempts(ownerUserId: String): Flow<List<QuizAttemptEntity>>

    @Query("SELECT COUNT(*) FROM quiz_attempts WHERE ownerUserId = :ownerUserId")
    suspend fun getAttemptCount(ownerUserId: String): Int

    @Query("SELECT COALESCE(SUM(correctAnswers), 0) FROM quiz_attempts WHERE ownerUserId = :ownerUserId")
    suspend fun getQuestionsCorrect(ownerUserId: String): Int

    @Query("SELECT COALESCE(SUM(totalQuestions), 0) FROM quiz_attempts WHERE ownerUserId = :ownerUserId")
    suspend fun getQuestionsAnswered(ownerUserId: String): Int

    @Query("SELECT COALESCE(CAST(AVG(scorePercent) AS INTEGER), 0) FROM quiz_attempts WHERE ownerUserId = :ownerUserId")
    suspend fun getAverageScore(ownerUserId: String): Int

    @Query("SELECT COALESCE(SUM(timeSpentSeconds), 0) FROM quiz_attempts WHERE ownerUserId = :ownerUserId")
    suspend fun getStudyTimeSeconds(ownerUserId: String): Long

    @Query("SELECT * FROM quiz_attempts WHERE ownerUserId = :ownerUserId AND unitId = :unitId ORDER BY completedAtEpochMillis DESC")
    suspend fun getAttemptsForUnit(ownerUserId: String, unitId: String): List<QuizAttemptEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMistakes(mistakes: List<MistakeEntity>)

    @Query("SELECT * FROM mistakes WHERE ownerUserId = :ownerUserId AND reviewedAtEpochMillis IS NULL ORDER BY createdAtEpochMillis DESC")
    fun getOpenMistakes(ownerUserId: String): Flow<List<MistakeEntity>>

    @Query("SELECT * FROM mistakes WHERE ownerUserId = :ownerUserId AND unitId = :unitId AND reviewedAtEpochMillis IS NULL ORDER BY createdAtEpochMillis DESC")
    fun getOpenMistakesForUnit(ownerUserId: String, unitId: String): Flow<List<MistakeEntity>>

    @Query("UPDATE mistakes SET reviewedAtEpochMillis = :reviewedAt WHERE ownerUserId = :ownerUserId AND quizId = :quizId AND questionId = :questionId")
    suspend fun markMistakeReviewed(ownerUserId: String, quizId: String, questionId: Int, reviewedAt: Long = System.currentTimeMillis())

    @Query("UPDATE mistakes SET reviewedAtEpochMillis = :reviewedAt WHERE ownerUserId = :ownerUserId AND reviewedAtEpochMillis IS NULL")
    suspend fun markAllMistakesReviewed(ownerUserId: String, reviewedAt: Long = System.currentTimeMillis())
}
