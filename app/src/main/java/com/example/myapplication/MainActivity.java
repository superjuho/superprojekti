package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.button);
    }

    public void onButtonClick(View v) {
        startActivity(new Intent(MainActivity.this, Calm.class));
    }

    public void calendarHomeButtonClick(View v) {
        Calendar.calendarHomeButtonPressed();
        startActivity(new Intent(MainActivity.this, Calendar.class));
    }

    public void relaxHomeButtonClick (View v) {
        startActivity(new Intent(MainActivity.this, Relax.class));
    }
}

