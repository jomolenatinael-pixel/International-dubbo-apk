package com.areka.app.data.remote

import android.content.Context
import android.util.Log
import com.areka.app.BuildConfig
import com.areka.app.data.model.Question
import com.areka.app.data.model.QuestionOption
import com.areka.app.data.model.QuestionType
import com.areka.app.data.model.Quiz
import com.areka.app.data.repository.CurriculumData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.net.HttpURLConnection
import java.net.SocketTimeoutException
import java.net.URL
import java.net.UnknownHostException

/**
 * Remote question data source connecting to Supabase REST endpoints.
 * Caches content locally in a private JSON file for offline-first resilience
 * and directly loads remote questions into CurriculumData for quiz consumption.
 */
object SupabaseQuestionSync : RemoteQuestionDataSource {
    private const val TAG = "SupabaseQuestionSync"
    private const val CACHE_FILE = "supabase_question_bank.json"
    private const val PREFS = "supabase_sync"
    private const val LAST_SYNC = "last_sync_epoch_ms"
    private const val SYNC_INTERVAL_MS = 6 * 60 * 60 * 1000L

    override suspend fun sync(context: Context, force: Boolean): SyncResult = withContext(Dispatchers.IO) {
        if (BuildConfig.SUPABASE_URL.isBlank() || BuildConfig.SUPABASE_ANON_KEY.isBlank()) {
            loadCachedQuizzesIntoCurriculum(context)
            return@withContext SyncResult.NetworkError("Supabase is not configured; using bundled curriculum.")
        }
        val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        val now = System.currentTimeMillis()
        val lastSync = prefs.getLong(LAST_SYNC, 0L)

        if (!force && (now - lastSync < SYNC_INTERVAL_MS)) {
            loadCachedQuizzesIntoCurriculum(context)
            return@withContext SyncResult.Cached(lastSync)
        }

        try {
            val quizzes = get("/rest/v1/quizzes?select=id,subject,unit,title,description&limit=500")
            val questions = get("/rest/v1/questions?select=id,quiz_id,question_type,question_text,correct_answer,explanation,order_index&limit=2000")
            val choices = get("/rest/v1/choices?select=id,question_id,choice_text,is_correct,order_index&limit=8000")

            val payload = JSONObject()
                .put("quizzes", quizzes)
                .put("questions", questions)
                .put("choices", choices)
                .put("synced_at", now)

            context.openFileOutput(CACHE_FILE, Context.MODE_PRIVATE).use { output ->
                output.write(payload.toString().toByteArray(Charsets.UTF_8))
            }
            prefs.edit().putLong(LAST_SYNC, now).apply()

            val parsed = parseRemoteQuizzes(payload)
            CurriculumData.setRemoteQuizzes(parsed)

            Log.i(TAG, "Successfully synced ${quizzes.length()} quizzes and ${questions.length()} questions from Supabase.")
            SyncResult.Success(quizzesCount = quizzes.length(), questionsCount = questions.length(), timestamp = now)
        } catch (e: UnknownHostException) {
            loadCachedQuizzesIntoCurriculum(context)
            Log.w(TAG, "Device offline or DNS unreachable. Using local curriculum.")
            SyncResult.NetworkError("Device is offline or DNS lookup failed.", e)
        } catch (e: SocketTimeoutException) {
            loadCachedQuizzesIntoCurriculum(context)
            Log.w(TAG, "Connection timed out syncing question bank.")
            SyncResult.NetworkError("Connection timed out.", e)
        } catch (e: IOException) {
            loadCachedQuizzesIntoCurriculum(context)
            Log.w(TAG, "I/O error during question sync: ${e.message}")
            SyncResult.NetworkError(e.message ?: "I/O error during sync", e)
        } catch (e: JSONException) {
            loadCachedQuizzesIntoCurriculum(context)
            Log.e(TAG, "Failed to parse question bank response: ${e.message}")
            SyncResult.ParseError("Malformed JSON received from remote server", e)
        } catch (e: SupabaseHttpException) {
            loadCachedQuizzesIntoCurriculum(context)
            Log.w(TAG, "HTTP error ${e.statusCode}: ${e.message}")
            if (e.statusCode in listOf(401, 403)) {
                SyncResult.AuthError("Supabase authentication rejected request (${e.statusCode})")
            } else {
                SyncResult.ServerError(e.statusCode, e.message ?: "Server error")
            }
        } catch (e: Exception) {
            loadCachedQuizzesIntoCurriculum(context)
            Log.e(TAG, "Unexpected error during question sync", e)
            SyncResult.NetworkError("Unexpected sync failure: ${e.message}", e)
        }
    }

