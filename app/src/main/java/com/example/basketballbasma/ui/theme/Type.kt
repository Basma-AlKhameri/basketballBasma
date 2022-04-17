package com.example.basketballbasma.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.basketballbasma.R

// Set of Material typography styles to start with
val dosis = FontFamily(
    Font(R.font.dosis_extra_bold,FontWeight.ExtraBold),
    Font(R.font.dosis_regular, FontWeight.Normal)
)

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = dosis,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 32.sp,
        color = Color.Black
    ),
    h3 = TextStyle(
        fontFamily = dosis,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        color = Color.LightGray
    )
)