package com.example.aplicativodefisica.presentation.specific

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.aplicativodefisica.databinding.FragmentSpecificContentBinding
import com.example.aplicativodefisica.presentation.enum.TypeTest
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
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
        observers()
    }

    private fun observers() {
        binding?.specificEnergy?.setOnClickListener {
            direction(TypeTest.ENERGY)
        }
        binding?.specificMechanics?.setOnClickListener {
            direction(TypeTest.MECHANICS)
        }
        binding?.specificElectricity?.setOnClickListener {
            direction(TypeTest.ELECTRICITY)
        }
        binding?.specificOptics?.setOnClickListener {
            direction(TypeTest.OPTICS)
        }
        binding?.specificThermophysics?.setOnClickListener {
            direction(TypeTest.THERMOPHYSICS)
        }
        binding?.specificNewtonsLaws?.setOnClickListener {
            direction(TypeTest.NEWTONSLAWS)
        }
        binding?.specificCurrentsandPower?.setOnClickListener {
            direction(TypeTest.CURRENTSANDPOWER)
        }
        binding?.specificWavePhenomena?.setOnClickListener {
            direction(TypeTest.WAVEPHENOMENA)
        }
    }

    private fun direction(extra: TypeTest) {
        val directions =
            SpecificFragmentDirections.actionSpecificFragmentToRulesFragment(
                extra.toString()
            )
        findNavController().navigate(directions)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}