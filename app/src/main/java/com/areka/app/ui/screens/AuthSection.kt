package com.areka.app.ui.screens

import android.app.Activity
import androidx.credentials.CredentialManager
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.areka.app.data.remote.AuthState
import com.areka.app.data.remote.AuthValidator
import com.areka.app.data.remote.GoogleAuth
import com.areka.app.data.remote.SupabaseAuth
import com.areka.app.data.remote.SupabaseCloudSync
import kotlinx.coroutines.launch

private enum class AuthDialogMode { SIGN_IN, SIGN_UP, RESET_PASSWORD }

@Composable
fun AuthSection(modifier: Modifier = Modifier) {
    val authState by SupabaseAuth.state.collectAsState()
    var dialogMode by remember { mutableStateOf<AuthDialogMode?>(null) }
    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    val googleAuth = remember(context) { GoogleAuth(CredentialManager.create(context)) }
    var googleLoading by remember { mutableStateOf(false) }
    var googleError by remember { mutableStateOf<String?>(null) }
    val user = (authState as? AuthState.SignedIn)?.user

    LaunchedEffect(user?.id) {
        if (user != null) {
            SupabaseCloudSync.drainPendingAttempts()
            SupabaseCloudSync.syncAdminFlag()
            SupabaseCloudSync.refreshLeaderboard()
        }
    }

    Card(
        modifier = modifier.fillMaxWidth().testTag("auth_section_card"),
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
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
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
                    OutlinedButton(
                        onClick = {
                            scope.launch {
                                googleAuth.clearCredentialState()
                                SupabaseAuth.signOut()
                            }
                        },
                        modifier = Modifier.testTag("auth_sign_out_button")
                    ) {
                        Text("Sign out")
                    }
                }
                is AuthState.PasswordRecovery -> {
                    Text(
                        "Password Reset Active",
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        if (!state.email.isNullOrBlank()) {
                            "Resetting password for ${state.email}. Set your new password to complete recovery."
                        } else {
                            "Set your new password to complete recovery."
                        },
                        style = MaterialTheme.typography.bodySmall
                    )
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Button(
                            onClick = { /* Password recovery dialog shown below */ },
                            modifier = Modifier.testTag("auth_set_new_password_button")
                        ) {
                            Text("Set new password")
                        }
                        OutlinedButton(
                            onClick = { SupabaseAuth.cancelPasswordRecovery() },
                            modifier = Modifier.testTag("auth_cancel_recovery_button")
                        ) {
                            Text("Cancel")
                        }
                    }
                }
                AuthState.Loading -> {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        CircularProgressIndicator(strokeWidth = 2.dp, modifier = Modifier.size(20.dp))
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
                    googleError?.let { Text(it, color = MaterialTheme.colorScheme.error) }
                    Button(
                        modifier = Modifier.fillMaxWidth(),
                        enabled = !googleLoading,
                        onClick = {
                            val activity = context as? Activity
                            if (activity == null) {
                                googleError = "Google sign-in is unavailable in this window."
                            } else {
                                googleLoading = true
                                googleError = null
                                scope.launch {
                                    googleAuth.signIn(activity).fold(
                                        onSuccess = { googleLoading = false },
                                        onFailure = {
                                            googleLoading = false
                                            googleError = it.message ?: "Google sign-in failed."
                                        }
                                    )
                                }
                            }
                        }
                    ) {
                        if (googleLoading) {
                            CircularProgressIndicator(strokeWidth = 2.dp)
                        } else {
                            Text("Continue with Google")
                        }
                    }
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Button(
                            onClick = { dialogMode = AuthDialogMode.SIGN_IN },
                            modifier = Modifier.testTag("auth_sign_in_open_button")
                        ) {
                            Text("Sign in")
                        }
                        OutlinedButton(
                            onClick = { dialogMode = AuthDialogMode.SIGN_UP },
                            modifier = Modifier.testTag("auth_create_account_open_button")
                        ) {
                            Text("Create account")
                        }
                    }
                }
            }
        }
    }

    // Password Recovery Dialog when in recovery state
    if (authState is AuthState.PasswordRecovery) {
        val recoveryState = authState as AuthState.PasswordRecovery
        PasswordRecoveryDialog(
            email = recoveryState.email,
            onDismiss = { SupabaseAuth.cancelPasswordRecovery() },
            onUpdated = {
                scope.launch {
                    SupabaseCloudSync.syncAdminFlag()
                    SupabaseCloudSync.refreshLeaderboard()
                }
            }
        )
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
private fun PasswordRecoveryDialog(
    email: String?,
    onDismiss: () -> Unit,
    onUpdated: () -> Unit
) {
    val scope = rememberCoroutineScope()
    var newPassword by remember { mutableStateOf("") }
    var confirmation by remember { mutableStateOf("") }
    var error by remember { mutableStateOf<String?>(null) }
    var submitting by remember { mutableStateOf(false) }

    AlertDialog(
        onDismissRequest = { if (!submitting) onDismiss() },
        title = { Text("Set new password") },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                if (!email.isNullOrBlank()) {
                    Text(
                        text = "Account: $email",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                OutlinedTextField(
                    value = newPassword,
                    onValueChange = {
                        newPassword = it
                        error = null
                    },
                    label = { Text("New password (min 6 characters)") },
                    singleLine = true,
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    modifier = Modifier.fillMaxWidth().testTag("recovery_password_input")
                )
                OutlinedTextField(
                    value = confirmation,
                    onValueChange = {
                        confirmation = it
                        error = null
                    },
                    label = { Text("Confirm new password") },
                    singleLine = true,
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    modifier = Modifier.fillMaxWidth().testTag("recovery_confirmation_input")
                )
                error?.let {
                    Text(it, color = MaterialTheme.colorScheme.error, style = MaterialTheme.typography.bodySmall)
                }
                Spacer(modifier = Modifier.height(2.dp))
            }
        },
        confirmButton = {
            val validation = AuthValidator.validatePasswordReset(newPassword, confirmation)
            val isValid = validation == null
            Button(
                enabled = !submitting && isValid,
                onClick = {
                    submitting = true
                    error = null
                    scope.launch {
                        SupabaseAuth.updatePassword(newPassword, confirmation).fold(
                            onSuccess = {
                                submitting = false
                                onUpdated()
                            },
                            onFailure = {
                                submitting = false
                                error = it.message ?: "Failed to update password. Please try again."
                            }
                        )
                    }
                },
                modifier = Modifier.testTag("recovery_submit_button")
            ) {
                if (submitting) {
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.CenterVertically) {
                        CircularProgressIndicator(strokeWidth = 2.dp, modifier = Modifier.size(16.dp))
                        Text("Updating…")
                    }
                } else {
                    Text("Update password")
                }
            }
        },
        dismissButton = {
            TextButton(
                enabled = !submitting,
                onClick = onDismiss,
                modifier = Modifier.testTag("recovery_cancel_button")
            ) {
                Text("Cancel")
            }
        }
    )
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
    var successNotice by remember { mutableStateOf<String?>(null) }
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
                    AuthDialogMode.RESET_PASSWORD -> "Forgot password"
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
                        modifier = Modifier.fillMaxWidth().testTag("auth_display_name_input")
                    )
                }
                OutlinedTextField(
                    value = email,
                    onValueChange = {
                        email = it
                        error = null
                        successNotice = null
                    },
                    label = { Text("Email") },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    modifier = Modifier.fillMaxWidth().testTag("auth_email_input")
                )
                if (!resetMode) {
                    OutlinedTextField(
                        value = password,
                        onValueChange = {
                            password = it
                            error = null
                        },
                        label = { Text("Password (min 6 characters)") },
                        singleLine = true,
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        modifier = Modifier.fillMaxWidth().testTag("auth_password_input")
                    )
                }
                if (signUpMode) {
                    OutlinedTextField(
                        value = confirmation,
                        onValueChange = {
                            confirmation = it
                            error = null
                        },
                        label = { Text("Confirm password") },
                        singleLine = true,
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        modifier = Modifier.fillMaxWidth().testTag("auth_confirmation_input")
                    )
                }
                error?.let {
                    Text(it, color = MaterialTheme.colorScheme.error, style = MaterialTheme.typography.bodySmall)
                }
                successNotice?.let {
                    Text(it, color = MaterialTheme.colorScheme.primary, style = MaterialTheme.typography.bodySmall)
                }
                if (mode == AuthDialogMode.SIGN_IN) {
                    TextButton(
                        enabled = !submitting,
                        onClick = {
                            error = null
                            successNotice = null
                            onChangeMode(AuthDialogMode.RESET_PASSWORD)
                        },
                        modifier = Modifier.testTag("auth_forgot_password_button")
                    ) {
                        Text("Forgot password?")
                    }
                }
                if (signUpMode && (error?.contains("Account created", true) == true || error?.contains("confirm", true) == true)) {
                    TextButton(
                        enabled = !submitting,
                        onClick = {
                            submitting = true
                            scope.launch {
                                val result = SupabaseAuth.resendConfirmation(email)
                                submitting = false
                                error = null
                                successNotice = result.fold(
                                    onSuccess = { "Confirmation email sent. Check your inbox." },
                                    onFailure = { it.message ?: "Failed to resend confirmation email." }
                                )
                            }
                        },
                        modifier = Modifier.testTag("auth_resend_confirmation_button")
                    ) {
                        Text("Resend confirmation email")
                    }
                }
                Spacer(modifier = Modifier.height(2.dp))
            }
        },
        confirmButton = {
            val isValid = when (mode) {
                AuthDialogMode.SIGN_IN ->
                    AuthValidator.validateEmail(email) == null && AuthValidator.validatePassword(password) == null
                AuthDialogMode.SIGN_UP ->
                    AuthValidator.validateSignUp(email, password, confirmation) == null
                AuthDialogMode.RESET_PASSWORD ->
                    AuthValidator.validateEmail(email) == null
            }

            Button(
                enabled = !submitting && isValid,
                onClick = {
                    submitting = true
                    error = null
                    successNotice = null
                    scope.launch {
                        when (mode) {
                            AuthDialogMode.SIGN_IN -> {
                                SupabaseAuth.signIn(email, password).fold(
                                    onSuccess = { submitting = false; onAuthenticated() },
                                    onFailure = {
                                        submitting = false
                                        error = it.message ?: "Something went wrong. Please try again."
                                    }
                                )
                            }
                            AuthDialogMode.SIGN_UP -> {
                                SupabaseAuth.signUp(email, password, confirmation, displayName).fold(
                                    onSuccess = { submitting = false; onAuthenticated() },
                                    onFailure = {
                                        submitting = false
                                        error = it.message ?: "Something went wrong. Please try again."
                                    }
                                )
                            }
                            AuthDialogMode.RESET_PASSWORD -> {
                                SupabaseAuth.sendPasswordReset(email).fold(
                                    onSuccess = {
                                        submitting = false
                                        successNotice = "If an account exists for this email, a password reset link has been sent. Check your inbox."
                                    },
                                    onFailure = {
                                        submitting = false
                                        error = it.message ?: "Something went wrong. Please try again."
                                    }
                                )
                            }
                        }
                    }
                },
                modifier = Modifier.testTag("auth_dialog_confirm_button")
            ) {
                if (submitting) {
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.CenterVertically) {
                        CircularProgressIndicator(strokeWidth = 2.dp, modifier = Modifier.size(16.dp))
                        Text("Please wait…")
                    }
                } else {
                    Text(if (resetMode) "Send reset email" else if (signUpMode) "Create account" else "Sign in")
                }
            }
        },
        dismissButton = {
            Row {
                if (mode == AuthDialogMode.RESET_PASSWORD) {
                    TextButton(
                        enabled = !submitting,
                        onClick = {
                            error = null
                            successNotice = null
                            onChangeMode(AuthDialogMode.SIGN_IN)
                        },
                        modifier = Modifier.testTag("auth_back_to_sign_in_button")
                    ) {
                        Text("Back to sign in")
                    }
                }
                TextButton(
                    enabled = !submitting,
                    onClick = onDismiss,
                    modifier = Modifier.testTag("auth_dialog_dismiss_button")
                ) {
                    Text("Cancel")
                }
            }
        }
    )
}
