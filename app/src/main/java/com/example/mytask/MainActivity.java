package com.example.mytask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    List<ListItem> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();
        recyclerView = findViewById(R.id.r1);
        recyclerView.setHasFixedSize(true);
        adapter = new Adapter(this,list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        ListItem listItem1 = new ListItem("Name : " , "Date : ");
        list.add(listItem1);
        ListItem listItem2 = new ListItem("Name : " , "Date : ");
        list.add(listItem2);
        ListItem listItem3 = new ListItem("Name : " , "Date : ");
        list.add(listItem3);
        ListItem listItem4 = new ListItem("Name : " , "Date : ");
        list.add(listItem4);
    }
}