package com.example.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.Model.Player
import com.example.swoosh.Utilities.EXTRA_PLAYER
import com.example.swoosh.databinding.ActivityFinishBinding


class FinishActivity : AppCompatActivity() {

    lateinit var binding:ActivityFinishBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!

        binding.searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."

    }
}