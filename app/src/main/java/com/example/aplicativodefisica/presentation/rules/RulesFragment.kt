package com.example.aplicativodefisica.presentation.rules

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.aplicativodefisica.R
import com.example.aplicativodefisica.databinding.FragmentRulesBinding
import com.example.aplicativodefisica.presentation.enum.TypeTest
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RulesFragment : Fragment() {

    private val args by navArgs<RulesFragmentArgs>()

    private var binding: FragmentRulesBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentRulesBinding.inflate(
        inflater,
        container,
        false
    ).apply {
        binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observers()
        setTextRules()
    }

    private fun setTextRules() {
        with(binding?.bodyRules){
            if(args.typeTest == TypeTest.GENERAL.toString()) {
                this?.text = getString(R.string.rules_body_rules)
            } else {
                this?.text = getString(R.string.rules_specific_body_rules)
            }
        }
    }

    private fun observers() {
        binding?.start?.setOnClickListener {
            val directions =
                RulesFragmentDirections.actionRulesFragmentToExercisesFragment(
                    args.typeTest
                )
            findNavController().navigate(directions)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}