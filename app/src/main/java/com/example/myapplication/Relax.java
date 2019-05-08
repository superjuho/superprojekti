package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


public class Relax extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relax);

        populateListView();
        registerClickCallback();
    }


    private void populateListView() {
        String[] myItems = {"Toiminta paniikkikohtauksen aikana", "Paniikkikohtauksen ennaltaehkäisy", "Ahdistus", "Stressi"};

        ArrayAdapter<String> adapter = new ArrayAdapter(
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
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
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