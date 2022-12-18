package com.example.scooterx.presentation.ui.theme
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors


private val DarkColorPalette = darkColors(
    primary = Primary,
    secondary = Secondary,
    surface = Surface,
    onSurface = onSurface,
    onBackground = OnBackGround
)

private val LightColorPalette = lightColors(
    primary = Primary,
    secondary = Secondary,
    surface = Surface,
    onSurface = onSurface,
    onBackground = OnBackGround
)

@Composable
fun ScooterXTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
