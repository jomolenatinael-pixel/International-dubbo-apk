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
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL

/** Guest-first email/password authentication backed by Supabase Auth REST. */
object SupabaseAuth {
    private const val PREFS = "areka_auth"
    private const val ACCESS_TOKEN = "access_token"
    private const val REFRESH_TOKEN = "refresh_token"
    private const val USER_ID = "user_id"
    private const val EMAIL = "email"
    private const val DISPLAY_NAME = "display_name"

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private var appContext: Context? = null
    @Volatile private var accessToken: String? = null
    private var refreshToken: String? = null

    private val _state = MutableStateFlow<AuthState>(AuthState.SignedOut)
    val state: StateFlow<AuthState> = _state.asStateFlow()

    fun initialize(context: Context) {
        if (appContext != null) return
        appContext = context.applicationContext
        val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        accessToken = prefs.getString(ACCESS_TOKEN, null)
        refreshToken = prefs.getString(REFRESH_TOKEN, null)
        val storedUserId = prefs.getString(USER_ID, null)
        val storedEmail = prefs.getString(EMAIL, null)
        if (accessToken != null && storedUserId != null && storedEmail != null) {
            _state.value = AuthState.SignedIn(
                AuthUser(storedUserId, storedEmail, prefs.getString(DISPLAY_NAME, storedEmail) ?: storedEmail)
            )
        }
        if (!refreshToken.isNullOrBlank()) {
            scope.launch { refreshSession() }
        }
    }

    suspend fun signIn(email: String, password: String): Result<AuthUser> = withContext(Dispatchers.IO) {
        authenticate(
            endpoint = "/auth/v1/token?grant_type=password",
            body = JSONObject().put("email", email.trim()).put("password", password)
        )
    }

    suspend fun signUp(email: String, password: String, displayName: String): Result<AuthUser> = withContext(Dispatchers.IO) {
        authenticate(
            endpoint = "/auth/v1/signup",
            body = JSONObject()
                .put("email", email.trim())
                .put("password", password)
                .put("data", JSONObject().put("display_name", displayName.trim().ifBlank { email.trim() }))
        )
    }

    suspend fun signOut() = withContext(Dispatchers.IO) {
        val token = accessToken
        if (!token.isNullOrBlank() && configured()) {
            try {
                request("/auth/v1/logout", "POST", JSONObject(), token)
            } catch (_: Exception) {
                // A local sign-out must succeed even when the device is offline.
            }
        }
        clearSession()
    }

    fun currentAccessToken(): String? = accessToken

    private suspend fun refreshSession(): Result<AuthUser> = withContext(Dispatchers.IO) {
        val token = refreshToken ?: return@withContext Result.failure(AuthException("No refresh token"))
        try {
            val json = request(
                "/auth/v1/token?grant_type=refresh_token",
                "POST",
                JSONObject().put("refresh_token", token),
                null
            )
            saveSession(json, fallbackUser = currentUser())
        } catch (e: Exception) {
            // Keep the cached signed-in state for offline use; retry on the next app start.
            Result.failure(AuthException(e.message ?: "Session refresh failed"))
        }
    }

    private fun authenticate(endpoint: String, body: JSONObject): Result<AuthUser> {
        if (!configured()) {
            val error = AuthException("Supabase is not configured. Add SUPABASE_URL and SUPABASE_ANON_KEY to local.properties.")
            _state.value = AuthState.Error(error.message ?: "Supabase is not configured")
            return Result.failure(error)
        }
        _state.value = AuthState.Loading
        return try {
            saveSession(request(endpoint, "POST", body, null), fallbackUser = null)
        } catch (e: Exception) {
            val error = AuthException(readableError(e))
            _state.value = AuthState.Error(error.message ?: "Authentication failed")
            Result.failure(error)
        }
    }

    private fun saveSession(json: JSONObject, fallbackUser: AuthUser?): Result<AuthUser> {
        val newAccess = json.optString("access_token").ifBlank { null }
        val newRefresh = json.optString("refresh_token").ifBlank { null }
        val userJson = json.optJSONObject("user")
        val user = AuthUser(
            id = userJson?.optString("id").orEmpty().ifBlank { fallbackUser?.id.orEmpty() },
            email = userJson?.optString("email").orEmpty().ifBlank { fallbackUser?.email.orEmpty() },
            displayName = userJson?.optJSONObject("user_metadata")?.optString("display_name")
                .orEmpty().ifBlank { fallbackUser?.displayName ?: userJson?.optString("email").orEmpty() }
        )
        if (newAccess == null || user.id.isBlank()) {
            val message = if (json.optBoolean("email_confirmed_at", false).not()) {
                "Account created. Check your email to confirm it, then sign in."
            } else {
                "Authentication succeeded but no usable session was returned."
            }
            _state.value = AuthState.SignedOut
            return Result.failure(AuthException(message))
        }
        accessToken = newAccess
        refreshToken = newRefresh ?: refreshToken
        appContext?.getSharedPreferences(PREFS, Context.MODE_PRIVATE)?.edit()
            ?.putString(ACCESS_TOKEN, accessToken)
            ?.putString(REFRESH_TOKEN, refreshToken)
            ?.putString(USER_ID, user.id)
            ?.putString(EMAIL, user.email)
            ?.putString(DISPLAY_NAME, user.displayName)
            ?.apply()
        _state.value = AuthState.SignedIn(user)
        return Result.success(user)
    }

    private fun currentUser(): AuthUser? = when (val state = _state.value) {
        is AuthState.SignedIn -> state.user
        else -> null
    }

    private fun clearSession() {
        accessToken = null
        refreshToken = null
        appContext?.getSharedPreferences(PREFS, Context.MODE_PRIVATE)?.edit()?.clear()?.apply()
        _state.value = AuthState.SignedOut
    }

    private fun configured(): Boolean = BuildConfig.SUPABASE_URL.isNotBlank() && BuildConfig.SUPABASE_ANON_KEY.isNotBlank()

    private fun request(path: String, method: String, body: JSONObject?, bearer: String?): JSONObject {
        val connection = (URL(BuildConfig.SUPABASE_URL.trimEnd('/') + path).openConnection() as HttpURLConnection).apply {
            requestMethod = method
            connectTimeout = 12_000
            readTimeout = 20_000
            doInput = true
            setRequestProperty("apikey", BuildConfig.SUPABASE_ANON_KEY)
            setRequestProperty("Accept", "application/json")
            if (!bearer.isNullOrBlank()) setRequestProperty("Authorization", "Bearer $bearer")
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
            if (code !in 200..299) throw AuthException("Supabase returned HTTP $code: ${parseError(text)}")
            if (text.isBlank()) JSONObject() else JSONObject(text)
        } finally {
            connection.disconnect()
        }
    }

    private fun readableError(error: Exception): String = when (error) {
        is AuthException -> error.message ?: "Authentication failed"
        is IOException -> "Network unavailable. You can continue studying as a guest."
        else -> error.message ?: "Authentication failed"
    }

    private fun parseError(text: String): String = try {
        val json = JSONObject(text)
        json.optString("msg").ifBlank { json.optString("error_description") }
            .ifBlank { json.optString("message") }.ifBlank { "Request failed" }
    } catch (_: Exception) { "Request failed" }
}

data class AuthUser(val id: String, val email: String, val displayName: String)

sealed interface AuthState {
    data object SignedOut : AuthState
    data object Loading : AuthState
    data class SignedIn(val user: AuthUser) : AuthState
    data class Error(val message: String) : AuthState
}

class AuthException(message: String) : Exception(message)
