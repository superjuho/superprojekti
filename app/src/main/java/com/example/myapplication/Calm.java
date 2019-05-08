package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Luokka tarjoaa käyttäjälle viisi valittavaa fiilistä, jotka lisätä omaan kalenteriin
 * @author Juho Puurunen
 * @version 1.0 5/2019
 */
public class Calm extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calm);


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
        Calendar.calendarHomeButtonPressed();
        startActivity(new Intent(Calm.this, Calendar.class));
    }
    public void relaxHomeButtonClick (View v) {
        startActivity(new Intent(Calm.this, Relax.class));
    }
}
