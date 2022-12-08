package com.example.quizapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.quizapp.databinding.FragmentHistoryBinding;

import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends Fragment {
    FragmentHistoryBinding binding;
    private HistoryAdapter historyAdapter;
    private int mCorrectAnswers = 0;
    private int mTotalQuestions = 0;
    private String mCategory = "";
    private String mDifficulty = "";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHistoryBinding.inflate(inflater, container, false);

        if (this.getArguments() != null) {
            mCorrectAnswers = this.getArguments().getInt(Constants.CORRECT_ANSWER);
            mTotalQuestions = this.getArguments().getInt(Constants.TOTAL_QUESTIONS);
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
        List<History> list = new ArrayList<>(){};
            String scoreString = Integer.toString(mCorrectAnswers) + "/" + Integer.toString(mTotalQuestions);
            list.add(new History(scoreString, mCategory, mDifficulty, "6/12/2022"));

        return list;

    }
}