package com.areka.app.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface UserProfileDao {
    @Query("SELECT * FROM user_profile WHERE ownerUserId = :ownerUserId AND id = 1 LIMIT 1")
    fun getUserProfile(ownerUserId: String): Flow<UserProfileEntity?>

    @Query("SELECT * FROM user_profile WHERE ownerUserId = :ownerUserId AND id = 1 LIMIT 1")
    suspend fun getUserProfileOnce(ownerUserId: String): UserProfileEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdate(profile: UserProfileEntity)

    @Query("UPDATE user_profile SET isDarkTheme = :isDark WHERE ownerUserId = :ownerUserId AND id = 1")
    suspend fun updateTheme(ownerUserId: String, isDark: Boolean)

    @Query("UPDATE user_profile SET name = :name, grade = :grade WHERE ownerUserId = :ownerUserId AND id = 1")
    suspend fun updateNameAndGrade(ownerUserId: String, name: String, grade: String)
}
