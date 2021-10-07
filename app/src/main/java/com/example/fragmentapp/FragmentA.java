package com.example.fragmentapp;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentapp.databinding.FragmentABinding;


public class FragmentA extends Fragment {

    public FragmentA() {
    }

    MainActivityViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentABinding binding= DataBindingUtil.inflate(inflater,R.layout.fragment_a, container, false);
        viewModel = new ViewModelProvider(requireActivity()).get(MainActivityViewModel.class);

        binding.btnFragmentB.setOnClickListener(v -> {
            viewModel.setText(binding.editTextTextPersonName.getText().toString());
            ((MainActivity)getActivity()).replaceFragments();
        });

        return binding.getRoot();
    }
}