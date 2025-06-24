package com.elhady.cinematicket.ui.screen.booking.model

data class Hours(
    val id: Int,
    val hour: String,
    val isSelected: Boolean,
)

val hours = listOf(
    Hours(hour = "10:00", isSelected = true, id = 1),
    Hours(hour = "11:00", isSelected = false, id = 2),
    Hours(hour = "12:00", isSelected = false, id = 3),
    Hours(hour = "13:00", isSelected = false, id = 4),
    Hours(hour = "14:00", isSelected = false, id = 5),
    Hours(hour = "15:00", isSelected = false, id = 6),
    Hours(hour = "16:00", isSelected = false, id = 7),
)
