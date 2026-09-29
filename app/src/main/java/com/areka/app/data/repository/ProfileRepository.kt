package com.areka.app.data.repository

import com.areka.app.data.local.UserProfileDao
import com.areka.app.data.local.UserProfileEntity
import com.areka.app.data.local.currentOwnerId
import com.areka.app.data.local.ownerIdFlow
import com.areka.app.data.model.UserProfile
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class ProfileRepository(
    private val userProfileDao: () -> UserProfileDao?,
    private val scope: CoroutineScope = CoroutineScope(Dispatchers.IO)
) {
    private val _isDarkTheme = MutableStateFlow(true)
    val isDarkTheme: StateFlow<Boolean> = _isDarkTheme.asStateFlow()

    private val _userProfile = MutableStateFlow(UserProfile(name = "Student", grade = "Grade 10"))
    val userProfile: StateFlow<UserProfile> = _userProfile.asStateFlow()

    fun attachDao(dao: UserProfileDao) {
        scope.launch {
            ownerIdFlow().flatMapLatest { owner ->
                flow {
                    if (dao.getUserProfileOnce(owner) == null) {
                        dao.insertOrUpdate(UserProfileEntity.default(owner))
                    }
                    emitAll(dao.getUserProfile(owner))
                }
            }.collectLatest { entity ->
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
        _userProfile.value = _userProfile.value.copy(name = trimmedName, grade = trimmedGrade)
        scope.launch { userProfileDao()?.updateNameAndGrade(currentOwnerId(), trimmedName, trimmedGrade) }
    }

    fun toggleTheme() {
        val newTheme = !_isDarkTheme.value
        _isDarkTheme.value = newTheme
        scope.launch { userProfileDao()?.updateTheme(currentOwnerId(), newTheme) }
    }
}
