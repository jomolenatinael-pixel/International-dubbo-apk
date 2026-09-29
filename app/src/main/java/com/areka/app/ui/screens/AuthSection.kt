package com.areka.app.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.areka.app.data.remote.AuthState
import com.areka.app.data.remote.SupabaseAuth
import com.areka.app.data.remote.SupabaseCloudSync
import com.areka.app.data.repository.StudyRepository
import kotlinx.coroutines.launch

private enum class AuthDialogMode { SIGN_IN, SIGN_UP }

@Composable
fun AuthSection(modifier: Modifier = Modifier) {
    val authState by SupabaseAuth.state.collectAsState()
    var dialogMode by remember { mutableStateOf<AuthDialogMode?>(null) }
    val scope = rememberCoroutineScope()
    val user = (authState as? AuthState.SignedIn)?.user

    LaunchedEffect(user?.id) {
        if (user != null) {
            SupabaseCloudSync.drainPendingAttempts()
            SupabaseCloudSync.syncAdminFlag()
            SupabaseCloudSync.syncProfile(StudyRepository.userProfile.value)
            SupabaseCloudSync.refreshLeaderboard()
        }
    }

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text("Cloud account", style = MaterialTheme.typography.titleMedium)
            when (val state = authState) {
                is AuthState.SignedIn -> {
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Text(state.user.displayName, style = MaterialTheme.typography.bodyLarge)
                        if (state.user.isAdmin) {
                            Surface(
                                shape = RoundedCornerShape(50),
                                color = MaterialTheme.colorScheme.primaryContainer
                            ) {
                                Text(
                                    "Admin",
                                    style = MaterialTheme.typography.labelSmall,
                                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                                )
                            }
                        }
                    }
                    Text(state.user.email, style = MaterialTheme.typography.bodySmall)
                    Text(
                        "Your study stats sync when online. Guest study remains available offline.",
                        style = MaterialTheme.typography.bodySmall
                    )
                    OutlinedButton(onClick = { scope.launch { SupabaseAuth.signOut() } }) {
                        Text("Sign out")
                    }
                }
                AuthState.Loading -> {
                    Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                        CircularProgressIndicator(strokeWidth = 2.dp)
                        Text("Connecting…", style = MaterialTheme.typography.bodyMedium)
                    }
                }
                else -> {
                    Text(
                        if (state is AuthState.Error) state.message
                        else "Use guest mode offline, or sign in to sync progress and view the real leaderboard.",
                        style = MaterialTheme.typography.bodySmall,
                        color = if (state is AuthState.Error) MaterialTheme.colorScheme.error
                        else MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Button(onClick = { dialogMode = AuthDialogMode.SIGN_IN }) { Text("Sign in") }
                        OutlinedButton(onClick = { dialogMode = AuthDialogMode.SIGN_UP }) { Text("Create account") }
                    }
                }
            }
        }
    }

    dialogMode?.let { mode ->
        AuthDialog(
            mode = mode,
            onDismiss = { dialogMode = null },
            onAuthenticated = {
                dialogMode = null
                scope.launch {
                    SupabaseCloudSync.syncAdminFlag()
                    SupabaseCloudSync.syncProfile(StudyRepository.userProfile.value)
                    SupabaseCloudSync.refreshLeaderboard()
                }
            }
        )
    }
}

@Composable
private fun AuthDialog(
    mode: AuthDialogMode,
    onDismiss: () -> Unit,
    onAuthenticated: () -> Unit
) {
    val scope = rememberCoroutineScope()
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var displayName by remember { mutableStateOf("") }
    var error by remember { mutableStateOf<String?>(null) }
    var submitting by remember { mutableStateOf(false) }

    AlertDialog(
        onDismissRequest = { if (!submitting) onDismiss() },
        title = { Text(if (mode == AuthDialogMode.SIGN_IN) "Sign in" else "Create account") },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                if (mode == AuthDialogMode.SIGN_UP) {
                    OutlinedTextField(
                        value = displayName,
                        onValueChange = { displayName = it },
                        label = { Text("Display name") },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Email") },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    modifier = Modifier.fillMaxWidth()
                )
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Password") },
                    singleLine = true,
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    modifier = Modifier.fillMaxWidth()
                )
                if (error != null) Text(error!!, color = MaterialTheme.colorScheme.error)
                Spacer(modifier = Modifier.height(2.dp))
            }
        },
        confirmButton = {
            Button(
                enabled = !submitting && email.contains("@") && password.length >= 6,
                onClick = {
                    submitting = true
                    error = null
                    scope.launch {
                        val result = if (mode == AuthDialogMode.SIGN_IN) {
                            SupabaseAuth.signIn(email, password)
                        } else {
                            SupabaseAuth.signUp(email, password, displayName)
                        }
                        submitting = false
                        result.fold(
                            onSuccess = { onAuthenticated() },
                            onFailure = { error = it.message ?: "Authentication failed" }
                        )
                    }
                }
            ) { Text(if (submitting) "Please wait…" else "Continue") }
        },
        dismissButton = { TextButton(enabled = !submitting, onClick = onDismiss) { Text("Cancel") } }
    )
}
