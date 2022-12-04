package com.example.quizapp;

public class Question {
    private  int id;
    private String question;
    private int image;
    private String optionOne;
    private String optionTwo;
    private String optionThree;
    private String optionFour;
    private int correctAnswer;


    public Question(int id, String question, int image, String optionOne, String optionTwo, String optionThree, String optionFour, int correctAnswer) {
        this.id = id;
        this.question = question;
        this.image = image;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.optionThree = optionThree;
        this.optionFour = optionFour;
        this.correctAnswer = correctAnswer;
    }
}
