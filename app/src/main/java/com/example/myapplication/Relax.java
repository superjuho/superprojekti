package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Relax luokassa on lista ahdistukseen, stressiin ja paniikkikohtauksiin liittyvistä tiedoista.
 * @author Tomi Eränne
 */

public class Relax extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relax);

        populateListView(); //tehdään lista kun activity aukeaa
        registerClickCallback();
    }



    private void populateListView() {
        String[] myItems = {"Paniikkikohtaus", "Unettomuus", "Ahdistus", "Stressi"};

        ArrayAdapter<String> adapter = new ArrayAdapter( //Array adapteri ListViewille
                this,
                R.layout.relaxlist,
                myItems);

        ListView list = findViewById(R.id.relaxlist);
        list.setAdapter(adapter);
    }
    private void registerClickCallback(){
        ListView list = findViewById(R.id.relaxlist);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {   //onClickItem lukee painetun komponentin position
                if(position == 0) {                                                              //ja sen mukaan avaa uuden activityn
                    Intent myIntent = new Intent(view.getContext(), Relax1.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Relax2.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Relax3.class);
                    startActivityForResult(myIntent, 0);

                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), Relax4.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });

    }
}