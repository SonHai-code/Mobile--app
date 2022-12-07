package com.example.quizapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.quizapp.databinding.FragmentHomeBinding;

import java.util.Objects;


public class HomeFragment extends Fragment implements View.OnClickListener {

    private FragmentHomeBinding binding;
    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        HomeActivity mHomeActivity = (HomeActivity) getActivity();

        assert mHomeActivity != null;
        String mUserName = mHomeActivity.getUserName().toString();
        binding.textView3.setText("Hi" + " " + mUserName);

        binding.cvMath.setOnClickListener(this);
        binding.cvGeography.setOnClickListener(this);
        binding.cvHistory.setOnClickListener(this);
        binding.cvScience.setOnClickListener(this);

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.cvMath:
                sendCategoryData("MATH");
                break;

            case R.id.cvGeography:
                sendCategoryData("GEOGRAPHY");
                break;

            case R.id.cvHistory:
                sendCategoryData("HISTORY");
                break;

            case R.id.cvScience:
                sendCategoryData("SCIENCE");
                break;
        }
    }

    private void sendCategoryData(String data) {
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, new DifficultyFragment()).commit();
        Bundle result = new Bundle();
        result.putString(Constants.CATEGORY, data);
        getParentFragmentManager().setFragmentResult(Constants.CATEGORY, result);

    }
}