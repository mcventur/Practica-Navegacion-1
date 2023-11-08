package com.mpd.pmdm.practicanavegacion1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mpd.pmdm.practicanavegacion1.bombilla.BombillaActivity
import com.mpd.pmdm.practicanavegacion1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAppBombilla.setOnClickListener {
            val appBombillaIntent = Intent(this, BombillaActivity::class.java)
            startActivity(appBombillaIntent)
        }
    }
}