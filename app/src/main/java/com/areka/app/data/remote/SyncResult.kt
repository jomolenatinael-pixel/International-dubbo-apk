package com.areka.app.data.remote

sealed interface SyncResult {
    data class Success(val quizzesCount: Int, val questionsCount: Int, val timestamp: Long) : SyncResult
    data class Cached(val lastSyncTimestamp: Long) : SyncResult
    data class NetworkError(val message: String, val cause: Throwable? = null) : SyncResult
    data class ServerError(val statusCode: Int, val message: String) : SyncResult
    data class ParseError(val message: String, val cause: Throwable? = null) : SyncResult
    data class AuthError(val message: String) : SyncResult
}

interface RemoteQuestionDataSource {
    suspend fun sync(context: android.content.Context, force: Boolean = false): SyncResult
}
