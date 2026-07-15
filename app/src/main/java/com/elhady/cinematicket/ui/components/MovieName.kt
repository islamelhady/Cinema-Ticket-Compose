package com.elhady.cinematicket.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MovieName(
    modifier: Modifier = Modifier,
    movieName: String
) {
    Text(
        modifier = modifier.padding(horizontal = 16.dp)
            .padding(bottom = 16.dp),
        text = movieName,
        style = MaterialTheme.typography.titleLarge,
        maxLines = 3,
        minLines = 2,

    )
}

@Preview
@Composable
private fun MovieNamePreview() {
    MovieName(movieName = "Fantastic Beasts: The Secrets of Dumbledore")
}