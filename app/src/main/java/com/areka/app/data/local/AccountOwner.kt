package com.areka.app.data.local

import com.areka.app.data.remote.AuthState
import com.areka.app.data.remote.SupabaseAuth
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map

const val GUEST_OWNER_ID = "guest"

fun currentOwnerId(): String =
    (SupabaseAuth.state.value as? AuthState.SignedIn)?.user?.id ?: GUEST_OWNER_ID

fun ownerIdFlow(): Flow<String> = SupabaseAuth.state
    .map { state -> (state as? AuthState.SignedIn)?.user?.id ?: GUEST_OWNER_ID }
    .distinctUntilChanged()
