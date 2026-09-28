package com.areka.app.data.remote

import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL

/**
 * Pulls the published question bank into a local JSON cache. The app continues
 * using its bundled curriculum when the network is unavailable.
 */
object SupabaseQuestionSync {
    private const val BASE_URL = "https://jxdfukggxxlemsoumtal.supabase.co"
    // Supabase publishable keys are safe for client applications; RLS remains authoritative.
    private const val PUBLISHABLE_KEY = "sb_publishable_DOToB455mOzuaWpUnFO1cg_OhejqXQj"
    private const val CACHE_FILE = "supabase_question_bank.json"
    private const val PREFS = "supabase_sync"
    private const val LAST_SYNC = "last_sync_epoch_ms"
    private const val SYNC_INTERVAL_MS = 6 * 60 * 60 * 1000L

    suspend fun sync(context: Context) = withContext(Dispatchers.IO) {
        val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        val now = System.currentTimeMillis()
        if (now - prefs.getLong(LAST_SYNC, 0L) < SYNC_INTERVAL_MS) return@withContext

        try {
            val payload = JSONObject()
                .put("quizzes", get("/rest/v1/quizzes?select=id,subject,unit,title,description&limit=500"))
                .put("questions", get("/rest/v1/questions?select=id,quiz_id,question_type,question_text,correct_answer,explanation,order_index&limit=2000"))
                .put("choices", get("/rest/v1/choices?select=id,question_id,choice_text,is_correct,order_index&limit=8000"))
            context.openFileOutput(CACHE_FILE, Context.MODE_PRIVATE).use { output ->
                output.write(payload.toString().toByteArray(Charsets.UTF_8))
            }
            prefs.edit().putLong(LAST_SYNC, now).apply()
        } catch (_: Exception) {
            // Offline-first: retain the last successful cache and bundled questions.
        }
    }

    private fun get(path: String): JSONArray {
        val connection = (URL(BASE_URL + path).openConnection() as HttpURLConnection).apply {
            requestMethod = "GET"
            connectTimeout = 15_000
            readTimeout = 30_000
            setRequestProperty("apikey", PUBLISHABLE_KEY)
            setRequestProperty("Authorization", "Bearer $PUBLISHABLE_KEY")
            setRequestProperty("Accept", "application/json")
        }
        return try {
            if (connection.responseCode !in 200..299) {
                throw IllegalStateException("Supabase request failed: ${connection.responseCode}")
            }
            JSONArray(connection.inputStream.bufferedReader().use { it.readText() })
        } finally {
            connection.disconnect()
        }
    }
}