    fun loadCachedQuizzesIntoCurriculum(context: Context) {
        val payload = getCachedPayload(context) ?: return
        try {
            val parsed = parseRemoteQuizzes(payload)
            if (parsed.isNotEmpty()) {
                CurriculumData.setRemoteQuizzes(parsed)
            }
        } catch (e: Exception) {
            Log.w(TAG, "Failed to load cached remote quizzes: ${e.message}")
        }
    }

    fun getCachedPayload(context: Context): JSONObject? {
        return try {
            context.openFileInput(CACHE_FILE).bufferedReader().use {
                JSONObject(it.readText())
            }
        } catch (_: Exception) {
            null
        }
    }

    fun parseRemoteQuizzes(payload: JSONObject): Map<String, Quiz> {
        val quizzesJson = payload.optJSONArray("quizzes") ?: return emptyMap()
        val questionsJson = payload.optJSONArray("questions") ?: JSONArray()
        val choicesJson = payload.optJSONArray("choices") ?: JSONArray()

        // Group choices by question_id
        val choicesByQuestion = mutableMapOf<Int, MutableList<JSONObject>>()
        for (i in 0 until choicesJson.length()) {
            val choice = choicesJson.optJSONObject(i) ?: continue
            val qId = choice.optInt("question_id", -1)
            if (qId != -1) {
                choicesByQuestion.getOrPut(qId) { mutableListOf() }.add(choice)
            }
        }

        // Group questions by quiz_id
        val questionsByQuiz = mutableMapOf<String, MutableList<JSONObject>>()
        for (i in 0 until questionsJson.length()) {
            val q = questionsJson.optJSONObject(i) ?: continue
            val quizId = q.optString("quiz_id")
            if (quizId.isNotBlank()) {
                questionsByQuiz.getOrPut(quizId) { mutableListOf() }.add(q)
            }
        }

        val result = mutableMapOf<String, Quiz>()
        for (i in 0 until quizzesJson.length()) {
            val quizObj = quizzesJson.optJSONObject(i) ?: continue
            val quizId = quizObj.optString("id")
            val unitId = quizObj.optString("unit").ifBlank { quizId }
            val title = quizObj.optString("title").ifBlank { "Unit Quiz" }
            val subject = quizObj.optString("subject").ifBlank { "General" }

            val rawQuestions = questionsByQuiz[quizId] ?: questionsByQuiz[unitId] ?: emptyList()
            if (rawQuestions.isEmpty()) continue

            val questions = rawQuestions.mapIndexed { index, qJson ->
                val qId = qJson.optInt("id", index + 1)
                val qTypeStr = qJson.optString("question_type", "multiple_choice")
                val isFillIn = qTypeStr.equals("fill_in_the_blank", ignoreCase = true)
                val choices = choicesByQuestion[qId] ?: emptyList()

                val options = choices.map { c ->
                    QuestionOption(
                        id = c.optString("id"),
                        text = c.optString("choice_text")
                    )
                }

                val correctChoice = choices.firstOrNull { it.optBoolean("is_correct", false) }
                val correctOptionId = correctChoice?.optString("id")
                    ?: qJson.optString("correct_answer").ifBlank { options.firstOrNull()?.id.orEmpty() }

                Question(
                    id = qId,
                    questionNumber = qJson.optInt("order_index", index + 1),
                    totalQuestions = rawQuestions.size,
                    text = qJson.optString("question_text"),
                    options = options,
                    correctOptionId = correctOptionId,
                    explanation = qJson.optString("explanation"),
                    type = if (isFillIn) QuestionType.FILL_IN_THE_BLANK else QuestionType.MULTIPLE_CHOICE
                )
            }

            val quiz = Quiz(
                id = quizId,
                title = title,
                subject = subject,
                subjectId = subject.lowercase(),
                unitId = unitId,
                durationMinutes = 5,
                questions = questions
            )
            result[unitId] = quiz
            result[quizId] = quiz
        }

        return result
    }

    private fun get(path: String): JSONArray {
        val connection = (URL(BuildConfig.SUPABASE_URL.trimEnd('/') + path).openConnection() as HttpURLConnection).apply {
            requestMethod = "GET"
            connectTimeout = 12_000
            readTimeout = 20_000
            setRequestProperty("apikey", BuildConfig.SUPABASE_ANON_KEY)
            setRequestProperty("Authorization", "Bearer ${BuildConfig.SUPABASE_ANON_KEY}")
            setRequestProperty("Accept", "application/json")
        }
        return try {
            val code = connection.responseCode
            if (code !in 200..299) {
                throw SupabaseHttpException(code, "Supabase request to $path failed with HTTP $code")
            }
            val text = connection.inputStream.bufferedReader().use { it.readText() }
            JSONArray(text)
        } finally {
            connection.disconnect()
        }
    }

    private class SupabaseHttpException(val statusCode: Int, message: String) : IOException(message)
}
