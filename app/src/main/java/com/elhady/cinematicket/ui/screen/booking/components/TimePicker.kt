package com.elhady.cinematicket.ui.screen.booking.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.ui.theme.LightGrey

@Composable
fun TimePicker() {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(5) { index ->
            val isSelected = index == 0
            Box(
                modifier = Modifier.Companion
                    .clip(RoundedCornerShape(16.dp))
                    .background(if (isSelected) Color.Companion.Transparent else Color.Companion.Transparent)
                    .border(
                        1.dp,
                        if (isSelected) Color.Companion.Transparent else LightGrey,
                        androidx.compose.foundation.shape.RoundedCornerShape(16.dp)
                    )
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .then(
                        if (isSelected) Modifier.Companion.background(
                            Color.Companion.LightGray.copy(
                                alpha = 0.5f
                            )
                        ) else Modifier.Companion
                    ),
                contentAlignment = Alignment.Companion.Center
            ) {
                Text(
                    text = "10:00",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.Companion.Black
                )
            }
        }
    }
}