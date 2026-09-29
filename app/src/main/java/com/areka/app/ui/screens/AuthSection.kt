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
import kotlinx.coroutines.launch

private enum class AuthDialogMode { SIGN_IN, SIGN_UP, RESET_PASSWORD }

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
                        Text("Restoring cloud session…", style = MaterialTheme.typography.bodyMedium)
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
            onChangeMode = { dialogMode = it },
            onAuthenticated = {
                dialogMode = null
                scope.launch {
                    SupabaseCloudSync.syncAdminFlag()
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
    onChangeMode: (AuthDialogMode) -> Unit,
    onAuthenticated: () -> Unit
) {
    val scope = rememberCoroutineScope()
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmation by remember { mutableStateOf("") }
    var displayName by remember { mutableStateOf("") }
    var error by remember { mutableStateOf<String?>(null) }
    var submitting by remember { mutableStateOf(false) }
    val signUpMode = mode == AuthDialogMode.SIGN_UP
    val resetMode = mode == AuthDialogMode.RESET_PASSWORD

    AlertDialog(
        onDismissRequest = { if (!submitting) onDismiss() },
        title = {
            Text(
                when (mode) {
                    AuthDialogMode.SIGN_IN -> "Sign in"
                    AuthDialogMode.SIGN_UP -> "Create account"
                    AuthDialogMode.RESET_PASSWORD -> "Reset password"
                }
            )
        },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                if (signUpMode) {
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
                if (!resetMode) {
                    OutlinedTextField(
                        value = password,
                        onValueChange = { password = it },
                        label = { Text("Password") },
                        singleLine = true,
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                if (signUpMode) {
                    OutlinedTextField(
                        value = confirmation,
                        onValueChange = { confirmation = it },
                        label = { Text("Confirm password") },
                        singleLine = true,
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                error?.let { Text(it, color = MaterialTheme.colorScheme.error) }
                if (mode == AuthDialogMode.SIGN_IN) {
                    TextButton(enabled = !submitting, onClick = { onChangeMode(AuthDialogMode.RESET_PASSWORD) }) {
                        Text("Forgot password?")
                    }
                }
                if (signUpMode && error?.startsWith("Account created") == true) {
                    TextButton(enabled = !submitting, onClick = {
                        submitting = true
                        scope.launch {
                            val result = SupabaseAuth.resendConfirmation(email)
                            submitting = false
                            error = result.exceptionOrNull()?.message
                                ?: "Confirmation email sent. Check your inbox."
                        }
                    }) { Text("Resend confirmation email") }
                }
                Spacer(modifier = Modifier.height(2.dp))
            }
        },
        confirmButton = {
            val valid = email.contains("@") &&
                (resetMode || password.length >= 6) &&
                (!signUpMode || confirmation == password)
            Button(
                enabled = !submitting && valid,
                onClick = {
                    submitting = true
                    error = null
                    scope.launch {
                        when (mode) {
                            AuthDialogMode.SIGN_IN -> {
                                SupabaseAuth.signIn(email, password).fold(
                                    onSuccess = { submitting = false; onAuthenticated() },
                                    onFailure = { submitting = false; error = it.message ?: "Something went wrong. Please try again." }
                                )
                            }
                            AuthDialogMode.SIGN_UP -> {
                                SupabaseAuth.signUp(email, password, confirmation, displayName).fold(
                                    onSuccess = { submitting = false; onAuthenticated() },
                                    onFailure = { submitting = false; error = it.message ?: "Something went wrong. Please try again." }
                                )
                            }
                            AuthDialogMode.RESET_PASSWORD -> {
                                SupabaseAuth.sendPasswordReset(email).fold(
                                    onSuccess = { submitting = false; error = "Check your email for a password reset link." },
                                    onFailure = { submitting = false; error = it.message ?: "Something went wrong. Please try again." }
                                )
                            }
                        }
                    }
                }
            ) { Text(if (submitting) "Please wait…" else if (resetMode) "Send reset email" else "Continue") }
        },
        dismissButton = {
            Row {
                if (mode == AuthDialogMode.RESET_PASSWORD) {
                    TextButton(enabled = !submitting, onClick = { onChangeMode(AuthDialogMode.SIGN_IN) }) { Text("Back to sign in") }
                }
                TextButton(enabled = !submitting, onClick = onDismiss) { Text("Cancel") }
            }
        }
    )
}
