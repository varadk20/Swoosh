package com.example.swoosh.Controller
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.databinding.ActivityLeagueBinding

class LeagueActivity : Baseactivity(){
    lateinit var binding: ActivityLeagueBinding

    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeagueBinding.inflate(layoutInflater)
        setContentView(binding.root) // Set content view here

//        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view:View) {
        binding.WomensLeagueBtn.isChecked=false
        binding.CoedLeagueBtn.isChecked = false

        selectedLeague = "mens"
    }
    fun onWomensClicked(view:View) {
        binding.menLeagueBtn.isChecked = false
        binding.CoedLeagueBtn.isChecked = false

        selectedLeague = "womens"
    }
    fun onCoedClicked(view:View) {
        binding.menLeagueBtn.isChecked = false
        binding.WomensLeagueBtn.isChecked=false
        selectedLeague = "coed"
    }

    fun leagueNextClicked(view: View){
        if (selectedLeague!=""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        }
        else{
            Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show()
        }


    }
}