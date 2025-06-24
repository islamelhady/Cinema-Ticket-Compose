package com.elhady.cinematicket.ui.screen.booking.model

data class Day(
    val id: Int,
    val dayName: String,
    val dayNum: Int,
    val isSelected: Boolean
)

val days = listOf(
    Day(dayNum = 14, dayName = "Thu", isSelected = false, id = 1),
    Day(dayNum = 15, dayName = "Fri", isSelected = true, id = 2),
    Day(dayNum = 16, dayName = "Sat", isSelected = false, id = 3),
    Day(dayNum = 17, dayName = "Sun", isSelected = false, id = 4),
    Day(dayNum = 18, dayName = "Mon", isSelected = false, id = 5),
    Day(dayNum = 19, dayName = "Tue", isSelected = false, id = 6),
    Day(dayNum = 20, dayName = "Wed", isSelected = false, id = 7),
    Day(dayNum = 21, dayName = "Thu", isSelected = false, id = 8),
)