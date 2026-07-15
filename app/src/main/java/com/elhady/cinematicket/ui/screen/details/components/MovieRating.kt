package com.elhady.cinematicket.ui.screen.details.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MovieRating() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        RatingItem(score = "6.8/10", source = "IMDb")
        RatingItem(score = "63%", source = "Rotten Tomatoes")
        RatingItem(score = "4/10", source = "IGN")
    }
}

@Composable
@Preview
fun MovieRatingPreview() {
    MovieRating()
}