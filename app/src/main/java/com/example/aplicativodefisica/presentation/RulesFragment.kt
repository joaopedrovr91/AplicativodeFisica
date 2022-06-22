package com.example.aplicativodefisica.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.aplicativodefisica.databinding.FragmentRulesBinding

//@AndroidEntryPoint
class RulesFragment : Fragment() {

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
        binding?.start?.setOnClickListener {
            val directions = RulesFragmentDirections.actionRulesFragmentToExercisesFragment()
            findNavController().navigate(directions)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}