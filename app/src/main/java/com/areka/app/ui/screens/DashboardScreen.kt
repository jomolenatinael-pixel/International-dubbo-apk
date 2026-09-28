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
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.areka.app.data.model.Quiz
import com.areka.app.data.model.SubjectItem
import com.areka.app.data.model.UserProfile
import com.areka.app.data.repository.StudyRepository
import com.areka.app.ui.components.MistakesReviewDialog
import com.areka.app.ui.components.UnitSelectionDialog
import com.areka.app.ui.theme.*

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
    val activities by StudyRepository.recentActivities.collectAsStateWithLifecycle()
    val dueFlashcardsCount by StudyRepository.dueFlashcardsCount.collectAsStateWithLifecycle()
    val openMistakes by StudyRepository.openMistakes.collectAsStateWithLifecycle()
    var showReviewMistakesDialog by remember { mutableStateOf(false) }

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
                            text = "Grade 10 · New Curriculum",
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
                            "Search subjects and quizzes...",
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

            // Home "Today" Section: Continue last study + due flashcards count + start button
            item(key = "today_study_card") {
                val lastActivity = activities.firstOrNull()
                val activityParts = lastActivity?.iconType?.split("|") ?: emptyList()
                val lastMode = activityParts.getOrNull(0) ?: "flashcards"
                val lastStudySubject = subjects.find { it.id == activityParts.getOrNull(1) } ?: subjects.first()
                val lastStudyUnit = StudyRepository.getUnitsForSubject(lastStudySubject.id)
                    .find { it.id == activityParts.getOrNull(2) }
                    ?: StudyRepository.getUnitsForSubject(lastStudySubject.id).firstOrNull()
                val lastStudyTitle = lastActivity?.let { "${lastStudySubject.name} · ${lastStudyUnit?.title ?: it.subtitle}" }
                    ?: "${lastStudySubject.name}: ${lastStudyUnit?.title ?: "Unit 1"}"

                Card(
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                    border = androidx.compose.foundation.BorderStroke(
                        1.dp,
                        Brush.horizontalGradient(listOf(NeonCyan.copy(alpha = 0.6f), ElectricBlue.copy(alpha = 0.6f)))
                    ),
                    elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("today_card")
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                Brush.linearGradient(
                                    listOf(
                                        ElectricBlue.copy(alpha = 0.12f),
                                        NeonCyan.copy(alpha = 0.08f),
                                        Color.Transparent
                                    )
                                )
                            )
                            .padding(18.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Surface(
                                    shape = RoundedCornerShape(8.dp),
                                    color = (if (LocalThemeIsDark.current) NeonCyan else ElectricBlue).copy(alpha = 0.15f)
                                ) {
                                    Text(
                                        text = "TODAY",
                                        style = MaterialTheme.typography.labelSmall.copy(
                                            fontWeight = FontWeight.Black,
                                            color = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue,
                                            letterSpacing = 1.sp
                                        ),
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = "Your next study step",
                                    style = MaterialTheme.typography.bodySmall.copy(
                                        color = MaterialTheme.colorScheme.secondaryTextColor,
                                        fontWeight = FontWeight.Medium
                                    )
                                )
                            }

                            // Due flashcards count pill
                            Surface(
                                shape = RoundedCornerShape(12.dp),
                                color = AmberGold.copy(alpha = 0.15f),
                                border = androidx.compose.foundation.BorderStroke(1.dp, AmberGold.copy(alpha = 0.4f)),
                                modifier = Modifier.testTag("due_flashcards_count_pill")
                            ) {
                                Row(
                                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Style,
                                        contentDescription = null,
                                        tint = AmberGold,
                                        modifier = Modifier.size(14.dp)
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(
                                        text = "$dueFlashcardsCount Due",
                                        style = MaterialTheme.typography.labelSmall.copy(
                                            fontWeight = FontWeight.Bold,
                                            color = AmberGold
                                        )
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(12.dp))

                        // Continue Last Study Details
                        Text(
                            text = if (lastActivity == null) "Start with Mathematics · Unit 1" else "Continue $lastStudyTitle",
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onBackground
                            ),
                            maxLines = 2
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = if (lastActivity == null) "Build your first study habit with a short unit session." else "Pick up where you left off.",
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = MaterialTheme.colorScheme.secondaryTextColor
                            )
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        // Start Study Button
                        Button(
                            onClick = {
                                if (lastStudyUnit != null && lastMode == "quiz") {
                                    onStartQuiz(StudyRepository.getQuizForUnit(lastStudyUnit.id))
                                } else if (lastStudyUnit != null) {
                                    onOpenFlashcards(lastStudySubject.id, lastStudyUnit.id)
                                } else {
                                    onStartQuiz(allQuizzes.first())
                                }
                            },
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = ElectricBlue),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(46.dp)
                                .testTag("today_start_button")
                        ) {
                            Icon(Icons.Default.PlayArrow, contentDescription = null, modifier = Modifier.size(18.dp))
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(if (lastActivity == null) "Start with Mathematics · Unit 1" else "Continue", fontWeight = FontWeight.Bold)
                        }

                        if (openMistakes.isNotEmpty()) {
                            Spacer(modifier = Modifier.height(8.dp))
                            OutlinedButton(
                                onClick = { showReviewMistakesDialog = true },
                                shape = RoundedCornerShape(12.dp),
                                border = androidx.compose.foundation.BorderStroke(1.dp, CoralRed.copy(alpha = 0.5f)),
                                colors = ButtonDefaults.outlinedButtonColors(contentColor = CoralRed),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("review_mistakes_home_button")
                            ) {
                                Icon(Icons.Default.ErrorOutline, contentDescription = null, modifier = Modifier.size(16.dp), tint = CoralRed)
                                Spacer(modifier = Modifier.width(6.dp))
                                Text("Review ${openMistakes.size} Quiz Mistakes", fontWeight = FontWeight.SemiBold)
                            }
                        }
                    }
                }
            }

            // Due today: honest scheduler state, never fabricated progress.
            item(key = "due_today_section") {
                Card(
                    shape = RoundedCornerShape(18.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                    border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
                    modifier = Modifier.fillMaxWidth().testTag("due_today_card")
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Default.Schedule, contentDescription = null, tint = AmberGold, modifier = Modifier.size(20.dp))
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Due today", style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold))
                        }
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = if (dueFlashcardsCount == 0) "You're clear for today." else "$dueFlashcardsCount flashcards are ready for review.",
                            style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.secondaryTextColor)
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        if (dueFlashcardsCount > 0) {
                            Button(
                                onClick = {
                                    val subject = subjects.first()
                                    val unit = StudyRepository.getUnitsForSubject(subject.id).firstOrNull()
                                    if (unit != null) onOpenFlashcards(subject.id, unit.id)
                                },
                                shape = RoundedCornerShape(12.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue),
                                modifier = Modifier.fillMaxWidth().height(46.dp).testTag("review_due_button")
                            ) { Text("Review due cards", fontWeight = FontWeight.Bold) }
                        } else {
                            OutlinedButton(
                                onClick = { selectedSubjectForUnits = subjects.firstOrNull() },
                                shape = RoundedCornerShape(12.dp),
                                modifier = Modifier.fillMaxWidth().height(46.dp)
                            ) { Text("Pick a unit to learn something new") }
                        }
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

    if (showReviewMistakesDialog) {
        MistakesReviewDialog(
            mistakes = openMistakes,
            onDismiss = { showReviewMistakesDialog = false },
            onMarkReviewed = { quizId, questionId ->
                StudyRepository.markMistakeReviewed(quizId, questionId)
            },
            onClearAll = {
                StudyRepository.markAllMistakesReviewed()
                showReviewMistakesDialog = false
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
