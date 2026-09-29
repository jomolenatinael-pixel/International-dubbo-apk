package com.areka.app.data.remote

import android.content.Context
import com.areka.app.BuildConfig
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import java.util.Locale

/** Single source of truth for the real Supabase session. */
object SupabaseAuth {
    private const val PREFS = "areka_auth"
    private const val ACCESS_TOKEN = "access_token"
    private const val REFRESH_TOKEN = "refresh_token"
    private const val USER_ID = "user_id"
    private const val EMAIL = "email"
    private const val DISPLAY_NAME = "display_name"
    private const val IS_ADMIN = "is_admin"
    private const val MIN_PASSWORD_LENGTH = 6

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val authMutex = Mutex()
    private var appContext: Context? = null
    @Volatile private var accessToken: String? = null
    private var refreshToken: String? = null
    private var initialized = false

    private val _state = MutableStateFlow<AuthState>(AuthState.Loading)
    val state: StateFlow<AuthState> = _state.asStateFlow()

    fun initialize(context: Context) {
        synchronized(this) {
            if (initialized) return
            initialized = true
            appContext = context.applicationContext
        }
        _state.value = AuthState.Loading
        scope.launch { restoreSession() }
    }

    suspend fun signIn(email: String, password: String): Result<AuthUser> = authMutex.withLock {
        val validation = validateCredentials(email, password)
        if (validation != null) return@withLock Result.failure(validation)
        authenticateLocked(
            "/auth/v1/token?grant_type=password",
            JSONObject().put("email", email.trim().lowercase(Locale.US)).put("password", password)
        )
    }

    suspend fun signUp(email: String, password: String, confirmation: String, displayName: String): Result<AuthUser> = authMutex.withLock {
        val validation = validateCredentials(email, password)
        if (validation != null) return@withLock Result.failure(validation)
        if (password != confirmation) return@withLock Result.failure(AuthException("Passwords do not match."))
        authenticateLocked(
            "/auth/v1/signup",
            JSONObject()
                .put("email", email.trim().lowercase(Locale.US))
                .put("password", password)
                .put("data", JSONObject().put("display_name", displayName.trim().ifBlank { email.trim() }))
        )
    }

    suspend fun sendPasswordReset(email: String): Result<Unit> = authMutex.withLock {
        val normalized = email.trim().lowercase(Locale.US)
        if (!EMAIL_PATTERN.matches(normalized)) {
            return@withLock Result.failure(AuthException("Please enter a valid email address."))
        }
        try {
            requestJson(
                "/auth/v1/recover",
                "POST",
                JSONObject().put("email", normalized).put("redirect_to", "areka://auth/recovery"),
                bearer = null
            )
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(AuthException(userMessage(e)))
        }
    }

    suspend fun resendConfirmation(email: String): Result<Unit> = authMutex.withLock {
        val normalized = email.trim().lowercase(Locale.US)
        if (!EMAIL_PATTERN.matches(normalized)) {
            return@withLock Result.failure(AuthException("Please enter a valid email address."))
        }
        try {
            requestJson(
                "/auth/v1/resend",
                "POST",
                JSONObject().put("type", "signup").put("email", normalized),
                bearer = null
            )
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(AuthException(userMessage(e)))
        }
    }

    suspend fun signOut() = authMutex.withLock {
        val token = accessToken
        if (!token.isNullOrBlank() && configured()) {
            runCatching { requestJson("/auth/v1/logout", "POST", JSONObject(), token) }
        }
        clearSession()
    }

    fun currentAccessToken(): String? = accessToken

    fun setServerAdminFlag(isAdmin: Boolean) {
        val current = _state.value as? AuthState.SignedIn ?: return
        val updated = current.user.copy(isAdmin = isAdmin)
        appContext?.getSharedPreferences(PREFS, Context.MODE_PRIVATE)?.edit()
            ?.putBoolean(IS_ADMIN, isAdmin)?.apply()
        _state.value = AuthState.SignedIn(updated)
    }

