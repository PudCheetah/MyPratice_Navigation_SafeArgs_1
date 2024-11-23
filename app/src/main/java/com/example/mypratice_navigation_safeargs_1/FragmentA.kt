package com.example.mypratice_navigation_safeargs_1

import android.R
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.mypratice_navigation_safeargs_1.databinding.FragmentABinding

class FragmentA : Fragment() {
    private lateinit var binding: FragmentABinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentABinding.inflate(inflater, container, false)

        val navController = findNavController()
        val action = FragmentADirections.actionFragmentAToFragmentB("GotDataFromA")

        try {
            val arg = FragmentAArgs.fromBundle(requireArguments())
            binding.tvAA.text = arg.dataFromSomeWhereA
        }catch(e: Exception){

        }
        
        binding.button.setOnClickListener {
            navController.navigate(action)
        }
        return binding.root
    }
}