package com.elhady.cinematicket.ui.screen.booking.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.ui.components.BookingButton
import com.elhady.cinematicket.ui.theme.CinemaTicketTheme

@Composable
fun BookingTickets(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        PriceTicket()
        BookingButton()
    }
}

@Preview(showBackground = true)
@Composable
fun BookingTicketsPreview() {
    CinemaTicketTheme {
        BookingTickets()
    }
}
