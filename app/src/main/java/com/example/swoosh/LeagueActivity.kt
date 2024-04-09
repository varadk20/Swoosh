package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.swoosh.databinding.ActivityMainBinding

class LeagueActivity : Baseactivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_league) // Set content view here
    }

    fun leagueNextClicked(view: View){
        val skillActivity = Intent(this, SkillActivity::class.java)
        startActivity(skillActivity)

    }
}