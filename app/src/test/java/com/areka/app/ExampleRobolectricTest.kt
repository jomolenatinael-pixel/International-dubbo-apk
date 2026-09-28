package com.areka.app

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.areka.app.data.repository.StudyRepository
import com.areka.app.data.model.QuizScoring
import com.areka.app.ui.components.AppDestination
import com.areka.app.ui.viewmodel.AppViewModel
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class ExampleRobolectricTest {

  @Test
  fun `read string from context`() {
    val context = ApplicationProvider.getApplicationContext<Context>()
    val appName = context.getString(R.string.app_name)
    assertEquals("Areka", appName)
  }

  @Test
  fun `test AppViewModel back navigation flow`() {
    val viewModel = AppViewModel()
    assertEquals(AppDestination.DASHBOARD, viewModel.currentDestination.value)

    // Navigate to leaderboard
    viewModel.navigateTo(AppDestination.LEADERBOARD)
    assertEquals(AppDestination.LEADERBOARD, viewModel.currentDestination.value)

    // Back press should return to DASHBOARD
    val handled = viewModel.handleBack()
    assertTrue(handled)
    assertEquals(AppDestination.DASHBOARD, viewModel.currentDestination.value)

    // Back press from DASHBOARD should not be consumed
    val handledAtRoot = viewModel.handleBack()
    assertFalse(handledAtRoot)
  }

  @Test
  fun `test profile update and leaderboard reflection`() {
    StudyRepository.updateProfile("Jordan Lee", "Grade 11")
    val profile = StudyRepository.userProfile.value
    assertEquals("Jordan Lee", profile.name)
    assertEquals("Grade 11", profile.grade)

    // Leaderboard should dynamically reflect the user's name
    val global = StudyRepository.getGlobalLeaderboard(profile)
    val userEntry = global.firstOrNull { it.isCurrentUser }
    assertTrue(userEntry != null)
    assertEquals("Jordan Lee", userEntry?.name)
    assertEquals("Grade 11", userEntry?.grade)
  }

  @Test
  fun `quiz scoring counts correct incorrect skipped and points consistently`() {
    val quiz = StudyRepository.getQuizForUnit("math_u1")
    val answers = quiz.questions.take(2).associate { it.id to it.correctOptionId }
    val score = QuizScoring.calculate(quiz, answers)
    assertEquals(4, score.totalQuestions)
    assertEquals(2, score.correctAnswers)
    assertEquals(0, score.incorrectAnswers)
    assertEquals(2, score.skippedAnswers)
    assertEquals(50, score.percentage)
    assertEquals(500, score.pointsEarned)
  }

  @Test
  fun `test theme toggle persists in memory and state`() {
    val initialTheme = StudyRepository.isDarkTheme.value
    StudyRepository.toggleTheme()
    assertEquals(!initialTheme, StudyRepository.isDarkTheme.value)
    // Toggle back
    StudyRepository.toggleTheme()
    assertEquals(initialTheme, StudyRepository.isDarkTheme.value)
  }

  @Test
  fun `test hand-authored unit quizzes exist with high quality questions`() {
    val mathQuiz = StudyRepository.getQuizForUnit("math_u1")
    assertEquals("Relations and Functions Quiz", mathQuiz.title)
    assertEquals(4, mathQuiz.questions.size)
    assertEquals(4, mathQuiz.questions.first().options.size)
    assertFalse(mathQuiz.questions.first().explanation.isEmpty())

    // Confirm total units across 9 subjects equals exactly 66 units
    assertEquals(66, StudyRepository.units.size)
    assertEquals(9, StudyRepository.subjects.size)
  }

  @Test
  fun `test Quiz tab destination navigation and start quiz flow`() {
    val viewModel = AppViewModel()
    assertEquals(AppDestination.DASHBOARD, viewModel.currentDestination.value)

    // Navigate to Quiz Tab
    viewModel.navigateTo(AppDestination.QUIZ)
    assertEquals(AppDestination.QUIZ, viewModel.currentDestination.value)
    assertTrue(viewModel.currentActiveQuiz.value == null)

    // Start a Unit Quiz from the Quiz Tab
    val biologyQuiz = StudyRepository.getQuizForUnit("bio_u1")
    viewModel.startQuiz(biologyQuiz)
    assertEquals(biologyQuiz, viewModel.currentActiveQuiz.value)

    // Back handling while inside active quiz should dismiss active quiz and return to Quiz Tab
    val handledExitQuiz = viewModel.handleBack()
    assertTrue(handledExitQuiz)
    assertTrue(viewModel.currentActiveQuiz.value == null)
    assertEquals(AppDestination.QUIZ, viewModel.currentDestination.value)

    // Back handling from Quiz Tab returns to Dashboard
    val handledReturnHome = viewModel.handleBack()
    assertTrue(handledReturnHome)
    assertEquals(AppDestination.DASHBOARD, viewModel.currentDestination.value)
  }

  @Test
  fun `test openQuizHub sets subject and unit and navigates to QUIZ`() {
    val viewModel = AppViewModel()
    viewModel.openQuizHub("chem", "chem_u2")
    assertEquals(AppDestination.QUIZ, viewModel.currentDestination.value)
    assertEquals("chem", viewModel.quizSubjectId.value)
    assertEquals("chem_u2", viewModel.quizUnitId.value)
  }
}
