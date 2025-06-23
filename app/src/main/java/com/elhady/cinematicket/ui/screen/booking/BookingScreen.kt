package com.elhady.cinematicket.ui.screen.booking

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.elhady.cinematicket.ui.components.CircularIcon
import com.elhady.cinematicket.ui.screen.booking.components.BottomSheet
import com.elhady.cinematicket.ui.screen.booking.components.ScreenCinema
import com.elhady.cinematicket.ui.screen.booking.components.SeatSelection

@Composable
fun BookingScreen(
    days: List<Day>,
    hours: List<Hours>,
    viewModel: BookingViewModel = viewModel()
) {
    val state by viewModel.uiState.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .verticalScroll(rememberScrollState())
    ) {
        CircularIcon(modifier = Modifier.padding(top = 16.dp, start = 16.dp))
        ScreenCinema()
        SeatSelection(
            seats = state.seats,
            onSeatClick = viewModel::onSeatClick
        )
        BottomSheet(days = days, hour = hours)
    }
}

@Preview(showSystemUi = true)
@Composable
fun BookingScreenPreview() {
    BookingScreen(days = days, hours = hours)
}
