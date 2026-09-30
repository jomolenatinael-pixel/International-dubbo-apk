package com.areka.app.data.remote

import android.content.Context
import android.net.Uri
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
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLDecoder
import java.util.Locale

/**
 * Hardened, single source of truth for Supabase Authentication.
 *
 * Security guarantees:
 * - Tokens are stored exclusively in Keystore-backed secure storage (never plaintext SharedPreferences).
 * - Passwords, tokens, and authorization headers are NEVER logged.
 * - Single synchronized refresh flow prevents token races on HTTP 401.
 * - Password recovery callback parses both fragments and query parameters securely into AuthState.PasswordRecovery.
 * - Updating password authenticates against /auth/v1/user and securely transitions to AuthState.SignedIn.
 * - User-facing messages never expose server internals or leak user account existence unnecessarily.
 * - Safe handling of secure storage errors, corrupted keystores, leaked passwords, and HTTP 429 rate limits.
 */
object SupabaseAuth {
    private const val PREFS = "areka_auth"
    private const val USER_ID = "user_id"
    private const val EMAIL = "email"
    private const val DISPLAY_NAME = "display_name"
    private const val IS_ADMIN = "is_admin"

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val authMutex = Mutex()
    private var appContext: Context? = null
    private var tokenStorage: SecureTokenStorage? = null

    @Volatile private var accessToken: String? = null
    private var refreshToken: String? = null
    @Volatile private var recoveryAccessToken: String? = null
    private var recoveryRefreshToken: String? = null
    private var initialized = false

    private val _state = MutableStateFlow<AuthState>(AuthState.Loading)
    val state: StateFlow<AuthState> = _state.asStateFlow()

    fun initialize(context: Context, customTokenStorage: SecureTokenStorage? = null) {
        synchronized(this) {
            if (initialized) return
            initialized = true
            appContext = context.applicationContext
            tokenStorage = customTokenStorage ?: AndroidKeystoreTokenStorage(context.applicationContext)
        }
        _state.value = AuthState.Loading
        scope.launch { restoreSession() }
    }

    /** Testing hook to inject custom token storage without Android KeyStore. */
    fun setTokenStorageForTesting(storage: SecureTokenStorage) {
        tokenStorage = storage
    }

    suspend fun signIn(email: String, password: String): Result<AuthUser> = authMutex.withLock {
        val emailErr = AuthValidator.validateEmail(email)
        if (emailErr != null) return@withLock Result.failure(AuthException(emailErr))
        val passErr = AuthValidator.validatePassword(password)
        if (passErr != null) return@withLock Result.failure(AuthException(passErr))

        authenticateLocked(
            endpoint = "/auth/v1/token?grant_type=password",
            body = JSONObject()
                .put("email", AuthValidator.normalizeEmail(email))
                .put("password", password)
        )
    }

    suspend fun signUp(
        email: String,
        password: String,
        confirmation: String,
        displayName: String
    ): Result<AuthUser> = authMutex.withLock {
        val validationErr = AuthValidator.validateSignUp(email, password, confirmation)
        if (validationErr != null) return@withLock Result.failure(AuthException(validationErr))

        authenticateLocked(
            endpoint = "/auth/v1/signup",
            body = JSONObject()
                .put("email", AuthValidator.normalizeEmail(email))
                .put("password", password)
                .put("data", JSONObject().put("display_name", displayName.trim().ifBlank { email.trim() }))
        )
    }

    suspend fun sendPasswordReset(email: String): Result<Unit> = authMutex.withLock {
        val emailErr = AuthValidator.validateEmail(email)
        if (emailErr != null) return@withLock Result.failure(AuthException(emailErr))

        try {
            requestJson(
                path = "/auth/v1/recover",
                method = "POST",
                body = JSONObject()
                    .put("email", AuthValidator.normalizeEmail(email))
                    .put("redirect_to", "areka://auth/recovery"),
                bearer = null
            )
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(AuthException(userMessage(e)))
        }
    }

