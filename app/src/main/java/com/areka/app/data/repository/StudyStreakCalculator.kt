package com.areka.app.data.repository

object StudyStreakCalculator {
    fun nextStreak(currentStreak: Int, lastActiveEpochDay: Long, todayEpochDay: Long): Int {
        val safeCurrent = currentStreak.coerceAtLeast(0)
        return when {
            lastActiveEpochDay == todayEpochDay -> safeCurrent
            lastActiveEpochDay == todayEpochDay - 1L -> safeCurrent + 1
            else -> 1
        }
    }
}
