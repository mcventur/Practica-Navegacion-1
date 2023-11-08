package com.mpd.pmdm.practicanavegacion1.semaforo

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mpd.pmdm.practicanavegacion1.databinding.FragmentSemaforoColorBinding

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val COLOR_SEMAFORO = "color_semaforo"

/**
 * A simple [Fragment] subclass.
 * Use the [SemaforoColorFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SemaforoColorFragment : Fragment() {
    private var _binding: FragmentSemaforoColorBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSemaforoColorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        actualizaColorSemaforo()
    }

    private fun actualizaColorSemaforo() {
        //Asignamos el color al semáforo
        val colorSemaforo = arguments?.getInt(COLOR_SEMAFORO) ?: Color.RED
        binding.semaforoLayout.setBackgroundColor(colorSemaforo)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param color El color a aplicar en el semáforo
         * @return A new instance of fragment SemaforoColorFragment.
         */
        @JvmStatic
        fun newInstance(color: Int) =
            SemaforoColorFragment().apply {
                arguments = Bundle().apply {
                    putInt(COLOR_SEMAFORO, color)
                }
            }
    }
}