package com.example.mypratice_navigation_safeargs_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mypratice_navigation_safeargs_1.databinding.FragmentBBinding
import com.example.mypratice_navigation_safeargs_1.databinding.FragmentDBinding

class FragmentD : Fragment() {
    private lateinit var binding: FragmentDBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentDBinding.inflate(inflater, container, false)

        val navController = findNavController()
        val action = FragmentDDirections.actionFragmentDToFragmentA("GotDataFromD")
        val arg = FragmentDArgs.fromBundle(requireArguments())

        binding.tvDD.text = arg.dataFromSomeWhereD

        binding.button.setOnClickListener {
            navController.navigate(action)
        }

        return binding.root
    }
}