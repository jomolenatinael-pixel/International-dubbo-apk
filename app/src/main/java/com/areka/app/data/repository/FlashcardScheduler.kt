package com.areka.app.data.repository

import com.areka.app.data.local.CardStatus
import com.areka.app.data.local.FlashcardScheduleEntity
import com.areka.app.data.local.ReviewGrade
import com.areka.app.data.local.ReviewLogEntity
import kotlin.math.roundToInt

object FlashcardScheduler {
    val LEARNING_STEPS_MS = listOf(
        1 * 60 * 1000L,
        10 * 60 * 1000L
    )

    private const val MAX_INTERVAL_DAYS = 36_500f
    private const val MILLIS_PER_DAY = 86_400_000f

    fun gradeCard(
        current: FlashcardScheduleEntity,
        grade: ReviewGrade,
        now: Long = System.currentTimeMillis()
    ): Pair<FlashcardScheduleEntity, ReviewLogEntity> {
        val currentStatus = runCatching { CardStatus.valueOf(current.status) }.getOrDefault(CardStatus.NEW)
        var newStatus = currentStatus
        var newLearningStep = current.learningStepIndex.coerceIn(0, LEARNING_STEPS_MS.lastIndex)
        var newLapses = current.lapses.coerceAtLeast(0)
        var newRepetitions = current.repetitions.coerceAtLeast(0)
        var newEase = current.ease.takeIf { it.isFinite() }?.coerceIn(1.3f, 4.0f) ?: 2.5f
        var newIntervalDays = current.intervalDays.takeIf { it.isFinite() }?.coerceIn(0f, MAX_INTERVAL_DAYS) ?: 0f
        var newDueAt = now

        when (currentStatus) {
            CardStatus.NEW, CardStatus.LEARNING, CardStatus.RELEARNING -> when (grade) {
                ReviewGrade.AGAIN -> {
                    newLearningStep = 0
                    newStatus = if (currentStatus == CardStatus.RELEARNING) CardStatus.RELEARNING else CardStatus.LEARNING
                    if (currentStatus != CardStatus.NEW) newLapses++
                    newEase = maxOf(1.3f, newEase - 0.2f)
                    newDueAt = now + LEARNING_STEPS_MS[0]
                    newIntervalDays = 0f
                }
                ReviewGrade.HARD -> {
                    val stepDuration = LEARNING_STEPS_MS[newLearningStep]
                    newDueAt = now + (stepDuration * 1.5).toLong()
                    newStatus = if (currentStatus == CardStatus.RELEARNING) CardStatus.RELEARNING else CardStatus.LEARNING
                }
                ReviewGrade.GOOD -> {
                    if (newLearningStep < LEARNING_STEPS_MS.lastIndex) {
                        newLearningStep++
                        newStatus = CardStatus.LEARNING
                        newDueAt = now + LEARNING_STEPS_MS[newLearningStep]
                    } else {
                        newStatus = CardStatus.REVIEW
                        newIntervalDays = 1.0f
                        newRepetitions++
                        newDueAt = dueAt(now, newIntervalDays)
                        newLearningStep = 0
                    }
                }
                ReviewGrade.EASY -> {
                    newStatus = CardStatus.REVIEW
                    newIntervalDays = 4.0f
                    newRepetitions++
                    newDueAt = dueAt(now, newIntervalDays)
                    newLearningStep = 0
                }
            }
            CardStatus.REVIEW -> when (grade) {
                ReviewGrade.AGAIN -> {
                    newStatus = CardStatus.RELEARNING
                    newLearningStep = 0
                    newLapses++
                    newEase = maxOf(1.3f, newEase - 0.2f)
                    newIntervalDays = 1.0f
                    newDueAt = now + LEARNING_STEPS_MS[0]
                }
                ReviewGrade.HARD -> {
                    newIntervalDays = (newIntervalDays * 1.2f).coerceIn(1.0f, MAX_INTERVAL_DAYS)
                    newEase = maxOf(1.3f, newEase - 0.15f)
                    newDueAt = dueAt(now, newIntervalDays)
                    newRepetitions++
                }
                ReviewGrade.GOOD -> {
                    newIntervalDays = (newIntervalDays * newEase).coerceIn(1.0f, MAX_INTERVAL_DAYS)
                    newDueAt = dueAt(now, newIntervalDays)
                    newRepetitions++
                }
                ReviewGrade.EASY -> {
                    newIntervalDays = (newIntervalDays * newEase * 1.3f).coerceIn(1.0f, MAX_INTERVAL_DAYS)
                    newEase = (newEase + 0.15f).coerceAtMost(4.0f)
                    newDueAt = dueAt(now, newIntervalDays)
                    newRepetitions++
                }
            }
        }

        val updatedSchedule = current.copy(
            status = newStatus.name,
            dueAtEpochMillis = newDueAt.coerceAtLeast(now),
            intervalDays = newIntervalDays,
            ease = newEase,
            repetitions = newRepetitions,
            lapses = newLapses,
            learningStepIndex = newLearningStep,
            lastReviewedAtEpochMillis = now,
            updatedAtEpochMillis = now
        )
        val log = ReviewLogEntity(
            cardId = current.cardId,
            unitId = current.unitId,
            grade = grade.name,
            previousStatus = current.status,
            newStatus = newStatus.name,
            previousIntervalDays = current.intervalDays,
            newIntervalDays = newIntervalDays,
            reviewedAtEpochMillis = now
        )
        return Pair(updatedSchedule, log)
    }

