package com.elhady.cinematicket.ui.screen.booking.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.ui.screen.booking.SeatStatus
import com.elhady.cinematicket.ui.screen.booking.SeatUiState
import com.elhady.cinematicket.ui.theme.Orange

@Composable
fun SeatSelection(
    seats: List<SeatUiState>,
    onSeatClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    // Assuming 30 seats: 10 left, 10 middle, 10 right
    // Each Column has 5 pairs (5 rows x 2 seats)
    val leftSeats = seats.take(10)
    val middleSeats = seats.drop(10).take(10)
    val rightSeats = seats.drop(20).take(10)

    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            // Left Seats
            SeatColumn(
                seats = leftSeats,
                onSeatClick = onSeatClick,
                rotation = 10f
            )

            // Middle Seats
            SeatColumn(
                seats = middleSeats,
                onSeatClick = onSeatClick,
                paddingTop = 8.dp
            )

            // Right Seats
            SeatColumn(
                seats = rightSeats,
                onSeatClick = onSeatClick,
                rotation = -10f
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            SeatLegend(text = "Available", color = Color.White)
            SeatLegend(text = "Taken", color = Color.DarkGray)
            SeatLegend(text = "Selected", color = Orange)
        }
    }
}

@Composable
private fun SeatColumn(
    seats: List<SeatUiState>,
    onSeatClick: (Int) -> Unit,
    rotation: Float = 0f,
    paddingTop: Dp = 0.dp
) {
    Column(
        modifier = Modifier.padding(top = paddingTop),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        // chunked(2) to create pairs from the list of 10 seats
        seats.chunked(2).forEach { pair ->
            if (pair.size == 2) {
                SeatPair(
                    seat1 = pair[0],
                    seat2 = pair[1],
                    onSeatClick = onSeatClick,
                    modifier = if (rotation != 0f) Modifier.graphicsLayer { rotationZ = rotation } else Modifier
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SeatSelectionPreview() {
    val mockSeats = List(30) { i ->
        SeatUiState(id = i, status = SeatStatus.AVAILABLE, color = Color.White)
    }
    SeatSelection(seats = mockSeats, onSeatClick = {})
}

