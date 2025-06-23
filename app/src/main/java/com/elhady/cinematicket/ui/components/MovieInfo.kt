package com.elhady.cinematicket.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.ui.theme.CinemaTicketTheme

@Composable
fun MovieInfo(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MovieName(movieName = "Fantastic Beasts: The Secrets of Dumbledore")
        MovieCategories()
    }
}


@Composable
@Preview(showBackground = true)
fun MovieInfoPreview() {
    CinemaTicketTheme{
        MovieInfo()
    }
}