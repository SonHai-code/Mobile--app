package com.example.quizapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.quizapp.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {
    ActivityHomeBinding binding;
    private String mUserName = "";
    private int mCorrectAnswers ;
    private int mTotalQuestions ;
    private String mCategory = "";
    private String mDifficulty = "";
    private int mNumberofHistories;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Get username from MainActivity
        mUserName = getIntent().getStringExtra(Constants.USER_NAME);

        // Get data from ResultActivity after pressing FINISH button
        mCorrectAnswers = getIntent().getIntExtra(Constants.CORRECT_ANSWER, 0);
        mTotalQuestions = getIntent().getIntExtra(Constants.TOTAL_QUESTIONS, 10);
        mCategory = getIntent().getStringExtra(Constants.CATEGORY);
        mDifficulty = getIntent().getStringExtra(Constants.DIFFICULTY);
        mNumberofHistories = getIntent().getIntExtra(Constants.NUM_OF_HISTORIES, 0);


        // Set HomeFragment as a default
       replaceFragment(new HomeFragment());

        // Set bottom navigation bar selections
        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    replaceFragment(new HomeFragment());
                    break;

                case R.id.history:
                    replaceFragment(new HistoryFragment());
                    break;
            }
            return true;
        });

        // Check whether we're recreating a previously destroyed instance
        if (savedInstanceState != null) {
            // Restore value of members from saved state
           mUserName = savedInstanceState.getString(Constants.USER_NAME);
            mCorrectAnswers = savedInstanceState.getInt(Constants.CORRECT_ANSWER, 0);
            mTotalQuestions = savedInstanceState.getInt(Constants.TOTAL_QUESTIONS, 10);
            mCategory = savedInstanceState.getString(Constants.CATEGORY);
            mDifficulty = savedInstanceState.getString(Constants.DIFFICULTY);

        } else {
            mUserName = "Default Name";
        }
    }

    private void replaceFragment(Fragment fragment) {
        // Send username data to HomeFragment and set HomeFragment as Default
        Bundle bundle = new Bundle();
        bundle.putString(Constants.USER_NAME, mUserName);
        bundle.putInt(Constants.CORRECT_ANSWER,mCorrectAnswers);
        bundle.putInt(Constants.TOTAL_QUESTIONS,mTotalQuestions);
        bundle.putString(Constants.DIFFICULTY, mDifficulty);
        bundle.putString(Constants.CATEGORY,mCategory);
        bundle.putInt(Constants.NUM_OF_HISTORIES, 0);

        fragment.setArguments(bundle);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment).commit();
    }


    // Handle saving data
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString(Constants.USER_NAME, mUserName);
        outState.putString(Constants.DIFFICULTY, mDifficulty);
        outState.putString(Constants.CATEGORY, mCategory);
        outState.putInt(Constants.CORRECT_ANSWER, mCorrectAnswers);
        outState.putInt(Constants.TOTAL_QUESTIONS, mTotalQuestions);

        super.onSaveInstanceState(outState);
    }


    // Top navigation bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_nav_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.information:
                Intent intent = new Intent(this, InformationActivity.class);
                startActivity(intent);
                break;
            case R.id.feedback:
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}