package com.example.aplicativodefisica.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.aplicativodefisica.databinding.FragmentSelectionBinding

//@AndroidEntryPoint
class SelectionFragment : Fragment() {

    private var binding: FragmentSelectionBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentSelectionBinding.inflate(
        inflater,
        container,
        false
    ).apply {
        binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.option1?.setOnClickListener {
            val directions = SelectionFragmentDirections.actionSelectionFragmentToRulesFragment()
            findNavController().navigate(directions)
        }
        binding?.option2?.setOnClickListener {
            val directions = SelectionFragmentDirections.actionSelectionFragmentToSpecificFragment()
            findNavController().navigate(directions)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}