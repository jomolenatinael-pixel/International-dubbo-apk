package com.areka.app.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = NeonCyan,
    onPrimary = Color.Black,
    primaryContainer = NeonCyan.copy(alpha = 0.15f),
    onPrimaryContainer = NeonCyan,
    secondary = ElectricBlue,
    onSecondary = Color.White,
    secondaryContainer = DarkNavyCardHover,
    onSecondaryContainer = TextWhite,
    tertiary = AmberGold,
    onTertiary = Color.Black,
    background = DarkNavyBg,
    onBackground = TextWhite,
    surface = DarkNavyCard,
    onSurface = TextWhite,
    surfaceVariant = DarkNavyInput,
    onSurfaceVariant = TextLightGrey,
    outline = DarkNavyCardBorder
)

private val LightColorScheme = lightColorScheme(
    primary = ElectricBlue,
    onPrimary = Color.White,
    primaryContainer = NeonCyan.copy(alpha = 0.15f),
    onPrimaryContainer = DarkNavyBg,
    secondary = ElectricBlue,
    onSecondary = Color.White,
    secondaryContainer = LightCardHover,
    onSecondaryContainer = TextDark,
    tertiary = AmberGold,
    onTertiary = Color.Black,
    background = LightBg,
    onBackground = TextDark,
    surface = LightCard,
    onSurface = TextDark,
    surfaceVariant = LightInput,
    onSurfaceVariant = TextDarkMuted,
    outline = LightCardBorder
)

val LocalThemeIsDark = staticCompositionLocalOf { true }

// Semantic theme helpers
val ColorScheme.inputFieldBackground: Color
    @Composable
    @ReadOnlyComposable
    get() = if (LocalThemeIsDark.current) DarkNavyInput else LightInput

val ColorScheme.cardBorderColor: Color
    @Composable
    @ReadOnlyComposable
    get() = if (LocalThemeIsDark.current) DarkNavyCardBorder else LightCardBorder

val ColorScheme.cardHoverColor: Color
    @Composable
    @ReadOnlyComposable
    get() = if (LocalThemeIsDark.current) DarkNavyCardHover else LightCardHover

val ColorScheme.secondaryTextColor: Color
    @Composable
    @ReadOnlyComposable
    get() = if (LocalThemeIsDark.current) TextMuted else TextDarkMuted

@Composable
fun ArekaTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    CompositionLocalProvider(LocalThemeIsDark provides darkTheme) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )
    }
}
