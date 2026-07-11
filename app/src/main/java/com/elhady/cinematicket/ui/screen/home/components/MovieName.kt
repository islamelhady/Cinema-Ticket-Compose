package com.elhady.cinematicket.ui.screen.home.components

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
        modifier = modifier.padding(vertical = 16.dp, horizontal = 32.dp),
        text = movieName,
        style = MaterialTheme.typography.titleLarge.copy(color = Color.Black),
        maxLines = 2,
        minLines = 2
    )
}

@Preview
@Composable
private fun MovieNamePreview() {
    MovieName(movieName = "Fantastic Beasts: The Secrets of Dumbledore")
}