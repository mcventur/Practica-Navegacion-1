package com.mpd.pmdm.practicanavegacion1.bombilla

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.IdRes
import com.mpd.pmdm.practicanavegacion1.R
import com.mpd.pmdm.practicanavegacion1.databinding.FragmentImgBombillaBinding

/**
 * A simple [Fragment] subclass.
 */
class ImgBombillaFragment : Fragment() {

    var _binding: FragmentImgBombillaBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentImgBombillaBinding.inflate(inflater, container, false)
        return binding.root
    }

    /**
     * Actualiza la imagen de la bombilla a partir del id del botón pulsado recibido
     */
    fun actualizarEstadoBombilla(@IdRes botonPulsado: Int){
        val imgBombillaResource = when(botonPulsado){
            R.id.btn_encender -> R.drawable.encendida
            else -> R.drawable.apagada
        }

        binding.imgBombilla.setImageResource(imgBombillaResource)
    }
}