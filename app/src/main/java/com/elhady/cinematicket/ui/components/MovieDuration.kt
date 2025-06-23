package com.elhady.cinematicket.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.cinematicket.R
import com.elhady.cinematicket.ui.theme.OpenSans

@Composable
fun MovieDuration(
    modifier: Modifier = Modifier,
    movieDuration: String = "2h 23m",
    textColor: Color = Color.Gray,
    iconTint: Color = Color.Gray,
    textSize: TextUnit = 16.sp,
    iconSize: Dp = 32.dp,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Icon(
            modifier = Modifier.size(iconSize),
            painter = painterResource(R.drawable.ic_time),
            contentDescription = null,
            tint = iconTint
        )
        Text(
            text = movieDuration,
            style = TextStyle(
                fontSize = textSize,
                letterSpacing = 0.15.sp,
                fontFamily = OpenSans,
                fontWeight = FontWeight.Medium,
                color = textColor
            )
        )
    }
}


@Preview
@Composable
private fun MovieDurationPreview() {
    MovieDuration(movieDuration = "2h 23m", textSize = 14.sp, iconSize = 24.dp)
}