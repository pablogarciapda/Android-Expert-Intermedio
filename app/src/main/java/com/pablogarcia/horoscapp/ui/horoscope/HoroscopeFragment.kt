package com.pablogarcia.horoscapp.ui.horoscope

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pablogarcia.horoscapp.databinding.FragmentHoroscopeBinding


class HoroscopeFragment : Fragment() {

    //Se crea una variable con barrabaja llamada binding y una constante de tipo bindig que llama
    // a la anterior variable _binding
    private var _binding: FragmentHoroscopeBinding? = null

    // on !! le estoy diciendo que no va a ser nulo ya que abajo le asigno un valor seguro
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHoroscopeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}