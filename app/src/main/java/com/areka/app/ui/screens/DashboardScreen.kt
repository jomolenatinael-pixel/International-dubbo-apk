package com.areka.app.ui.screens

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.automirrored.filled.TrendingUp
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.areka.app.data.model.DailyStreakBadge
import com.areka.app.data.model.Quiz
import com.areka.app.data.model.SubjectItem
import com.areka.app.data.model.UserProfile
import com.areka.app.data.repository.StudyRepository
import com.areka.app.ui.components.GlowingBadgeItem
import com.areka.app.ui.components.UnitSelectionDialog
import com.areka.app.ui.theme.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun DashboardScreen(
    userProfile: UserProfile,
    onStartQuiz: (Quiz) -> Unit,
    onOpenFlashcards: (String, String) -> Unit,
    searchQuery: String = "",
    onSearchQueryChange: (String) -> Unit = {},
    modifier: Modifier = Modifier
) {
    var selectedSubjectForUnits by remember { mutableStateOf<SubjectItem?>(null) }
    var isUploadingDoc by remember { mutableStateOf(false) }
    val coroutineScope = rememberCoroutineScope()

    val streakBadges = StudyRepository.streakBadges
    val subjects = StudyRepository.subjects
    val allQuizzes = StudyRepository.allQuizzes

    // Filtered lists based on search
    val trimmedQuery = searchQuery.trim()
    val isSearching = trimmedQuery.isNotEmpty()

    val filteredSubjects = remember(trimmedQuery, subjects) {
        if (!isSearching) subjects
        else subjects.filter { it.name.contains(trimmedQuery, ignoreCase = true) }
    }

    val filteredQuizzes = remember(trimmedQuery, allQuizzes) {
        if (!isSearching) allQuizzes
        else allQuizzes.filter {
            it.title.contains(trimmedQuery, ignoreCase = true) ||
            it.subject.contains(trimmedQuery, ignoreCase = true)
        }
    }

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        contentPadding = PaddingValues(top = 8.dp, bottom = 80.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        // Welcome Header & Search
        item(key = "header_section") {
            Column(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "Welcome, ${userProfile.name.substringBefore(" ")}!",
                            style = MaterialTheme.typography.headlineMedium.copy(
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onBackground
                            )
                        )
                        Text(
                            text = "${userProfile.grade} • High School STEM Track",
                            style = MaterialTheme.typography.bodyMedium.copy(
                                color = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue,
                                fontWeight = FontWeight.SemiBold
                            )
                        )
                    }

                    Surface(
                        shape = CircleShape,
                        color = MaterialTheme.colorScheme.surface,
                        border = androidx.compose.foundation.BorderStroke(1.5.dp, NeonCyan.copy(alpha = 0.6f)),
                        modifier = Modifier
                            .size(48.dp)
                            .shadow(6.dp, CircleShape, ambientColor = NeonCyan)
                    ) {
                        val initials = userProfile.name.split(" ")
                            .filter { it.isNotBlank() }
                            .mapNotNull { it.firstOrNull()?.uppercase() }
                            .take(2)
                            .joinToString("")
                            .ifEmpty { "A" }
                        Box(contentAlignment = Alignment.Center) {
                            Text(
                                text = initials,
                                style = MaterialTheme.typography.titleMedium.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue
                                )
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))

                // Modern Search Bar
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = onSearchQueryChange,
                    placeholder = {
                        Text(
                            "Search quizzes, periodic trends, algebra...",
                            color = MaterialTheme.colorScheme.secondaryTextColor,
                            fontSize = 14.sp
                        )
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search icon",
                            tint = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue
                        )
                    },
                    trailingIcon = {
                        if (searchQuery.isNotEmpty()) {
                            IconButton(onClick = { onSearchQueryChange("") }) {
                                Icon(
                                    imageVector = Icons.Default.Close,
                                    contentDescription = "Clear search query",
                                    tint = MaterialTheme.colorScheme.secondaryTextColor
                                )
                            }
                        }
                    },
                    shape = RoundedCornerShape(16.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = MaterialTheme.colorScheme.inputFieldBackground,
                        unfocusedContainerColor = MaterialTheme.colorScheme.inputFieldBackground,
                        focusedBorderColor = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue,
                        unfocusedBorderColor = MaterialTheme.colorScheme.outline
                    ),
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("dashboard_search_input")
                )
            }
        }

        // When actively searching, show matched results directly
        if (isSearching) {
            item(key = "search_results_header") {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Search Results for \"$trimmedQuery\"",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    )
                    TextButton(onClick = { onSearchQueryChange("") }) {
                        Text("Clear")
                    }
                }
            }

            if (filteredQuizzes.isEmpty() && filteredSubjects.isEmpty()) {
                item(key = "search_empty") {
                    Card(
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                        border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(28.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Default.SearchOff,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.secondaryTextColor,
                                modifier = Modifier.size(44.dp)
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "No quizzes found matching \"$trimmedQuery\"",
                                style = MaterialTheme.typography.bodyMedium.copy(
                                    color = MaterialTheme.colorScheme.secondaryTextColor,
                                    fontWeight = FontWeight.Medium
                                )
                            )
                            Spacer(modifier = Modifier.height(12.dp))
                            Button(
                                onClick = { onSearchQueryChange("") },
                                shape = RoundedCornerShape(12.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = ElectricBlue)
                            ) {
                                Icon(Icons.Default.Clear, contentDescription = null, modifier = Modifier.size(16.dp))
                                Spacer(modifier = Modifier.width(6.dp))
                                Text("Clear Search")
                            }
                        }
                    }
                }
            } else {
                items(filteredQuizzes, key = { "search_quiz_${it.id}" }) { quiz ->
                    Card(
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                        border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { onStartQuiz(quiz) }
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = quiz.title,
                                    style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                                )
                                Text(
                                    text = "${quiz.subject} • ${quiz.questions.size} Questions • ${quiz.durationMinutes} mins",
                                    style = MaterialTheme.typography.bodySmall.copy(
                                        color = MaterialTheme.colorScheme.secondaryTextColor
                                    )
                                )
                            }
                            Button(
                                onClick = { onStartQuiz(quiz) },
                                shape = RoundedCornerShape(10.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = ElectricBlue),
                                contentPadding = PaddingValues(horizontal = 14.dp, vertical = 6.dp)
                            ) {
                                Text("Start")
                            }
                        }
                    }
                }
            }
        } else {
            // Standard Dashboard layout when not searching

            // Upload Textbook for Quiz Card
            item(key = "upload_card") {
                Card(
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                    border = androidx.compose.foundation.BorderStroke(
                        1.dp,
                        Brush.horizontalGradient(listOf(NeonCyan.copy(alpha = 0.5f), NeonPurple.copy(alpha = 0.5f)))
                    ),
                    elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("upload_textbook_card")
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                Brush.linearGradient(
                                    listOf(
                                        ElectricBlue.copy(alpha = 0.12f),
                                        NeonPurple.copy(alpha = 0.08f),
                                        Color.Transparent
                                    )
                                )
                            )
                            .padding(18.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(48.dp)
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(NeonCyan.copy(alpha = 0.2f))
                                    .border(1.dp, NeonCyan.copy(alpha = 0.4f), RoundedCornerShape(12.dp)),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Description,
                                    contentDescription = "Textbook Document",
                                    tint = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue,
                                    modifier = Modifier.size(26.dp)
                                )
                            }

                            Spacer(modifier = Modifier.width(14.dp))

                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "Upload Textbook for Quiz",
                                    style = MaterialTheme.typography.titleMedium.copy(
                                        fontWeight = FontWeight.Bold,
                                        color = MaterialTheme.colorScheme.onBackground
                                    )
                                )
                                Text(
                                    text = "Generate questions instantly from your syllabus",
                                    style = MaterialTheme.typography.bodySmall.copy(
                                        color = MaterialTheme.colorScheme.secondaryTextColor,
                                        fontSize = 12.sp
                                    )
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        if (isUploadingDoc) {
                            Column(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                LinearProgressIndicator(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(6.dp)
                                        .clip(RoundedCornerShape(3.dp)),
                                    color = NeonCyan,
                                    trackColor = MaterialTheme.colorScheme.outline
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text = "Analyzing chapters with Gemini AI...",
                                    style = MaterialTheme.typography.bodySmall.copy(
                                        color = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                )
                            }
                        } else {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "Supported: PDF, EPUB, Notes",
                                    style = MaterialTheme.typography.labelSmall.copy(
                                        color = MaterialTheme.colorScheme.secondaryTextColor
                                    )
                                )

                                Button(
                                    onClick = {
                                        if (isUploadingDoc) return@Button
                                        isUploadingDoc = true
                                        coroutineScope.launch {
                                            delay(1400)
                                            isUploadingDoc = false
                                            val newQuiz = StudyRepository.getQuizForUnit("chem_u2")
                                            onStartQuiz(newQuiz)
                                        }
                                    },
                                    enabled = !isUploadingDoc,
                                    shape = RoundedCornerShape(12.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = ElectricBlue,
                                        contentColor = Color.White
                                    ),
                                    modifier = Modifier
                                        .heightIn(min = 44.dp)
                                        .testTag("upload_quiz_button")
                                ) {
                                    Icon(Icons.Default.CloudUpload, contentDescription = null, modifier = Modifier.size(16.dp))
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text("Generate Quiz", fontWeight = FontWeight.SemiBold)
                                }
                            }
                        }
                    }
                }
            }

            // Recent Quizzes Row (History, Biology, Chemistry)
            item(key = "recent_quizzes_section") {
                Column(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Recent Quizzes",
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onBackground
                            )
                        )

                        TextButton(
                            onClick = { selectedSubjectForUnits = subjects.firstOrNull() }
                        ) {
                            Text(
                                text = "View All",
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        RecentQuizMiniCard(
                            title = "History",
                            scoreText = "85% Avg",
                            accentColor = AmberGold,
                            icon = Icons.Default.AccountBalance,
                            modifier = Modifier.weight(1f),
                            onClick = { selectedSubjectForUnits = subjects.find { it.id == "history" } }
                        )
                        RecentQuizMiniCard(
                            title = "Biology",
                            scoreText = "92% Avg",
                            accentColor = EmeraldGreen,
                            icon = Icons.Default.Biotech,
                            modifier = Modifier.weight(1f),
                            onClick = { selectedSubjectForUnits = subjects.find { it.id == "biology" } }
                        )
                        RecentQuizMiniCard(
                            title = "Chemistry",
                            scoreText = "Active",
                            accentColor = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue,
                            icon = Icons.Default.Science,
                            modifier = Modifier.weight(1f),
                            onClick = { selectedSubjectForUnits = subjects.find { it.id == "chemistry" } }
                        )
                    }
                }
            }

            // Subject Overview Grid (All 9 subjects)
            item(key = "subjects_section") {
                Column(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Subject Overview",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    subjects.chunked(3).forEachIndexed { rowIndex, rowSubjects ->
                        if (rowIndex > 0) {
                            Spacer(modifier = Modifier.height(8.dp))
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            rowSubjects.forEach { subject ->
                                SubjectPillCard(
                                    subject = subject,
                                    modifier = Modifier.weight(1f),
                                    onClick = { selectedSubjectForUnits = subject }
                                )
                            }
                            repeat(3 - rowSubjects.size) {
                                Spacer(modifier = Modifier.weight(1f))
                            }
                        }
                    }
                }
            }

            // Daily Streak Section
            item(key = "daily_streak_section") {
                Card(
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                    border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("daily_streak_section")
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Daily Streak",
                                style = MaterialTheme.typography.titleMedium.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onBackground
                                )
                            )

                            Text(
                                text = "45-Day Record!",
                                style = MaterialTheme.typography.labelMedium.copy(
                                    color = AmberGold,
                                    fontWeight = FontWeight.Bold
                                )
                            )
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            // Circular Streak indicator
                            Box(
                                modifier = Modifier
                                    .size(72.dp)
                                    .clip(CircleShape)
                                    .background(
                                        Brush.radialGradient(
                                            listOf(
                                                AmberGold.copy(alpha = 0.25f),
                                                MaterialTheme.colorScheme.surfaceVariant
                                            )
                                        )
                                    )
                                    .border(2.dp, AmberGold, CircleShape),
                                contentAlignment = Alignment.Center
                            ) {
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text(
                                        text = "${userProfile.streakDays}",
                                        style = MaterialTheme.typography.titleLarge.copy(
                                            fontWeight = FontWeight.Black,
                                            color = AmberGold
                                        )
                                    )
                                    Text(
                                        text = "DAYS",
                                        style = MaterialTheme.typography.labelSmall.copy(
                                            fontSize = 9.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = MaterialTheme.colorScheme.secondaryTextColor
                                        )
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.width(16.dp))

                            // Glowing badges row
                            LazyRow(
                                modifier = Modifier.weight(1f),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                items(streakBadges, key = { it.title }) { badge ->
                                    GlowingBadgeItem(
                                        title = badge.title,
                                        days = badge.daysRequired,
                                        color = Color(badge.colorHex),
                                        isUnlocked = badge.isUnlocked
                                    )
                                }
                            }
                        }
                    }
                }
            }

            // Recommendations Card
            item(key = "recommendation_section") {
                Column(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "Recommendations",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Card(
                        shape = RoundedCornerShape(18.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                        border = androidx.compose.foundation.BorderStroke(1.dp, NeonPurple.copy(alpha = 0.4f)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable(
                                role = Role.Button,
                                onClickLabel = "Start Algebra Review Quiz"
                            ) { onStartQuiz(StudyRepository.algebraReviewQuiz) }
                            .testTag("recommended_quiz_card")
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.weight(1f)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(46.dp)
                                        .clip(RoundedCornerShape(12.dp))
                                        .background(NeonPurple.copy(alpha = 0.2f)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Calculate,
                                        contentDescription = "Math icon",
                                        tint = NeonPurple,
                                        modifier = Modifier.size(24.dp)
                                    )
                                }

                                Spacer(modifier = Modifier.width(12.dp))

                                Column {
                                    Text(
                                        text = "Algebra Review Quiz",
                                        style = MaterialTheme.typography.titleSmall.copy(
                                            fontWeight = FontWeight.Bold,
                                            color = MaterialTheme.colorScheme.onBackground
                                        )
                                    )
                                    Text(
                                        text = "Grade 10 • 3 Questions • 12 mins",
                                        style = MaterialTheme.typography.bodySmall.copy(
                                            color = MaterialTheme.colorScheme.secondaryTextColor,
                                            fontSize = 11.sp
                                        )
                                    )
                                }
                            }

                            IconButton(
                                onClick = { onStartQuiz(StudyRepository.algebraReviewQuiz) },
                                modifier = Modifier
                                    .size(44.dp)
                                    .clip(CircleShape)
                                    .background(NeonPurple)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.PlayArrow,
                                    contentDescription = "Start Algebra Quiz",
                                    tint = Color.White,
                                    modifier = Modifier.size(22.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    selectedSubjectForUnits?.let { selectedSubject ->
        UnitSelectionDialog(
            subject = selectedSubject,
            onDismiss = { selectedSubjectForUnits = null },
            onStartQuizForUnit = { quiz ->
                selectedSubjectForUnits = null
                onStartQuiz(quiz)
            },
            onOpenFlashcardsForUnit = { subjectId, unitId ->
                selectedSubjectForUnits = null
                onOpenFlashcards(subjectId, unitId)
            }
        )
    }
}

@Composable
fun RecentQuizMiniCard(
    title: String,
    scoreText: String,
    accentColor: Color,
    icon: ImageVector,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = MaterialTheme.colorScheme.surface,
        border = androidx.compose.foundation.BorderStroke(1.dp, accentColor.copy(alpha = 0.35f)),
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .clickable(
                role = Role.Button,
                onClickLabel = "Open $title quiz",
                onClick = onClick
            )
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(accentColor.copy(alpha = 0.15f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = "$title icon",
                    tint = accentColor,
                    modifier = Modifier.size(18.dp)
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = title,
                style = MaterialTheme.typography.labelLarge.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
            )

            Text(
                text = scoreText,
                style = MaterialTheme.typography.bodySmall.copy(
                    color = accentColor,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
        }
    }
}

@Composable
fun SubjectPillCard(
    subject: SubjectItem,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    val color = Color(subject.accentColorHex)
    Surface(
        shape = RoundedCornerShape(14.dp),
        color = MaterialTheme.colorScheme.surface,
        border = androidx.compose.foundation.BorderStroke(1.dp, color.copy(alpha = 0.3f)),
        modifier = modifier
            .clip(RoundedCornerShape(14.dp))
            .clickable(
                role = Role.Button,
                onClickLabel = "Select subject ${subject.name}",
                onClick = onClick
            )
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(26.dp)
                    .clip(CircleShape)
                    .background(color.copy(alpha = 0.2f)),
                contentAlignment = Alignment.Center
            ) {
                val icon = when (subject.iconType) {
                    "calculator" -> Icons.Default.Calculate
                    "atom" -> Icons.Default.AllInclusive
                    "beaker" -> Icons.Default.Science
                    "dna" -> Icons.Default.Biotech
                    "globe" -> Icons.Default.Public
                    "balance" -> Icons.Default.AccountBalance
                    "trending_up" -> Icons.AutoMirrored.Filled.TrendingUp
                    "pillar" -> Icons.Default.HistoryEdu
                    "fitness" -> Icons.Default.FitnessCenter
                    else -> Icons.AutoMirrored.Filled.MenuBook
                }
                Icon(icon, contentDescription = null, tint = color, modifier = Modifier.size(14.dp))
            }

            Spacer(modifier = Modifier.width(6.dp))

            Text(
                text = subject.name,
                style = MaterialTheme.typography.labelSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                ),
                maxLines = 1
            )
        }
    }
}
