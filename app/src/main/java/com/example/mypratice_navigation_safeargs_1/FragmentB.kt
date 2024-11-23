package com.example.mypratice_navigation_safeargs_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mypratice_navigation_safeargs_1.databinding.FragmentABinding
import com.example.mypratice_navigation_safeargs_1.databinding.FragmentBBinding

class FragmentB : Fragment() {
    private lateinit var binding: FragmentBBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,avedInstanceState: Bundle?): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)

        val navController = findNavController()
        val action = FragmentBDirections.actionFragmentBToFragmentC("GotDataFromB")
        val arg = FragmentBArgs.fromBundle(requireArguments())

        binding.tvBB.text = arg.dataFromSomeWhereB

        binding.button.setOnClickListener {
            navController.navigate(action)
        }

        return binding.root
    }
}