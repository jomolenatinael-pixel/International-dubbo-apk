package com.areka.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import android.content.Intent
import com.areka.app.data.remote.AuthState
import com.areka.app.data.remote.SupabaseAuth
import com.areka.app.data.repository.StudyRepository
import com.areka.app.ui.components.AppDestination
import com.areka.app.ui.components.ArekaBottomNav
import com.areka.app.ui.components.ArekaTopBar
import com.areka.app.ui.screens.*
import com.areka.app.ui.theme.ArekaTheme
import com.areka.app.ui.viewmodel.AppViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        handleAuthIntent(intent)
        setContent {
            ArekaApp()
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        handleAuthIntent(intent)
    }

    private fun handleAuthIntent(intent: Intent?) {
        val data = intent?.data ?: return
        if (data.scheme == "areka" && data.host == "auth") {
            SupabaseAuth.handleRecoveryUri(data)
        }
    }
}

@Composable
fun ArekaApp(
    viewModel: AppViewModel = viewModel()
) {
    val isDarkTheme by viewModel.isDarkTheme.collectAsStateWithLifecycle()
    val currentDestination by viewModel.currentDestination.collectAsStateWithLifecycle()
    val currentActiveQuiz by viewModel.currentActiveQuiz.collectAsStateWithLifecycle()
    val flashcardSubjectId by viewModel.flashcardSubjectId.collectAsStateWithLifecycle()
    val flashcardUnitId by viewModel.flashcardUnitId.collectAsStateWithLifecycle()
    val quizSubjectId by viewModel.quizSubjectId.collectAsStateWithLifecycle()
    val quizUnitId by viewModel.quizUnitId.collectAsStateWithLifecycle()
    val searchQuery by viewModel.dashboardSearchQuery.collectAsStateWithLifecycle()
    val userProfile by StudyRepository.userProfile.collectAsStateWithLifecycle()
    val authState by SupabaseAuth.state.collectAsStateWithLifecycle()

    LaunchedEffect(authState) {
        if (authState is AuthState.PasswordRecovery) {
            viewModel.navigateTo(AppDestination.PROFILE)
        }
    }

    // Global back-handling to navigate to Home or exit active quiz cleanly
    BackHandler(enabled = currentActiveQuiz != null || currentDestination != AppDestination.DASHBOARD) {
        viewModel.handleBack()
    }

    ArekaTheme(darkTheme = isDarkTheme) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Scaffold(
                topBar = {
                    // Show TopBar on main screens (Quiz tab, Flashcards, and active Quiz manage their own top bars)
                    if (currentActiveQuiz == null && currentDestination != AppDestination.FLASHCARDS && currentDestination != AppDestination.QUIZ) {
                        ArekaTopBar(
                            streakDays = userProfile.streakDays,
                            isDarkTheme = isDarkTheme,
                            onToggleDarkTheme = { viewModel.toggleDarkTheme() },
                            onProfileClick = {
                                viewModel.navigateTo(AppDestination.PROFILE)
                            }
                        )
                    }
                },
                bottomBar = {
                    // Only show bottom navigation when not inside an active quiz
                    if (currentActiveQuiz == null) {
                        ArekaBottomNav(
                            currentDestination = currentDestination,
                            onNavigate = { destination ->
                                viewModel.navigateTo(destination)
                            }
                        )
                    }
                }
            ) { innerPadding ->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(
                            top = if (currentActiveQuiz == null && currentDestination != AppDestination.FLASHCARDS && currentDestination != AppDestination.QUIZ) {
                                innerPadding.calculateTopPadding()
                            } else {
                                androidx.compose.ui.unit.Dp(0f)
                            },
                            bottom = if (currentActiveQuiz == null) {
                                innerPadding.calculateBottomPadding()
                            } else {
                                androidx.compose.ui.unit.Dp(0f)
                            }
                        )
                ) {
                    currentActiveQuiz?.let { activeQuiz ->
                        QuizScreen(
                            quiz = activeQuiz,
                            onBack = { viewModel.exitActiveQuiz() },
                            onOpenFlashcards = { subjectId, unitId ->
                                viewModel.openFlashcards(subjectId, unitId)
                            }
                        )
                    } ?: run {
                        AnimatedContent(
                            targetState = currentDestination,
                            label = "screenTransition"
                        ) { destination ->
                            when (destination) {
                                AppDestination.DASHBOARD -> {
                                    DashboardScreen(
                                        userProfile = userProfile,
                                        onStartQuiz = { quiz -> viewModel.startQuiz(quiz) },
                                        onOpenFlashcards = { subjectId, unitId ->
                                            viewModel.openFlashcards(subjectId, unitId)
                                        },
                                        searchQuery = searchQuery,
                                        onSearchQueryChange = { query ->
                                            viewModel.setDashboardSearchQuery(query)
                                        }
                                    )
                                }
                                AppDestination.QUIZ -> {
                                    QuizTabScreen(
                                        initialSubjectId = quizSubjectId,
                                        initialUnitId = quizUnitId,
                                        onStartQuiz = { quiz -> viewModel.startQuiz(quiz) },
                                        onBack = { viewModel.navigateTo(AppDestination.DASHBOARD) }
                                    )
                                }
                                AppDestination.FLASHCARDS -> {
                                    FlashcardsScreen(
                                        initialSubjectId = flashcardSubjectId,
                                        initialUnitId = flashcardUnitId,
                                        onStartQuiz = { quiz -> viewModel.startQuiz(quiz) },
                                        onBack = { viewModel.navigateTo(AppDestination.DASHBOARD) }
                                    )
                                }
                                AppDestination.PROFILE -> {
                                    ProfileScreen(
                                        userProfile = userProfile,
                                        isDarkTheme = isDarkTheme,
                                        onToggleDarkTheme = { viewModel.toggleDarkTheme() },
                                        onUpdateProfile = { name, grade ->
                                            viewModel.updateUserProfile(name, grade)
                                        },
                                        onBack = { viewModel.navigateTo(AppDestination.DASHBOARD) }
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
