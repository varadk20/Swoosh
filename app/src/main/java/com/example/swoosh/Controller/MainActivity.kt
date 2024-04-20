package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.example.swoosh.databinding.ActivityMainBinding

class MainActivity : Baseactivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // Set content view here

        binding.getStartedbutton.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }

    }
}