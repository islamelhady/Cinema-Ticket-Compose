package com.elhady.cinematicket.ui.screen.details.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.ui.theme.Grey
import com.elhady.cinematicket.ui.theme.LightGrey

@Composable
fun MovieInfo(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            RatingItem(score = "6.8/10", source = "IMDb")
            RatingItem(score = "63%", source = "Rotten Tomatoes")
            RatingItem(score = "4/10", source = "IGN")
        }

        MovieTitle(title = "Fantastic Beasts: The Secrets of Dumbledore")

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            GenreTag(tag = "Fantasy")
            GenreTag(tag = "Adventure")
        }
    }
}

@Composable
private fun MovieTitle(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.titleMedium,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(vertical = 16.dp)
    )
}

@Composable
private fun RatingItem(score: String, source: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = score,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Medium
        )
        Text(text = source, style = MaterialTheme.typography.bodySmall, color = Grey)
    }
}

@Composable
private fun GenreTag(tag: String) {
    Text(
        text = tag,
        modifier = Modifier
            .border(
                1.dp,
                LightGrey,
                RoundedCornerShape(16.dp)
            )
            .padding(horizontal = 12.dp, vertical = 4.dp),
        style = MaterialTheme.typography.bodySmall,
        color = Color.Black
    )
}

@Composable
@Preview(showBackground = true)
fun MovieInfoPreview() {
    MovieInfo()
}