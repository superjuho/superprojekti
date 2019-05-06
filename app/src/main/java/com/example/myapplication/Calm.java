package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calm extends AppCompatActivity {

    Button great;
    Button fine;
    Button ngreat;
    Button bad;
    Button awful;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calm);
        great = findViewById(R.id.great);
        fine = findViewById(R.id.Fine);
        ngreat = findViewById(R.id.ngreat);
        bad = findViewById(R.id.bad);
        awful = findViewById(R.id.awful);

    }

    public void greatClick(View v) {

    }
}
