package com.example.bookshelf.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80,
    onPrimary = Color.White
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

)

/**
* Отвечает за переключение цветовой палитры для темной и светлой темы.
*/
@Composable
fun BookShelfTheme(content: @Composable () -> Unit) {
    val isDarkThemeEnabled = isSystemInDarkTheme() || BookShelfThemeSettings.isDarkThemeEnabled
    val colors = if (isDarkThemeEnabled) DarkColorScheme else LightColorScheme

    MaterialTheme(colorScheme = colors, content = content)
}

/**
 * Позволяет переключаться между светлой и темной темой в настройках приложения.
 */
object BookShelfThemeSettings {
    var isDarkThemeEnabled by mutableStateOf(false)
}