    suspend fun resendConfirmation(email: String): Result<Unit> = authMutex.withLock {
        val emailErr = AuthValidator.validateEmail(email)
        if (emailErr != null) return@withLock Result.failure(AuthException(emailErr))

        try {
            requestJson(
                path = "/auth/v1/resend",
                method = "POST",
                body = JSONObject().put("type", "signup").put("email", AuthValidator.normalizeEmail(email)),
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

    /**
     * Parses an incoming password recovery deep-link (areka://auth/recovery).
     * Extracts tokens from either the URI fragment or query string and transitions to
     * AuthState.PasswordRecovery without treating the user as signed in yet.
     */
    fun handleRecoveryUri(uri: Uri?): Result<Unit> {
        if (uri == null) {
            val error = AuthException("Invalid password recovery link.")
            _state.value = AuthState.Error(error.message.orEmpty())
            return Result.failure(error)
        }

        val params = parseUriParameters(uri)

        // Check for error parameters returned by Supabase
        val errorDesc = params["error_description"] ?: params["error"]
        if (!errorDesc.isNullOrBlank()) {
            val msg = if (errorDesc.contains("expired", true) || errorDesc.contains("invalid", true)) {
                "This password reset link is invalid or has expired. Please request a new one."
            } else {
                "Unable to reset password with this link. Please request a new one."
            }
            _state.value = AuthState.Error(msg)
            return Result.failure(AuthException(msg))
        }

        val recAccess = params["access_token"] ?: params["token"]
        val recRefresh = params["refresh_token"]

        if (recAccess.isNullOrBlank()) {
            val msg = "This password reset link is missing required authorization tokens. Please request a new one."
            _state.value = AuthState.Error(msg)
            return Result.failure(AuthException(msg))
        }

        recoveryAccessToken = recAccess
        recoveryRefreshToken = recRefresh
        val email = params["email"]

        _state.value = AuthState.PasswordRecovery(email = email)
        return Result.success(Unit)
    }

    /**
     * Updates the password using the recovery session via Supabase's /auth/v1/user endpoint.
     * On success, establishes and securely persists the authenticated session.
     */
    suspend fun updatePassword(newPassword: String, confirmation: String): Result<AuthUser> = authMutex.withLock {
        val validationErr = AuthValidator.validatePasswordReset(newPassword, confirmation)
        if (validationErr != null) return@withLock Result.failure(AuthException(validationErr))

        val bearerToken = recoveryAccessToken ?: accessToken
        if (bearerToken.isNullOrBlank()) {
            val err = AuthException("Your recovery session has expired or has already been used. Please request a new reset link.")
            _state.value = AuthState.Error(err.message.orEmpty())
            return@withLock Result.failure(err)
        }

        _state.value = AuthState.Loading
        try {
            val userResponse = requestJson(
                path = "/auth/v1/user",
                method = "PUT",
                body = JSONObject().put("password", newPassword),
                bearer = bearerToken
            ) as? JSONObject ?: throw AuthException("Unexpected response from server.")

            val userId = userResponse.optString("id")
            val userEmail = userResponse.optString("email")
            val userMetadata = userResponse.optJSONObject("user_metadata")
            val displayName = userMetadata?.optString("display_name")
                ?.ifBlank { null } ?: userEmail

            val user = AuthUser(
                id = userId,
                email = userEmail,
                displayName = displayName,
                isAdmin = false
            )

            // Securely persist the new active session
            accessToken = bearerToken
            refreshToken = recoveryRefreshToken ?: refreshToken

            try {
                tokenStorage?.saveTokens(accessToken, refreshToken)
            } catch (e: SecureStorageException) {
                _state.value = AuthState.Error("Secure storage could not save your session. Please sign in.")
                return@withLock Result.failure(AuthException("Secure storage could not save your session."))
            }

            appContext?.getSharedPreferences(PREFS, Context.MODE_PRIVATE)?.edit()
                ?.putString(USER_ID, user.id)
                ?.putString(EMAIL, user.email)
                ?.putString(DISPLAY_NAME, user.displayName)
                ?.putBoolean(IS_ADMIN, user.isAdmin)
                ?.apply()

            // Clear temporary recovery tokens
            recoveryAccessToken = null
            recoveryRefreshToken = null

            _state.value = AuthState.SignedIn(user)
            Result.success(user)
        } catch (e: Exception) {
            recoveryAccessToken = null
            recoveryRefreshToken = null
            val msg = if ((e as? AuthException)?.statusCode in setOf(400, 401, 403)) {
                "Your password reset link has expired or has already been used. Please request a new one."
            } else {
                userMessage(e)
            }
            _state.value = AuthState.Error(msg)
            Result.failure(AuthException(msg))
        }
    }

    /** Exits the recovery state and returns to signed-out state. */
    fun cancelPasswordRecovery() {
        recoveryAccessToken = null
        recoveryRefreshToken = null
        if (_state.value is AuthState.PasswordRecovery) {
            _state.value = AuthState.SignedOut
        }
    }

    /** All authenticated REST calls use this path, including one safe refresh retry on HTTP 401. */
    suspend fun authenticatedRequest(
        path: String,
        method: String,
        body: JSONObject? = null,
        prefer: String? = null
    ): Any = authMutex.withLock {
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
        val tokens = try {
            tokenStorage?.getTokens() ?: StoredTokens(null, null)
        } catch (e: Exception) {
            StoredTokens(null, null, isAvailable = false)
        }

        if (!tokens.isAvailable) {
            clearSession()
            _state.value = AuthState.SignedOut
            return@withLock
        }

        accessToken = tokens.accessToken
        refreshToken = tokens.refreshToken

        val prefs = appContext?.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
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
        // Transport failure does not destroy a real cached session; offline study remains available.
        _state.value = AuthState.SignedIn(storedUser)
    }

    private suspend fun authenticateLocked(endpoint: String, body: JSONObject): Result<AuthUser> {
        if (!configured()) {
            val error = AuthException("Cloud account is not configured on this build.")
            _state.value = AuthState.Error(error.message.orEmpty())
            return Result.failure(error)
        }
        _state.value = AuthState.Loading
        return try {
            saveSession(requestJson(endpoint, "POST", body, bearer = null), fallbackUser = null)
        } catch (e: Exception) {
            val error = AuthException(userMessage(e), (e as? AuthException)?.statusCode ?: 0)
            _state.value = AuthState.Error(error.message.orEmpty())
            Result.failure(error)
        }
    }

    private suspend fun refreshSessionLocked(
        fallback: AuthUser? = readStoredUser(appContext?.getSharedPreferences(PREFS, Context.MODE_PRIVATE))
    ): Result<AuthUser> {
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
        val objectJson = json as? JSONObject
            ?: return Result.failure(AuthException("Something went wrong. Please try again."))
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

        // Tokens are strictly stored in Keystore-backed storage
        try {
            tokenStorage?.saveTokens(accessToken, refreshToken)
        } catch (e: SecureStorageException) {
            _state.value = AuthState.Error("Secure storage could not save your session. Please try again.")
            return Result.failure(AuthException("Secure storage could not save your session."))
        }

        // Metadata is kept in ordinary SharedPreferences (no plaintext tokens)
        appContext?.getSharedPreferences(PREFS, Context.MODE_PRIVATE)?.edit()
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
        recoveryAccessToken = null
        recoveryRefreshToken = null

        try {
            tokenStorage?.clearTokens()
        } catch (_: Exception) {}

        appContext?.getSharedPreferences(PREFS, Context.MODE_PRIVATE)?.edit()?.clear()?.apply()

        _state.value = AuthState.SignedOut
    }

    private fun configured(): Boolean =
        BuildConfig.SUPABASE_URL.isNotBlank() && BuildConfig.SUPABASE_ANON_KEY.isNotBlank()

    private fun requestJson(
        path: String,
        method: String,
        body: JSONObject?,
        bearer: String?,
        prefer: String? = null
    ): Any {
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
        error is AuthException && error.statusCode == 429 ->
            "Too many requests. Please wait a moment and try again."
        error is AuthException && (error.statusCode == 422 || error.message?.contains("pwned", true) == true || error.message?.contains("breach", true) == true) ->
            "This password has appeared in a known data breach. For your security, please choose a different password."
        error is AuthException && (error.statusCode == 401 || error.statusCode == 400 && error.message?.contains("invalid", true) == true) ->
            "Invalid email or password."
        error is AuthException && error.message?.contains("already registered", true) == true ->
            "An account with this email already exists."
        error is AuthException && error.message?.contains("email not confirmed", true) == true ->
            "Please confirm your email address before signing in."
        error is AuthException && error.message?.contains("weak", true) == true ->
            "Password must be at least 6 characters."
        error is AuthException && error.message?.contains("expired", true) == true ->
            "This link has expired or has already been used. Please request a new one."
        error is IOException ->
            "Connection failed. Please check your internet connection and try again."
        else ->
            "Something went wrong. Please try again."
    }

    private fun parseError(text: String): String = try {
        val json = JSONObject(text)
        json.optString("msg").ifBlank { json.optString("error_description") }
            .ifBlank { json.optString("message") }.ifBlank { json.optString("error") }
            .ifBlank { "Request failed" }
    } catch (_: Exception) { "Request failed" }

    private fun parseUriParameters(uri: Uri): Map<String, String> {
        val map = mutableMapOf<String, String>()
        try {
            uri.queryParameterNames?.forEach { name ->
                uri.getQueryParameter(name)?.let { map[name] = it }
            }
        } catch (_: Exception) {}

        val fragment = uri.fragment
        if (!fragment.isNullOrBlank()) {
            fragment.split('&').forEach { param ->
                val parts = param.split('=', limit = 2)
                if (parts.size == 2) {
                    val key = try { URLDecoder.decode(parts[0], "UTF-8") } catch (_: Exception) { parts[0] }
                    val value = try { URLDecoder.decode(parts[1], "UTF-8") } catch (_: Exception) { parts[1] }
                    map[key] = value
                }
            }
        }
        return map
    }
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
    data class PasswordRecovery(val email: String? = null) : AuthState
    data class Error(val message: String) : AuthState
}

class AuthException(message: String, val statusCode: Int = 0) : Exception(message)

