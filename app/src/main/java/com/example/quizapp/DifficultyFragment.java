package com.example.quizapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.quizapp.databinding.FragmentDifficultyBinding;

public class DifficultyFragment extends Fragment implements View.OnClickListener {
    FragmentDifficultyBinding binding;
    private String mCategory = "";
    private String mUserName = "";

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDifficultyBinding.inflate(inflater, container, false);

        // Get category data from HomeFragment
//        getParentFragmentManager().setFragmentResultListener(Constants.CATEGORY, this, new FragmentResultListener() {
//            @Override
//            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
//                mCategory = result.getString(Constants.CATEGORY);
//            }
//        });

        if (this.getArguments() != null) {
            mCategory = this.getArguments().getString(Constants.CATEGORY);
            mUserName = this.getArguments().getString(Constants.USER_NAME);
        }

        binding.cvEasy.setOnClickListener(this);
        binding.cvMedium.setOnClickListener(this);
        binding.cvHard.setOnClickListener(this);

        return binding.getRoot();
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cvEasy:
                sendDataToQuizQuestions("EASY");
                break;

            case R.id.cvMedium:
                sendDataToQuizQuestions("MEDIUM");
                break;

            case R.id.cvHard:
                sendDataToQuizQuestions("HARD");
                break;
        }

    }

    private void sendDataToQuizQuestions(String difficulty) {
        Intent intent = new Intent(getActivity().getBaseContext(), QuizQuestionsActivity.class);
        intent.putExtra(Constants.CATEGORY, mCategory);
        intent.putExtra(Constants.USER_NAME, mUserName);
        intent.putExtra(Constants.DIFFICULTY, difficulty);
        getActivity().startActivity(intent);
    }
}