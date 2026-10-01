package com.areka.app

import android.content.Context
import android.net.Uri
import androidx.test.core.app.ApplicationProvider
import com.areka.app.data.local.GUEST_OWNER_ID
import com.areka.app.data.local.QuizAttemptEntity
import com.areka.app.data.model.QuestionType
import com.areka.app.data.remote.AuthState
import com.areka.app.data.remote.AuthValidator
import com.areka.app.data.remote.InMemoryTokenStorage
import com.areka.app.data.remote.SecureStorageException
import com.areka.app.data.remote.SupabaseAuth
import com.areka.app.data.remote.SupabaseQuestionSync
import com.areka.app.data.repository.CurriculumData
import org.json.JSONArray
import org.json.JSONObject
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import java.util.UUID

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class AuthSecurityTest {

    private lateinit var context: Context

    @Before
    fun setup() {
        context = ApplicationProvider.getApplicationContext<Context>()
        // Ensure clean test preferences across test runs
        context.getSharedPreferences("areka_auth", Context.MODE_PRIVATE).edit().clear().commit()
        context.getSharedPreferences("areka_secure_tokens", Context.MODE_PRIVATE).edit().clear().commit()
        context.getSharedPreferences("areka_cloud_sync", Context.MODE_PRIVATE).edit().clear().commit()
        context.getSharedPreferences("supabase_sync", Context.MODE_PRIVATE).edit().clear().commit()
    }

    // ==========================================
    // 1. Credential Validation Tests
    // ==========================================

    @Test
    fun `valid email accepts standard formats`() {
        assertNull(AuthValidator.validateEmail("learner@example.com"))
        assertNull(AuthValidator.validateEmail("student.123@areka.edu"))
        assertNull(AuthValidator.validateEmail("user+study@domain.org"))
    }

    @Test
    fun `invalid email rejects missing at, bad domains, and blank`() {
        assertNotNull(AuthValidator.validateEmail(""))
        assertNotNull(AuthValidator.validateEmail("   "))
        assertNotNull(AuthValidator.validateEmail("plainaddress"))
        assertNotNull(AuthValidator.validateEmail("missing.domain@"))
        assertNotNull(AuthValidator.validateEmail("@nodomain.com"))
        assertNotNull(AuthValidator.validateEmail("bad@domain"))
    }

    @Test
    fun `blank password is rejected`() {
        val err = AuthValidator.validatePassword("")
        assertNotNull(err)
        assertEquals("Please enter your password.", err)
    }

    @Test
    fun `password below minimum 6 characters is rejected`() {
        val err = AuthValidator.validatePassword("12345")
        assertNotNull(err)
        assertEquals("Password must be at least 6 characters.", err)

        // Exactly 6 characters is accepted
        assertNull(AuthValidator.validatePassword("123456"))
        // Above 6 characters is accepted
        assertNull(AuthValidator.validatePassword("strongPassword2026!"))
    }

    @Test
    fun `mismatched password confirmation is rejected`() {
        val err = AuthValidator.validatePasswordConfirmation("secret123", "secret999")
        assertNotNull(err)
        assertEquals("Passwords do not match.", err)
    }

    @Test
    fun `matching password confirmation passes`() {
        assertNull(AuthValidator.validatePasswordConfirmation("secret123", "secret123"))
    }

    @Test
    fun `signUp validation enforces email and password confirmation rules`() {
        assertNotNull(AuthValidator.validateSignUp("bademail", "pass123", "pass123"))
        assertNotNull(AuthValidator.validateSignUp("valid@areka.app", "123", "123"))
        assertNotNull(AuthValidator.validateSignUp("valid@areka.app", "pass123", "different"))
        assertNull(AuthValidator.validateSignUp("valid@areka.app", "pass123", "pass123"))
    }

    @Test
    fun `password reset validation validates new password and confirmation`() {
        assertNotNull(AuthValidator.validatePasswordReset("123", "123"))
        assertNotNull(AuthValidator.validatePasswordReset("pass123", "pass999"))
        assertNull(AuthValidator.validatePasswordReset("newPass123", "newPass123"))
    }

    // ==========================================
    // 2. Secure Token Storage & Legacy Migration
    // ==========================================

    @Test
    fun `tokens saved in token storage are accessible and can be cleared`() {
        val storage = InMemoryTokenStorage()
        storage.saveTokens("mock_access_token", "mock_refresh_token")
        val tokens = storage.getTokens()
        assertEquals("mock_access_token", tokens.accessToken)
        assertEquals("mock_refresh_token", tokens.refreshToken)
        assertTrue(tokens.isAvailable)

        storage.clearTokens()
        val cleared = storage.getTokens()
        assertNull(cleared.accessToken)
        assertNull(cleared.refreshToken)
    }

    @Test
    fun `secure storage failure throws SecureStorageException and marks unavailable`() {
        val failingStorage = InMemoryTokenStorage(simulateFailure = true)
        assertFalse(failingStorage.isAvailable())
        assertFalse(failingStorage.getTokens().isAvailable)

        try {
            failingStorage.saveTokens("acc", "ref")
            fail("Expected SecureStorageException")
        } catch (e: SecureStorageException) {
            assertTrue(e.message?.contains("Simulated") == true)
        }
    }

    @Test
    fun `legacy plaintext tokens are migrated and scrubbed from plaintext storage`() {
        val legacyPrefs = context.getSharedPreferences("areka_auth", Context.MODE_PRIVATE)
        legacyPrefs.edit()
            .putString("access_token", "legacy_plain_access")
            .putString("refresh_token", "legacy_plain_refresh")
            .putString("user_id", "u_test_123")
            .commit()

        val testSecurePrefs = context.getSharedPreferences("test_encrypted_prefs", Context.MODE_PRIVATE)
        testSecurePrefs.edit().clear().commit()
        val secureStorage = com.areka.app.data.remote.AndroidKeystoreTokenStorage(
            context = context,
            customSecurePrefs = testSecurePrefs
        )
        val migrated = secureStorage.getTokens()

        // 1. Tokens were recovered
        assertEquals("legacy_plain_access", migrated.accessToken)
        assertEquals("legacy_plain_refresh", migrated.refreshToken)

        // 2. Plaintext tokens were immediately scrubbed from legacy SharedPreferences
        assertFalse(legacyPrefs.contains("access_token"))
        assertFalse(legacyPrefs.contains("refresh_token"))

        // 3. Non-token user metadata remains preserved in legacy SharedPreferences
        assertEquals("u_test_123", legacyPrefs.getString("user_id", null))
    }

    // ==========================================
    // 3. Password Recovery Deep-Link & State
    // ==========================================

    @Test
    fun `recovery callback parses query parameters into PasswordRecovery state`() {
        val uri = Uri.parse("areka://auth/recovery?access_token=rec_token_123&refresh_token=rec_refresh_456&type=recovery&email=student@areka.app")
        val result = SupabaseAuth.handleRecoveryUri(uri)

        assertTrue(result.isSuccess)
        val state = SupabaseAuth.state.value
        assertTrue(state is AuthState.PasswordRecovery)
        val recoveryState = state as AuthState.PasswordRecovery
        assertEquals("student@areka.app", recoveryState.email)

        // Cleanup
        SupabaseAuth.cancelPasswordRecovery()
        assertEquals(AuthState.SignedOut, SupabaseAuth.state.value)
    }

    @Test
    fun `recovery callback parses fragment parameters into PasswordRecovery state`() {
        val uri = Uri.parse("areka://auth/recovery#access_token=fragment_acc_token&refresh_token=fragment_ref_token&type=recovery")
        val result = SupabaseAuth.handleRecoveryUri(uri)

        assertTrue(result.isSuccess)
        val state = SupabaseAuth.state.value
        assertTrue(state is AuthState.PasswordRecovery)

        // Must NOT automatically treat the user as signed in
        assertFalse(state is AuthState.SignedIn)

        // Cleanup
        SupabaseAuth.cancelPasswordRecovery()
        assertEquals(AuthState.SignedOut, SupabaseAuth.state.value)
    }

    @Test
    fun `recovery callback with error parameter transitions to safe Error state`() {
        val uri = Uri.parse("areka://auth/recovery#error=access_denied&error_code=401&error_description=Email+link+is+invalid+or+has+expired")
        val result = SupabaseAuth.handleRecoveryUri(uri)

        assertTrue(result.isFailure)
        val state = SupabaseAuth.state.value
        assertTrue(state is AuthState.Error)
        val errState = state as AuthState.Error
        assertTrue(errState.message.contains("expired", true) || errState.message.contains("invalid", true))
    }

    @Test
    fun `recovery callback with missing tokens transitions to Error state`() {
        val uri = Uri.parse("areka://auth/recovery")
        val result = SupabaseAuth.handleRecoveryUri(uri)

        assertTrue(result.isFailure)
        assertTrue(SupabaseAuth.state.value is AuthState.Error)
    }

    // ==========================================
    // 4. Pending Cloud Attempts Idempotency
    // ==========================================

    @Test
    fun `idempotency UUID seed produces stable and deterministic cloud attempt IDs`() {
        val userId = "usr_42"
        val localAttemptId = "attempt_math_u1_1720000000"
        val seed = "${userId}_$localAttemptId"

        val uuid1 = UUID.nameUUIDFromBytes(seed.toByteArray(Charsets.UTF_8)).toString()
        val uuid2 = UUID.nameUUIDFromBytes(seed.toByteArray(Charsets.UTF_8)).toString()

        assertEquals(uuid1, uuid2)
        assertEquals(36, uuid1.length) // Standard UUID length

        // Different user ID produces different UUID even with same attempt ID
        val diffUserSeed = "usr_99_$localAttemptId"
        val diffUuid = UUID.nameUUIDFromBytes(diffUserSeed.toByteArray(Charsets.UTF_8)).toString()
        assertNotEquals(uuid1, diffUuid)
    }

    // ==========================================
    // 5. Account Isolation Tests
    // ==========================================

    @Test
    fun `guest owner ID is constant and distinct from user IDs`() {
        assertEquals("guest", GUEST_OWNER_ID)
        val attemptGuest = QuizAttemptEntity(
            ownerUserId = GUEST_OWNER_ID,
            id = "att_g1",
            quizId = "math_u1",
            quizTitle = "Math Quiz",
            subjectId = "math",
            unitId = "math_u1",
            scorePercent = 80,
            correctAnswers = 4,
            totalQuestions = 5,
            timeSpentSeconds = 60
        )
        val attemptUserA = attemptGuest.copy(ownerUserId = "user_A_id", id = "att_u1")

        assertEquals("guest", attemptGuest.ownerUserId)
        assertEquals("user_A_id", attemptUserA.ownerUserId)
        assertNotEquals(attemptGuest.ownerUserId, attemptUserA.ownerUserId)
    }

    // ==========================================
    // 6. Remote Question Bank Parsing & Consumption
    // ==========================================

    @Test
    fun `parseRemoteQuizzes converts Supabase question bank into domain models`() {
        val quizzesJson = JSONArray().put(
            JSONObject()
                .put("id", "remote_chem_u1")
                .put("unit", "chem_u1")
                .put("title", "Remote Chemistry Quiz")
                .put("subject", "Chemistry")
        )
        val questionsJson = JSONArray().put(
            JSONObject()
                .put("id", 101)
                .put("quiz_id", "remote_chem_u1")
                .put("question_type", "multiple_choice")
                .put("question_text", "What is H2O?")
                .put("explanation", "Water molecule")
                .put("order_index", 1)
        )
        val choicesJson = JSONArray()
            .put(JSONObject().put("id", "c1").put("question_id", 101).put("choice_text", "Water").put("is_correct", true))
            .put(JSONObject().put("id", "c2").put("question_id", 101).put("choice_text", "Acid").put("is_correct", false))

        val payload = JSONObject()
            .put("quizzes", quizzesJson)
            .put("questions", questionsJson)
            .put("choices", choicesJson)

        val parsed = SupabaseQuestionSync.parseRemoteQuizzes(payload)
        assertEquals(1, parsed.size / 2) // Keyed by both quizId and unitId

        val chemQuiz = parsed["chem_u1"]
        assertNotNull(chemQuiz)
        assertEquals("Remote Chemistry Quiz", chemQuiz?.title)
        assertEquals(1, chemQuiz?.questions?.size)
        assertEquals("What is H2O?", chemQuiz?.questions?.first()?.text)
        assertEquals("c1", chemQuiz?.questions?.first()?.correctOptionId)
        assertEquals(QuestionType.MULTIPLE_CHOICE, chemQuiz?.questions?.first()?.type)

        // Verify consumption into CurriculumData
        CurriculumData.setRemoteQuizzes(parsed)
        val resolved = CurriculumData.getQuizForUnit("chem_u1")
        assertEquals("Remote Chemistry Quiz", resolved.title)
    }
}
