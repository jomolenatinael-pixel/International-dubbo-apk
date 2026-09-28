package com.areka.app.data.repository

import com.areka.app.data.local.CardStatus
import com.areka.app.data.local.FlashcardScheduleEntity
import com.areka.app.data.local.ReviewGrade
import com.areka.app.data.local.ReviewLogEntity
import kotlin.math.roundToInt

object FlashcardScheduler {

    // Learning steps: Step 0 = 1 minute, Step 1 = 10 minutes
    val LEARNING_STEPS_MS = listOf(
        1 * 60 * 1000L,   // 1 min
        10 * 60 * 1000L   // 10 min
    )

    fun gradeCard(
        current: FlashcardScheduleEntity,
        grade: ReviewGrade,
        now: Long = System.currentTimeMillis()
    ): Pair<FlashcardScheduleEntity, ReviewLogEntity> {
        val currentStatus = try {
            CardStatus.valueOf(current.status)
        } catch (_: Exception) {
            CardStatus.NEW
        }

        var newStatus = currentStatus
        var newLearningStep = current.learningStepIndex
        var newLapses = current.lapses
        var newRepetitions = current.repetitions
        var newEase = current.ease
        var newIntervalDays = current.intervalDays
        var newDueAt = now

        when (currentStatus) {
            CardStatus.NEW, CardStatus.LEARNING, CardStatus.RELEARNING -> {
                when (grade) {
                    ReviewGrade.AGAIN -> {
                        newLearningStep = 0
                        newStatus = if (currentStatus == CardStatus.RELEARNING) CardStatus.RELEARNING else CardStatus.LEARNING
                        if (currentStatus != CardStatus.NEW) {
                            newLapses++
                        }
                        newEase = maxOf(1.3f, newEase - 0.2f)
                        newDueAt = now + LEARNING_STEPS_MS[0]
                        newIntervalDays = 0f
                    }
                    ReviewGrade.HARD -> {
                        val stepIndex = newLearningStep.coerceIn(0, LEARNING_STEPS_MS.size - 1)
                        val stepDuration = LEARNING_STEPS_MS[stepIndex]
                        newDueAt = now + (stepDuration * 1.5).toLong()
                        newStatus = if (currentStatus == CardStatus.RELEARNING) CardStatus.RELEARNING else CardStatus.LEARNING
                    }
                    ReviewGrade.GOOD -> {
                        if (newLearningStep < LEARNING_STEPS_MS.size - 1) {
                            newLearningStep++
                            newStatus = CardStatus.LEARNING
                            newDueAt = now + LEARNING_STEPS_MS[newLearningStep]
                        } else {
                            newStatus = CardStatus.REVIEW
                            newIntervalDays = 1.0f
                            newRepetitions++
                            newDueAt = now + (1 * 86_400_000L)
                            newLearningStep = 0
                        }
                    }
                    ReviewGrade.EASY -> {
                        newStatus = CardStatus.REVIEW
                        newIntervalDays = 4.0f
                        newRepetitions++
                        newDueAt = now + (4 * 86_400_000L)
                        newLearningStep = 0
                    }
                }
            }

            CardStatus.REVIEW -> {
                when (grade) {
                    ReviewGrade.AGAIN -> {
                        newStatus = CardStatus.RELEARNING
                        newLearningStep = 0
                        newLapses++
                        newEase = maxOf(1.3f, newEase - 0.2f)
                        newIntervalDays = 1.0f
                        newDueAt = now + LEARNING_STEPS_MS[0]
                    }
                    ReviewGrade.HARD -> {
                        newIntervalDays = maxOf(1.0f, newIntervalDays * 1.2f)
                        newEase = maxOf(1.3f, newEase - 0.15f)
                        newDueAt = now + (newIntervalDays * 86_400_000L).toLong()
                        newRepetitions++
                    }
                    ReviewGrade.GOOD -> {
                        newIntervalDays = maxOf(1.0f, newIntervalDays * newEase)
                        newDueAt = now + (newIntervalDays * 86_400_000L).toLong()
                        newRepetitions++
                    }
                    ReviewGrade.EASY -> {
                        newIntervalDays = maxOf(1.0f, newIntervalDays * newEase * 1.3f)
                        newEase += 0.15f
                        newDueAt = now + (newIntervalDays * 86_400_000L).toLong()
                        newRepetitions++
                    }
                }
            }
        }

        val updatedSchedule = current.copy(
            status = newStatus.name,
            dueAtEpochMillis = newDueAt,
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
        val status = try {
            CardStatus.valueOf(schedule.status)
        } catch (_: Exception) {
            CardStatus.NEW
        }

        return when (status) {
            CardStatus.NEW, CardStatus.LEARNING, CardStatus.RELEARNING -> {
                when (grade) {
                    ReviewGrade.AGAIN -> "<1m"
                    ReviewGrade.HARD -> {
                        val stepIndex = schedule.learningStepIndex.coerceIn(0, LEARNING_STEPS_MS.size - 1)
                        if (stepIndex == 0) "1.5m" else "15m"
                    }
                    ReviewGrade.GOOD -> {
                        if (schedule.learningStepIndex < LEARNING_STEPS_MS.size - 1) "10m" else "1d"
                    }
                    ReviewGrade.EASY -> "4d"
                }
            }
            CardStatus.REVIEW -> {
                when (grade) {
                    ReviewGrade.AGAIN -> "<1m"
                    ReviewGrade.HARD -> formatDays(maxOf(1.0f, schedule.intervalDays * 1.2f))
                    ReviewGrade.GOOD -> formatDays(maxOf(1.0f, schedule.intervalDays * schedule.ease))
                    ReviewGrade.EASY -> formatDays(maxOf(1.0f, schedule.intervalDays * schedule.ease * 1.3f))
                }
            }
        }
    }

    private fun formatDays(days: Float): String {
        return when {
            days < 1f -> "${(days * 24).roundToInt().coerceAtLeast(1)}h"
            days < 30f -> "${days.roundToInt().coerceAtLeast(1)}d"
            else -> "${(days / 30f).roundToInt().coerceAtLeast(1)}mo"
        }
    }
}
