package com.mpd.pmdm.practicanavegacion1.semaforo.model

import android.graphics.Color

class Semaforo {
    private var color: Int = Color.RED
        get() = field

    fun avanzar(){
        color = when(color){
            Color.RED -> Color.YELLOW
            Color.YELLOW -> Color.GREEN
            else -> Color.RED
        }
    }

}