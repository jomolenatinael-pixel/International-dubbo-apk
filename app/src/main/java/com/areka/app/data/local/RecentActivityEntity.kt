package com.areka.app.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.areka.app.data.model.RecentActivity

@Entity(tableName = "recent_activities")
data class RecentActivityEntity(
    @PrimaryKey val id: String,
    val title: String,
    val subtitle: String,
    val progressPercent: Int,
    val isCompleted: Boolean = true,
    val iconType: String = "quiz",
    val timestamp: Long = System.currentTimeMillis()
) {
    fun toRecentActivity(): RecentActivity = RecentActivity(
        id = id,
        title = title,
        subtitle = subtitle,
        progressPercent = progressPercent,
        isCompleted = isCompleted,
        iconType = iconType
    )
}
