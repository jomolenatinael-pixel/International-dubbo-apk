package com.areka.app.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.animation.*
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.ViewList
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.areka.app.data.local.CardStatus
import com.areka.app.data.local.FlashcardScheduleEntity
import com.areka.app.data.local.ReviewGrade
import com.areka.app.data.model.Flashcard
import com.areka.app.data.model.Quiz
import com.areka.app.data.model.SubjectItem
import com.areka.app.data.model.SubjectUnit
import com.areka.app.data.repository.FlashcardScheduler
import com.areka.app.data.repository.StudyRepository
import com.areka.app.ui.theme.*

@Composable
fun FlashcardsScreen(
    initialSubjectId: String? = null,
    initialUnitId: String? = null,
    onStartQuiz: (Quiz) -> Unit,
    onBack: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val subjects = StudyRepository.subjects

    var selectedSubjectId by remember(initialSubjectId) {
        mutableStateOf(initialSubjectId ?: subjects.first().id)
    }

    val currentSubject = subjects.find { it.id == selectedSubjectId } ?: subjects.first()
    val unitsForSubject = remember(selectedSubjectId) {
        StudyRepository.getUnitsForSubject(selectedSubjectId)
    }

    var selectedUnitId by remember(initialUnitId, selectedSubjectId) {
        mutableStateOf(initialUnitId ?: unitsForSubject.firstOrNull()?.id)
    }

    val currentUnit = unitsForSubject.find { it.id == selectedUnitId } ?: unitsForSubject.firstOrNull()

    // Mode: if a unit is selected, show Study Flashcards view, otherwise show Unit selection list
    var isStudyingCards by remember(selectedUnitId) {
        mutableStateOf(selectedUnitId != null)
    }

    BackHandler {
        if (isStudyingCards && unitsForSubject.size > 1) {
            isStudyingCards = false
        } else {
            onBack()
        }
    }

    val accentColor = Color(currentSubject.accentColorHex)

    Scaffold(
        topBar = {
            Surface(
                color = MaterialTheme.colorScheme.surface,
                tonalElevation = 4.dp,
                border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.3f))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .statusBarsPadding()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = {
                                if (isStudyingCards) {
                                    isStudyingCards = false
                                } else {
                                    onBack()
                                }
                            },
                            modifier = Modifier
                                .size(40.dp)
                                .testTag("flashcards_back_button")
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Back",
                                tint = MaterialTheme.colorScheme.onBackground
                            )
                        }

                        Spacer(modifier = Modifier.width(6.dp))

                        Column {
                            Text(
                                text = if (isStudyingCards && currentUnit != null) currentUnit.title else "Flashcards",
                                style = MaterialTheme.typography.titleMedium.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onBackground
                                ),
                                maxLines = 1
                            )
                            Text(
                                text = "${currentSubject.name} • ${if (isStudyingCards) "Study Mode" else "Pick a Unit"}",
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = accentColor,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                            )
                        }
                    }

                    if (isStudyingCards && currentUnit != null) {
                        TextButton(
                            onClick = { isStudyingCards = false },
                            modifier = Modifier.testTag("change_unit_btn")
                        ) {
                            Text(
                                text = "Units",
                                color = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
        },
        modifier = modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            // Horizontal Subject Selector Tabs
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp),
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(subjects, key = { it.id }) { subject ->
                    val isSelected = subject.id == selectedSubjectId
                    val subColor = Color(subject.accentColorHex)

                    Surface(
                        shape = RoundedCornerShape(16.dp),
                        color = if (isSelected) subColor.copy(alpha = 0.2f) else MaterialTheme.colorScheme.surface,
                        border = androidx.compose.foundation.BorderStroke(
                            1.dp,
                            if (isSelected) subColor else MaterialTheme.colorScheme.outline.copy(alpha = 0.4f)
                        ),
                        modifier = Modifier
                            .clickable(
                                role = Role.Tab,
                                onClick = {
                                    selectedSubjectId = subject.id
                                    val newUnits = StudyRepository.getUnitsForSubject(subject.id)
                                    selectedUnitId = newUnits.firstOrNull()?.id
                                }
                            )
                            .testTag("subject_tab_${subject.id}")
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(8.dp)
                                    .clip(CircleShape)
                                    .background(subColor)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = subject.name,
                                style = MaterialTheme.typography.labelMedium.copy(
                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                    color = if (isSelected) MaterialTheme.colorScheme.onBackground else MaterialTheme.colorScheme.secondaryTextColor
                                )
                            )
                        }
                    }
                }
            }

            if (!isStudyingCards || currentUnit == null) {
                // Unit Selection List View
                Text(
                    text = "Select a unit in ${currentSubject.name} to start studying:",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = MaterialTheme.colorScheme.secondaryTextColor,
                        fontWeight = FontWeight.Medium
                    ),
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 6.dp)
                )

                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(horizontal = 16.dp),
                    contentPadding = PaddingValues(top = 8.dp, bottom = 80.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(unitsForSubject, key = { it.id }) { unit ->
                        Card(
                            shape = RoundedCornerShape(18.dp),
                            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                            border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    selectedUnitId = unit.id
                                    isStudyingCards = true
                                }
                                .testTag("unit_study_card_${unit.id}")
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Surface(
                                        shape = RoundedCornerShape(8.dp),
                                        color = accentColor.copy(alpha = 0.15f),
                                        border = androidx.compose.foundation.BorderStroke(1.dp, accentColor.copy(alpha = 0.3f))
                                    ) {
                                        Text(
                                            text = "Unit ${unit.unitNumber}",
                                            style = MaterialTheme.typography.labelSmall.copy(
                                                fontWeight = FontWeight.Bold,
                                                color = accentColor
                                            ),
                                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                                        )
                                    }

                                    Text(
                                        text = "${unit.flashcardCount} Flashcards",
                                        style = MaterialTheme.typography.bodySmall.copy(
                                            color = MaterialTheme.colorScheme.secondaryTextColor,
                                            fontWeight = FontWeight.SemiBold
                                        )
                                    )
                                }

                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = unit.title,
                                    style = MaterialTheme.typography.titleMedium.copy(
                                        fontWeight = FontWeight.Bold,
                                        color = MaterialTheme.colorScheme.onBackground
                                    )
                                )

                                Text(
                                    text = unit.description,
                                    style = MaterialTheme.typography.bodySmall.copy(
                                        color = MaterialTheme.colorScheme.secondaryTextColor
                                    )
                                )

                                Spacer(modifier = Modifier.height(14.dp))

                                Row(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                                ) {
                                    Button(
                                        onClick = {
                                            selectedUnitId = unit.id
                                            isStudyingCards = true
                                        },
                                        shape = RoundedCornerShape(12.dp),
                                        colors = ButtonDefaults.buttonColors(containerColor = accentColor),
                                        modifier = Modifier.weight(1f)
                                    ) {
                                        Icon(Icons.Default.Style, contentDescription = null, modifier = Modifier.size(16.dp))
                                        Spacer(modifier = Modifier.width(6.dp))
                                        Text("Study Cards")
                                    }

                                    OutlinedButton(
                                        onClick = {
                                            val quiz = StudyRepository.getQuizForUnit(unit.id)
                                            onStartQuiz(quiz)
                                        },
                                        shape = RoundedCornerShape(12.dp),
                                        modifier = Modifier.weight(1f)
                                    ) {
                                        Icon(Icons.Default.Quiz, contentDescription = null, modifier = Modifier.size(16.dp))
                                        Spacer(modifier = Modifier.width(6.dp))
                                        Text("Unit Quiz")
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                // Interactive Flashcard Study Mode
                val cards = remember(currentUnit.id) {
                    StudyRepository.getFlashcardsForUnit(currentUnit.id)
                }

                InteractiveFlashcardDeck(
                    cards = cards,
                    unit = currentUnit,
                    accentColor = accentColor,
                    onStartQuiz = {
                        val quiz = StudyRepository.getQuizForUnit(currentUnit.id)
                        onStartQuiz(quiz)
                    },
                    onDone = { isStudyingCards = false }
                )
            }
        }
    }
}

