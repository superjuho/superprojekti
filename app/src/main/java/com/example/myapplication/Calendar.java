package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Calendar extends AppCompatActivity {
    private static boolean greatPressed = false;
    private static boolean finePressed = false;
    private static boolean notGreatPressed = false;
    private static boolean badPressed = false;
    private static boolean awfulPressed = false;

    SharedPreferences shared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        shared = getSharedPreferences("App_settings", MODE_PRIVATE);
        GridView days = findViewById(R.id.Calendar);
        String[] dayz = new String[] {

        };

        List<String> dayzList = new ArrayList<>(Arrays.asList(dayz));

        ArrayAdapter<String> gridViewArrayAdapter = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, dayzList);

        days.setAdapter(gridViewArrayAdapter);
        if (greatPressed) {
            dayzList.add(dayzList.size(),"Great day!");
            gridViewArrayAdapter.notifyDataSetChanged();
            Set<String> set = shared.getStringSet("DATE_LIST", null);
            dayzList.addAll(set);
            greatPressed = false;
        } else if (awfulPressed) {
            dayzList.add(dayzList.size(),"Awful day");
            gridViewArrayAdapter.notifyDataSetChanged();
            Set<String> set = shared.getStringSet("DATE_LIST", null);
            dayzList.addAll(set);
            awfulPressed = false;
        } else if (finePressed) {
            dayzList.add(dayzList.size(),"Fine day");
            gridViewArrayAdapter.notifyDataSetChanged();
            Set<String> set = shared.getStringSet("DATE_LIST", null);
            dayzList.addAll(set);
            finePressed = false;
        } else if (notGreatPressed) {
            dayzList.add(dayzList.size(),"Not great..");
            gridViewArrayAdapter.notifyDataSetChanged();
            Set<String> set = shared.getStringSet("DATE_LIST", null);
            dayzList.addAll(set);
            notGreatPressed = false;
        } else if (badPressed) {
            dayzList.add(dayzList.size(),"Bad day");
            gridViewArrayAdapter.notifyDataSetChanged();
            Set<String> set = shared.getStringSet("DATE_LIST", null);
            dayzList.addAll(set);
            badPressed = false;
        }

            SharedPreferences.Editor editor = shared.edit();
            Set<String> set = new HashSet<>();
            set.addAll(dayzList);
            editor.putStringSet("DATE_LIST", set);
            editor.apply();








    }



    public static void greatPressed() {
        greatPressed = true;

    }

    public static void awfulPressed() {
        awfulPressed = true;

    }

    public static void finePressed() {
        finePressed = true;
    }

    public static void notGreatPressed() {
        notGreatPressed = true;
    }

    public static void badPressed() {
        badPressed = true;
    }








}
