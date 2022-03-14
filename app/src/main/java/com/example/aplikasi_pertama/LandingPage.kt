package com.example.aplikasi_pertama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplikasi_pertama.databinding.ActivityLandingPageBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

private lateinit var binding: ActivityLandingPageBinding

class LandingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)

        binding = ActivityLandingPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bmi.setOnClickListener {showBmiPage()}
        binding.logout.setOnClickListener {logout()}
    }

    fun showBmiPage(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun logout(){
        Firebase.auth.signOut()
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}