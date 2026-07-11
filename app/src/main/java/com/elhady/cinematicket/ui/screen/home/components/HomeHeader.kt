package com.elhady.cinematicket.ui.screen.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.ui.components.Chip

@Composable
fun HomeHeader(
    modifier: Modifier = Modifier,
    selectedTab: Int = 0,
    onTabSelected: (Int) -> Unit = {}
) {
    Row(
        modifier = modifier
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
        Chip(
            text = "Now Showing",
            isSelected = selectedTab == 0,
            onClick = { onTabSelected(0) }
        )
        Chip(
            text = "Coming Soon",
            isSelected = selectedTab == 1,
            onClick = { onTabSelected(1) }
        )
    }
}

@Preview
@Composable
fun HomeHeaderPreview() {
    HomeHeader()
}
