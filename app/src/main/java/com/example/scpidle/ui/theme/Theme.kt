package com.example.scpidle.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val EsquemaOscuro = darkColorScheme(
    primary = Color(0xFFE53935),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFF5C1B1B),
    onPrimaryContainer = Color(0xFFFFDAD6),
    secondary = Color(0xFF8E8E96),
    onSecondary = Color(0xFF0F0F10),
    secondaryContainer = Color(0xFF3A2326),
    onSecondaryContainer = Color(0xFFFFDAD6),
    background = Color(0xFF0F0F10),
    onBackground = Color(0xFFE8E8EA),
    surface = Color(0xFF0F0F10),
    onSurface = Color(0xFFE8E8EA),
    surfaceVariant = Color(0xFF1F1F23),
    onSurfaceVariant = Color(0xFFA6A6AD),
    surfaceContainer = Color(0xFF17171A),
    surfaceContainerHighest = Color(0xFF1F1F24),
    outline = Color(0xFF3D3D44)
)

@Composable
fun SCPIdleTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = EsquemaOscuro,
        typography = Typography,
        content = content
    )
}