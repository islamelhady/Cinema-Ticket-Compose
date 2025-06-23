package com.elhady.cinematicket.ui.screen.booking.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.R
import com.elhady.cinematicket.ui.theme.Orange

@Composable
fun SeatPair(
    color1: Color,
    color2: Color,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.padding(4.dp),
        contentAlignment = Alignment.Center,
    ) {
        Icon(
            painter = painterResource(id = R.drawable.seat_grouper),
            modifier = Modifier.scale(1.5f),
            contentDescription = null,
            tint = if (color1 == Orange && color2 == Orange) Orange.copy(alpha = .2f) else Color.DarkGray.copy(alpha = .6f),
        )
        Row(
            modifier = Modifier
                .padding(4.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                painter = painterResource(id = R.drawable.cenima_seat),
                contentDescription = null,
                tint = color1,
                modifier = Modifier.size(42.dp).padding(bottom = 4.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.cenima_seat),
                contentDescription = null,
                tint = color2,
                modifier = Modifier.size(42.dp).padding(bottom = 4.dp)
            )
        }
    }
}

@Composable
@Preview
fun SeatPairPreview() {
    SeatPair(color1 = Color.White, color2 = Color.White)
}