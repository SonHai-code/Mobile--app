package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.quizapp.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {
    ActivityResultBinding binding;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String username = getIntent().getStringExtra(Constants.USER_NAME);
        binding.tvUsername.setText(username);

        String category = getIntent().getStringExtra(Constants.CATEGORY);
        String difficulty = getIntent().getStringExtra(Constants.DIFFICULTY);

        int totalQuestions = getIntent().getIntExtra(Constants.TOTAL_QUESTIONS, 0);
        int correctAnswers = getIntent().getIntExtra(Constants.CORRECT_ANSWER, 0);


        binding.tvScore.setText("Your score is " + correctAnswers + "/" + totalQuestions );

        binding.btnFinish.setOnClickListener(view -> {
            Histories.mNumberOfHistories ++;
            Intent intent = new Intent(this, HomeActivity.class);


            intent.putExtra(Constants.USER_NAME, binding.tvUsername.getText().toString().trim());
            intent.putExtra(Constants.CATEGORY, category);
            intent.putExtra(Constants.DIFFICULTY, difficulty);
            intent.putExtra(Constants.CORRECT_ANSWER, correctAnswers);
            intent.putExtra(Constants.TOTAL_QUESTIONS, totalQuestions);


            startActivity(intent);
            finish();
        });

        binding.btnShare.setOnClickListener(view -> {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            String message = "I've answered correctly " + correctAnswers + " questions in " + difficulty.toLowerCase() +" level with " + category.toLowerCase() + " topic.";
            sendIntent.putExtra(Intent.EXTRA_TEXT, message);
            sendIntent.setType("text/plain");

            Intent shareIntent = Intent.createChooser(sendIntent, null);
            startActivity(shareIntent);
        });


    }
}