package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class Relax extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateListView();
    }


    private void populateListView() {
        String[] myItems = {"Relax1", "Relax2", "Relax3", "Relax4"};

        ArrayAdapter<String> adapter = new ArrayAdapter(
                this,
                R.layout.relaxlist,
                myItems);

        ListView list = findViewById(R.id.relaxlist);
        list.setAdapter(adapter);
    }
}