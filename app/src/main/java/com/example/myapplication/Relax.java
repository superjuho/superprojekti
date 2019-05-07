package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Relax extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateListView();
        registerClickCallback();
    }


    private void populateListView() {
        String[] myItems = {"Relax1", "Relax2", "Relax3", "Relax4"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                R.layout.relaxlist,
                myItems);

        ListView list = (ListView) findViewById(R.id.relaxlist);
        list.setAdapter(adapter);
    }

    private void registerClickCallback() {
        ListView list = (ListView) findViewById(R.id.relaxlist);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> paret, View viewClicked, int position, long id) {
                TextView textView = (TextView) viewClicked;
                String message = "You clicked # " + position
                        + ", which is string: " + textView.getText().toString();
                Toast.makeText(Relax.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }
}
