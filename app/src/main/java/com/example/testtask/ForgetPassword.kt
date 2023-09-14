package com.example.testtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testtask.databinding.ActivityForgetPasswordBinding

class ForgetPassword : AppCompatActivity() {
    private var binding : ActivityForgetPasswordBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgetPasswordBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        binding!!.backbutton.setOnClickListener ({

          val intent = Intent(this@ForgetPassword,MainActivity::class.java)
          startActivity(intent)

      })
    }


}