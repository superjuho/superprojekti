package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

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
        Calendar.greatPressed();
        startActivity(new Intent(Calm.this, Calendar.class));
    }

    public void awfulClick(View v) {
        Calendar.awfulPressed();
        startActivity(new Intent(Calm.this, Calendar.class));
    }

    public void fineClick(View v) {
        Calendar.finePressed();
        startActivity(new Intent(Calm.this, Calendar.class));

    }
    public void notGreatClick(View v) {
        Calendar.notGreatPressed();
        startActivity(new Intent(Calm.this, Calendar.class));
    }
    public void badClick(View v) {
        Calendar.badPressed();
        startActivity(new Intent(Calm.this, Calendar.class));
    }

    public void calendarHomeButtonClick(View v) {
        startActivity(new Intent(Calm.this, Calendar.class));
    }
}
