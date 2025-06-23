package com.elhady.cinematicket.ui.screen.booking.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.ui.screen.booking.Day
import com.elhady.cinematicket.ui.screen.booking.days
import com.elhady.cinematicket.ui.theme.Grey
import com.elhady.cinematicket.ui.theme.LightGrey

@Composable
fun DatePicker(days: List<Day>) {
    LazyRow(
        modifier = Modifier.padding(bottom = 16.dp),
        contentPadding = PaddingValues(horizontal = 32.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(days) { day ->
            DataPickerItem(day = day)
        }
    }
}

@Composable
private fun DataPickerItem(day: Day) {
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(color = if (day.isSelected) Color.DarkGray else Color.Transparent)
            .border(
                width = 1.dp,
                color = if (day.isSelected) Color.DarkGray else Color.Gray,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(horizontal = 16.dp, vertical = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = day.dayNum.toString(),
            style = MaterialTheme.typography.titleMedium,
            color = if (day.isSelected) Color.White else Color.Black,
        )
        Text(
            text = day.dayName,
            style = MaterialTheme.typography.bodySmall,
            color = if (day.isSelected) Color.White else Grey
        )
    }
}

@Preview(name = "DataPicker Preview")
@Composable
fun DataPickerPreview() {
    DatePicker(days = days)
}

@Preview(name = "DataPickerItem Preview")
@Composable
fun DataPickerItemPreview() {
    DataPickerItem(day = Day(dayNum = 14, dayName = "Thu", isSelected = false, id = 1))
}