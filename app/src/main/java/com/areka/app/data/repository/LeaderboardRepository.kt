package com.areka.app.data.repository

import com.areka.app.data.model.BadgeType
import com.areka.app.data.model.LeaderboardEntry
import com.areka.app.data.model.UserProfile

interface LeaderboardDataSource {
    fun globalEntries(): List<LeaderboardEntry>
    fun classAEntries(userProfile: UserProfile): List<LeaderboardEntry>
}

class MockLeaderboardDataSource : LeaderboardDataSource {
    override fun globalEntries(): List<LeaderboardEntry> = listOf(
        LeaderboardEntry("u1", 1, "Alex Chen", "Grade 10", 94800, false, BadgeType.GOLD, 0xFF3B82F6),
        LeaderboardEntry("u2", 2, "Sarah Johnson", "Grade 10", 91200, false, BadgeType.SILVER, 0xFFEC4899),
        LeaderboardEntry("u3", 3, "Fatima Khan", "Grade 10", 88900, false, BadgeType.BRONZE, 0xFF8B5CF6),
        LeaderboardEntry("u4", 4, "John Doe", "Grade 10", 86200, false, BadgeType.REGULAR, 0xFF10B981),
        LeaderboardEntry("u5", 5, "John Doe Jr", "Grade 10", 84500, false, BadgeType.REGULAR, 0xFFF59E0B),
        LeaderboardEntry("u6", 6, "Tanya Ross", "Grade 10", 83000, false, BadgeType.REGULAR, 0xFF00D2FF),
        LeaderboardEntry("u7", 7, "Soph Ehen", "Grade 10", 81500, false, BadgeType.REGULAR, 0xFF6366F1),
        LeaderboardEntry("u8", 8, "Marcus Wright", "Grade 10", 79200, false, BadgeType.REGULAR, 0xFF14B8A6),
        LeaderboardEntry("u9", 9, "Emma Wilson", "Grade 10", 78100, false, BadgeType.REGULAR, 0xFFF43F5E),
        LeaderboardEntry("u10", 10, "Liam Davis", "Grade 10", 76400, false, BadgeType.REGULAR, 0xFF84CC16),
        LeaderboardEntry("u_user", 11, "Student", "Grade 10", 0, true, BadgeType.REGULAR, 0xFF00D2FF)
    )

    override fun classAEntries(userProfile: UserProfile): List<LeaderboardEntry> = listOf(
        LeaderboardEntry("u_user", 1, userProfile.name, "Class A", userProfile.totalPoints, true, BadgeType.GOLD, 0xFF00D2FF),
        LeaderboardEntry("u3", 2, "Fatima Khan", "Class A", 88900, false, BadgeType.SILVER, 0xFF8B5CF6),
        LeaderboardEntry("u4", 3, "John Doe", "Class A", 86200, false, BadgeType.BRONZE, 0xFF10B981),
        LeaderboardEntry("u7", 4, "Soph Ehen", "Class A", 81500, false, BadgeType.REGULAR, 0xFF6366F1),
        LeaderboardEntry("u8", 5, "Marcus Wright", "Class A", 79200, false, BadgeType.REGULAR, 0xFF14B8A6)
    )
}

class LeaderboardRepository(private val dataSource: LeaderboardDataSource) {
    fun global(userProfile: UserProfile): List<LeaderboardEntry> = rank(
        dataSource.globalEntries().map { if (it.isCurrentUser) it.copy(name = userProfile.name, grade = userProfile.grade, points = userProfile.totalPoints) else it }
    )

    fun classA(userProfile: UserProfile): List<LeaderboardEntry> = rank(dataSource.classAEntries(userProfile))

    fun userRank(userProfile: UserProfile): List<LeaderboardEntry> = global(userProfile).take(3)

    private fun rank(entries: List<LeaderboardEntry>): List<LeaderboardEntry> = entries
        .sortedByDescending { it.points }
        .mapIndexed { index, entry ->
            entry.copy(
                rank = index + 1,
                badgeType = when (index) {
                    0 -> BadgeType.GOLD
                    1 -> BadgeType.SILVER
                    2 -> BadgeType.BRONZE
                    else -> BadgeType.REGULAR
                }
            )
        }
}
