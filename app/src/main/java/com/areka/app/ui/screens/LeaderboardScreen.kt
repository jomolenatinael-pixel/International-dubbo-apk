package com.areka.app.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.areka.app.data.model.BadgeType
import com.areka.app.data.model.LeaderboardEntry
import com.areka.app.data.repository.StudyRepository
import com.areka.app.ui.theme.*

enum class LeaderboardTab(val title: String) {
    GLOBAL("Global"),
    CLASS_A("Class A"),
    USER_RANK("User's Rank")
}

@Composable
fun LeaderboardScreen(
    onBack: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    BackHandler {
        onBack()
    }

    val userProfile by StudyRepository.userProfile.collectAsStateWithLifecycle()

    var selectedTab by remember { mutableStateOf(LeaderboardTab.GLOBAL) }
    var searchQuery by remember { mutableStateOf("") }

    val entries = remember(selectedTab, userProfile) {
        when (selectedTab) {
            LeaderboardTab.GLOBAL -> StudyRepository.getGlobalLeaderboard(userProfile)
            LeaderboardTab.CLASS_A -> StudyRepository.getClassALeaderboard(userProfile)
            LeaderboardTab.USER_RANK -> StudyRepository.getUserRankSublist(userProfile)
        }
    }

    val filteredEntries = remember(searchQuery, entries) {
        val trimmed = searchQuery.trim()
        if (trimmed.isBlank()) entries
        else entries.filter { it.name.contains(trimmed, ignoreCase = true) }
    }

    Scaffold(
        topBar = {
            Surface(
                color = MaterialTheme.colorScheme.surface,
                tonalElevation = 4.dp,
                border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.3f))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .statusBarsPadding()
                        .padding(horizontal = 16.dp, vertical = 12.dp)
                ) {
                    Text(
                        text = "Top Students - Grade 10",
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    // Tab buttons (Global, Class A, User's Rank)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        LeaderboardTab.entries.forEach { tab ->
                            val isSelected = selectedTab == tab
                            val activeBg = if (LocalThemeIsDark.current) ElectricBlue else MaterialTheme.colorScheme.primary
                            val inactiveBg = MaterialTheme.colorScheme.surfaceVariant

                            Surface(
                                shape = RoundedCornerShape(20.dp),
                                color = if (isSelected) activeBg else inactiveBg,
                                border = androidx.compose.foundation.BorderStroke(
                                    1.dp,
                                    if (isSelected) activeBg else MaterialTheme.colorScheme.outline
                                ),
                                modifier = Modifier
                                    .weight(1f)
                                    .height(42.dp)
                                    .clickable(
                                        role = Role.Tab,
                                        onClickLabel = "Select ${tab.title} leaderboard"
                                    ) { selectedTab = tab }
                                    .testTag("tab_${tab.name}")
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = tab.title,
                                        style = MaterialTheme.typography.labelMedium.copy(
                                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                            color = if (isSelected) Color.White else MaterialTheme.colorScheme.secondaryTextColor
                                        )
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    // Search box
                    OutlinedTextField(
                        value = searchQuery,
                        onValueChange = { searchQuery = it },
                        placeholder = {
                            Text(
                                "Search student name...",
                                color = MaterialTheme.colorScheme.secondaryTextColor,
                                fontSize = 13.sp
                            )
                        },
                        leadingIcon = {
                            Icon(
                                Icons.Default.Search,
                                contentDescription = "Search students",
                                tint = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue,
                                modifier = Modifier.size(18.dp)
                            )
                        },
                        trailingIcon = {
                            if (searchQuery.isNotEmpty()) {
                                IconButton(onClick = { searchQuery = "" }) {
                                    Icon(
                                        Icons.Default.Close,
                                        contentDescription = "Clear search",
                                        tint = MaterialTheme.colorScheme.secondaryTextColor
                                    )
                                }
                            }
                        },
                        shape = RoundedCornerShape(14.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = MaterialTheme.colorScheme.inputFieldBackground,
                            unfocusedContainerColor = MaterialTheme.colorScheme.inputFieldBackground,
                            focusedBorderColor = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue,
                            unfocusedBorderColor = MaterialTheme.colorScheme.outline
                        ),
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(52.dp)
                            .testTag("leaderboard_search")
                    )
                }
            }
        },
        bottomBar = {
            // Sticky user rank bar at bottom
            val stickyBorder = if (LocalThemeIsDark.current) NeonCyan.copy(alpha = 0.6f) else ElectricBlue.copy(alpha = 0.6f)
            val currentRank = userProfile.globalRank
            val topScore = 94800
            val pointsDiff = topScore - userProfile.totalPoints

            Surface(
                color = MaterialTheme.colorScheme.surface,
                border = androidx.compose.foundation.BorderStroke(1.5.dp, stickyBorder),
                shadowElevation = 12.dp,
                shape = RoundedCornerShape(topStart = 18.dp, topEnd = 18.dp),
                modifier = Modifier.windowInsetsPadding(WindowInsets.navigationBars)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Surface(
                            shape = CircleShape,
                            color = (if (LocalThemeIsDark.current) NeonCyan else ElectricBlue).copy(alpha = 0.2f),
                            border = androidx.compose.foundation.BorderStroke(1.dp, if (LocalThemeIsDark.current) NeonCyan else ElectricBlue)
                        ) {
                            Box(
                                modifier = Modifier.size(36.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "#$currentRank",
                                    style = MaterialTheme.typography.labelLarge.copy(
                                        fontWeight = FontWeight.Black,
                                        color = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue
                                    )
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Column {
                            Text(
                                text = "Your Current Rank (${userProfile.name.substringBefore(" ")})",
                                style = MaterialTheme.typography.titleSmall.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            )
                            Text(
                                text = if (pointsDiff > 0) {
                                    "${"%,d".format(pointsDiff)} pts to reach Rank #1"
                                } else {
                                    "You're in 1st Place! 🏆"
                                },
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                            )
                        }
                    }

                    Text(
                        text = "${"%,d".format(userProfile.totalPoints)} pts",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Black,
                            color = AmberGold
                        )
                    )
                }
            }
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 16.dp),
            contentPadding = PaddingValues(top = 12.dp, bottom = 16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(filteredEntries, key = { it.id }) { entry ->
                LeaderboardRowCard(entry = entry)
            }
        }
    }
}

