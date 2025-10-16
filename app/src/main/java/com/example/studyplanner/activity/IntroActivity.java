package com.example.studyplanner.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studyplanner.R;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        // Find the login button by its ID and set a click listener
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle login button click
                goToLoginActivity(); // Call the method to go to MainActivity
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle login button click
                goToSignActivity(); // Call the method to go to MainActivity
            }
        });

    }

    // Method to navigate to MainActivity
    private void goToLoginActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    // Method to navigate to SignActivity
    private void goToSignActivity() {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }

}