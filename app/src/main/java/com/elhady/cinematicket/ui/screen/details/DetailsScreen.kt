package com.elhady.cinematicket.ui.screen.details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.ui.components.BookingButton
import com.elhady.cinematicket.ui.components.MovieInfo
import com.elhady.cinematicket.ui.screen.details.components.CastList
import com.elhady.cinematicket.ui.screen.details.components.HeaderDetails
import com.elhady.cinematicket.ui.screen.details.components.MovieDescription
import com.elhady.cinematicket.ui.screen.details.components.MovieRating
import com.elhady.cinematicket.ui.screen.details.components.PosterBanner
import com.elhady.cinematicket.ui.theme.CinemaTicketTheme

@Composable
fun DetailsScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        PosterBanner()
        Column() {
            HeaderDetails(modifier = Modifier.padding(bottom = 140.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Color.White,
                        shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
                    )
                    .padding(top = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MovieRating()
                MovieInfo()
                CastList()
                MovieDescription()
                BookingButton(text = "Booking")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DetailsScreenPreview() {
    CinemaTicketTheme {
        DetailsScreen()
    }
}
