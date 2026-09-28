package com.areka.app.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.areka.app.data.model.Quiz
import com.areka.app.data.repository.StudyRepository
import com.areka.app.ui.components.AppDestination
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class AppViewModel : ViewModel() {

    val isDarkTheme: StateFlow<Boolean> = StudyRepository.isDarkTheme

    private val _currentDestination = MutableStateFlow(AppDestination.DASHBOARD)
    val currentDestination: StateFlow<AppDestination> = _currentDestination.asStateFlow()

    private val _currentActiveQuiz = MutableStateFlow<Quiz?>(null)
    val currentActiveQuiz: StateFlow<Quiz?> = _currentActiveQuiz.asStateFlow()

    private val _flashcardSubjectId = MutableStateFlow<String?>(null)
    val flashcardSubjectId: StateFlow<String?> = _flashcardSubjectId.asStateFlow()

    private val _flashcardUnitId = MutableStateFlow<String?>(null)
    val flashcardUnitId: StateFlow<String?> = _flashcardUnitId.asStateFlow()

    private val _quizSubjectId = MutableStateFlow<String?>(null)
    val quizSubjectId: StateFlow<String?> = _quizSubjectId.asStateFlow()

    private val _quizUnitId = MutableStateFlow<String?>(null)
    val quizUnitId: StateFlow<String?> = _quizUnitId.asStateFlow()

    private val _dashboardSearchQuery = MutableStateFlow("")
    val dashboardSearchQuery: StateFlow<String> = _dashboardSearchQuery.asStateFlow()

    fun navigateTo(destination: AppDestination) {
        if (_currentActiveQuiz.value != null) {
            _currentActiveQuiz.value = null
        }
        _currentDestination.value = destination
    }

    fun startQuiz(quiz: Quiz) {
        _currentActiveQuiz.value = quiz
    }

    fun exitActiveQuiz() {
        _currentActiveQuiz.value = null
    }

    fun openQuizHub(subjectId: String? = null, unitId: String? = null) {
        if (_currentActiveQuiz.value != null) {
            _currentActiveQuiz.value = null
        }
        _quizSubjectId.value = subjectId
        _quizUnitId.value = unitId
        _currentDestination.value = AppDestination.QUIZ
    }

    fun openFlashcards(subjectId: String? = null, unitId: String? = null) {
        if (_currentActiveQuiz.value != null) {
            _currentActiveQuiz.value = null
        }
        _flashcardSubjectId.value = subjectId
        _flashcardUnitId.value = unitId
        _currentDestination.value = AppDestination.FLASHCARDS
    }

    fun toggleDarkTheme() {
        StudyRepository.toggleTheme()
    }

    fun updateUserProfile(name: String, grade: String) {
        StudyRepository.updateProfile(name, grade)
    }

    fun setDashboardSearchQuery(query: String) {
        _dashboardSearchQuery.value = query
    }

    /**
     * Handles system back press across custom navigation state.
     * Returns true if back action was consumed, false if on root dashboard.
     */
    fun handleBack(): Boolean {
        if (_currentActiveQuiz.value != null) {
            _currentActiveQuiz.value = null
            return true
        }
        if (_currentDestination.value != AppDestination.DASHBOARD) {
            _currentDestination.value = AppDestination.DASHBOARD
            return true
        }
        return false
    }
}
