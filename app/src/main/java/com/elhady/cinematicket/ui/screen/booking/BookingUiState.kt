package com.elhady.cinematicket.ui.screen.booking

import androidx.compose.ui.graphics.Color

data class BookingUiState(
    val seats: List<SeatUiState> = emptyList()
)

data class SeatUiState(
    val id: Int,
    val status: SeatStatus,
    val color: Color = Color.White
)

enum class SeatStatus {
    AVAILABLE, TAKEN, SELECTED
}