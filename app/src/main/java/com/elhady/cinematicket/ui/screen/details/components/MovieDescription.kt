package com.elhady.cinematicket.ui.screen.details.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.R

@Composable
fun MovieDescription(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier
            .padding(horizontal = 20.dp)
            .padding(bottom = 32.dp),
        text = stringResource(R.string.movieDescription),
        style = MaterialTheme.typography.bodyMedium,
        maxLines = 3,
        minLines = 3,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
@Preview
fun MovieDescriptionPreview(){
    MovieDescription()
}