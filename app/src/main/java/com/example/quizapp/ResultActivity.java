package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

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

        int totalQuestions = getIntent().getIntExtra(Constants.TOTAL_QUESTIONS, 0);
        int correctAnswers = getIntent().getIntExtra(Constants.CORRECT_ANSWER, 0);


        binding.tvScore.setText("Your score is " + correctAnswers + "/" + totalQuestions );

        binding.btnFinish.setOnClickListener(view -> {
            Intent intent = new Intent(this, HomeActivity.class);

            intent.putExtra(Constants.USER_NAME, binding.tvUsername.getText().toString().trim());
            startActivity(intent);
            finish();
        });

        binding.btnShare.setOnClickListener(view -> {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
            sendIntent.setType("text/plain");

            Intent shareIntent = Intent.createChooser(sendIntent, null);
            startActivity(shareIntent);
        });


    }
}