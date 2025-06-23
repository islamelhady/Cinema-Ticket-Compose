package com.elhady.cinematicket.ui.screen.details.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.elhady.cinematicket.ui.theme.Grey

@Composable
 fun RatingItem(score: String, source: String) {
    Column(horizontalAlignment = Alignment.Companion.CenterHorizontally) {
        Text(
            text = score,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Companion.Medium
        )
        Text(text = source, style = MaterialTheme.typography.bodySmall, color = Grey)
    }
}

@Composable
@Preview
fun RatingItemPreview() {
    RatingItem(score = "6.8/10", source = "IMDb")
}