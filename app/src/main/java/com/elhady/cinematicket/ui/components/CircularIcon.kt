package com.elhady.cinematicket.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.R
import com.elhady.cinematicket.ui.theme.Grey

@Composable
fun CircularIcon(
    modifier: Modifier = Modifier,
    icon: Painter = painterResource(id = R.drawable.close),
    backgroundColor: Color = Grey.copy(alpha = 0.8f)
) {
    Icon(
        modifier = modifier
            .windowInsetsPadding(WindowInsets.statusBars)
            .clip(CircleShape)
            .background(backgroundColor)
            .clickable(onClick = {})
            .padding(8.dp)
            .size(28.dp),
        painter = icon,
        contentDescription = null,
        tint = Color.White,
    )
}

@Composable
@Preview
fun CircularIconPreview() {
    CircularIcon()
}