package com.chat.designsystem.theme

import androidx.compose.runtime.Stable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.chat.designsystem.R

object Typography {
    private val suit = FontFamily(
        Font(R.font.suit_heavy, FontWeight.Black),
        Font(R.font.suit_bold, FontWeight.Bold),
        Font(R.font.suit_semi_bold, FontWeight.SemiBold),
        Font(R.font.suit_medium, FontWeight.Medium),
        Font(R.font.suit_regular, FontWeight.Normal)
    )

    @Stable
    val h1 = TextStyle(
        fontFamily = suit,
        fontSize = 19.sp,
        fontWeight = FontWeight.Black
    )

    @Stable
    val b1 = TextStyle(
        fontFamily = suit,
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold
    )

    @Stable
    val b2 = TextStyle(
        fontFamily = suit,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold
    )

    @Stable
    val b3 = TextStyle(
        fontFamily = suit,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    )

    @Stable
    val b4 = TextStyle(
        fontFamily = suit,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold
    )

    @Stable
    val b5 = TextStyle(
        fontFamily = suit,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold
    )

    @Stable
    val b6 = TextStyle(
        fontFamily = suit,
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold
    )

    @Stable
    val sb1 = TextStyle(
        fontFamily = suit,
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold
    )

    @Stable
    val m1 = TextStyle(
        fontFamily = suit,
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium
    )

    @Stable
    val m2 = TextStyle(
        fontFamily = suit,
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium
    )

    @Stable
    val m3 = TextStyle(
        fontFamily = suit,
        fontSize = 13.sp,
        fontWeight = FontWeight.Medium
    )

    @Stable
    val m4 = TextStyle(
        fontFamily = suit,
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium
    )

    @Stable
    val m5 = TextStyle(
        fontFamily = suit,
        fontSize = 10.sp,
        fontWeight = FontWeight.Medium
    )

    @Stable
    val r1 = TextStyle(
        fontFamily = suit,
        fontSize = 15.sp,
        fontWeight = FontWeight.Normal
    )
}
