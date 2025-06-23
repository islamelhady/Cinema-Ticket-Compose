package com.elhady.cinematicket.ui.screen.booking.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BottomSheet() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color.White,
                shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
            )
            .padding(vertical = 16.dp)
    ) {
        DatePicker()
        TimePicker()
        BookingTickets()
    }
}

@Preview
@Composable
fun BottomSheetPreview(){
    BottomSheet()
}
