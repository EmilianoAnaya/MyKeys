package com.example.mykeys.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mykeys.R

// Set of Material typography styles to start with

val mainTitle = FontFamily(
    Font(R.font.adlamdisplay_regular)
)

val headingTitle = FontFamily(
    Font(R.font.arimo_italic)
)

val bodyDefault = FontFamily(
    Font(R.font.caladea_italic)
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = bodyDefault,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    ),

    bodyMedium = TextStyle(
        fontFamily = bodyDefault,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),

    bodySmall = TextStyle(
        fontFamily = mainTitle,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),

    titleLarge = TextStyle(
        fontFamily = mainTitle,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
    ),

    titleMedium = TextStyle(
        fontFamily = headingTitle,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        color = Color.White
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)