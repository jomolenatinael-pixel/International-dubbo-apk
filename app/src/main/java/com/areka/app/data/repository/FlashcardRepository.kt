package com.areka.app.data.repository

import com.areka.app.data.local.CardStatus
import com.areka.app.data.local.FlashcardProgressDao
import com.areka.app.data.local.FlashcardProgressEntity
import com.areka.app.data.local.FlashcardScheduleDao
import com.areka.app.data.local.FlashcardScheduleEntity
import com.areka.app.data.local.ReviewGrade
import com.areka.app.data.local.currentOwnerId
import com.areka.app.data.local.ownerIdFlow
import com.areka.app.data.model.Flashcard
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch

class FlashcardRepository(
    private val scheduleDao: () -> FlashcardScheduleDao?,
    private val progressDao: () -> FlashcardProgressDao?,
    private val scope: CoroutineScope = CoroutineScope(Dispatchers.IO)
) {
    private val _dueFlashcardsCount = MutableStateFlow(0)
    val dueFlashcardsCount: StateFlow<Int> = _dueFlashcardsCount.asStateFlow()

    fun attachDao(dao: FlashcardScheduleDao) {
        scope.launch {
            ownerIdFlow().collectLatest { owner ->
                if (dao.getScheduleCount(owner) == 0) {
                    val now = System.currentTimeMillis()
                    dao.insertAll(CurriculumData.flashcards.map { card ->
                        FlashcardScheduleEntity(
                            ownerUserId = owner,
                            cardId = card.id,
                            subjectId = card.subjectId,
                            unitId = card.unitId,
                            dueAtEpochMillis = now,
                            updatedAtEpochMillis = now
                        )
                    })
                }
                dao.getAllSchedules(owner).collectLatest { schedules ->
                    val now = System.currentTimeMillis()
                    _dueFlashcardsCount.value = schedules.count { it.dueAtEpochMillis <= now }
                }
            }
        }
    }

    fun getFlashcardsForUnit(unitId: String): List<Flashcard> = CurriculumData.getFlashcardsForUnit(unitId)

    fun getFlashcardProgressForUnit(unitId: String): Flow<List<FlashcardProgressEntity>> =
        progressDao()?.getProgressForUnit(currentOwnerId(), unitId) ?: flowOf(emptyList())

    fun setFlashcardStatus(cardId: String, unitId: String, isKnown: Boolean) {
        scope.launch {
            progressDao()?.setCardProgress(
                FlashcardProgressEntity(
                    ownerUserId = currentOwnerId(),
                    cardId = cardId,
                    unitId = unitId,
                    isKnown = isKnown
                )
            )
        }
    }

    fun getSchedulesForUnit(unitId: String): Flow<List<FlashcardScheduleEntity>> =
        scheduleDao()?.getSchedulesForUnit(currentOwnerId(), unitId) ?: flowOf(emptyList())

    suspend fun ensureSchedulesForUnit(unitId: String): List<FlashcardScheduleEntity> {
        val dao = scheduleDao() ?: return emptyList()
        val owner = currentOwnerId()
        val cards = CurriculumData.getFlashcardsForUnit(unitId)
        val existing = dao.getSchedulesForUnitOnce(owner, unitId)
        val existingCardIds = existing.map { it.cardId }.toSet()
        val now = System.currentTimeMillis()
        val missing = cards.filter { it.id !in existingCardIds }
        if (missing.isNotEmpty()) {
            dao.insertAll(missing.map { card ->
                FlashcardScheduleEntity(
                    ownerUserId = owner,
                    cardId = card.id,
                    subjectId = card.subjectId,
                    unitId = card.unitId,
                    dueAtEpochMillis = now,
                    updatedAtEpochMillis = now
                )
            })
            return dao.getSchedulesForUnitOnce(owner, unitId)
        }
        return existing
    }

    fun answerCard(cardId: String, grade: ReviewGrade, onAnswered: (() -> Unit)? = null) {
        scope.launch {
            val dao = scheduleDao() ?: return@launch
            val owner = currentOwnerId()
            val schedule = dao.getScheduleForCard(owner, cardId) ?: return@launch
            val (updatedSchedule, log) = FlashcardScheduler.gradeCard(schedule, grade)
            dao.insertOrUpdate(updatedSchedule.copy(ownerUserId = owner))
            dao.insertReviewLog(log.copy(ownerUserId = owner))
            onAnswered?.invoke()
        }
    }

    fun resetUnitSchedules(unitId: String) {
        scope.launch {
            val dao = scheduleDao() ?: return@launch
            val owner = currentOwnerId()
            dao.deleteSchedulesForUnit(owner, unitId)
            ensureSchedulesForUnit(unitId)
        }
    }
}
