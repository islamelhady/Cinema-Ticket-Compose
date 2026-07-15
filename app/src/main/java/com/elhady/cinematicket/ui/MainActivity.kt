package com.elhady.cinematicket.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elhady.cinematicket.ui.screen.booking.BookingScreen
import com.elhady.cinematicket.ui.screen.booking.model.days
import com.elhady.cinematicket.ui.screen.booking.model.hours
import com.elhady.cinematicket.ui.theme.CinemaTicketTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CinemaTicketTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BookingScreen(
                        days = days,
                        hours = hours,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CinemaTicketTheme {
        BookingScreen(
            days = days,
            hours = hours
        )
    }
}