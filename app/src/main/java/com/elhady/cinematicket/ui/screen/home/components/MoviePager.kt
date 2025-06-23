package com.elhady.cinematicket.ui.screen.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import com.elhady.cinematicket.R
import com.elhady.cinematicket.ui.theme.CinemaTicketTheme
import kotlin.math.absoluteValue

@Composable
fun MoviePager(
    modifier: Modifier = Modifier,
    pagerState: PagerState
) {
    HorizontalPager(
        state = pagerState,
        modifier = modifier
            .fillMaxWidth()
            .height(400.dp),
        contentPadding = PaddingValues(horizontal = 64.dp),
        pageSpacing = 16.dp,
        verticalAlignment = Alignment.CenterVertically
    ) { page ->
        Card(
            modifier = Modifier
                .graphicsLayer {
                    val pageOffset = (
                            (pagerState.currentPage - page) + pagerState.currentPageOffsetFraction
                            ).absoluteValue
                    alpha = lerp(
                        start = 0.5f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    )
                    scaleY = lerp(
                        start = 0.8f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    )
                },
            shape = RoundedCornerShape(32.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
        ) {
            val imageRes = when (page % 3) {
                0 -> R.drawable.dr_strange
                1 -> R.drawable.morbius
                else -> R.drawable.fantastic_beasts
            }
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MoviePagerPreview() {
    CinemaTicketTheme {
        MoviePager(pagerState = rememberPagerState { 3 })
    }
}
