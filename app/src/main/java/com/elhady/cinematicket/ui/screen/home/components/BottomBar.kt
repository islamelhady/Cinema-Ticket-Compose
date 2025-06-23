package com.elhady.cinematicket.ui.screen.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elhady.cinematicket.R
import com.elhady.cinematicket.ui.theme.Orange

@Composable
fun BottomBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .padding(horizontal = 24.dp, vertical = 16.dp)
            .fillMaxWidth()
            .background(Color.White),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        BottomNavBarItem(
            icon = painterResource(R.drawable.ic_movie),
            iconTint = Color.White,
            backgroundColor = Orange
        )
        BottomNavBarItem(
            icon = painterResource(R.drawable.search),
            backgroundColor = Color.Transparent
        )
        BadgedBox(
            badge = {
                Badge(
                    modifier = Modifier.offset(y = 12.dp),
                    containerColor = Orange,
                    contentColor = Color.White
                ) {
                    Text("5", fontSize = 12.sp)
                }
            }
        ) {
            BottomNavBarItem(
                icon = painterResource(R.drawable.ticket),
                backgroundColor = Color.Transparent
            )
        }
        BottomNavBarItem(
            modifier = Modifier.Companion,
            icon = painterResource(R.drawable.profile),
            backgroundColor = Color.Transparent
        )
    }
}

@Composable
@Preview
fun BottomBarPreview() {
    BottomBar()
}