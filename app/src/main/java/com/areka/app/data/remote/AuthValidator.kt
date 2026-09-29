package com.areka.app.data.remote

import java.util.Locale

/**
 * Client-side credential validation matching the Supabase Auth server policies.
 */
object AuthValidator {
    const val MIN_PASSWORD_LENGTH = 6
    private val EMAIL_REGEX = Regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")

    fun validateEmail(email: String): String? {
        val trimmed = email.trim()
        if (trimmed.isBlank()) {
            return "Please enter your email address."
        }
        if (!EMAIL_REGEX.matches(trimmed)) {
            return "Please enter a valid email address."
        }
        return null
    }

    fun validatePassword(password: String): String? {
        if (password.isBlank()) {
            return "Please enter your password."
        }
        if (password.length < MIN_PASSWORD_LENGTH) {
            return "Password must be at least $MIN_PASSWORD_LENGTH characters."
        }
        return null
    }

    fun validatePasswordConfirmation(password: String, confirmation: String): String? {
        val passwordError = validatePassword(password)
        if (passwordError != null) return passwordError
        if (password != confirmation) {
            return "Passwords do not match."
        }
        return null
    }

    fun validateSignUp(email: String, password: String, confirmation: String): String? {
        return validateEmail(email) ?: validatePasswordConfirmation(password, confirmation)
    }

    fun validatePasswordReset(password: String, confirmation: String): String? {
        return validatePasswordConfirmation(password, confirmation)
    }

    fun normalizeEmail(email: String): String = email.trim().lowercase(Locale.US)
}
