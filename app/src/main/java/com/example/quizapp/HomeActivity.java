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

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Get username from MainActivity
        mUserName = getIntent().getStringExtra(Constants.USER_NAME);

        // Send username data to HomeFragment and set HomeFragment as Default
       HomeFragment homeFragment = new HomeFragment();

       Bundle bundle = new Bundle();
       bundle.putString(Constants.USER_NAME, mUserName);

       homeFragment.setArguments(bundle);

        // Set HomeFragment as a default
       replaceFragment(homeFragment);

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
        } else {
            mUserName = "Default Name";
        }
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment).commit();
    }


    // Handle saving data
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString(Constants.USER_NAME, mUserName);
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