package com.pulse.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = OrangeAccent,
    onPrimary = Color(0xFF000000),
    primaryContainer = OrangeAccent,
    onPrimaryContainer = Color(0xFFFFFFFF),
    secondary = OrangeAccentLight,
    onSecondary = Color(0xFF000000),
    secondaryContainer = OrangeAccentLight,
    onSecondaryContainer = Color(0xFF000000),
    tertiary = OrangeAccent,
    onTertiary = Color(0xFF000000),
    tertiaryContainer = OrangeAccent,
    onTertiaryContainer = Color(0xFF000000),
    error = DarkError,
    onError = Color(0xFF000000),
    errorContainer = DarkError,
    onErrorContainer = Color(0xFFFFFFFF),
    background = DarkBackground,
    onBackground = LightText,
    surface = DarkSurface,
    onSurface = LightText,
    surfaceVariant = DarkSurfaceVariant,
    onSurfaceVariant = LightTextSecondary,
    outline = LightTextTertiary,
    outlineVariant = DarkSurfaceVariant,
    scrim = Color(0xFF000000),
)

private val LightColorScheme = lightColorScheme(
    primary = OrangeAccent,
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = OrangeAccentLight,
    onPrimaryContainer = Color(0xFF000000),
    secondary = OrangeAccentLight,
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = OrangeAccentLight,
    onSecondaryContainer = Color(0xFF000000),
    tertiary = OrangeAccent,
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = OrangeAccent,
    onTertiaryContainer = Color(0xFF000000),
    error = Color(0xFFB3261E),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFF9DEDC),
    onErrorContainer = Color(0xFF410E0B),
    background = Color(0xFFFBFBFB),
    onBackground = Color(0xFF1C1C1C),
    surface = Color(0xFFFBFBFB),
    onSurface = Color(0xFF1C1C1C),
    surfaceVariant = Color(0xFFEDEDED),
    onSurfaceVariant = Color(0xFF494949),
    outline = Color(0xFF79747E),
    outlineVariant = Color(0xFFCAC7D0),
    scrim = Color(0xFF000000),
)

@Composable
fun PulseTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
