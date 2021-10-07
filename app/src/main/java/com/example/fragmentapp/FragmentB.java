package com.example.fragmentapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentapp.databinding.FragmentBBinding;


public class FragmentB extends Fragment {

    public FragmentB() {
    }

    MainActivityViewModel viewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentBBinding binding= DataBindingUtil.inflate(inflater,R.layout.fragment_b, container, false);
        viewModel=new ViewModelProvider(requireActivity()).get(MainActivityViewModel.class);
        binding.txtText.setText(viewModel.getText());

        binding.btnSecondActivity.setOnClickListener(v -> {
            Intent intent=new Intent(getActivity(),SecondActivity.class);
            startActivity(intent);
        });

        return binding.getRoot();
    }
}