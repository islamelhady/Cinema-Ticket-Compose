package com.elhady.cinematicket.ui.screen.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.R
import com.elhady.cinematicket.ui.theme.Orange

@Composable
fun BottomNavBarItem(
    modifier: Modifier = Modifier,
    icon: Painter,
    iconTint: Color = Color.Black,
    backgroundColor: Color,
) {
    Icon(
        modifier = modifier
            .background(backgroundColor, shape = CircleShape)
            .padding(12.dp)
            .size(32.dp),
        painter = icon,
        contentDescription = "Bottom Nav Bar Item",
        tint = iconTint
    )
}

@Preview
@Composable
private fun BottomBarItemPreview() {
    BottomNavBarItem(
        icon = painterResource(R.drawable.ic_movie),
        iconTint = Color.White,
        backgroundColor = Orange
    )
}
