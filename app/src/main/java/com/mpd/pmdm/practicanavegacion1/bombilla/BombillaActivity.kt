package com.mpd.pmdm.practicanavegacion1.bombilla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mpd.pmdm.practicanavegacion1.R

class BombillaActivity : AppCompatActivity(), InterruptorBombillaListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bombilla)
    }

    override fun onButtonClick(buttonId: Int) {
        val imgBombillaFragment = supportFragmentManager.findFragmentById(R.id.img_bombilla_fragment) as ImgBombillaFragment
        imgBombillaFragment.actualizarEstadoBombilla(buttonId)
    }
}