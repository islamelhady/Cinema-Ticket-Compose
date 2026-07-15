package com.elhady.cinematicket.ui.screen.booking

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.elhady.cinematicket.ui.theme.Orange
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BookingViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(BookingUiState())
    val uiState = _uiState.asStateFlow()

    init {
        // Initialize 30 seats
        val initialSeats = List(30) { index ->
            val status = when {
                index % 5 == 0 || index % 7 == 0 -> SeatStatus.TAKEN
                else -> SeatStatus.AVAILABLE
            }
            SeatUiState(
                id = index,
                status = status,
                color = getSeatColor(status)
            )
        }
        _uiState.update { it.copy(seats = initialSeats) }
    }

    fun onSeatClick(seatId: Int) {
        _uiState.update { currentState ->
            val updatedSeats = currentState.seats.map { seat ->
                if (seat.id == seatId) {
                    val newStatus = when (seat.status) {
                        SeatStatus.AVAILABLE -> SeatStatus.SELECTED
                        SeatStatus.SELECTED -> SeatStatus.AVAILABLE
                        SeatStatus.TAKEN -> seat.status
                    }
                    seat.copy(status = newStatus, color = getSeatColor(newStatus))
                } else {
                    seat
                }
            }
            currentState.copy(seats = updatedSeats)
        }
    }

    private fun getSeatColor(status: SeatStatus): Color {
        return when (status) {
            SeatStatus.AVAILABLE -> Color.White
            SeatStatus.TAKEN -> Color.DarkGray
            SeatStatus.SELECTED -> Orange
        }
    }
}
