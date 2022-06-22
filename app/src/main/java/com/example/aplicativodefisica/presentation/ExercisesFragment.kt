package com.example.aplicativodefisica.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.aplicativodefisica.databinding.FragmentExercisesBinding

//@AndroidEntryPoint
class ExercisesFragment : Fragment() {

    private var binding: FragmentExercisesBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentExercisesBinding.inflate(
        inflater,
        container,
        false
    ).apply {
        binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.exercisesOption1?.setOnClickListener {
            val directions = ExercisesFragmentDirections.actionRulesFragmentToResultsFragment()
            findNavController().navigate(directions)
        }
        binding?.exercisesOption2?.setOnClickListener {
            val directions = ExercisesFragmentDirections.actionRulesFragmentToResultsFragment()
            findNavController().navigate(directions)
        }
        binding?.exercisesOption3?.setOnClickListener {
            val directions = ExercisesFragmentDirections.actionRulesFragmentToResultsFragment()
            findNavController().navigate(directions)
        }
        binding?.exercisesOption4?.setOnClickListener {
            val directions = ExercisesFragmentDirections.actionRulesFragmentToResultsFragment()
            findNavController().navigate(directions)
        }
        binding?.exercisesOption5?.setOnClickListener {
            val directions = ExercisesFragmentDirections.actionRulesFragmentToResultsFragment()
            findNavController().navigate(directions)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}