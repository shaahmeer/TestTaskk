package com.example.testtask

import RecycleViewhotel
import TicketViewModel
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testtask.Viewmodel.PostViewmodel
import com.example.testtask.adapter.PostRecycle
import com.example.testtask.adapter.RecycleviewTicket
import com.example.testtask.databinding.ActivityMainHomeScreenBinding
import com.example.testtask.viewmodel.HotelViewModelFactory
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout


class MainHomeScreen : AppCompatActivity() {
    private lateinit var binding: ActivityMainHomeScreenBinding
    private lateinit var adapterhotel: RecycleViewhotel
    private lateinit var adapter: RecycleviewTicket
    private lateinit var adapterpost: PostRecycle
    private lateinit var postviewmodel: PostViewmodel
    private lateinit var ticketViewModel: TicketViewModel
    private lateinit var hotelviewmodel: HotelViewModelFactory
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainHomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.drawerLayout)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)





        Ticketbinding()
        HotelBinding()
        PostBinding()
    }

    private fun setSupportActionBar(toolbar: DrawerLayout) {

    }

    fun PostBinding() {
        binding.recycleview.setHasFixedSize(true)


        postviewmodel = ViewModelProvider(this).get(PostViewmodel::class.java)


        val postlist = postviewmodel.getpost()
        adapterpost = PostRecycle(postlist)

        binding.postrecycle.adapter = adapterpost
        binding.postrecycle.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        nav()
    }

    fun HotelBinding() {
        binding.recycleview.setHasFixedSize(true)

        hotelviewmodel = ViewModelProvider(this).get(HotelViewModelFactory::class.java)

        val hotellist = hotelviewmodel.gethotelticket()
        adapterhotel = RecycleViewhotel(hotellist)

        binding.recycleviewhotel.adapter = adapterhotel
        binding.recycleviewhotel.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

    fun Ticketbinding() {
        binding.recycleview.setHasFixedSize(true)

        ticketViewModel = ViewModelProvider(this).get(TicketViewModel::class.java)

        val ticketList = ticketViewModel.getTickets()

        adapter = RecycleviewTicket(ticketList)

        binding.recycleview.adapter = adapter
        binding.recycleview.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

    fun nav() {
        toggle = ActionBarDrawerToggle(this, binding.drawerLayout, R.string.open, R.string.close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        binding.navbutton.setOnClickListener {

            binding.drawerLayout.openDrawer(GravityCompat.START)
        }
    }

}
