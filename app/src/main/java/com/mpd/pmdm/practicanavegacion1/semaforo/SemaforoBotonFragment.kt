package com.mpd.pmdm.practicanavegacion1.semaforo

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mpd.pmdm.practicanavegacion1.R
import com.mpd.pmdm.practicanavegacion1.databinding.FragmentSemaforoBotonesBinding


/**
 * A simple [Fragment] subclass.
 */
class SemaforoBotonFragment : Fragment() {
    var _binding: FragmentSemaforoBotonesBinding? = null
    val binding get() = _binding!!
    private lateinit var botonListener: BotonSemaforoListener

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(activity is BotonSemaforoListener)
            botonListener = activity as BotonSemaforoListener
        else throw RuntimeException("Must implement BotonSemaforoListener")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSemaforoBotonesBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCambiarColor.setOnClickListener {
            botonListener.onClickedButton()
        }
    }

}