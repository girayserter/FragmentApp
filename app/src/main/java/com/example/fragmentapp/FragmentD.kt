package com.example.fragmentapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.fragmentapp.databinding.FragmentCBinding
import com.example.fragmentapp.databinding.FragmentDBinding

class FragmentD : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val viewModel:SecondActivityViewModel by activityViewModels()
        val binding : FragmentDBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_d,container,false)
        binding.txtPassedText.text=viewModel.text

        return binding.root
    }

}