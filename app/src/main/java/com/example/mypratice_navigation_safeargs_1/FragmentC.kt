package com.example.mypratice_navigation_safeargs_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mypratice_navigation_safeargs_1.databinding.FragmentBBinding
import com.example.mypratice_navigation_safeargs_1.databinding.FragmentCBinding

class FragmentC : Fragment() {
    private lateinit var binding: FragmentCBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentCBinding.inflate(inflater, container, false)

        val navController = findNavController()
        val action = FragmentCDirections.actionFragmentCToFragmentD("GotDataFromC")
        val arg = FragmentCArgs.fromBundle(requireArguments())

        binding.tvCC.text = arg.dataFromSomeWhereC

        binding.button.setOnClickListener {
            navController.navigate(action)
        }
        return binding.root
    }
}