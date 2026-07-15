package com.elhady.cinematicket.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.R
import com.elhady.cinematicket.ui.theme.Orange

@Composable
fun BookingButton(
    text: String = "Buy tickets"
) {
    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(containerColor = Orange),
        shape = CircleShape
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 12.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Icon(
                modifier = Modifier.size(32.dp),
                painter = painterResource(R.drawable.credit),
                contentDescription = null
            )
            Text(text = text, style = MaterialTheme.typography.bodyLarge)
        }
    }
}

@Composable
@Preview
fun BookingButtonPreview() {
    BookingButton()
}