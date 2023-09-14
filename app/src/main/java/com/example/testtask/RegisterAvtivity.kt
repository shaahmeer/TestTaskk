package com.example.testtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testtask.databinding.ActivityMainBinding
import com.example.testtask.databinding.ActivityRegisterAvtivityBinding

class RegisterAvtivity : AppCompatActivity() {
    private var binding: ActivityRegisterAvtivityBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterAvtivityBinding.inflate(layoutInflater)
        setContentView(binding!!.root)


        binding!!.backbutton.setOnClickListener ({
            val intent = Intent(this@RegisterAvtivity,MainActivity::class.java)
            startActivity(intent)

        })
    }
}