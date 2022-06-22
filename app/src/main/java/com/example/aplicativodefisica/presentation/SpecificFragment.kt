package com.example.aplicativodefisica.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.aplicativodefisica.databinding.FragmentSpecificContentBinding

//@AndroidEntryPoint
class SpecificFragment : Fragment() {

    private var binding: FragmentSpecificContentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentSpecificContentBinding.inflate(
        inflater,
        container,
        false
    ).apply {
        binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.specificEnergy?.setOnClickListener {
            direction("Energy")
        }
        binding?.specificMechanics?.setOnClickListener {
            direction("Mechanics")
        }
        binding?.specificElectricity?.setOnClickListener {
            direction("Electricity")
        }
        binding?.specificOptics?.setOnClickListener {
            direction("Optics")
        }
        binding?.specificThermophysics?.setOnClickListener {
            direction("Thermophysics")
        }
        binding?.specificNewtonsLaws?.setOnClickListener {
            direction("NewtonsLaws")
        }
        binding?.specificCurrentsandPower?.setOnClickListener {
            direction("CurrentsandPower")
        }
        binding?.specificWavePhenomena?.setOnClickListener {
            direction("WavePhenomena")
        }
    }
    private fun direction(extra: String) {
        val directions = SpecificFragmentDirections.actionSpecificFragmentToRulesFragment()
        findNavController().navigate(directions)
        print(extra)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}