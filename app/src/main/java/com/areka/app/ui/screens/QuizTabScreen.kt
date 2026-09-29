package com.areka.app.ui.screens

import androidx.activity.compose.BackHandler
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
import com.areka.app.data.model.Quiz
import com.areka.app.data.model.SubjectItem
import com.areka.app.data.model.SubjectUnit
import com.areka.app.data.repository.StudyRepository
import com.areka.app.ui.theme.*

@Composable
fun QuizTabScreen(
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

    BackHandler {
        onBack()
    }

    val accentColor = Color(currentSubject.accentColorHex)

    Scaffold(
        topBar = {
            Surface(
                color = MaterialTheme.colorScheme.surface,
                tonalElevation = 4.dp,
                border = androidx.compose.foundation.BorderStroke(
                    1.dp,
                    MaterialTheme.colorScheme.outline.copy(alpha = 0.3f)
                )
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
                            onClick = onBack,
                            modifier = Modifier
                                .size(40.dp)
                                .testTag("quiz_hub_back_button")
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Back to Home",
                                tint = MaterialTheme.colorScheme.onBackground
                            )
                        }

                        Spacer(modifier = Modifier.width(6.dp))

                        Column {
                            Text(
                                text = "Unit Quizzes",
                                style = MaterialTheme.typography.titleMedium.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onBackground
                                )
                            )
                            Text(
                                text = "${currentSubject.name} • Select a Unit",
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = accentColor,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                            )
                        }
                    }

                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = accentColor.copy(alpha = 0.12f),
                        border = androidx.compose.foundation.BorderStroke(1.dp, accentColor.copy(alpha = 0.3f))
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Quiz,
                                contentDescription = null,
                                tint = accentColor,
                                modifier = Modifier.size(15.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "${unitsForSubject.size} Units",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = accentColor
                                )
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
            // Horizontal Subject Selector Tabs (All 9 subjects)
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
                                }
                            )
                            .testTag("quiz_subject_tab_${subject.id}")
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

            // Section Guidance
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 4.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Select a unit in ${currentSubject.name}:",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = MaterialTheme.colorScheme.secondaryTextColor,
                        fontWeight = FontWeight.Medium
                    )
                )
                Text(
                    text = "Choose a unit • Full curriculum quiz",
                    style = MaterialTheme.typography.labelSmall.copy(
                        color = accentColor,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }

            // Unit Cards List
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(horizontal = 16.dp),
                contentPadding = PaddingValues(top = 8.dp, bottom = 80.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(unitsForSubject, key = { it.id }) { unit ->
                    val unitQuiz = remember(unit.id) { StudyRepository.getQuizForUnit(unit.id) }
                    Card(
                        shape = RoundedCornerShape(18.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                        border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("unit_quiz_card_${unit.id}")
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

                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Timer,
                                        contentDescription = null,
                                        tint = MaterialTheme.colorScheme.secondaryTextColor,
                                        modifier = Modifier.size(14.dp)
                                    )
                                    Text(
                                        text = "${unitQuiz.durationMinutes} Mins • ${unitQuiz.questions.size} Qs",
                                        style = MaterialTheme.typography.bodySmall.copy(
                                            color = MaterialTheme.colorScheme.secondaryTextColor,
                                            fontWeight = FontWeight.SemiBold,
                                            fontSize = 11.sp
                                        )
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(8.dp))

                            Text(
                                text = unit.title,
                                style = MaterialTheme.typography.titleMedium.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onBackground
                                )
                            )

                            Spacer(modifier = Modifier.height(4.dp))

                            Text(
                                text = unit.description,
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = MaterialTheme.colorScheme.secondaryTextColor
                                )
                            )

                            Spacer(modifier = Modifier.height(14.dp))

                            Button(
                                onClick = {
                                    val quiz = StudyRepository.getQuizForUnit(unit.id)
                                    onStartQuiz(quiz)
                                },
                                shape = RoundedCornerShape(12.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = accentColor),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("start_quiz_btn_${unit.id}")
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Quiz,
                                    contentDescription = null,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text("Take Quiz")
                            }
                        }
                    }
                }
            }
        }
    }
}
