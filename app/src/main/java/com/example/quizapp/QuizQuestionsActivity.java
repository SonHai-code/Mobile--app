package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quizapp.databinding.ActivityQuizQuestionsBinding;


import java.util.ArrayList;

public class QuizQuestionsActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityQuizQuestionsBinding binding;
    private int mCurrentPosition = 1 ; //The position of current question out of 10
    private ArrayList<Question> mQuestionsList = new ArrayList<>();
    private int mCurrentSelectedPosition = 0; // The position of selected choice
    private int mCorrectAnswers = 0;
    private String mUserName;
    Boolean isSubmitted = false;
    private String mCategory = "";
    private String mDifficulty = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityQuizQuestionsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mUserName = getIntent().getStringExtra(Constants.USER_NAME);
        mCategory = getIntent().getStringExtra(Constants.CATEGORY);
        mDifficulty = getIntent().getStringExtra(Constants.DIFFICULTY);


        // mQuestionList will contain 10 questions of each type-difficulty
        mQuestionsList = Constants.getQuestions();

        setQuestion();

        binding.tvOptionOne.setOnClickListener(this);

        binding.tvOptionTwo.setOnClickListener(this);

        binding.tvOptionThree.setOnClickListener(this);

        binding.tvOptionFour.setOnClickListener(this);

        binding.btnSubmit.setOnClickListener(this);
    }

    // Set question from questionList
    @SuppressLint("SetTextI18n")
    private void setQuestion() {
        Question question = mQuestionsList.get(mCurrentPosition - 1);

        defaultOptionsView();

        // If there was the final question change button to FINISH
        if (mCurrentPosition == mQuestionsList.size()) {
            binding.btnSubmit.setText("FINISH");
        } else {
            binding.btnSubmit.setText("SUBMIT");
        }

        binding.progressBar.setProgress(mCurrentPosition);

        binding.tvProgress.setText(mCurrentPosition + "/" + binding.progressBar.getMax());

        binding.tvQuestion.setText(question.getQuestion());

        binding.ivImage.setImageResource(question.getImage());

        binding.tvOptionOne.setText(question.getOptionOne());

        binding.tvOptionTwo.setText(question.getOptionTwo());

        binding.tvOptionThree.setText(question.getOptionThree());

        binding.tvOptionFour.setText(question.getOptionFour());
    }

    // Set view for default option
    protected void defaultOptionsView() {

        ArrayList<TextView> options = new ArrayList<>();

        options.add(0, binding.tvOptionOne);
        options.add(1, binding.tvOptionTwo);
        options.add(2, binding.tvOptionThree);
        options.add(3, binding.tvOptionFour);

        for (TextView option: options) {
            option.setTextColor(Color.parseColor("#7A8089"));
            option.setTypeface(Typeface.DEFAULT);
            option.setBackground(ContextCompat.getDrawable(this,R.drawable.default_option_border_bg));
        }

    }

    // Rewrite onClick function to set selected option
    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(View view) {
            switch (view.getId()) {
                case R.id.tv_option_one:
                    if (!isSubmitted){
                        selectedOptionView(binding.tvOptionOne, 1);
                    }
                    break;

                case R.id.tv_option_two:
                    if (!isSubmitted) {
                        selectedOptionView(binding.tvOptionTwo, 2);
                    }
                    break;

                case R.id.tv_option_three:
                    if (!isSubmitted){
                        selectedOptionView(binding.tvOptionThree, 3);
                    }
                    break;

                case R.id.tv_option_four:
                    if (!isSubmitted) {
                        selectedOptionView(binding.tvOptionFour, 4);
                    }
                    break;

                case R.id.btn_submit:
                    if (mCurrentSelectedPosition == 0) {
                        isSubmitted = false;
                        mCurrentPosition++;

                        if (mCurrentPosition <= mQuestionsList.size()) {
                            setQuestion();
                        } else {
                            Intent intent = new Intent(this, ResultActivity.class);
                            intent.putExtra(Constants.USER_NAME, mUserName);
                            intent.putExtra(Constants.CORRECT_ANSWER, mCorrectAnswers);
                            intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionsList.size());
                            intent.putExtra(Constants.DIFFICULTY,mDifficulty);
                            intent.putExtra(Constants.CATEGORY, mCategory);
                            startActivity(intent);
                        }
                    } else {
                        isSubmitted = true;
                        Question question = mQuestionsList.get(mCurrentPosition - 1);
                        if (mCurrentSelectedPosition == question.getCorrectAnswer()) {
                            mCorrectAnswers ++;
                            answerView(mCurrentSelectedPosition, R.drawable.correct_option_border_bg);
                        } else {
                            answerView(mCurrentSelectedPosition, R.drawable.wrong_option_border_bg);
                            answerView(question.getCorrectAnswer(),R.drawable.result_option_border_bg);
                        }

                        binding.btnSubmit.setText("NEXT");

                        if (mCurrentPosition == mQuestionsList.size()) {
                            binding.btnSubmit.setText("FINISH");
                        }
                        mCurrentSelectedPosition = 0;
                    }
                    break;
         }
        }

    // Set background for wrong/correct answer question
    private void answerView(int answer, int drawableView) {
        switch (answer) {
            case 1:
                binding.tvOptionOne.setBackground(ContextCompat.getDrawable(this,drawableView));
                break;

            case 2:
                binding.tvOptionTwo.setBackground(ContextCompat.getDrawable(this,drawableView));
                break;

            case 3:
                binding.tvOptionThree.setBackground(ContextCompat.getDrawable(this, drawableView));
                break;

            case 4:
                binding.tvOptionFour.setBackground(ContextCompat.getDrawable(this, drawableView));
                break;
        }
    }

    // Set selected option view
    private void selectedOptionView(TextView tv, int selectedOptionNumber) {
        defaultOptionsView(); // set default view for remain options
        mCurrentSelectedPosition = selectedOptionNumber; // set selected position
        tv.setTextColor(Color.parseColor("#363A43"));
        tv.setTypeface(tv.getTypeface(), Typeface.BOLD);
        tv.setBackground(ContextCompat.getDrawable(this,R.drawable.selected_option_border_bg));
    }
}