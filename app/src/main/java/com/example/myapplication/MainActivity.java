package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private String TAG = "Tässä";
private int Lol = 0;
Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.button);
    }

    public void onButtonClick(View v) {
        Lol++;
        Log.d(TAG,"Täällä ollaan");
        Log.d(TAG,"Vittu mitä pasoaa");
    }
}
