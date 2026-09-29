package com.areka.app.data.repository

import com.areka.app.data.local.UserProfileDao
import com.areka.app.data.local.UserProfileEntity
import com.areka.app.data.model.UserProfile
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class ProfileRepository(
    private val userProfileDao: () -> UserProfileDao?,
    private val scope: CoroutineScope = CoroutineScope(Dispatchers.IO)
) {
    private val _isDarkTheme = MutableStateFlow(true)
    val isDarkTheme: StateFlow<Boolean> = _isDarkTheme.asStateFlow()

    private val _userProfile = MutableStateFlow(
        UserProfile(
            name = "Student",
            grade = "Grade 10",
            streakDays = 0,
            totalQuizzes = 0,
            averageScore = 0,
            timeStudiedHours = 0,
            globalRank = 11,
            totalPoints = 0
        )
    )
    val userProfile: StateFlow<UserProfile> = _userProfile.asStateFlow()

    fun attachDao(dao: UserProfileDao) {
        scope.launch {
            val existing = dao.getUserProfileOnce()
            if (existing == null) {
                dao.insertOrUpdate(UserProfileEntity.default())
            }
            dao.getUserProfile().collectLatest { entity ->
                if (entity != null) {
                    _userProfile.value = entity.toUserProfile()
                    _isDarkTheme.value = entity.isDarkTheme
                }
            }
        }
    }

    fun updateProfile(name: String, grade: String) {
        val trimmedName = name.trim().ifBlank { _userProfile.value.name }
        val trimmedGrade = grade.trim().ifBlank { _userProfile.value.grade }

        val current = _userProfile.value
        _userProfile.value = current.copy(name = trimmedName, grade = trimmedGrade)

        scope.launch {
            userProfileDao()?.updateNameAndGrade(trimmedName, trimmedGrade)
        }
    }

    fun toggleTheme() {
        val newTheme = !_isDarkTheme.value
        _isDarkTheme.value = newTheme
        scope.launch {
            userProfileDao()?.updateTheme(newTheme)
        }
    }
}