@Composable
fun InteractiveFlashcardDeck(
    cards: List<Flashcard>,
    unit: SubjectUnit,
    accentColor: Color,
    onStartQuiz: () -> Unit,
    onDone: () -> Unit
) {
    if (cards.isEmpty()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                        .background(accentColor.copy(alpha = 0.15f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Style,
                        contentDescription = null,
                        tint = accentColor,
                        modifier = Modifier.size(32.dp)
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "No cards for this unit yet",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "New flashcard content will be added in upcoming curriculum updates.",
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = MaterialTheme.colorScheme.secondaryTextColor,
                        textAlign = TextAlign.Center
                    )
                )
            }
        }
        return
    }

    // Lazy initialization of scheduling rows in Room
    LaunchedEffect(unit.id) {
        StudyRepository.ensureSchedulesForUnit(unit.id)
    }

    val schedules by StudyRepository.getSchedulesForUnit(unit.id)
        .collectAsStateWithLifecycle(initialValue = emptyList())

    val schedulesMap = remember(schedules) { schedules.associateBy { it.cardId } }
    val cardsMap = remember(cards) { cards.associateBy { it.id } }

    var isBrowseMode by remember(unit.id) { mutableStateOf(false) }
    var activeQueue by remember(unit.id) { mutableStateOf<List<String>>(emptyList()) }
    var isQueueInitialized by remember(unit.id) { mutableStateOf(false) }
    var cardsReviewedInSession by remember(unit.id) { mutableIntStateOf(0) }
    var initialQueueTotal by remember(unit.id) { mutableIntStateOf(0) }

    // Build study queue when schedules become available - due cards first
    LaunchedEffect(schedules, unit.id) {
        if (!isQueueInitialized && schedules.isNotEmpty()) {
            val now = System.currentTimeMillis()
            // 1. Due cards first: cards whose schedule dueAtEpochMillis <= now, sorted by earliest due
            val dueCards = cards.filter { card ->
                val s = schedulesMap[card.id]
                s != null && s.status != CardStatus.NEW.name && s.dueAtEpochMillis <= now
            }.sortedBy { schedulesMap[it.id]?.dueAtEpochMillis ?: Long.MAX_VALUE }
             .map { it.id }

            // 2. New cards
            val newCards = cards.filter { card ->
                val s = schedulesMap[card.id]
                s == null || s.status == CardStatus.NEW.name
            }.map { it.id }

            // 3. Fallback: future scheduled cards if neither due nor new remain
            val futureCards = cards.filter { card ->
                val s = schedulesMap[card.id]
                s != null && s.status != CardStatus.NEW.name && s.dueAtEpochMillis > now
            }.sortedBy { schedulesMap[it.id]?.dueAtEpochMillis ?: Long.MAX_VALUE }
             .map { it.id }

            val built = if (dueCards.isNotEmpty()) {
                dueCards + newCards.filter { it !in dueCards }
            } else if (newCards.isNotEmpty()) {
                newCards
            } else {
                futureCards.ifEmpty { cards.map { it.id } }
            }

            activeQueue = built
            initialQueueTotal = built.size
            isQueueInitialized = true
        }
    }

    // Statistics for the entire unit
    val newCount = remember(schedules, cards) {
        cards.count { card ->
            val s = schedulesMap[card.id]
            s == null || s.status == CardStatus.NEW.name
        }
    }
    val learningCount = remember(schedules, cards) {
        cards.count { card ->
            val s = schedulesMap[card.id]
            s != null && (s.status == CardStatus.LEARNING.name || s.status == CardStatus.RELEARNING.name)
        }
    }
    val reviewCount = remember(schedules, cards) {
        cards.count { card ->
            val s = schedulesMap[card.id]
            s != null && s.status == CardStatus.REVIEW.name
        }
    }

    if (isBrowseMode) {
        AnkiBrowseModeView(
            cards = cards,
            unit = unit,
            schedulesMap = schedulesMap,
            accentColor = accentColor,
            onExitBrowse = { isBrowseMode = false },
            onStartQuiz = onStartQuiz
        )
        return
    }

    // If queue is empty after initialization -> Congratulations state
    if (isQueueInitialized && activeQueue.isEmpty()) {
        AnkiQueueCompleteView(
            unit = unit,
            totalCards = cards.size,
            newCount = newCount,
            learningCount = learningCount,
            reviewCount = reviewCount,
            cardsReviewedInSession = cardsReviewedInSession,
            accentColor = accentColor,
            schedules = schedules,
            onStudyAllAhead = {
                activeQueue = cards.map { it.id }
                initialQueueTotal = cards.size
                cardsReviewedInSession = 0
            },
            onBrowseCards = { isBrowseMode = true },
            onStartQuiz = onStartQuiz,
            onDone = onDone
        )
        return
    }

    val currentCardId = activeQueue.firstOrNull()
    val currentCard = currentCardId?.let { cardsMap[it] } ?: cards.first()
    val currentSchedule = currentCardId?.let { schedulesMap[it] }
        ?: FlashcardScheduleEntity(cardId = currentCard.id, subjectId = unit.subjectId, unitId = unit.id)

    var isFlipped by remember(currentCard.id) { mutableStateOf(false) }

    val rotation by animateFloatAsState(
        targetValue = if (isFlipped) 180f else 0f,
        animationSpec = tween(durationMillis = 300),
        label = "ankiCardFlip"
    )

    val activeNewCount = activeQueue.count { schedulesMap[it]?.status in listOf(CardStatus.NEW.name, null) }
    val activeLearningCount = activeQueue.count { schedulesMap[it]?.status in listOf(CardStatus.LEARNING.name, CardStatus.RELEARNING.name) }
    val activeReviewCount = activeQueue.count { schedulesMap[it]?.status == CardStatus.REVIEW.name }

    val progress = if (initialQueueTotal > 0) {
        (cardsReviewedInSession.toFloat() / (cardsReviewedInSession + activeQueue.size)).coerceIn(0f, 1f)
    } else 0f

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Anki Session Header HUD
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Unit ${unit.unitNumber} · Card ${cardsReviewedInSession + 1} of $initialQueueTotal",
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                )

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    AnkiQueueBadge(count = activeNewCount, label = "New", color = NeonCyan)
                    AnkiQueueBadge(count = activeLearningCount, label = "Learn", color = AmberGold)
                    AnkiQueueBadge(count = activeReviewCount, label = "Review", color = EmeraldGreen)
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            LinearProgressIndicator(
                progress = { progress },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(6.dp)
                    .clip(RoundedCornerShape(3.dp)),
                color = accentColor,
                trackColor = MaterialTheme.colorScheme.surfaceVariant
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Spaced Repetition Flashcard
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .clickable { isFlipped = !isFlipped }
                .testTag("flashcard_flip_target"),
            contentAlignment = Alignment.Center
        ) {
            Card(
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(
                    containerColor = if (isFlipped) {
                        MaterialTheme.colorScheme.surfaceVariant
                    } else {
                        MaterialTheme.colorScheme.surface
                    }
                ),
                border = androidx.compose.foundation.BorderStroke(
                    2.dp,
                    if (isFlipped) accentColor else accentColor.copy(alpha = 0.5f)
                ),
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                modifier = Modifier
                    .fillMaxSize()
                    .graphicsLayer {
                        rotationY = rotation
                        cameraDistance = 14f * density
                    }
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp)
                        .graphicsLayer {
                            if (rotation > 90f) {
                                rotationY = 180f
                            }
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        // Card Scheduling Status Pills
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Surface(
                                shape = RoundedCornerShape(8.dp),
                                color = accentColor.copy(alpha = 0.15f),
                                border = androidx.compose.foundation.BorderStroke(1.dp, accentColor.copy(alpha = 0.3f))
                            ) {
                                Text(
                                    text = if (rotation <= 90f) "TERM / CONCEPT" else "DEFINITION / ANSWER",
                                    style = MaterialTheme.typography.labelSmall.copy(
                                        fontWeight = FontWeight.Black,
                                        letterSpacing = 1.sp,
                                        color = accentColor
                                    ),
                                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                                )
                            }

                            val scheduleStatus = currentSchedule.status
                            val (statusLabel, statusColor) = when (scheduleStatus) {
                                CardStatus.LEARNING.name -> "LEARNING (Step ${currentSchedule.learningStepIndex + 1}/2)" to AmberGold
                                CardStatus.RELEARNING.name -> "RELEARNING" to CoralRed
                                CardStatus.REVIEW.name -> "REVIEW (${currentSchedule.intervalDays.toInt().coerceAtLeast(1)}d)" to EmeraldGreen
                                else -> "NEW CARD" to NeonCyan
                            }

                            Surface(
                                shape = RoundedCornerShape(8.dp),
                                color = statusColor.copy(alpha = 0.15f),
                                border = androidx.compose.foundation.BorderStroke(1.dp, statusColor.copy(alpha = 0.4f))
                            ) {
                                Text(
                                    text = statusLabel,
                                    style = MaterialTheme.typography.labelSmall.copy(
                                        fontWeight = FontWeight.Bold,
                                        color = statusColor
                                    ),
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }

                            if (currentSchedule.repetitions > 0) {
                                Surface(
                                    shape = RoundedCornerShape(8.dp),
                                    color = MaterialTheme.colorScheme.surface,
                                    border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.5f))
                                ) {
                                    Text(
                                        text = "↺ ${currentSchedule.repetitions}",
                                        style = MaterialTheme.typography.labelSmall.copy(
                                            color = MaterialTheme.colorScheme.secondaryTextColor,
                                            fontWeight = FontWeight.Bold
                                        ),
                                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 4.dp)
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(24.dp))

                        // Card Text Content
                        Text(
                            text = if (rotation <= 90f) currentCard.front else currentCard.back,
                            style = MaterialTheme.typography.headlineSmall.copy(
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                lineHeight = 34.sp,
                                color = MaterialTheme.colorScheme.onBackground
                            ),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp)
                        )

                        Spacer(modifier = Modifier.height(24.dp))

                        Surface(
                            shape = CircleShape,
                            color = MaterialTheme.colorScheme.background.copy(alpha = 0.7f),
                            border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.4f))
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 14.dp, vertical = 6.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = Icons.Default.FlipCameraAndroid,
                                    contentDescription = null,
                                    tint = accentColor,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = if (rotation <= 90f) "Tap card or button to reveal back" else "Rate your recall below",
                                    style = MaterialTheme.typography.labelSmall.copy(
                                        color = MaterialTheme.colorScheme.secondaryTextColor,
                                        fontWeight = FontWeight.Medium
                                    )
                                )
                            }
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Interaction Zone: Show Answer OR Anki 4-Grade Buttons
        if (!isFlipped) {
            Button(
                onClick = { isFlipped = true },
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = accentColor),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
                    .testTag("show_answer_btn")
            ) {
                Icon(Icons.Default.Visibility, contentDescription = null, modifier = Modifier.size(20.dp), tint = Color.Black)
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Show Answer",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                )
            }
        } else {
            // Anki 4 Buttons: Again, Hard, Good, Easy with Next Interval Previews
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Again
                AnkiGradeButton(
                    label = "Again",
                    intervalHint = FlashcardScheduler.getNextIntervalPreview(currentSchedule, ReviewGrade.AGAIN),
                    color = CoralRed,
                    modifier = Modifier
                        .weight(1f)
                        .testTag("grade_again_btn"),
                    onClick = {
                        StudyRepository.answerCard(currentCard.id, ReviewGrade.AGAIN)
                        activeQueue = activeQueue.drop(1) + currentCard.id
                        cardsReviewedInSession++
                        isFlipped = false
                    }
                )

                // Hard
                AnkiGradeButton(
                    label = "Hard",
                    intervalHint = FlashcardScheduler.getNextIntervalPreview(currentSchedule, ReviewGrade.HARD),
                    color = AmberGold,
                    modifier = Modifier
                        .weight(1f)
                        .testTag("grade_hard_btn"),
                    onClick = {
                        StudyRepository.answerCard(currentCard.id, ReviewGrade.HARD)
                        val isLearning = currentSchedule.status in listOf(CardStatus.NEW.name, CardStatus.LEARNING.name, CardStatus.RELEARNING.name)
                        activeQueue = if (isLearning && activeQueue.size > 1) {
                            activeQueue.drop(1) + currentCard.id
                        } else {
                            activeQueue.drop(1)
                        }
                        cardsReviewedInSession++
                        isFlipped = false
                    }
                )

                // Good
                AnkiGradeButton(
                    label = "Good",
                    intervalHint = FlashcardScheduler.getNextIntervalPreview(currentSchedule, ReviewGrade.GOOD),
                    color = ElectricBlue,
                    modifier = Modifier
                        .weight(1f)
                        .testTag("grade_good_btn"),
                    onClick = {
                        StudyRepository.answerCard(currentCard.id, ReviewGrade.GOOD)
                        val staysInQueue = currentSchedule.status in listOf(CardStatus.NEW.name, CardStatus.LEARNING.name) && currentSchedule.learningStepIndex == 0
                        activeQueue = if (staysInQueue && activeQueue.size > 1) {
                            activeQueue.drop(1) + currentCard.id
                        } else {
                            activeQueue.drop(1)
                        }
                        cardsReviewedInSession++
                        isFlipped = false
                    }
                )

                // Easy
                AnkiGradeButton(
                    label = "Easy",
                    intervalHint = FlashcardScheduler.getNextIntervalPreview(currentSchedule, ReviewGrade.EASY),
                    color = EmeraldGreen,
                    modifier = Modifier
                        .weight(1f)
                        .testTag("grade_easy_btn"),
                    onClick = {
                        StudyRepository.answerCard(currentCard.id, ReviewGrade.EASY)
                        activeQueue = activeQueue.drop(1)
                        cardsReviewedInSession++
                        isFlipped = false
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        // Auxiliary actions
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextButton(
                onClick = { isBrowseMode = true },
                colors = ButtonDefaults.textButtonColors(contentColor = MaterialTheme.colorScheme.secondaryTextColor)
            ) {
                Icon(Icons.AutoMirrored.Filled.ViewList, contentDescription = null, modifier = Modifier.size(16.dp))
                Spacer(modifier = Modifier.width(6.dp))
                Text("Browse All Cards", style = MaterialTheme.typography.labelMedium)
            }

            Button(
                onClick = onStartQuiz,
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                modifier = Modifier
                    .height(40.dp)
                    .testTag("unit_quiz_from_flashcards_btn")
            ) {
                Icon(Icons.Default.Quiz, contentDescription = null, modifier = Modifier.size(16.dp), tint = accentColor)
                Spacer(modifier = Modifier.width(6.dp))
                Text("Unit Quiz", color = MaterialTheme.colorScheme.onBackground, fontWeight = FontWeight.Bold, fontSize = 13.sp)
            }
        }
    }
}

