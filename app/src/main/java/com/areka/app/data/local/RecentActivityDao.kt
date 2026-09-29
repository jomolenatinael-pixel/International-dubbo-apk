package com.areka.app.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface RecentActivityDao {
    @Query("SELECT * FROM recent_activities WHERE ownerUserId = :ownerUserId ORDER BY timestamp DESC LIMIT 20")
    fun getRecentActivities(ownerUserId: String): Flow<List<RecentActivityEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(activity: RecentActivityEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(activities: List<RecentActivityEntity>)

    @Query("SELECT COUNT(*) FROM recent_activities WHERE ownerUserId = :ownerUserId")
    suspend fun getCount(ownerUserId: String): Int
}
