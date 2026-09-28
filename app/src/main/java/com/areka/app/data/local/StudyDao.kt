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

    @Query("SELECT * FROM quiz_attempts ORDER BY completedAtEpochMillis DESC")
    fun getAttempts(): Flow<List<QuizAttemptEntity>>

    @Query("SELECT COUNT(*) FROM quiz_attempts")
    suspend fun getAttemptCount(): Int

    @Query("SELECT COALESCE(SUM(correctAnswers), 0) FROM quiz_attempts")
    suspend fun getQuestionsCorrect(): Int

    @Query("SELECT COALESCE(SUM(totalQuestions), 0) FROM quiz_attempts")
    suspend fun getQuestionsAnswered(): Int

    @Query("SELECT COALESCE(CAST(AVG(scorePercent) AS INTEGER), 0) FROM quiz_attempts")
    suspend fun getAverageScore(): Int

    @Query("SELECT COALESCE(SUM(timeSpentSeconds), 0) FROM quiz_attempts")
    suspend fun getStudyTimeSeconds(): Long

    @Query("SELECT * FROM quiz_attempts WHERE unitId = :unitId ORDER BY completedAtEpochMillis DESC")
    suspend fun getAttemptsForUnit(unitId: String): List<QuizAttemptEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMistakes(mistakes: List<MistakeEntity>)

    @Query("SELECT * FROM mistakes WHERE reviewedAtEpochMillis IS NULL ORDER BY createdAtEpochMillis DESC")
    fun getOpenMistakes(): Flow<List<MistakeEntity>>

    @Query("SELECT * FROM mistakes WHERE unitId = :unitId AND reviewedAtEpochMillis IS NULL ORDER BY createdAtEpochMillis DESC")
    fun getOpenMistakesForUnit(unitId: String): Flow<List<MistakeEntity>>
}
