package com.areka.app.data.remote

import android.content.Context
import android.content.SharedPreferences
import android.os.Build
import android.util.Log
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import java.io.File
import java.io.IOException
import java.security.GeneralSecurityException
import java.security.KeyStore

data class StoredTokens(
    val accessToken: String?,
    val refreshToken: String?,
    val isAvailable: Boolean = true
)

class SecureStorageException(message: String, cause: Throwable? = null) : Exception(message, cause)

interface SecureTokenStorage {
    @Throws(SecureStorageException::class)
    fun getTokens(): StoredTokens

    @Throws(SecureStorageException::class)
    fun saveTokens(accessToken: String?, refreshToken: String?)

    fun clearTokens()

    fun isAvailable(): Boolean
}

/**
 * Android Keystore-backed secure token storage using EncryptedSharedPreferences (AES-256 GCM).
 *
 * Strict Security Rules:
 * 1. NEVER falls back to plaintext token storage under any circumstances.
 * 2. Migrates legacy plaintext tokens into encrypted storage once, then deletes the old keys.
 * 3. Does NOT delete legacy credentials until encrypted persistence has been verified to succeed.
 * 4. If secure storage cannot initialize or save credentials, fails safely and throws SecureStorageException.
 * 5. Handles KeyStore invalidation or encrypted file corruption safely by attempting a clean reset.
 * 6. Sweeps all legacy preference files used by earlier versions to eliminate stale plaintext credentials.
 * 7. Never logs access tokens, refresh tokens, passwords, recovery tokens, or authorization headers.
 */
