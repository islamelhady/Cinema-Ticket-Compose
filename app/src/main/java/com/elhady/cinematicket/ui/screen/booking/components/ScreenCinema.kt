package com.elhady.cinematicket.ui.screen.booking.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.R
import com.elhady.cinematicket.ui.theme.CinemaTicketTheme

@Composable
fun ScreenCinema(
    modifier: Modifier = Modifier,
    imageRes: Painter = painterResource(id = R.drawable.fantastic_beasts_poster)
) {
    val curvedShape = GenericShape { size, _ ->
        val width = size.width
        val height = size.height
        
        moveTo(
            0f,
            height * 0.12f
        )
        quadraticTo(
            width / 2,
            0f,
            width,
            height * 0.12f
        )
        lineTo(width * 0.9f, height)
        quadraticTo(
            width / 2,
            height * 0.8f,
            width * 0.11f,
            height
        )
        close()
    }

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(horizontal = 16.dp)
            .clip(curvedShape)
    ) {
        Image(
            painter = imageRes,
            contentDescription = "Cinema Screen Content",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0x000000)
@Composable
private fun CinemaScreenPreview() {
    CinemaTicketTheme {
        ScreenCinema()
    }
}
