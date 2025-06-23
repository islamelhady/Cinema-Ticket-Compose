package com.elhady.cinematicket.ui.screen.booking

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BookingViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(BookingUiState())
    val uiState = _uiState.asStateFlow()

    init {
        // Initialize 30 seats (3 columns x 5 rows x 2 seats per pair = 30 seats)
        val initialSeats = List(30) { index ->
            SeatUiState(
                id = index,
                status = when {
                    // Randomly set some seats as TAKEN for demo
                    index % 5 == 0 || index % 7 == 0 -> SeatStatus.TAKEN
                    else -> SeatStatus.AVAILABLE
                }
            )
        }
        _uiState.update { it.copy(seats = initialSeats) }
    }

    fun onSeatClick(seatId: Int) {
        _uiState.update { currentState ->
            val updatedSeats = currentState.seats.map { seat ->
                if (seat.id == seatId) {
                    when (seat.status) {
                        SeatStatus.AVAILABLE -> seat.copy(status = SeatStatus.SELECTED)
                        SeatStatus.SELECTED -> seat.copy(status = SeatStatus.AVAILABLE)
                        SeatStatus.TAKEN -> seat // Do nothing if taken
                    }
                } else {
                    seat
                }
            }
            currentState.copy(seats = updatedSeats)
        }
    }
}
