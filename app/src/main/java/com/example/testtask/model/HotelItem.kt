package com.example.testtask.model

import androidx.lifecycle.ViewModel

data class HotelItem(
    val itemImage: Int,
    val itemRating: Float,
    val itemHeading: String,
    val itemDescription: String
) : ViewModel()