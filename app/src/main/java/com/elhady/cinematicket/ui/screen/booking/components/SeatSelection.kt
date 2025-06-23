package com.elhady.cinematicket.ui.screen.booking.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.ui.theme.Orange

@Composable
fun SeatSelection(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            // Left Seats
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                repeat(5) { rowIndex ->
                    val color1 = if (rowIndex == 4) Color.DarkGray else Color.White
                    val color2 = if (rowIndex == 2 || rowIndex == 0) Color.DarkGray else Color.White
                    SeatPair(
                        color1 = color1,
                        color2 = color2,
                        modifier = Modifier.graphicsLayer { rotationZ = 10f }
                    )
                }
            }

            // Middle Seats
            Column(
                modifier = Modifier.padding(top = 8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                repeat(5) { rowIndex ->
                    val color1 =
                        if (rowIndex == 1 || rowIndex == 2) Orange else if (rowIndex == 3) Color.DarkGray else Color.White
                    val color2 =
                        if (rowIndex == 1 || rowIndex == 2) Orange else if (rowIndex == 3) Color.DarkGray else Color.White
                    SeatPair(color1, color2)
                }
            }

            // Right Seats
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                repeat(5) { rowIndex ->
                    val color1 =
                        if (rowIndex == 0 || rowIndex == 2 || rowIndex == 4) Color.DarkGray else Color.White
                    val color2 =
                        if (rowIndex == 0 || rowIndex == 2 || rowIndex == 4) Color.DarkGray else Color.White
                    SeatPair(
                        color1 = color1,
                        color2 = color2,
                        modifier = Modifier.graphicsLayer { rotationZ = -10f }
                    )
                }
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            SeatLegend(text = "Available", color = Color.White)
            SeatLegend(text = "Taken", color = Color.DarkGray)
            SeatLegend(text = "Selected", color = Orange)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SeatSelectionPreview() {
    SeatSelection()
}

