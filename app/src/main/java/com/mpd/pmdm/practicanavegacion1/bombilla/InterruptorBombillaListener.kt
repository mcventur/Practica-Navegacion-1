package com.mpd.pmdm.practicanavegacion1.bombilla

import androidx.annotation.IdRes

interface InterruptorBombillaListener {
    fun onButtonClick(@IdRes buttonId: Int)
}