    fun getNextIntervalPreview(schedule: FlashcardScheduleEntity, grade: ReviewGrade): String {
        val status = runCatching { CardStatus.valueOf(schedule.status) }.getOrDefault(CardStatus.NEW)
        val safeInterval = schedule.intervalDays.takeIf { it.isFinite() }?.coerceIn(0f, MAX_INTERVAL_DAYS) ?: 0f
        val safeEase = schedule.ease.takeIf { it.isFinite() }?.coerceIn(1.3f, 4.0f) ?: 2.5f
        return when (status) {
            CardStatus.NEW, CardStatus.LEARNING, CardStatus.RELEARNING -> when (grade) {
                ReviewGrade.AGAIN -> "<1m"
                ReviewGrade.HARD -> if (schedule.learningStepIndex.coerceIn(0, LEARNING_STEPS_MS.lastIndex) == 0) "1.5m" else "15m"
                ReviewGrade.GOOD -> if (schedule.learningStepIndex < LEARNING_STEPS_MS.lastIndex) "10m" else "1d"
                ReviewGrade.EASY -> "4d"
            }
            CardStatus.REVIEW -> when (grade) {
                ReviewGrade.AGAIN -> "<1m"
                ReviewGrade.HARD -> formatDays((safeInterval * 1.2f).coerceIn(1f, MAX_INTERVAL_DAYS))
                ReviewGrade.GOOD -> formatDays((safeInterval * safeEase).coerceIn(1f, MAX_INTERVAL_DAYS))
                ReviewGrade.EASY -> formatDays((safeInterval * safeEase * 1.3f).coerceIn(1f, MAX_INTERVAL_DAYS))
            }
        }
    }

    private fun dueAt(now: Long, intervalDays: Float): Long {
        val millis = (intervalDays.coerceIn(0f, MAX_INTERVAL_DAYS) * MILLIS_PER_DAY)
            .toLong()
            .coerceAtMost(Long.MAX_VALUE - now)
        return now + millis
    }

    private fun formatDays(days: Float): String = when {
        days < 1f -> "${(days * 24).roundToInt().coerceAtLeast(1)}h"
        days < 30f -> "${days.roundToInt().coerceAtLeast(1)}d"
        else -> "${(days / 30f).roundToInt().coerceAtLeast(1)}mo"
    }
}
