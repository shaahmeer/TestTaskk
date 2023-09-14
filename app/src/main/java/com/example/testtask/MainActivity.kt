package com.example.testtask
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import com.example.testtask.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intent()
        login()




    }

    fun login() {
        binding.loginButton.setOnClickListener {
            val enteredEmail = binding.Email.text.toString()
            val enteredPassword = binding.editTextText.text.toString()

            if (enteredEmail == "123@gmail.com" && enteredPassword == "1234") {
                showToast("Login successful")

                    val intent = Intent(this@MainActivity,MainHomeScreen::class.java)
                    startActivity(intent)


            } else {
                showToast("Login failed. Please check your email and password.")
            }
        }
    }


    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


    fun intent(){
        binding.Signup.setOnClickListener ({
            val intent = Intent(this@MainActivity,RegisterAvtivity::class.java)
            startActivity(intent)

        })

        binding.forgotpassword.setOnClickListener({
            val intent = Intent(this@MainActivity,ForgetPassword::class.java)
            startActivity(intent)
        })





    }
}