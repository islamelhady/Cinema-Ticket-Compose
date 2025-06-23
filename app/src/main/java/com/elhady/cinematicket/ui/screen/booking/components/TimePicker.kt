package com.elhady.cinematicket.ui.screen.booking.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.ui.screen.booking.Hours
import com.elhady.cinematicket.ui.screen.booking.hours
import com.elhady.cinematicket.ui.theme.Grey
import com.elhady.cinematicket.ui.theme.LightGrey

@Composable
fun TimePicker(hours: List<Hours>) {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 32.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(hours) {
            TimePickerItem(hours = it)
        }
    }

}

@Composable
fun TimePickerItem(hours: Hours) {
    Column(
        modifier = Modifier
            .border(
                1.dp,
                if (hours.isSelected) Color.DarkGray else Color.Gray,
                RoundedCornerShape(16.dp)
            )
            .background(
                color = if (hours.isSelected) Color.DarkGray else Color.Transparent,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            text = hours.hour,
            style = MaterialTheme.typography.bodyLarge,
            color = if (hours.isSelected) Color.White else Grey
        )
    }
}

@Preview
@Composable
fun TimePickerPreview() {
    TimePicker(hours = hours)
}

@Preview
@Composable
fun TimePickerItemPreview() {
    TimePickerItem(
        hours = Hours(hour = "10:00", isSelected = true, id = 1)
    )
}