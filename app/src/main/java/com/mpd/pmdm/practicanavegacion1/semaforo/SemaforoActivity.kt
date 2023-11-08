package com.mpd.pmdm.practicanavegacion1.semaforo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mpd.pmdm.practicanavegacion1.databinding.ActivitySemaforoBinding
import com.mpd.pmdm.practicanavegacion1.semaforo.model.Semaforo

class SemaforoActivity : AppCompatActivity(), BotonSemaforoListener {
    private lateinit var binding: ActivitySemaforoBinding
    private val semaforo = Semaforo()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySemaforoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        if (savedInstanceState == null) {
            //Cargamos el fragmento correspondiente al botón del semáforo
            var fragmentContainer = binding.semaforoBotonFragment
            val semaforoBotonFragment = SemaforoBotonFragment()
            supportFragmentManager
                .beginTransaction() //empezar una transacción
                .add(fragmentContainer.id, semaforoBotonFragment)
                .commit()

            //Cargamos el fragmento del color del semáforo
            fragmentContainer = binding.semaforoColorFragment
            val semaforoColorFragment = SemaforoColorFragment.newInstance(semaforo.color)
            supportFragmentManager
                .beginTransaction() //empezar una transacción
                .add(fragmentContainer.id, semaforoColorFragment)
                .commit()
        }

    }

    /**
     * Actualiza el modelo del Semaforo
     * Reemplaza el fragmento con el color del semaforo anterior por un nuevo fragmento con el nuevo color
     */
    override fun onClickedButton() {
        semaforo.avanzar()
        val semaforoColorFragment = SemaforoColorFragment.newInstance(semaforo.color)
        val semaforoFragmentContainer = binding.semaforoColorFragment
        supportFragmentManager
            .beginTransaction()
            .replace(semaforoFragmentContainer.id, semaforoColorFragment)
            .commit()
    }
}