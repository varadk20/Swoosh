package com.example.swoosh.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.Utilities.EXTRA_PLAYER
import com.example.swoosh.databinding.ActivitySkillBinding

class SkillActivity : AppCompatActivity() {
    lateinit var binding: ActivitySkillBinding

    lateinit var player:Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySkillBinding.inflate(layoutInflater)
        setContentView(binding.root) // Set content view here

        player = intent.getParcelableExtra(EXTRA_PLAYER)!!
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
    }


    fun onBallerClicked(view: View){
        binding.begineerSkillBtn.isChecked = false
        player.skill="baller"
    }

    fun onBegineerClicked(view: View){
        binding.ballerBtnClicked.isChecked = false
        player.skill="begineer"
    }

    fun onSkillFinishedClicked(view: View){
        if (player.skill!=""){
            val finishActivity =Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }

        else{
            Toast.makeText(this,"Please select a skill level.", Toast.LENGTH_SHORT).show()
        }
    }

}