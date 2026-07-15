package com.elhady.cinematicket.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MovieCategories() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Chip(tag = "Fantasy")
        Chip(tag = "Adventure")
    }
}

@Composable
@Preview
fun MovieCategoriesPreview() {
    MovieCategories()
}