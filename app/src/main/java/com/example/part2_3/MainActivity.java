package com.example.part2_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        names = new ArrayList<>();
        names.add("Tiger");
        names.add("Lion");
        names.add("Elephant");
        names.add("Shark");
        names.add("Fish");
        names.add("Whales");
        names.add("Bear");
        names.add("Wolf");
        names.add("Dog");
        names.add("Cat");
        NameAdapter adapter = new NameAdapter(names);
        recyclerView.setAdapter(adapter);
    }
}