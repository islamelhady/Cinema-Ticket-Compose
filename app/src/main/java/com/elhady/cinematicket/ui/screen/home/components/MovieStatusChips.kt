package com.elhady.cinematicket.ui.screen.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.ui.components.Chip
import com.elhady.cinematicket.ui.theme.Orange

@Composable
fun MovieStatusChips(
    modifier: Modifier = Modifier.Companion
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Chip(
            tag = "Now Showing",
            borderWidth = 0.dp,
            textColor = Color.Companion.White,
            backgroundColor = Orange,
        )
        Chip(
            tag = "Coming Soon",
        )
    }
}

@Composable
@Preview
fun MovieStatusChipsPreview() {
    MovieStatusChips()
}