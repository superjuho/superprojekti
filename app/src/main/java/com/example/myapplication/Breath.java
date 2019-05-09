package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Breath luokassa on rauhoittava hengitysharjoitus
 * @author Vilja Aspegren
 */
public class Breath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breath);
    }

    public void calendarHomeButtonClick(View v) {
        Calendar.calendarHomeButtonPressed();
        startActivity(new Intent(Breath.this, Calendar.class));
    }

    public void relaxHomeButtonClick (View v) {
        startActivity(new Intent(Breath.this, Relax.class));
    }

    public void breathHomeButtonClick (View v) {
        startActivity(new Intent(Breath.this, Breath.class));
    }
}
