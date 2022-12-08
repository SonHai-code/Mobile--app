package com.example.quizapp;

import java.util.ArrayList;

public class Histories {
    public static final ArrayList<History> historiesList = new ArrayList<>();

    public static ArrayList<History> setHistories(int index, History history) {
       historiesList.add(index, history);
        return historiesList;
    }
}