    /** All authenticated REST calls use this path, including one safe refresh retry on HTTP 401. */
    suspend fun authenticatedRequest(path: String, method: String, body: JSONObject? = null, prefer: String? = null): Any =
        authMutex.withLock {
            val token = accessToken ?: throw AuthException("Your session has expired. Please sign in again.", 401)
            try {
                requestJson(path, method, body, token, prefer)
            } catch (e: AuthException) {
                if (e.statusCode != 401 || refreshToken.isNullOrBlank()) throw e
                val refreshed = refreshSessionLocked()
                if (refreshed.isFailure) {
                    clearSession()
                    throw AuthException("Your session has expired. Please sign in again.", 401)
                }
                requestJson(path, method, body, accessToken, prefer)
            }
        }

    private suspend fun restoreSession() = authMutex.withLock {
        val prefs = appContext?.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        accessToken = prefs?.getString(ACCESS_TOKEN, null)
        refreshToken = prefs?.getString(REFRESH_TOKEN, null)
        val storedUser = readStoredUser(prefs)
        if (accessToken.isNullOrBlank() || storedUser == null) {
            clearSession()
            return@withLock
        }
        if (!refreshToken.isNullOrBlank()) {
            val refreshed = refreshSessionLocked(storedUser)
            if (refreshed.isSuccess) return@withLock
            val error = refreshed.exceptionOrNull()
            if (error is AuthException && error.statusCode in setOf(400, 401, 403)) {
                clearSession()
                return@withLock
            }
        }
        // A transport failure does not destroy a real cached session; offline study remains available.
        _state.value = AuthState.SignedIn(storedUser)
    }

    private suspend fun authenticateLocked(endpoint: String, body: JSONObject): Result<AuthUser> {
        if (!configured()) {
            val error = AuthException("Cloud account is not configured on this build.")
            _state.value = AuthState.Error(error.message ?: "Authentication failed")
            return Result.failure(error)
        }
        _state.value = AuthState.Loading
        return try {
            saveSession(requestJson(endpoint, "POST", body, bearer = null), fallbackUser = null)
        } catch (e: Exception) {
            val error = AuthException(userMessage(e), (e as? AuthException)?.statusCode ?: 0)
            _state.value = AuthState.Error(error.message ?: "Authentication failed")
            Result.failure(error)
        }
    }

    private suspend fun refreshSessionLocked(fallback: AuthUser? = readStoredUser(appContext?.getSharedPreferences(PREFS, Context.MODE_PRIVATE))): Result<AuthUser> {
        val token = refreshToken ?: return Result.failure(AuthException("No refresh token."))
        return try {
            saveSession(
                requestJson(
                    "/auth/v1/token?grant_type=refresh_token",
                    "POST",
                    JSONObject().put("refresh_token", token),
                    bearer = null
                ),
                fallback
            )
        } catch (e: Exception) {
            Result.failure(AuthException(userMessage(e), (e as? AuthException)?.statusCode ?: 0))
        }
    }

    private fun saveSession(json: Any, fallbackUser: AuthUser?): Result<AuthUser> {
        val objectJson = json as? JSONObject ?: return Result.failure(AuthException("Something went wrong. Please try again."))
        val newAccess = objectJson.optString("access_token").ifBlank { null }
        val newRefresh = objectJson.optString("refresh_token").ifBlank { null }
        val userJson = objectJson.optJSONObject("user")
        val user = AuthUser(
            id = userJson?.optString("id").orEmpty().ifBlank { fallbackUser?.id.orEmpty() },
            email = userJson?.optString("email").orEmpty().ifBlank { fallbackUser?.email.orEmpty() },
            displayName = userJson?.optJSONObject("user_metadata")?.optString("display_name")
                .orEmpty().ifBlank { fallbackUser?.displayName ?: userJson?.optString("email").orEmpty() }
        )
        if (newAccess == null || user.id.isBlank()) {
            _state.value = AuthState.SignedOut
            return Result.failure(AuthException("Account created. Check your email to confirm it, then sign in."))
        }
        accessToken = newAccess
        refreshToken = newRefresh ?: refreshToken
        appContext?.getSharedPreferences(PREFS, Context.MODE_PRIVATE)?.edit()
            ?.putString(ACCESS_TOKEN, accessToken)
            ?.putString(REFRESH_TOKEN, refreshToken)
            ?.putString(USER_ID, user.id)
            ?.putString(EMAIL, user.email)
            ?.putString(DISPLAY_NAME, user.displayName)
            ?.putBoolean(IS_ADMIN, user.isAdmin)
            ?.apply()
        _state.value = AuthState.SignedIn(user)
        return Result.success(user)
    }

