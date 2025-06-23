package com.elhady.cinematicket.ui.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.cinematicket.R
import com.elhady.cinematicket.ui.components.Chip
import com.elhady.cinematicket.ui.components.MovieDuration
import com.elhady.cinematicket.ui.screen.home.components.BlurredImage
import com.elhady.cinematicket.ui.screen.home.components.BottomNavBarItem
import com.elhady.cinematicket.ui.screen.home.components.HomePager
import com.elhady.cinematicket.ui.screen.home.components.MovieName
import com.elhady.cinematicket.ui.screen.home.model.Movie
import com.elhady.cinematicket.ui.theme.Orange

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
            item {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Chip(
                        text = "Now Showing",
                        borderWidth = 0.dp,
                        textColor = White,
                        backgroundColor = Orange,
                    )
                    Chip(
                        text = "Coming Soon",
                    )
                }
            }
            item {
                HomePager(pagerState, movies)
            }
            item {
                MovieDuration(
                    movieDuration = movies[pagerState.currentPage].duration,
                    textSize = 16.sp,
                    iconSize = 24.dp
                )
            }
            item {
                MovieName(movieName = movies[pagerState.currentPage].name)
            }
            item {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Chip(
                        text = "Action",
                    )
                    Chip(
                        text = "Horror",
                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .padding(horizontal = 24.dp, vertical = 16.dp)
                .fillMaxWidth()
                .background(White)
                .align(Alignment.BottomCenter),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BottomNavBarItem(
                icon = painterResource(R.drawable.ic_movie),
                iconTint = White,
                backgroundColor = Orange
            )
            BottomNavBarItem(
                icon = painterResource(R.drawable.search),
                backgroundColor = Color.Transparent
            )
            BadgedBox(
                badge = {
                    Badge(
                        modifier = Modifier.offset(y = 12.dp),
                        containerColor = Orange,
                        contentColor = White
                    ) {
                        Text("5", fontSize = 12.sp)
                    }
                }
            ) {
                BottomNavBarItem(
                    icon = painterResource(R.drawable.ticket),
                    backgroundColor = Color.Transparent
                )
            }
            BottomNavBarItem(
                modifier = Modifier,
                icon = painterResource(R.drawable.profile),
                backgroundColor = Color.Transparent
            )
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
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