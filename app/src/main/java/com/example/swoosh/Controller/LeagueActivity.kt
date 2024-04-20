package com.example.swoosh.Controller
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.Utilities.EXTRA_PLAYER
import com.example.swoosh.databinding.ActivityLeagueBinding

class LeagueActivity : Baseactivity(){
    lateinit var binding: ActivityLeagueBinding

    var player = Player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeagueBinding.inflate(layoutInflater)
        setContentView(binding.root) // Set content view here

//        setContentView(R.layout.activity_league)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
    }



    fun onMensClicked(view:View) {
        binding.WomensLeagueBtn.isChecked=false
        binding.CoedLeagueBtn.isChecked = false

        player.league = "mens"
    }
    fun onWomensClicked(view:View) {
        binding.menLeagueBtn.isChecked = false
        binding.CoedLeagueBtn.isChecked = false

        player.league = "womens"
    }
    fun onCoedClicked(view:View) {
        binding.menLeagueBtn.isChecked = false
        binding.WomensLeagueBtn.isChecked=false
        player.league = "coed"
    }

    fun leagueNextClicked(view: View){
        if (player.league!=""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        }
        else{
            Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show()
        }


    }
}