    private fun readStoredUser(prefs: android.content.SharedPreferences?): AuthUser? {
        val id = prefs?.getString(USER_ID, null).orEmpty()
        val email = prefs?.getString(EMAIL, null).orEmpty()
        if (id.isBlank() || email.isBlank()) return null
        return AuthUser(
            id = id,
            email = email,
            displayName = prefs?.getString(DISPLAY_NAME, email) ?: email,
            isAdmin = prefs?.getBoolean(IS_ADMIN, false) == true
        )
    }

    private fun clearSession() {
        accessToken = null
        refreshToken = null
        appContext?.getSharedPreferences(PREFS, Context.MODE_PRIVATE)?.edit()?.clear()?.apply()
        _state.value = AuthState.SignedOut
    }

    private fun validateCredentials(email: String, password: String): AuthException? {
        val normalized = email.trim()
        return when {
            !EMAIL_PATTERN.matches(normalized) -> AuthException("Please enter a valid email address.")
            password.isBlank() -> AuthException("Please enter your password.")
            password.length < MIN_PASSWORD_LENGTH -> AuthException("Your password is too weak.")
            else -> null
        }
    }

    private fun configured(): Boolean = BuildConfig.SUPABASE_URL.isNotBlank() && BuildConfig.SUPABASE_ANON_KEY.isNotBlank()

    private fun requestJson(path: String, method: String, body: JSONObject?, bearer: String?, prefer: String? = null): Any {
        if (!configured()) throw AuthException("Cloud account is not configured on this build.")
        val connection = (URL(BuildConfig.SUPABASE_URL.trimEnd('/') + path).openConnection() as HttpURLConnection).apply {
            requestMethod = method
            connectTimeout = 12_000
            readTimeout = 20_000
            doInput = true
            setRequestProperty("apikey", BuildConfig.SUPABASE_ANON_KEY)
            setRequestProperty("Accept", "application/json")
            if (!bearer.isNullOrBlank()) setRequestProperty("Authorization", "Bearer $bearer")
            if (prefer != null) setRequestProperty("Prefer", prefer)
            if (body != null) {
                doOutput = true
                setRequestProperty("Content-Type", "application/json")
            }
        }
        return try {
            if (body != null) connection.outputStream.use { it.write(body.toString().toByteArray(Charsets.UTF_8)) }
            val code = connection.responseCode
            val stream = if (code in 200..299) connection.inputStream else connection.errorStream
            val text = stream?.bufferedReader()?.use { it.readText() }.orEmpty()
            if (code !in 200..299) throw AuthException(parseError(text), code)
            when {
                text.isBlank() -> JSONObject()
                text.trimStart().startsWith("[") -> JSONArray(text)
                else -> JSONObject(text)
            }
        } finally {
            connection.disconnect()
        }
    }

    private fun userMessage(error: Exception): String = when {
        error is AuthException && error.statusCode == 401 -> "Invalid email or password."
        error is AuthException && error.message?.contains("already registered", true) == true -> "An account with this email already exists."
        error is AuthException && error.message?.contains("weak", true) == true -> "Your password is too weak."
        error is IOException -> "Check your internet connection and try again."
        else -> "Something went wrong. Please try again."
    }

    private fun parseError(text: String): String = try {
        val json = JSONObject(text)
        json.optString("msg").ifBlank { json.optString("error_description") }
            .ifBlank { json.optString("message") }.ifBlank { json.optString("error") }
            .ifBlank { "Request failed" }
    } catch (_: Exception) { "Request failed" }

    private val EMAIL_PATTERN = Regex("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")
}

data class AuthUser(
    val id: String,
    val email: String,
    val displayName: String,
    val isAdmin: Boolean = false
)

sealed interface AuthState {
    data object Loading : AuthState
    data object SignedOut : AuthState
    data class SignedIn(val user: AuthUser) : AuthState
    data class Error(val message: String) : AuthState
}

class AuthException(message: String, val statusCode: Int = 0) : Exception(message)
