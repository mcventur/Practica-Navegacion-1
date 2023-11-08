package com.mpd.pmdm.practicanavegacion1.bombilla.model

class Bombilla{
    private var encendida: Boolean
    //Constructor. Por defecto apagada
    init {
        encendida = false
    }

    fun encender() {
        encendida = true
    }

    fun apagar(){
        encendida = false
    }

    fun estaEncendida():Boolean{
        return encendida
    }

}