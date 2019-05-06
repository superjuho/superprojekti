package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calendar extends AppCompatActivity {
    private static boolean greatPressed = false;
    private static boolean finePressed = false;
    private static boolean notGreatPressed = false;
    private static boolean badPressed = false;
    private static boolean awfulPressed = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        GridView days = findViewById(R.id.Calendar);
        String[] dayz = new String[] {

        };

        final List<String> dayzList = new ArrayList<String>(Arrays.asList(dayz));

        final ArrayAdapter<String> gridViewArrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, dayzList);

        days.setAdapter(gridViewArrayAdapter);


    }
}
