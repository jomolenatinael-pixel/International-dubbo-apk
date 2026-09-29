package com.areka.app.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.NavigateNext
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
import com.areka.app.data.model.Question
import com.areka.app.data.model.QuestionType
import com.areka.app.data.model.Quiz
import com.areka.app.data.model.QuizScore
import com.areka.app.data.model.QuizScoring
import com.areka.app.data.local.MistakeEntity
import com.areka.app.data.repository.StudyRepository
import com.areka.app.ui.components.CircularScoreGauge
import com.areka.app.ui.components.TrendLineChart
import com.areka.app.ui.theme.*
import kotlinx.coroutines.delay

@Composable
fun QuizScreen(
    quiz: Quiz,
    onBack: () -> Unit,
    onOpenFlashcards: ((subjectId: String, unitId: String) -> Unit)? = null,
    modifier: Modifier = Modifier
) {
    var showExitDialog by remember { mutableStateOf(false) }

    // Guard with confirmation if quiz is in progress
    BackHandler {
        showExitDialog = true
    }

    if (showExitDialog) {
        AlertDialog(
            onDismissRequest = { showExitDialog = false },
            title = {
                Text("Exit Quiz?", fontWeight = FontWeight.Bold)
            },
            text = {
                Text("Are you sure you want to leave this quiz? Your current progress will not be saved.")
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        showExitDialog = false
                        onBack()
                    }
                ) {
                    Text("Exit Quiz", color = CoralRed, fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                Button(
                    onClick = { showExitDialog = false }
                ) {
                    Text("Continue")
                }
            }
        )
    }

    if (quiz.questions.isEmpty()) {
        Box(
            modifier = modifier.fillMaxSize().padding(24.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "No questions found for this quiz.",
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = onBack) {
                    Text("Go Back")
                }
            }
        }
        return
    }

    // Session key increments on retake to cleanly reset all remembered state
    var sessionKey by remember(quiz.id) { mutableIntStateOf(0) }

    var currentQuestionIndex by remember(quiz.id, sessionKey) { mutableIntStateOf(0) }
    // Map from questionId to selectedOptionId
    val userAnswers = remember(quiz.id, sessionKey) { mutableStateMapOf<Int, String>() }
    var quizSubmitted by remember(quiz.id, sessionKey) { mutableStateOf(false) }
    var hasRecordedResult by remember(quiz.id, sessionKey) { mutableStateOf(false) }

    // Countdown timer properly keyed
    val initialSeconds = (quiz.durationMinutes * 60).coerceAtLeast(60)
    var secondsRemaining by remember(quiz.id, sessionKey) { mutableIntStateOf(initialSeconds) }
    var isTimerRunning by remember(quiz.id, sessionKey) { mutableStateOf(true) }

    // Timer restarts cleanly on sessionKey change or un-submitted state
    LaunchedEffect(quiz.id, sessionKey, isTimerRunning, quizSubmitted) {
        if (!quizSubmitted && isTimerRunning) {
            while (isTimerRunning && secondsRemaining > 0 && !quizSubmitted) {
                delay(1000)
                secondsRemaining--
            }
            if (secondsRemaining <= 0 && !quizSubmitted) {
                quizSubmitted = true
            }
        }
    }

    val totalQuestions = quiz.questions.size
    val safeIndex = currentQuestionIndex.coerceIn(0, (totalQuestions - 1).coerceAtLeast(0))
    val currentQuestion = quiz.questions.getOrNull(safeIndex) ?: quiz.questions.first()
    var fillInAnswer by remember(currentQuestion.id, sessionKey) {
        mutableStateOf(userAnswers[currentQuestion.id].orEmpty())
    }

    val safeSeconds = secondsRemaining.coerceAtLeast(0)
    val minutes = safeSeconds / 60
    val seconds = safeSeconds % 60
    val timerText = String.format("%02d:%02d", minutes, seconds)

    if (quizSubmitted) {
        val score: QuizScore = QuizScoring.calculate(quiz, userAnswers)
        val correctCount = score.correctAnswers
        val scorePercent = score.percentage
        val pointsEarned = score.pointsEarned

        // Deduplicated record call: only fires once per session submission
        LaunchedEffect(quizSubmitted, quiz.id, sessionKey) {
            if (quizSubmitted && !hasRecordedResult && totalQuestions > 0) {
                hasRecordedResult = true
                val mistakes = quiz.questions.filter { question ->
                    !QuizScoring.isCorrect(question, userAnswers[question.id])
                }.map { question ->
                    val selected = if (question.type == QuestionType.FILL_IN_THE_BLANK) {
                        userAnswers[question.id]?.ifBlank { "Skipped" } ?: "Skipped"
                    } else {
                        question.options.find { it.id == userAnswers[question.id] }?.text ?: "Skipped"
                    }
                    val correct = if (question.type == QuestionType.FILL_IN_THE_BLANK) {
                        question.correctOptionId
                    } else {
                        question.options.find { it.id == question.correctOptionId }?.text
                            ?: question.correctOptionId
                    }
                    MistakeEntity(
                        quizId = quiz.id,
                        questionId = question.id,
                        questionText = question.text,
                        selectedAnswer = selected,
                        correctAnswer = correct,
                        subjectId = quiz.subjectId ?: "",
                        unitId = quiz.unitId ?: "",
                        explanation = question.explanation
                    )
                }
                StudyRepository.recordQuizResult(
                    quiz = quiz,
                    score = score,
                    timeSpentSeconds = initialSeconds - secondsRemaining,
                    mistakes = mistakes
                )
            }
        }

        QuizResultsView(
            quiz = quiz,
            correctCount = correctCount,
            totalQuestions = totalQuestions,
            scorePercent = scorePercent,
            pointsEarned = pointsEarned,
            userAnswers = userAnswers,
            onRetake = {
                sessionKey++
            },
            onBackToDashboard = onBack,
            onOpenFlashcards = onOpenFlashcards
        )
        return
    }

    Scaffold(
        topBar = {
            Surface(
                color = MaterialTheme.colorScheme.surface,
                tonalElevation = 4.dp,
                border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.3f))
            ) {
                Column(modifier = Modifier.fillMaxWidth().statusBarsPadding()) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.weight(1f)
                        ) {
                            IconButton(
                                onClick = { showExitDialog = true },
                                modifier = Modifier.testTag("quiz_back_button")
                            ) {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                    contentDescription = "Exit Quiz",
                                    tint = MaterialTheme.colorScheme.onBackground
                                )
                            }

                            Spacer(modifier = Modifier.width(4.dp))

                            Column {
                                Text(
                                    text = quiz.title,
                                    style = MaterialTheme.typography.titleMedium.copy(
                                        fontWeight = FontWeight.Bold,
                                        color = MaterialTheme.colorScheme.onBackground
                                    ),
                                    maxLines = 1
                                )
                                Text(
                                    text = "${quiz.gradeLevel} • ${quiz.subject}",
                                    style = MaterialTheme.typography.bodySmall.copy(
                                        color = MaterialTheme.colorScheme.secondaryTextColor,
                                        fontSize = 11.sp
                                    )
                                )
                            }
                        }

                        // Timer badge
                        val isUrgent = secondsRemaining < 120
                        val timerBg = if (isUrgent) CoralRed.copy(alpha = 0.15f) else MaterialTheme.colorScheme.surfaceVariant
                        val timerBorder = if (isUrgent) CoralRed else NeonCyan.copy(alpha = 0.5f)
                        val timerTextColor = if (isUrgent) CoralRed else (if (LocalThemeIsDark.current) NeonCyan else ElectricBlue)

                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = timerBg,
                            border = androidx.compose.foundation.BorderStroke(1.dp, timerBorder),
                            modifier = Modifier.height(36.dp)
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 10.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Timer,
                                    contentDescription = "Time remaining",
                                    tint = timerTextColor,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "$timerText left",
                                    style = MaterialTheme.typography.labelMedium.copy(
                                        fontWeight = FontWeight.Bold,
                                        color = timerTextColor
                                    )
                                )
                            }
                        }
                    }

                    // Progress bar
                    LinearProgressIndicator(
                        progress = { (currentQuestionIndex + 1).toFloat() / totalQuestions },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(4.dp),
                        color = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue,
                        trackColor = MaterialTheme.colorScheme.outline
                    )
                }
            }
        },
        bottomBar = {
            Surface(
                color = MaterialTheme.colorScheme.surface,
                tonalElevation = 6.dp,
                border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.3f)),
                modifier = Modifier.windowInsetsPadding(WindowInsets.navigationBars)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    OutlinedButton(
                        onClick = {
                            if (currentQuestionIndex > 0) currentQuestionIndex--
                        },
                        enabled = currentQuestionIndex > 0,
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier
                            .heightIn(min = 44.dp)
                            .testTag("quiz_prev_button")
                    ) {
                        Text("Previous")
                    }

                    if (currentQuestionIndex == totalQuestions - 1) {
                        Button(
                            onClick = { quizSubmitted = true },
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = EmeraldGreen,
                                contentColor = Color.White
                            ),
                            modifier = Modifier
                                .heightIn(min = 44.dp)
                                .testTag("quiz_submit_button")
                        ) {
                            Icon(Icons.Default.CheckCircle, contentDescription = null, modifier = Modifier.size(18.dp))
                            Spacer(modifier = Modifier.width(6.dp))
                            Text("Submit Quiz", fontWeight = FontWeight.Bold)
                        }
                    } else {
                        Button(
                            onClick = {
                                if (currentQuestionIndex < totalQuestions - 1) currentQuestionIndex++
                            },
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = ElectricBlue,
                                contentColor = Color.White
                            ),
                            modifier = Modifier
                                .heightIn(min = 44.dp)
                                .testTag("quiz_next_button")
                        ) {
                            Text("Next", fontWeight = FontWeight.Bold)
                            Spacer(modifier = Modifier.width(4.dp))
                            Icon(Icons.AutoMirrored.Filled.NavigateNext, contentDescription = null, modifier = Modifier.size(18.dp))
                        }
                    }
                }
            }
        }
    ) { paddingValues ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 16.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(modifier = Modifier.height(4.dp))

            // Question counter and type badge
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Question ${currentQuestionIndex + 1} of $totalQuestions",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue
                    )
                )

                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = ElectricBlue.copy(alpha = 0.15f),
                    border = androidx.compose.foundation.BorderStroke(1.dp, ElectricBlue.copy(alpha = 0.3f))
                ) {
                    Text(
                        text = if (currentQuestion.type == QuestionType.FILL_IN_THE_BLANK) {
                            "Fill in the Blank"
                        } else {
                            "Multiple Choice"
                        },
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = ElectricBlue,
                            fontWeight = FontWeight.SemiBold
                        ),
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
            }

            // Question Prompt Card
            Card(
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(20.dp)) {
                    Text(
                        text = currentQuestion.text,
                        style = MaterialTheme.typography.titleLarge.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onBackground,
                            lineHeight = 28.sp
                        )
                    )
                }
            }

            if (currentQuestion.type == QuestionType.FILL_IN_THE_BLANK) {
                OutlinedTextField(
                    value = fillInAnswer,
                    onValueChange = {
                        fillInAnswer = it
                        userAnswers[currentQuestion.id] = it
                    },
                    label = { Text("Your answer") },
                    placeholder = { Text("Type your answer") },
                    singleLine = true,
                    shape = RoundedCornerShape(14.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .testTag("fill_in_answer")
                )
            } else {
                // Option Choices List
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    currentQuestion.options.forEach { option ->
                        val isSelected = userAnswers[currentQuestion.id] == option.id
                        val primaryAccent = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue
                        val borderColor = if (isSelected) primaryAccent else MaterialTheme.colorScheme.outline
                        val containerBg = if (isSelected) primaryAccent.copy(alpha = 0.12f)
                        else MaterialTheme.colorScheme.surface

                        Card(
                            shape = RoundedCornerShape(16.dp),
                            colors = CardDefaults.cardColors(containerColor = containerBg),
                            border = androidx.compose.foundation.BorderStroke(if (isSelected) 2.dp else 1.dp, borderColor),
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable(
                                    role = Role.RadioButton,
                                    onClickLabel = "Select option ${option.id}: ${option.text}",
                                    onClick = { userAnswers[currentQuestion.id] = option.id }
                                )
                                .testTag("option_${option.id}")
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
                                            .size(34.dp)
                                            .clip(CircleShape)
                                            .background(if (isSelected) primaryAccent else MaterialTheme.colorScheme.surfaceVariant)
                                            .border(1.dp, if (isSelected) primaryAccent else MaterialTheme.colorScheme.outline, CircleShape),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            text = option.id,
                                            style = MaterialTheme.typography.labelMedium.copy(
                                                fontWeight = FontWeight.Bold,
                                                color = if (isSelected) Color.White else MaterialTheme.colorScheme.onSurface
                                            )
                                        )
                                    }

                                    Spacer(modifier = Modifier.width(14.dp))
                                    Text(
                                        text = option.text,
                                        style = MaterialTheme.typography.bodyLarge.copy(
                                            color = if (isSelected) primaryAccent else MaterialTheme.colorScheme.onBackground,
                                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
                                        )
                                    )
                                }

                                if (isSelected) {
                                    Box(
                                        modifier = Modifier
                                            .size(24.dp)
                                            .clip(CircleShape)
                                            .background(primaryAccent),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Check,
                                            contentDescription = "Selected",
                                            tint = Color.White,
                                            modifier = Modifier.size(16.dp)
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }

            // Question Navigator Pills
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Question Navigator",
                    style = MaterialTheme.typography.labelMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.secondaryTextColor
                    )
                )

                Spacer(modifier = Modifier.height(8.dp))

                LazyRow(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    itemsIndexed(quiz.questions) { index, q ->
                        val isCurrent = index == currentQuestionIndex
                        val isAnswered = userAnswers.containsKey(q.id)
                        val primaryAccent = if (LocalThemeIsDark.current) NeonCyan else ElectricBlue

                        val bg = when {
                            isCurrent -> primaryAccent
                            isAnswered -> primaryAccent.copy(alpha = 0.25f)
                            else -> MaterialTheme.colorScheme.surfaceVariant
                        }

                        val textColor = when {
                            isCurrent -> Color.White
                            isAnswered -> primaryAccent
                            else -> MaterialTheme.colorScheme.secondaryTextColor
                        }

                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(bg)
                                .border(
                                    1.dp,
                                    if (isCurrent) primaryAccent else MaterialTheme.colorScheme.outline,
                                    CircleShape
                                )
                                .clickable(
                                    role = Role.Button,
                                    onClickLabel = "Go to question ${index + 1}"
                                ) { currentQuestionIndex = index },
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "${index + 1}",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = textColor
                                )
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}

