package com.example.final0.ui.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.final0.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public TextView txt;
    public int waterNum = 0;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });

//        text(root);

        return root;
    }
/*
    @SuppressLint("WrongViewCast")
    public void btnUp(View view) {
        Button button = (Button) view.findViewById(R.id.btnUp);
        txt = (TextView) view.findViewById(R.id.txtWater);
        waterNum++;
        String changed = "You have drinked " + waterNum + " bottle of water for today.";
        txt.setText(changed);
    }

    @SuppressLint("WrongViewCast")
    public void text(View view) {
        txt = (TextView) view.findViewById(R.id.txtWater);
        String water = "You have drinked " + waterNum + " bottle of water for today.";
        txt.setText(water);
    }

 */
}