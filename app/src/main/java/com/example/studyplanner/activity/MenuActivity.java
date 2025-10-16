package com.example.studyplanner.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studyplanner.R;


public class MenuActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageView imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.example.studyplanner.activity.MenuActivity.this, com.example.studyplanner.activity.AddnotesActivity.class);
                startActivity(i);
            }
        });
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.example.studyplanner.activity.MenuActivity.this, com.example.studyplanner.activity.MainActivity.class);
                startActivity(i);
            }
        });

        ImageView imageView2 = findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.example.studyplanner.activity.MenuActivity.this, com.example.studyplanner.activity.IntroActivity.class);
                startActivity(i);
            }
        });



    }
}