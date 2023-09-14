package com.example.testtask.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.testtask.R
import com.example.testtask.model.HotelItem
import com.example.testtask.model.ItemsViewModel


    class HotelViewModelFactory : ViewModel() {
        private val hotellist = ArrayList<HotelItem>()

        init {
            // Initialize your ticketList with data here
            for (i in 1..20) {
                hotellist.add(HotelItem(R.drawable.hotel1,4.5f,"Las Vegas","this is the best hotel in the country"))
            }
        }

        fun gethotelticket(): List<HotelItem> {
            return hotellist
        }
    }