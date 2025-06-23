package com.elhady.cinematicket.ui.screen.details.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.cinematicket.R
import com.elhady.cinematicket.ui.components.CircularIcon
import com.elhady.cinematicket.ui.components.MovieDuration
import com.elhady.cinematicket.ui.theme.Grey
import com.elhady.cinematicket.ui.theme.Orange

@Composable
fun HeaderDetails(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(120.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            CircularIcon()
            MovieDuration(
                modifier = Modifier
                    .background(Grey.copy(alpha = 0.6f), shape = CircleShape)
                    .padding(all = 4.dp),
                textColor = White,
                iconTint = Grey,
                textSize = 14.sp,
                iconSize = 24.dp
            )
        }
        CircularIcon(icon = painterResource(id = R.drawable.play), backgroundColor = Orange)
    }
}

@Composable
@Preview
fun HeaderPreview() {
    HeaderDetails()
}