class AndroidKeystoreTokenStorage(
    private val context: Context,
    private val legacyPrefsName: String = "areka_auth",
    private val securePrefsName: String = "areka_secure_tokens"
) : SecureTokenStorage {

    companion object {
        private const val TAG = "SecureTokenStorage"
        const val KEY_ACCESS_TOKEN = "access_token"
        const val KEY_REFRESH_TOKEN = "refresh_token"

        private val LEGACY_FILES = listOf(
            "areka_auth",
            "areka_prefs",
            "areka_cloud_sync",
            "com.areka.app_preferences"
        )

        private val TOKEN_KEYS = listOf(
            KEY_ACCESS_TOKEN,
            KEY_REFRESH_TOKEN,
            "token",
            "auth_token",
            "recovery_token"
        )
    }

    private var securePrefs: SharedPreferences? = null
    private var initialized = false

    init {
        initializeStorage()
    }

    @Synchronized
    private fun initializeStorage(attemptRecovery: Boolean = true) {
        try {
            val masterKey = MasterKey.Builder(context)
                .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
                .build()

            securePrefs = EncryptedSharedPreferences.create(
                context,
                securePrefsName,
                masterKey,
                EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
                EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
            )
            initialized = true
        } catch (e: Exception) {
            // GeneralSecurityException, IOException, KeyStoreException, etc.
            Log.w(TAG, "Encrypted storage initialization failed: ${e.javaClass.simpleName}")

            if (attemptRecovery) {
                Log.w(TAG, "Attempting recovery by purging corrupted keystore entry and encrypted file...")
                purgeCorruptedStorage()
                initializeStorage(attemptRecovery = false)
            } else {
                Log.e(TAG, "Encrypted storage could not be initialized. Never falling back to plaintext.")
                securePrefs = null
                initialized = false
            }
        }
    }

    private fun purgeCorruptedStorage() {
        try {
            // 1. Delete preferences file from disk
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                context.deleteSharedPreferences(securePrefsName)
            } else {
                val file = File(context.applicationInfo.dataDir, "shared_prefs/$securePrefsName.xml")
                if (file.exists()) file.delete()
            }
        } catch (_: Exception) {}

        try {
            // 2. Remove master key entry from Android KeyStore
            val keyStore = KeyStore.getInstance("AndroidKeyStore").apply { load(null) }
            if (keyStore.containsAlias(MasterKey.DEFAULT_MASTER_KEY_ALIAS)) {
                keyStore.deleteEntry(MasterKey.DEFAULT_MASTER_KEY_ALIAS)
            }
        } catch (_: Exception) {}
    }

    override fun isAvailable(): Boolean = securePrefs != null

    @Synchronized
    override fun getTokens(): StoredTokens {
        val prefs = securePrefs
        if (prefs == null) {
            return StoredTokens(null, null, isAvailable = false)
        }

        try {
            var access = prefs.getString(KEY_ACCESS_TOKEN, null)?.ifBlank { null }
            var refresh = prefs.getString(KEY_REFRESH_TOKEN, null)?.ifBlank { null }

            // Check if legacy plaintext storage contains tokens that need migration
            if (access == null && refresh == null) {
                val migrated = migrateLegacyTokensIfPresent(prefs)
                if (migrated != null) {
                    access = migrated.accessToken
                    refresh = migrated.refreshToken
                }
            } else {
                // Ensure stale plaintext copies in any legacy file are wiped
                scrubAllPlaintextTokens()
            }

            return StoredTokens(access, refresh, isAvailable = true)
        } catch (e: Exception) {
            Log.w(TAG, "Failed to read encrypted tokens: ${e.javaClass.simpleName}")
            return StoredTokens(null, null, isAvailable = false)
        }
    }

    @Synchronized
    override fun saveTokens(accessToken: String?, refreshToken: String?) {
        val prefs = securePrefs
            ?: throw SecureStorageException("Android Keystore secure storage is unavailable on this device.")

        try {
            val editor = prefs.edit()
            if (accessToken != null) {
                editor.putString(KEY_ACCESS_TOKEN, accessToken)
            } else {
                editor.remove(KEY_ACCESS_TOKEN)
            }

            if (refreshToken != null) {
                editor.putString(KEY_REFRESH_TOKEN, refreshToken)
            } else {
                editor.remove(KEY_REFRESH_TOKEN)
            }

            val committed = editor.commit()
            if (!committed) {
                throw SecureStorageException("Failed to commit credentials to secure encrypted storage.")
            }

            // Scrub any plaintext credentials from legacy preference files
            scrubAllPlaintextTokens()
        } catch (e: Exception) {
            if (e is SecureStorageException) throw e
            throw SecureStorageException("Could not persist credentials securely: ${e.message}", e)
        }
    }

    @Synchronized
    override fun clearTokens() {
        try {
            securePrefs?.edit()?.clear()?.commit()
        } catch (_: Exception) {}

        scrubAllPlaintextTokens()
    }

    private fun migrateLegacyTokensIfPresent(encryptedPrefs: SharedPreferences): StoredTokens? {
        val legacyPrefs = try {
            context.getSharedPreferences(legacyPrefsName, Context.MODE_PRIVATE)
        } catch (_: Exception) {
            return null
        }

        val legacyAccess = legacyPrefs.getString(KEY_ACCESS_TOKEN, null)?.ifBlank { null }
        val legacyRefresh = legacyPrefs.getString(KEY_REFRESH_TOKEN, null)?.ifBlank { null }

        if (legacyAccess == null && legacyRefresh == null) {
            return null
        }

        // 1. Attempt encrypted persistence FIRST
        val editor = encryptedPrefs.edit()
        if (legacyAccess != null) editor.putString(KEY_ACCESS_TOKEN, legacyAccess)
        if (legacyRefresh != null) editor.putString(KEY_REFRESH_TOKEN, legacyRefresh)
        val success = editor.commit()

        if (!success) {
            Log.w(TAG, "Migration to encrypted storage failed; retaining legacy credentials until next attempt.")
            return null
        }

        // 2. Verify encrypted persistence succeeded before deleting legacy credentials
        val verifiedAccess = encryptedPrefs.getString(KEY_ACCESS_TOKEN, null)
        val verifiedRefresh = encryptedPrefs.getString(KEY_REFRESH_TOKEN, null)

        val accessVerified = (legacyAccess == null || verifiedAccess == legacyAccess)
        val refreshVerified = (legacyRefresh == null || verifiedRefresh == legacyRefresh)

        if (accessVerified && refreshVerified) {
            // Delete legacy credentials from plaintext preferences
            legacyPrefs.edit()
                .remove(KEY_ACCESS_TOKEN)
                .remove(KEY_REFRESH_TOKEN)
                .commit()

            scrubAllPlaintextTokens()
            Log.i(TAG, "Legacy authentication credentials migrated to encrypted storage successfully.")
            return StoredTokens(legacyAccess, legacyRefresh, isAvailable = true)
        } else {
            Log.w(TAG, "Verification mismatch after encrypted write; retaining legacy credentials.")
            return null
        }
    }

    private fun scrubAllPlaintextTokens() {
        for (fileName in LEGACY_FILES) {
            try {
                val prefs = context.getSharedPreferences(fileName, Context.MODE_PRIVATE)
                val editor = prefs.edit()
                var modified = false
                for (key in TOKEN_KEYS) {
                    if (prefs.contains(key)) {
                        editor.remove(key)
                        modified = true
                    }
                }
                if (modified) {
                    editor.commit()
                }
            } catch (_: Exception) {}
        }
    }
}

/**
 * In-memory token storage for tests and mock environments.
 */
class InMemoryTokenStorage(
    private var access: String? = null,
    private var refresh: String? = null,
    var simulateFailure: Boolean = false
) : SecureTokenStorage {

    override fun isAvailable(): Boolean = !simulateFailure

    override fun getTokens(): StoredTokens {
        if (simulateFailure) return StoredTokens(null, null, isAvailable = false)
        return StoredTokens(access, refresh, isAvailable = true)
    }

    override fun saveTokens(accessToken: String?, refreshToken: String?) {
        if (simulateFailure) throw SecureStorageException("Simulated secure storage failure.")
        access = accessToken
        refresh = refreshToken
    }

    override fun clearTokens() {
        access = null
        refresh = null
    }
}
