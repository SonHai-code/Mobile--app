package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.quizapp.databinding.ActivityQuizQuestionsBinding;

import java.util.ArrayList;
import java.util.Iterator;

public class QuizQuestionsActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityQuizQuestionsBinding binding;
    private int mCurrentPosition = 1 ;
    private ArrayList<Question> mQuestionsList = null;
    protected int mCurrentSelectedPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.example.quizapp.databinding.ActivityQuizQuestionsBinding binding = ActivityQuizQuestionsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mQuestionsList = Constants.getQuestions();

        setQuestion();

        binding.tvOptionOne.setOnClickListener(this);

        binding.tvOptionTwo.setOnClickListener(this);

        binding.tvOptionThree.setOnClickListener(this);

        binding.tvOptionFour.setOnClickListener(this);
    }

    // Set question from questionList
    private void setQuestion() {
      mCurrentPosition = 1;
        Question question = mQuestionsList.get(mCurrentPosition - 1);

        defaultOptionsView();

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

        ArrayList<TextView> options = new ArrayList<TextView>();

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
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_option_one:
                selectedOptionView(binding.tvOptionOne, 1);
                break;

            case R.id.tv_option_two:
                selectedOptionView(binding.tvOptionTwo, 2);
                break;

            case R.id.tv_option_three:
                selectedOptionView(binding.tvOptionThree, 3);
                break;

            case R.id.tv_option_four:
                selectedOptionView(binding.tvOptionFour, 4);
                break;
        }
    }

    // Set selected option
    private void selectedOptionView(TextView tv, int selectedOptionNumber) {
        defaultOptionsView();
        mCurrentSelectedPosition = selectedOptionNumber;
        tv.setTextColor(Color.parseColor("#363A43"));
        tv.setTypeface(tv.getTypeface(), Typeface.BOLD);
        tv.setBackground(ContextCompat.getDrawable(this,R.drawable.selected_option_border_bg));
    }
}