package com.elhady.cinematicket.ui.screen.booking

data class BookingUiState(
    val seats: List<SeatUiState> = emptyList()
)

data class SeatUiState(
    val id: Int,
    val status: SeatStatus,
)

enum class SeatStatus {
    AVAILABLE, TAKEN, SELECTED
}