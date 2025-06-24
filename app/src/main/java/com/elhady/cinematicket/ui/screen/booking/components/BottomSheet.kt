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
import com.elhady.cinematicket.ui.screen.booking.model.Day
import com.elhady.cinematicket.ui.screen.booking.model.Hours
import com.elhady.cinematicket.ui.screen.booking.model.days
import com.elhady.cinematicket.ui.screen.booking.model.hours

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
    BottomSheet(days = days, hour = hours)
}
