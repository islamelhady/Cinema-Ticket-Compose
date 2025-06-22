package com.elhady.cinematicket.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.cinematicket.ui.theme.Grey
import com.elhady.cinematicket.ui.theme.OpenSans
import com.elhady.cinematicket.ui.theme.Orange

@Composable
fun Chip(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit = {},
    isSelected: Boolean = false,
    borderColor: Color = Grey,
    borderWidth: Dp = 1.dp,
    backgroundColor: Color = Color.Transparent,
    textColor: Color = Gray
) {
    Text(
        modifier = modifier
            .background(
                if (isSelected) Orange else backgroundColor,
                shape = CircleShape
            )
            .border(
                width = borderWidth,
                color = if (!isSelected) borderColor else Orange,
                shape = CircleShape
            )
            .clickable { onClick() }
            .padding(horizontal = 12.dp, vertical = 8.dp),

        text = text,
        style = TextStyle(
            color = if (isSelected) White else textColor,
            fontSize = 14.sp,
            fontFamily = OpenSans,
            letterSpacing = 0.15.sp,
            fontWeight = FontWeight.Normal
        )
    )
}

@Preview
@Composable
private fun ChipPreview() {
    Chip(
        text = "Coming Soon",
        backgroundColor = Orange,
        borderColor = Orange,
        isSelected = true
    )
}