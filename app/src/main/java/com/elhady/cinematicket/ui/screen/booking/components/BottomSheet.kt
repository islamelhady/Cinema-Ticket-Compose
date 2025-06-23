package com.elhady.cinematicket.ui.screen.booking.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.ui.screen.booking.Day
import com.elhady.cinematicket.ui.screen.booking.Hours

@Composable
fun BottomSheet(days: List<Day>, hour: List<Hours>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Color.White,
                shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
            )
            .padding(vertical = 16.dp)
    ) {
        DatePicker(days = days)
        TimePicker(hours = hour)
        BookingTickets()
    }
}

@Preview
@Composable
fun BottomSheetPreview(){
    BottomSheet(days = listOf(
        Day(dayNum = 14, dayName = "Thu", isSelected = false, id = 1),
        Day(dayNum = 15, dayName = "Fri", isSelected = true, id = 2),
        Day(dayNum = 16, dayName = "Sat", isSelected = false, id = 3),
        Day(dayNum = 17, dayName = "Sun", isSelected = false, id = 4),
        Day(dayNum = 18, dayName = "Mon", isSelected = false, id = 5),
        Day(dayNum = 19, dayName = "Tue", isSelected = false, id = 6),
    ), hour = listOf(
        Hours(hour = "10:00", isSelected = true, id = 1),
        Hours(hour = "11:00", isSelected = false, id = 2),
        Hours(hour = "12:00", isSelected = false, id = 3),
        Hours(hour = "13:00", isSelected = false, id = 4),
        Hours(hour = "14:00", isSelected = false, id = 5),
        Hours(hour = "15:00", isSelected = false, id = 6),
        Hours(hour = "16:00", isSelected = false, id = 7),
    ))
}
