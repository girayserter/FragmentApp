package com.example.fragmentapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.fragmentapp.databinding.FragmentCBinding

class FragmentC : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?
    {
        val viewModel:SecondActivityViewModel by activityViewModels()
        val binding : FragmentCBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_c,container,false)
        binding.btnFragmentD.setOnClickListener{
            viewModel.text=binding.txtPassText.text.toString()
            val action = FragmentCDirections.actionFragmentCToFragmentD()
            findNavController().navigate(action)
        }

        return binding.root
    }
}