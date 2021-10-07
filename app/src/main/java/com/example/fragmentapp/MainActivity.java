package com.example.fragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.fragmentapp.databinding.ActivityMainBinding;
import com.example.fragmentapp.databinding.FragmentABinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fragment_container_view,FragmentA.class,null)
                .commit();
    }

    public void replaceFragments(){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container_view,FragmentB.class, null)
                .setReorderingAllowed(true)
                .addToBackStack(null)
                .commit();
    }


}