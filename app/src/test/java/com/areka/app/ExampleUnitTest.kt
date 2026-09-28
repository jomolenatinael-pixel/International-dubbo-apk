package com.areka.app

import com.areka.app.data.local.CardStatus
import com.areka.app.data.local.FlashcardScheduleEntity
import com.areka.app.data.local.ReviewGrade
import com.areka.app.data.repository.FlashcardScheduler
import org.junit.Assert.*
import org.junit.Test

class ExampleUnitTest {

  @Test
  fun `new card with Good advances to next learning step`() {
    val initial = FlashcardScheduleEntity(
      cardId = "test_1",
      subjectId = "math",
      unitId = "math_u1",
      status = CardStatus.NEW.name,
      learningStepIndex = 0
    )
    val now = 1_000_000L
    val (updated, log) = FlashcardScheduler.gradeCard(initial, ReviewGrade.GOOD, now)

    assertEquals(CardStatus.LEARNING.name, updated.status)
    assertEquals(1, updated.learningStepIndex)
    assertEquals(now + 10 * 60 * 1000L, updated.dueAtEpochMillis)
    assertEquals("GOOD", log.grade)
  }

  @Test
  fun `learning card on last step with Good graduates to review`() {
    val initial = FlashcardScheduleEntity(
      cardId = "test_2",
      subjectId = "math",
      unitId = "math_u1",
      status = CardStatus.LEARNING.name,
      learningStepIndex = 1
    )
    val now = 1_000_000L
    val (updated, log) = FlashcardScheduler.gradeCard(initial, ReviewGrade.GOOD, now)

    assertEquals(CardStatus.REVIEW.name, updated.status)
    assertEquals(1.0f, updated.intervalDays, 0.01f)
    assertEquals(1, updated.repetitions)
    assertEquals(now + 86_400_000L, updated.dueAtEpochMillis)
  }

  @Test
  fun `new card with Easy graduates directly to review with 4 days interval`() {
    val initial = FlashcardScheduleEntity(
      cardId = "test_3",
      subjectId = "chem",
      unitId = "chem_u1",
      status = CardStatus.NEW.name
    )
    val now = 1_000_000L
    val (updated, _) = FlashcardScheduler.gradeCard(initial, ReviewGrade.EASY, now)

    assertEquals(CardStatus.REVIEW.name, updated.status)
    assertEquals(4.0f, updated.intervalDays, 0.01f)
    assertEquals(1, updated.repetitions)
    assertEquals(now + 4 * 86_400_000L, updated.dueAtEpochMillis)
  }

  @Test
  fun `review card with Again lapses and enters relearning`() {
    val initial = FlashcardScheduleEntity(
      cardId = "test_4",
      subjectId = "phys",
      unitId = "phys_u1",
      status = CardStatus.REVIEW.name,
      intervalDays = 6.0f,
      ease = 2.5f,
      repetitions = 3,
      lapses = 0
    )
    val now = 1_000_000L
    val (updated, log) = FlashcardScheduler.gradeCard(initial, ReviewGrade.AGAIN, now)

    assertEquals(CardStatus.RELEARNING.name, updated.status)
    assertEquals(1, updated.lapses)
    assertEquals(2.3f, updated.ease, 0.01f)
    assertEquals(now + 1 * 60 * 1000L, updated.dueAtEpochMillis)
    assertEquals("AGAIN", log.grade)
  }

  @Test
  fun `review card with Good scales interval by ease factor`() {
    val initial = FlashcardScheduleEntity(
      cardId = "test_5",
      subjectId = "bio",
      unitId = "bio_u1",
      status = CardStatus.REVIEW.name,
      intervalDays = 4.0f,
      ease = 2.5f,
      repetitions = 2
    )
    val now = 1_000_000L
    val (updated, _) = FlashcardScheduler.gradeCard(initial, ReviewGrade.GOOD, now)

    assertEquals(CardStatus.REVIEW.name, updated.status)
    assertEquals(10.0f, updated.intervalDays, 0.01f) // 4.0 * 2.5 = 10.0
    assertEquals(3, updated.repetitions)
    assertEquals(now + (10 * 86_400_000L), updated.dueAtEpochMillis)
  }

  @Test
  fun `interval preview strings are accurate for new and review cards`() {
    val newCard = FlashcardScheduleEntity(
      cardId = "test_preview_1",
      subjectId = "math",
      unitId = "math_u1",
      status = CardStatus.NEW.name,
      learningStepIndex = 0
    )
    assertEquals("<1m", FlashcardScheduler.getNextIntervalPreview(newCard, ReviewGrade.AGAIN))
    assertEquals("10m", FlashcardScheduler.getNextIntervalPreview(newCard, ReviewGrade.GOOD))
    assertEquals("4d", FlashcardScheduler.getNextIntervalPreview(newCard, ReviewGrade.EASY))

    val reviewCard = FlashcardScheduleEntity(
      cardId = "test_preview_2",
      subjectId = "math",
      unitId = "math_u1",
      status = CardStatus.REVIEW.name,
      intervalDays = 5.0f,
      ease = 2.5f
    )
    assertEquals("<1m", FlashcardScheduler.getNextIntervalPreview(reviewCard, ReviewGrade.AGAIN))
    assertEquals("6d", FlashcardScheduler.getNextIntervalPreview(reviewCard, ReviewGrade.HARD)) // 5 * 1.2 = 6
    assertEquals("13d", FlashcardScheduler.getNextIntervalPreview(reviewCard, ReviewGrade.GOOD)) // 5 * 2.5 = 12.5 -> 13d
  }
}
