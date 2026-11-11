package com.example.scpidle.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val EsquemaOscuro = darkColorScheme(
    primary = Rojo,
    onPrimary = Blanco,
    primaryContainer = RojoOscuro,
    onPrimaryContainer = RosaClaro,
    secondary = Gris,
    onSecondary = CasiNegro,
    secondaryContainer = RojoMuyOscuro,
    onSecondaryContainer = RosaClaro,
    background = CasiNegro,
    onBackground = TextoPrincipal,
    surface = CasiNegro,
    onSurface = TextoPrincipal,
    surfaceVariant = FondoTarjeta,
    onSurfaceVariant = TextoSecundario,
    surfaceContainer = FondoBarra,
    surfaceContainerHighest = FondoTarjetaContenedor,
    outline = Contorno
)

@Composable
fun SCPIdleTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = EsquemaOscuro,
        typography = Typography,
        content = content
    )
}