@Composable
fun QuizResultsView(
    quiz: Quiz,
    correctCount: Int,
    totalQuestions: Int,
    scorePercent: Int,
    pointsEarned: Int,
    userAnswers: Map<Int, String>,
    onRetake: () -> Unit,
    onBackToDashboard: () -> Unit,
    onOpenFlashcards: ((subjectId: String, unitId: String) -> Unit)? = null
) {
    var showMistakesOnly by remember { mutableStateOf(false) }

    BackHandler {
        onBackToDashboard()
    }

    Scaffold(
        topBar = {
            Surface(
                color = MaterialTheme.colorScheme.surface,
                tonalElevation = 4.dp
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .statusBarsPadding()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = onBackToDashboard) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back to dashboard")
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Quiz Results",
                        style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                    )
                }
            }
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 16.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(modifier = Modifier.height(8.dp))

            // Score Gauge and Points
            CircularScoreGauge(percentage = scorePercent)

            Text(
                text = "$correctCount of $totalQuestions Correct",
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
            )

            Surface(
                shape = RoundedCornerShape(12.dp),
                color = AmberGold.copy(alpha = 0.15f),
                border = androidx.compose.foundation.BorderStroke(1.dp, AmberGold.copy(alpha = 0.4f))
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 14.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(Icons.Default.MilitaryTech, contentDescription = null, tint = AmberGold)
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "+$pointsEarned Mastery Points Earned!",
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = AmberGold
                        )
                    )
                }
            }

            // Trend Chart
            Card(
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Topic Performance Curve",
                        style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    TrendLineChart(points = listOf(50f, 65f, 55f, 80f, scorePercent.toFloat()))
                }
            }

            // Question Breakdown List
            Text(
                text = "Detailed Breakdown",
                style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.align(Alignment.Start)
            )

            quiz.questions.forEach { question ->
                val userAnswer = userAnswers[question.id]
                val isCorrect = QuizScoring.isCorrect(question, userAnswer)

                Card(
                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                    border = androidx.compose.foundation.BorderStroke(
                        1.dp,
                        if (isCorrect) EmeraldGreen.copy(alpha = 0.5f) else CoralRed.copy(alpha = 0.5f)
                    ),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(14.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Q${question.questionNumber}: ${question.text}",
                                style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.SemiBold),
                                modifier = Modifier.weight(1f)
                            )
                            Icon(
                                imageVector = if (isCorrect) Icons.Default.CheckCircle else Icons.Default.Cancel,
                                contentDescription = if (isCorrect) "Correct answer" else "Incorrect answer",
                                tint = if (isCorrect) EmeraldGreen else CoralRed,
                                modifier = Modifier.size(20.dp)
                            )
                        }

                        Spacer(modifier = Modifier.height(6.dp))

                        val userOptionText = question.options.find { it.id == userAnswer }?.text ?: userAnswer ?: "Skipped"
                        val correctOptionText = question.options.find { it.id == question.correctOptionId }?.text ?: question.correctOptionId

                        Text(
                            text = "Your answer: $userOptionText • Correct: $correctOptionText",
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = if (isCorrect) EmeraldGreen else CoralRed,
                                fontWeight = FontWeight.Medium
                            )
                        )

                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = question.explanation,
                            style = MaterialTheme.typography.bodySmall.copy(
                                color = MaterialTheme.colorScheme.secondaryTextColor
                            )
                        )
                    }
                }
            }

            // Action Buttons
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                OutlinedButton(
                    onClick = onRetake,
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .weight(1f)
                        .heightIn(min = 48.dp)
                ) {
                    Text("Retake Quiz")
                }

                if (onOpenFlashcards != null && quiz.subjectId != null && quiz.unitId != null) {
                    Button(
                        onClick = { onOpenFlashcards(quiz.subjectId, quiz.unitId) },
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = NeonPurple),
                        modifier = Modifier
                            .weight(1f)
                            .heightIn(min = 48.dp)
                    ) {
                        Icon(Icons.Default.Style, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("Study Cards")
                    }
                } else {
                    Button(
                        onClick = onBackToDashboard,
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = ElectricBlue),
                        modifier = Modifier
                            .weight(1f)
                            .heightIn(min = 48.dp)
                    ) {
                        Icon(Icons.Default.Check, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("Done")
                    }
                }
            }

            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}