@Composable
fun AnkiGradeButton(
    label: String,
    intervalHint: String,
    color: Color,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = color.copy(alpha = 0.15f),
            contentColor = color
        ),
        border = androidx.compose.foundation.BorderStroke(1.5.dp, color.copy(alpha = 0.6f)),
        contentPadding = PaddingValues(horizontal = 4.dp, vertical = 6.dp),
        modifier = modifier.height(52.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = intervalHint,
                style = MaterialTheme.typography.labelSmall.copy(
                    fontWeight = FontWeight.Black,
                    fontSize = 11.sp,
                    color = color
                )
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = label,
                style = MaterialTheme.typography.labelMedium.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 13.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
            )
        }
    }
}

@Composable
fun AnkiQueueBadge(
    count: Int,
    label: String,
    color: Color
) {
    Surface(
        shape = RoundedCornerShape(8.dp),
        color = color.copy(alpha = 0.15f),
        border = androidx.compose.foundation.BorderStroke(1.dp, color.copy(alpha = 0.4f))
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(6.dp)
                    .clip(CircleShape)
                    .background(color)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = "$count $label",
                style = MaterialTheme.typography.labelSmall.copy(
                    color = color,
                    fontWeight = FontWeight.Bold
                )
            )
        }
    }
}

@Composable
fun AnkiQueueCompleteView(
    unit: SubjectUnit,
    totalCards: Int,
    newCount: Int,
    learningCount: Int,
    reviewCount: Int,
    cardsReviewedInSession: Int,
    accentColor: Color,
    schedules: List<FlashcardScheduleEntity>,
    onStudyAllAhead: () -> Unit,
    onBrowseCards: () -> Unit,
    onStartQuiz: () -> Unit,
    onDone: () -> Unit
) {
    val now = System.currentTimeMillis()
    val nextDue = schedules.filter { it.dueAtEpochMillis > now }.minByOrNull { it.dueAtEpochMillis }

    val nextDueText = if (nextDue != null) {
        val diffMinutes = ((nextDue.dueAtEpochMillis - now) / 60000L).coerceAtLeast(1)
        if (diffMinutes < 60) {
            "Next card due in $diffMinutes minutes"
        } else if (diffMinutes < 1440) {
            "Next card due in ${diffMinutes / 60} hours"
        } else {
            "Next card due tomorrow"
        }
    } else {
        "All cards scheduled and up to date"
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .size(72.dp)
                .clip(CircleShape)
                .background(EmeraldGreen.copy(alpha = 0.15f))
                .border(2.dp, EmeraldGreen.copy(alpha = 0.4f), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.CheckCircle,
                contentDescription = null,
                tint = EmeraldGreen,
                modifier = Modifier.size(40.dp)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "No cards due in this unit! 🎉",
            style = MaterialTheme.typography.headlineSmall.copy(
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Great work! You have reviewed all active cards for ${unit.title}. Spaced repetition protects your long-term memory.",
            style = MaterialTheme.typography.bodyMedium.copy(
                color = MaterialTheme.colorScheme.secondaryTextColor,
                textAlign = TextAlign.Center
            ),
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Surface(
            shape = RoundedCornerShape(12.dp),
            color = MaterialTheme.colorScheme.surfaceVariant,
            border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.4f))
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Schedule,
                    contentDescription = null,
                    tint = accentColor,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = nextDueText,
                    style = MaterialTheme.typography.labelMedium.copy(
                        color = MaterialTheme.colorScheme.onBackground,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Deck Statistics Summary Card
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.3f)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "$newCount", style = MaterialTheme.typography.titleLarge.copy(color = NeonCyan, fontWeight = FontWeight.Bold))
                    Text(text = "New", style = MaterialTheme.typography.labelSmall.copy(color = MaterialTheme.colorScheme.secondaryTextColor))
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "$learningCount", style = MaterialTheme.typography.titleLarge.copy(color = AmberGold, fontWeight = FontWeight.Bold))
                    Text(text = "Learning", style = MaterialTheme.typography.labelSmall.copy(color = MaterialTheme.colorScheme.secondaryTextColor))
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "$reviewCount", style = MaterialTheme.typography.titleLarge.copy(color = EmeraldGreen, fontWeight = FontWeight.Bold))
                    Text(text = "Review", style = MaterialTheme.typography.labelSmall.copy(color = MaterialTheme.colorScheme.secondaryTextColor))
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "$totalCards", style = MaterialTheme.typography.titleLarge.copy(color = MaterialTheme.colorScheme.onBackground, fontWeight = FontWeight.Bold))
                    Text(text = "Total Deck", style = MaterialTheme.typography.labelSmall.copy(color = MaterialTheme.colorScheme.secondaryTextColor))
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Action Buttons
        Button(
            onClick = onStudyAllAhead,
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults.buttonColors(containerColor = accentColor),
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
        ) {
            Icon(Icons.Default.School, contentDescription = null, modifier = Modifier.size(18.dp), tint = Color.Black)
            Spacer(modifier = Modifier.width(8.dp))
            Text("Study Ahead / Practice All ($totalCards cards)", color = Color.Black, fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedButton(
            onClick = onBrowseCards,
            shape = RoundedCornerShape(14.dp),
            border = androidx.compose.foundation.BorderStroke(1.5.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.5f)),
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
        ) {
            Icon(Icons.Default.Style, contentDescription = null, modifier = Modifier.size(18.dp))
            Spacer(modifier = Modifier.width(8.dp))
            Text("Browse All Cards In Unit", fontWeight = FontWeight.SemiBold)
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = onStartQuiz,
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults.buttonColors(containerColor = accentColor),
            modifier = Modifier.fillMaxWidth().height(48.dp)
        ) {
            Icon(Icons.Default.Quiz, contentDescription = null, modifier = Modifier.size(18.dp), tint = Color.Black)
            Spacer(modifier = Modifier.width(8.dp))
            Text("Take unit quiz", color = Color.Black, fontWeight = FontWeight.Bold)
        }
        TextButton(onClick = onDone, modifier = Modifier.fillMaxWidth()) {
            Text("Done", color = MaterialTheme.colorScheme.secondaryTextColor, fontWeight = FontWeight.SemiBold)
        }
    }
}

