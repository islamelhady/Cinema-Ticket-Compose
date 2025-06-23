package com.elhady.cinematicket.ui.screen.booking

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.ui.components.CircularIcon
import com.elhady.cinematicket.ui.screen.booking.components.BookingTickets
import com.elhady.cinematicket.ui.screen.booking.components.ScreenCinema
import com.elhady.cinematicket.ui.screen.booking.components.SeatSelection
import com.elhady.cinematicket.ui.theme.Grey
import com.elhady.cinematicket.ui.theme.LightGrey

@Composable
fun BookingScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        // Header

        CircularIcon()
        ScreenCinema()
        SeatSelection( )

        // Bottom Sheet Style Content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
                .background(Color.White)
                .padding(vertical = 16.dp)
        ) {
            DatePicker()
            TimePicker()
            BookingTickets()
        }
    }
}

@Composable
private fun DatePicker() {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(10) { index ->
            val isSelected = index == 2
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(if (isSelected) Color.DarkGray else Color.Transparent)
                    .border(if (isSelected) 0.dp else 1.dp, LightGrey, RoundedCornerShape(16.dp))
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "${14 + index}",
                    style = MaterialTheme.typography.titleMedium,
                    color = if (isSelected) Color.White else Color.Black,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Thu",
                    style = MaterialTheme.typography.bodySmall,
                    color = if (isSelected) Color.White else Grey
                )
            }
        }
    }
}

@Composable
private fun TimePicker() {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(5) { index ->
            val isSelected = index == 0
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(if (isSelected) Color.Transparent else Color.Transparent)
                    .border(
                        1.dp,
                        if (isSelected) Color.Transparent else LightGrey,
                        RoundedCornerShape(16.dp)
                    )
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .then(if (isSelected) Modifier.background(Color.LightGray.copy(alpha = 0.5f)) else Modifier),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "10:00",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.Black
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun BookingScreenPreview() {
    BookingScreen()
}
