package com.example.swoosh.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_SKILL
import com.example.swoosh.databinding.ActivityLeagueBinding
import com.example.swoosh.databinding.ActivitySkillBinding

class SkillActivity : AppCompatActivity() {
    lateinit var binding: ActivitySkillBinding

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySkillBinding.inflate(layoutInflater)
        setContentView(binding.root) // Set content view here

        val league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBallerClicked(view: View){
        binding.begineerSkillBtn.isChecked = false
        skill="baller"
    }

    fun onBegineerClicked(view: View){
        binding.ballerBtnClicked.isChecked = false
        skill="begineer"
    }

    fun onSkillFinishedClicked(view: View){
        if (skill!=""){
            val finishActivity =Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,skill)
            startActivity(finishActivity)
        }

        else{
            Toast.makeText(this,"Please select a skill level.", Toast.LENGTH_SHORT).show()
        }
    }

}