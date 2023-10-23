package com.example.indoorairqualitymonitoringapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class LoginActivity extends AppCompatActivity {
    ImageButton back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        back_btn = findViewById(R.id.btn_Back_he);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginActivity.super.onBackPressed();
            }
        });
    }
}