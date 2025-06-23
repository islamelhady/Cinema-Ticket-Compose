package com.elhady.cinematicket.ui.screen.details.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.elhady.cinematicket.R

@Composable
fun BannerImage() {
    Image(
        modifier = Modifier
            .fillMaxWidth(),
        painter = painterResource(id = R.drawable.fantastic_beasts),
        contentDescription = "Movie Banner",
        contentScale = ContentScale.FillBounds,
    )
}

@Composable
@Preview
fun BannerImagePreview() {
    BannerImage()
}