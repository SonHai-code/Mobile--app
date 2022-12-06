package com.example.quizapp;

public class History {

    private String score;
    private String category;
    private String difficulty;
    private String date;

    public History(String score, String category, String difficulty, String date) {
        this.score = score;
        this.category = category;
        this.difficulty = difficulty;
        this.date = date;
    }

    public String getScore() {
        return score;
    }

    public String getCategory() {
        return category;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getDate() {
        return date;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
