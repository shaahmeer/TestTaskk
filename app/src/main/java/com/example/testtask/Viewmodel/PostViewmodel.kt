package com.example.testtask.Viewmodel

import androidx.lifecycle.ViewModel
import com.example.testtask.R
import com.example.testtask.model.HotelItem
import com.example.testtask.model.Postmodel

class PostViewmodel : ViewModel() {

    private val postlist = ArrayList<Postmodel>()

    init {
        // Initialize your ticketList with data here
        for (i in 1..20) {
            postlist.add(
                Postmodel(
                    R.drawable.postbackground,
                    R.drawable.profileimage,
                    "Maryam",
                    "i like this place and i enjoyed there alot",
                    R.drawable.like,
                    R.drawable.dislike,
                    80,
                    5
                )
            )
            postlist.add(
                Postmodel(
                    R.drawable.postbackground,
                    R.drawable.profileimage,
                    "Maryam",
                    "i like this place and i enjoyed there alot",
                    R.drawable.like,
                    R.drawable.dislike,
                    80,
                    5
                )
            )


        }
    }

    fun getpost(): ArrayList<Postmodel> {
        return postlist
    }
}