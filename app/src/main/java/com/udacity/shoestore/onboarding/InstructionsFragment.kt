package com.udacity.shoestore.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentInstructionsBinding

class InstructionsFragment : Fragment() {

    private lateinit var binding: FragmentInstructionsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_instructions, container, false)

        binding.button3.setOnClickListener {
            completeOnboarding()
        }

        return binding.root
    }

    private fun completeOnboarding(){
        val action = InstructionsFragmentDirections.actionInstructionsFragmentToShoeListFragment()
        findNavController().navigate(action)
    }
}