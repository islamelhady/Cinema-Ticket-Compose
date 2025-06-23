package com.elhady.cinematicket.ui.screen.booking

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.ui.components.CircularIcon
import com.elhady.cinematicket.ui.screen.booking.components.BottomSheet
import com.elhady.cinematicket.ui.screen.booking.components.ScreenCinema
import com.elhady.cinematicket.ui.screen.booking.components.SeatSelection

@Composable
fun BookingScreen(days: List<Day>, hours: List<Hours>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .verticalScroll(rememberScrollState())
    ) {
        CircularIcon(modifier = Modifier.padding(top = 16.dp, start = 16.dp))
        ScreenCinema()
        SeatSelection( )
        BottomSheet(days = days, hour = hours)
    }
}

@Preview(showSystemUi = true)
@Composable
fun BookingScreenPreview() {
    BookingScreen(
        days = listOf(
            Day(dayNum = 14, dayName = "Thu", isSelected = false, id = 1),
            Day(dayNum = 15, dayName = "Fri", isSelected = true, id = 2),
            Day(dayNum = 16, dayName = "Sat", isSelected = false, id = 3),
            Day(dayNum = 17, dayName = "Sun", isSelected = false, id = 4),
            ),
        hours = listOf(
            Hours(hour = "10:00", isSelected = true, id = 1),
            Hours(hour = "11:00", isSelected = false, id = 2),
            Hours(hour = "12:00", isSelected = false, id = 3),
            Hours(hour = "13:00", isSelected = false, id = 4),
            Hours(hour = "14:00", isSelected = false, id = 5),
            Hours(hour = "15:00", isSelected = false, id = 6),
        )
    )
}
