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
fun BookingScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .verticalScroll(rememberScrollState())
    ) {
        CircularIcon(modifier = Modifier.padding(top = 16.dp, start = 16.dp))
        ScreenCinema()
        SeatSelection( )
        BottomSheet()
    }
}

@Preview(showSystemUi = true)
@Composable
fun BookingScreenPreview() {
    BookingScreen()
}