@Composable
fun LeaderboardRowCard(entry: LeaderboardEntry) {
    val isUser = entry.isCurrentUser
    val primaryAccent = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue

    val cardBorder = if (isUser) {
        androidx.compose.foundation.BorderStroke(1.5.dp, primaryAccent)
    } else {
        androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outline)
    }

    val cardBg = if (isUser) {
        primaryAccent.copy(alpha = 0.08f)
    } else {
        MaterialTheme.colorScheme.surface
    }

    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = cardBg),
        border = cardBorder,
        modifier = Modifier
            .fillMaxWidth()
            .testTag("leaderboard_row_${entry.rank}")
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.weight(1f)
            ) {
                // Rank Badge / Number
                Box(
                    modifier = Modifier.size(36.dp),
                    contentAlignment = Alignment.Center
                ) {
                    when (entry.badgeType) {
                        BadgeType.GOLD -> {
                            Icon(
                                imageVector = Icons.Default.EmojiEvents,
                                contentDescription = "Gold Medal",
                                tint = AmberGold,
                                modifier = Modifier.size(28.dp)
                            )
                        }
                        BadgeType.SILVER -> {
                            Icon(
                                imageVector = Icons.Default.MilitaryTech,
                                contentDescription = "Silver Medal",
                                tint = Color(0xFFCBD5E1),
                                modifier = Modifier.size(28.dp)
                            )
                        }
                        BadgeType.BRONZE -> {
                            Icon(
                                imageVector = Icons.Default.MilitaryTech,
                                contentDescription = "Bronze Medal",
                                tint = Color(0xFFD97706),
                                modifier = Modifier.size(28.dp)
                            )
                        }
                        else -> {
                            Text(
                                text = "${entry.rank}.",
                                style = MaterialTheme.typography.titleSmall.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.secondaryTextColor
                                )
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.width(10.dp))

                // Avatar circle
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(Color(entry.avatarColorHex))
                        .border(
                            1.dp,
                            if (isUser) primaryAccent else Color.Transparent,
                            CircleShape
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = entry.name.split(" ").mapNotNull { it.firstOrNull()?.toString() }.take(2).joinToString(""),
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = entry.name,
                            style = MaterialTheme.typography.bodyMedium.copy(
                                fontWeight = if (isUser) FontWeight.Bold else FontWeight.SemiBold,
                                color = if (isUser) primaryAccent else MaterialTheme.colorScheme.onBackground
                            )
                        )
                        if (isUser) {
                            Spacer(modifier = Modifier.width(6.dp))
                            Surface(
                                shape = RoundedCornerShape(6.dp),
                                color = primaryAccent.copy(alpha = 0.2f)
                            ) {
                                Text(
                                    text = "YOU",
                                    style = MaterialTheme.typography.labelSmall.copy(
                                        color = primaryAccent,
                                        fontSize = 9.sp,
                                        fontWeight = FontWeight.Black
                                    ),
                                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp)
                                )
                            }
                        }
                    }

                    Text(
                        text = entry.grade,
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = MaterialTheme.colorScheme.secondaryTextColor,
                            fontSize = 11.sp
                        )
                    )
                }
            }

            // Points
            Text(
                text = "${"%,d".format(entry.points)} pts",
                style = MaterialTheme.typography.titleSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = if (isUser) AmberGold else MaterialTheme.colorScheme.onBackground
                )
            )
        }
    }
}
