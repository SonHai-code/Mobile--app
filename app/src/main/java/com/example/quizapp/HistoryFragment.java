package com.example.quizapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.quizapp.databinding.FragmentHistoryBinding;

import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends Fragment {
    FragmentHistoryBinding binding;
    private HistoryAdapter historyAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHistoryBinding.inflate(inflater, container, false);
        historyAdapter = new HistoryAdapter(getActivity());

        // List items following vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        binding.rvHistories.setLayoutManager(linearLayoutManager);
        historyAdapter.setData(getListHistories());
        binding.rvHistories.setAdapter(historyAdapter);

        return binding.getRoot();
    }

    private List<History> getListHistories() {
        List<History> list = new ArrayList<>();

        list.add(new History("3/10", "geography", "Easy", "6/12/2022"));
        list.add(new History("3/10", "geography", "Easy", "6/12/2022"));
        list.add(new History("3/10", "geography", "Easy", "6/12/2022"));
        list.add(new History("3/10", "geography", "Easy", "6/12/2022"));
        list.add(new History("3/10", "geography", "Easy", "6/12/2022"));
        list.add(new History("3/10", "geography", "Easy", "6/12/2022"));
        list.add(new History("3/10", "geography", "Easy", "6/12/2022"));
        list.add(new History("3/10", "geography", "Easy", "6/12/2022"));

        list.add(new History("3/10", "geography", "Easy", "6/12/2022"));
        list.add(new History("3/10", "geography", "Easy", "6/12/2022"));
        list.add(new History("3/10", "geography", "Easy", "6/12/2022"));
        list.add(new History("3/10", "geography", "Easy", "6/12/2022"));
        list.add(new History("3/10", "geography", "Easy", "6/12/2022"));
        list.add(new History("3/10", "geography", "Easy", "6/12/2022"));
        list.add(new History("3/10", "geography", "Easy", "6/12/2022"));
        list.add(new History("3/10", "geography", "Easy", "6/12/2022"));


        return list;

    }
}