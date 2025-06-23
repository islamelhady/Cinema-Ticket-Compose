package com.elhady.cinematicket.ui.screen.booking.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.R
import com.elhady.cinematicket.ui.screen.booking.SeatStatus
import com.elhady.cinematicket.ui.screen.booking.SeatUiState
import com.elhady.cinematicket.ui.theme.Orange

@Composable
fun SeatPair(
    seat1: SeatUiState,
    seat2: SeatUiState,
    onSeatClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.padding(4.dp),
        contentAlignment = Alignment.Center,
    ) {
        Icon(
            painter = painterResource(id = R.drawable.seat_grouper),
            modifier = Modifier.scale(1.5f),
            contentDescription = null,
            tint = if (seat1.status == SeatStatus.SELECTED && seat2.status == SeatStatus.SELECTED) Orange.copy(alpha = .2f) else Color.DarkGray.copy(alpha = .6f),
        )
        Row(
            modifier = Modifier
                .padding(4.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            SeatIcon(seat = seat1, onClick = onSeatClick)
            SeatIcon(seat = seat2, onClick = onSeatClick)
        }
    }
}

@Composable
private fun SeatIcon(
    seat: SeatUiState,
    onClick: (Int) -> Unit
) {
    Icon(
        painter = painterResource(id = R.drawable.cenima_seat),
        contentDescription = null,
        tint = seat.color,
        modifier = Modifier
            .size(42.dp)
            .padding(bottom = 4.dp)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null,
                enabled = seat.status != SeatStatus.TAKEN
            ) {
                onClick(seat.id)
            }
    )
}

@Composable
@Preview
fun SeatPairPreview() {
    SeatPair(
        seat1 = SeatUiState(1, SeatStatus.SELECTED, Orange),
        seat2 = SeatUiState(2, SeatStatus.SELECTED, Orange),
        onSeatClick = {}
    )
}