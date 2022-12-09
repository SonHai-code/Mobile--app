package com.example.quizapp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quizapp.databinding.FragmentHistoryBinding;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class HistoryFragment extends Fragment {
    FragmentHistoryBinding binding;
    private HistoryAdapter historyAdapter;
    private int mCorrectAnswers;
    private int mTotalQuestions;
    private String mCategory = "";
    private String mDifficulty = "";
    private int mNumberOfHistories;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHistoryBinding.inflate(inflater, container, false);

        if (this.getArguments() != null) {
            mNumberOfHistories = this.getArguments().getInt(Constants.NUM_OF_HISTORIES, 0);
            mCorrectAnswers = this.getArguments().getInt(Constants.CORRECT_ANSWER, 0);
            mTotalQuestions = this.getArguments().getInt(Constants.TOTAL_QUESTIONS, 10);
            mCategory = this.getArguments().getString(Constants.CATEGORY);
            mDifficulty = this.getArguments().getString(Constants.DIFFICULTY);

        }

        historyAdapter = new HistoryAdapter(getActivity());
        // List items following vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        binding.rvHistories.setLayoutManager(linearLayoutManager);
            historyAdapter.setData(getListHistories());
        binding.rvHistories.setAdapter(historyAdapter);

        return binding.getRoot();
    }



    private List<History> getListHistories() {
        String scoreString = mCorrectAnswers + "/" + mTotalQuestions;
        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
         Histories.setHistories(mNumberOfHistories, new History(scoreString, mCategory, mDifficulty, simpleDateFormat.format(Calendar.getInstance().getTime())));
        return Histories.historiesList;
    }
}