package com.elhady.cinematicket.ui.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.R
import com.elhady.cinematicket.ui.components.MovieDuration
import com.elhady.cinematicket.ui.screen.home.components.BlurredImage
import com.elhady.cinematicket.ui.screen.home.components.HomePager
import com.elhady.cinematicket.ui.components.MovieInfo
import com.elhady.cinematicket.ui.screen.home.components.BottomBar
import com.elhady.cinematicket.ui.screen.home.components.MovieStatusChips
import com.elhady.cinematicket.ui.screen.home.model.Movie
import com.elhady.cinematicket.ui.theme.CinemaTicketTheme

@Composable
fun HomeScreen(
    movies: List<Movie>
) {
    val pagerState = rememberPagerState(initialPage = 1, pageCount = { movies.size })
    Box {
        BlurredImage(
            modifier = Modifier
                .fillMaxWidth()
                .background(White),
            imageId = painterResource(id = movies[pagerState.currentPage].image)
        )
        LazyColumn(
            modifier = Modifier
                .windowInsetsPadding(WindowInsets.statusBars)
                .padding(top = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item { MovieStatusChips() }
            item { HomePager(pagerState, movies) }
            item { MovieDuration(movieDuration = movies[pagerState.currentPage].duration) }
            item { MovieInfo() }
        }
        BottomBar(modifier = Modifier.align(Alignment.BottomCenter))
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    CinemaTicketTheme {
        HomeScreen(
            movies = listOf(
                Movie(
                    id = 1,
                    name = "Fantastic Beasts: The Secrets of Dumbledore",
                    image = R.drawable.fantastic_beasts,
                    category = listOf("Action", "Horror"),
                    duration = "1h 46m"
                ),
                Movie(
                    id = 2,
                    name = "Dr. Strange in the Multiverse of Madness",
                    image = R.drawable.dr_strange,
                    category = listOf("Action", "Horror"),
                    duration = "1h 46m"
                ),
                Movie(
                    id = 3,
                    name = "Morbius",
                    image = R.drawable.morbius,
                    category = listOf("Action", "Horror"),
                    duration = "1h 46m"
                )
            )
        )
    }
}