@Composable
fun AnkiBrowseModeView(
    cards: List<Flashcard>,
    unit: SubjectUnit,
    schedulesMap: Map<String, FlashcardScheduleEntity>,
    accentColor: Color,
    onExitBrowse: () -> Unit,
    onStartQuiz: () -> Unit
) {
    var browseIndex by remember(unit.id) { mutableIntStateOf(0) }
    var isFlipped by remember(unit.id, browseIndex) { mutableStateOf(false) }

    val currentCard = cards.getOrNull(browseIndex) ?: cards.first()
    val schedule = schedulesMap[currentCard.id]

    val rotation by animateFloatAsState(
        targetValue = if (isFlipped) 180f else 0f,
        animationSpec = tween(durationMillis = 300),
        label = "browseFlip"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Browse Mode Header
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "Browsing Card ${browseIndex + 1} of ${cards.size}",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                )
                Text(
                    text = "Sequential Deck Overview",
                    style = MaterialTheme.typography.bodySmall.copy(color = MaterialTheme.colorScheme.secondaryTextColor)
                )
            }

            TextButton(
                onClick = onExitBrowse,
                colors = ButtonDefaults.textButtonColors(contentColor = accentColor)
            ) {
                Icon(Icons.Default.PlayArrow, contentDescription = null, modifier = Modifier.size(16.dp))
                Spacer(modifier = Modifier.width(4.dp))
                Text("Start Review", fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Card Display
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .clickable { isFlipped = !isFlipped },
            contentAlignment = Alignment.Center
        ) {
            Card(
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(
                    containerColor = if (isFlipped) MaterialTheme.colorScheme.surfaceVariant else MaterialTheme.colorScheme.surface
                ),
                border = androidx.compose.foundation.BorderStroke(2.dp, accentColor.copy(alpha = 0.5f)),
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                modifier = Modifier
                    .fillMaxSize()
                    .graphicsLayer {
                        rotationY = rotation
                        cameraDistance = 14f * density
                    }
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp)
                        .graphicsLayer {
                            if (rotation > 90f) {
                                rotationY = 180f
                            }
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Surface(
                            shape = RoundedCornerShape(8.dp),
                            color = accentColor.copy(alpha = 0.15f),
                            border = androidx.compose.foundation.BorderStroke(1.dp, accentColor.copy(alpha = 0.3f))
                        ) {
                            Text(
                                text = if (rotation <= 90f) "TERM / CONCEPT" else "DEFINITION / ANSWER",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    fontWeight = FontWeight.Black,
                                    letterSpacing = 1.sp,
                                    color = accentColor
                                ),
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                            )
                        }

                        if (schedule != null) {
                            Spacer(modifier = Modifier.height(8.dp))
                            val (badgeText, badgeColor) = when (schedule.status) {
                                CardStatus.LEARNING.name -> "Learning (Step ${schedule.learningStepIndex + 1}/2)" to AmberGold
                                CardStatus.RELEARNING.name -> "Relearning" to CoralRed
                                CardStatus.REVIEW.name -> "Review (Interval: ${schedule.intervalDays.toInt()}d, Ease: ${(schedule.ease * 100).toInt()}%)" to EmeraldGreen
                                else -> "New Card" to NeonCyan
                            }
                            Text(
                                text = "SM-2: $badgeText",
                                style = MaterialTheme.typography.labelSmall.copy(color = badgeColor, fontWeight = FontWeight.Bold)
                            )
                        }

                        Spacer(modifier = Modifier.height(24.dp))

                        Text(
                            text = if (rotation <= 90f) currentCard.front else currentCard.back,
                            style = MaterialTheme.typography.headlineSmall.copy(
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                lineHeight = 34.sp,
                                color = MaterialTheme.colorScheme.onBackground
                            ),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 12.dp)
                        )

                        Spacer(modifier = Modifier.height(24.dp))

                        Text(
                            text = "Tap card to flip",
                            style = MaterialTheme.typography.labelSmall.copy(color = MaterialTheme.colorScheme.secondaryTextColor)
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Previous / Next Navigation Row
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = { if (browseIndex > 0) browseIndex-- },
                enabled = browseIndex > 0,
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.surfaceVariant)
                    .testTag("prev_card_btn")
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Previous card",
                    tint = if (browseIndex > 0) MaterialTheme.colorScheme.onBackground else MaterialTheme.colorScheme.secondaryTextColor
                )
            }

            Button(
                onClick = { isFlipped = !isFlipped },
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
            ) {
                Icon(Icons.Default.FlipCameraAndroid, contentDescription = null, modifier = Modifier.size(16.dp), tint = accentColor)
                Spacer(modifier = Modifier.width(6.dp))
                Text("Flip Card", color = MaterialTheme.colorScheme.onBackground, fontWeight = FontWeight.Bold)
            }

            IconButton(
                onClick = { if (browseIndex < cards.size - 1) browseIndex++ },
                enabled = browseIndex < cards.size - 1,
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.surfaceVariant)
                    .testTag("next_card_btn")
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = "Next card",
                    tint = if (browseIndex < cards.size - 1) MaterialTheme.colorScheme.onBackground else MaterialTheme.colorScheme.secondaryTextColor
                )
            }
        }
    }
}
