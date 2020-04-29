package com.example.kiassasapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.kiassasapp.ui.Adapter;

import java.util.ArrayList;

public class recyclerCard extends AppCompatActivity {
RecyclerView recyclerView;
Adapter adapter;
ArrayList<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_card);

        recyclerView = findViewById(R.id.recyclerView);
        items=new ArrayList<>();
        items.add("first card");
        items.add("second card");
        items.add("third card");
        items.add("forth card");
        items.add("fifth card");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter=new Adapter(this,items);
        recyclerView.setAdapter(adapter);




    }
}
