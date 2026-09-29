package com.areka.app.data.repository

import com.areka.app.data.local.MistakeEntity
import com.areka.app.data.local.StudyDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch

class MistakeRepository(
    private val studyDao: () -> StudyDao?,
    private val scope: CoroutineScope = CoroutineScope(Dispatchers.IO)
) {
    private val _openMistakes = MutableStateFlow<List<MistakeEntity>>(emptyList())
    val openMistakes: StateFlow<List<MistakeEntity>> = _openMistakes.asStateFlow()

    fun attachDao(dao: StudyDao) {
        scope.launch {
            dao.getOpenMistakes().collectLatest { mistakes ->
                _openMistakes.value = mistakes
            }
        }
    }

    fun getOpenMistakes(): Flow<List<MistakeEntity>> =
        studyDao()?.getOpenMistakes() ?: flowOf(emptyList())

    fun markMistakeReviewed(quizId: String, questionId: Int) {
        scope.launch {
            studyDao()?.markMistakeReviewed(quizId, questionId)
        }
    }

    fun markAllMistakesReviewed() {
        scope.launch {
            studyDao()?.markAllMistakesReviewed()
        }
    }
}
