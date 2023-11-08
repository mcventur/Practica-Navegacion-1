package com.mpd.pmdm.practicanavegacion1.bombilla

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mpd.pmdm.practicanavegacion1.databinding.FragmentBotonesBombillaBinding

/**
 * A simple [Fragment] subclass.
 */
class BotonesBombillaFragment : Fragment() {

    private lateinit var interruptorListener: InterruptorBombillaListener
    private var _binding : FragmentBotonesBombillaBinding? = null
    private val binding get() = _binding!!
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(activity is InterruptorBombillaListener){
            interruptorListener = activity as InterruptorBombillaListener
        }
        else{
            throw RuntimeException("Must implement InterruptorBombillaListener")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBotonesBombillaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnEncender.setOnClickListener {
            botonPulsado(it)
            binding.btnApagar.isEnabled = true
        }
        binding.btnApagar.setOnClickListener {
            botonPulsado(it)
            binding.btnEncender.isEnabled = true
        }
    }

    private fun botonPulsado(it: View) {
        interruptorListener.onButtonClick(it.id)
        it.isEnabled = !it.isEnabled
    }


}