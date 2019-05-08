package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;

import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;


import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/**
 * Luokassa tulee esille käyttäjän valitsemat päivän "moodit" jotka jäsentyvät gridviewiin päivämäärän kanssa
 * Luokassa myös laskuri joka laskee ja ilmoittaa erilaisten päivien määrät gridin alapuolella.
 * @author Juho Puurunen
 * @version 0.8 5/2019
 */

public class Calendar extends AppCompatActivity {
    private static boolean greatPressed = false;
    private static boolean finePressed = false;
    private static boolean notGreatPressed = false;
    private static boolean badPressed = false;
    private static boolean awfulPressed = false;
    private static boolean calendarHomeButtonPressed = false;

   static int greats, fines, ngreats, bads, awfuls;




    SharedPreferences shared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        shared = getSharedPreferences("App_settings", MODE_PRIVATE);

        GridView days = findViewById(R.id.Calendar);
        TextView great = findViewById(R.id.greatdays);
        TextView fine = findViewById(R.id.finedays);
        TextView notgreat = findViewById(R.id.notgreatdays);
        TextView bad = findViewById(R.id.baddays);
        TextView awful = findViewById(R.id.awfuldays);
        String[] dayz = new String[] {
            "Mitä tääl tapahtuu",
        };



        List<String> dayzList = new ArrayList<String>(Arrays.asList(dayz));

        ArrayAdapter<String> gridViewArrayAdapter = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, dayzList);

        days.setAdapter(gridViewArrayAdapter);

        String date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());

       SharedPreferences mPrefs = getSharedPreferences("label",0);
        int mInt = mPrefs.getInt("greats",0);
        SharedPreferences nPrefs = getSharedPreferences("label1", 0);
        int nInt =nPrefs.getInt("fines", 0);
        SharedPreferences bPrefs = getSharedPreferences("label2", 0);
        int bInt = bPrefs.getInt("ngreats", 0);
        SharedPreferences vPrefs = getSharedPreferences("label3", 0);
        int vInt =vPrefs.getInt("bads", 0);
        SharedPreferences cPrefs = getSharedPreferences("label4", 0);
        int cInt =cPrefs.getInt("awfuls", 0);



        if (greatPressed) {
            dayzList.add(dayzList.size(),"Great day!\n" + date);
            days.setBackgroundColor(Color.parseColor("#161fff"));
            gridViewArrayAdapter.notifyDataSetChanged();
            Set<String> set = shared.getStringSet("DATE_LIST", null);
            dayzList.addAll(set);
            greats++;
            final SharedPreferences.Editor mEditor = mPrefs.edit();
            mEditor.putInt("greats", greats);
            mEditor.apply();
            greatPressed = false;
        } else if (awfulPressed) {
            dayzList.add(dayzList.size(),"Awful day\n" + date);
            days.setBackgroundColor(Color.parseColor("#ad0202"));
            gridViewArrayAdapter.notifyDataSetChanged();
            Set<String> set = shared.getStringSet("DATE_LIST", null);
            dayzList.addAll(set);
            awfuls++;
            final SharedPreferences.Editor cEditor = cPrefs.edit();
            cEditor.putInt("awfuls", awfuls).apply();
            awfulPressed = false;
        } else if (finePressed) {
            dayzList.add(dayzList.size(),"Fine day\n" + date);
            days.setBackgroundColor(Color.parseColor("#34a873"));
            gridViewArrayAdapter.notifyDataSetChanged();
            Set<String> set = shared.getStringSet("DATE_LIST", null);
            dayzList.addAll(set);
            fines++;
            final SharedPreferences.Editor nEditor = nPrefs.edit();
            nEditor.putInt("fines", fines).apply();
            finePressed = false;
        } else if (notGreatPressed) {
            dayzList.add(dayzList.size(),"Not great..\n" + date);
            days.setBackgroundColor(Color.parseColor("#898989"));
            gridViewArrayAdapter.notifyDataSetChanged();
            Set<String> set = shared.getStringSet("DATE_LIST", null);
            dayzList.addAll(set);
            ngreats++;
            final SharedPreferences.Editor bEditor = bPrefs.edit();
            bEditor.putInt("ngreats", ngreats).apply();
            notGreatPressed = false;
        } else if (badPressed) {
            dayzList.add(dayzList.size(),"Bad day\n" + date);
            days.setBackgroundColor(Color.parseColor("#5a0001"));
            gridViewArrayAdapter.notifyDataSetChanged();
            Set<String> set = shared.getStringSet("DATE_LIST", null);
            dayzList.addAll(set);
            bads++;
            final SharedPreferences.Editor vEditor = vPrefs.edit();
            vEditor.putInt("bads", bads).apply();

            badPressed = false;
        } else if (calendarHomeButtonPressed) {

            gridViewArrayAdapter.notifyDataSetChanged();
            Set<String> set = shared.getStringSet("DATE_LIST", null);
            dayzList.addAll(set);
            calendarHomeButtonPressed = false;

        }
        SharedPreferences.Editor editor = shared.edit();
        Set<String> set = new HashSet<>(dayzList);
        editor.putStringSet("DATE_LIST", set);
        editor.apply();



            great.setText(String.valueOf(mInt));
            awful.setText(String.valueOf(cInt));
            fine.setText(String.valueOf(nInt));
            notgreat.setText(String.valueOf(bInt));
            bad.setText(String.valueOf(vInt));

        Log.d("tääl", String.valueOf(dayzList.size()));
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

    public static void calendarHomeButtonPressed() {
        calendarHomeButtonPressed = true;
    }




    }







