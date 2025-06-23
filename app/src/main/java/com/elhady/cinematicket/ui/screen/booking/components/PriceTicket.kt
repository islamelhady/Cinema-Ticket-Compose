package com.elhady.cinematicket.ui.screen.booking.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.elhady.cinematicket.ui.theme.Grey

@Composable
fun PriceTicket() {
    Column {
        Text(
            text = "$100.00",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Companion.Bold
        )
        Text(text = "4 tickets", style = MaterialTheme.typography.bodySmall, color = Grey)
    }
}

@Preview
@Composable
fun PriceTicketPreview() {
    PriceTicket()
}