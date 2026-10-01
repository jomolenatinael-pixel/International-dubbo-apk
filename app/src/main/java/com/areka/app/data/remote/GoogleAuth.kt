package com.areka.app.data.remote

import android.app.Activity
import android.util.Log
import androidx.credentials.ClearCredentialStateRequest
import androidx.credentials.CredentialManager
import androidx.credentials.CustomCredential
import androidx.credentials.exceptions.GetCredentialException
import androidx.credentials.GetCredentialRequest
import com.areka.app.BuildConfig
import com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException
import java.security.MessageDigest
import java.security.SecureRandom

/** Credential Manager bridge for native Google ID-token sign-in. */
class GoogleAuth(private val credentialManager: CredentialManager) {
    suspend fun signIn(activity: Activity): Result<AuthUser> {
        if (BuildConfig.GOOGLE_WEB_CLIENT_ID.isBlank()) {
            return Result.failure(AuthException("Google sign-in is not configured on this build."))
        }

        val rawNonce = secureNonce()
        val option = GetSignInWithGoogleOption.Builder(BuildConfig.GOOGLE_WEB_CLIENT_ID)
            .setNonce(sha256Hex(rawNonce))
            .build()
        val request = GetCredentialRequest.Builder()
            .addCredentialOption(option)
            .build()

        return try {
            val response = credentialManager.getCredential(
                context = activity,
                request = request
            )
            val credential = response.credential
            if (credential !is CustomCredential ||
                credential.type != GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL
            ) {
                Result.failure(AuthException("Google returned an unsupported credential."))
            } else {
                val googleCredential = GoogleIdTokenCredential.createFrom(credential.data)
                SupabaseAuth.signInWithGoogleIdToken(googleCredential.idToken, rawNonce)
            }
        } catch (_: GoogleIdTokenParsingException) {
            Result.failure(AuthException("Google returned an invalid sign-in token."))
        } catch (e: GetCredentialException) {
            Log.w(TAG, "Credential Manager Google sign-in failed: ${e::class.java.simpleName}: ${e.message}")
            Result.failure(AuthException(credentialErrorMessage(e)))
        } catch (e: Exception) {
            Log.w(TAG, "Google sign-in failed before Supabase exchange: ${e::class.java.simpleName}: ${e.message}")
            Result.failure(AuthException("Google sign-in failed (${e::class.java.simpleName}). Check the Android OAuth package and SHA-1, then try again."))
        }
    }

    suspend fun clearCredentialState() {
        runCatching {
            credentialManager.clearCredentialState(ClearCredentialStateRequest())
        }
    }

    private fun secureNonce(): String {
        val bytes = ByteArray(32)
        SecureRandom().nextBytes(bytes)
        return bytes.joinToString("") { "%02x".format(it.toInt() and 0xff) }
    }

    private fun sha256Hex(value: String): String = MessageDigest
        .getInstance("SHA-256")
        .digest(value.toByteArray(Charsets.UTF_8))
        .joinToString("") { "%02x".format(it.toInt() and 0xff) }

    private fun credentialErrorMessage(error: GetCredentialException): String = when {
        error.message?.contains("cancel", ignoreCase = true) == true -> "Google sign-in was cancelled."
        error.message?.contains("No credentials", ignoreCase = true) == true -> "No Google account is available on this device."
        error::class.java.simpleName.contains("ProviderConfiguration", ignoreCase = true) ->
            "Google provider setup failed. Verify package com.areka.app, the APK SHA-1, and the Web client ID."
        else -> "Google sign-in failed (${error::class.java.simpleName}). Check the Android OAuth package and SHA-1."
    }

    private companion object {
        const val TAG = "ArekaGoogleAuth"
    }
}
