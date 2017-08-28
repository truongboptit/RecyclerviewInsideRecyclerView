package com.example.truongle.recyclerviewinsiderecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayoutManager layoutManager;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Model> list2 = new ArrayList<>();
        ArrayList<Model2> list = new ArrayList<>();
        list.add(new Model2("A",1));
        list.add(new Model2("B",1));
        list.add(new Model2("C",1));
        list.add(new Model2("D",2));
        list.add(new Model2("E",2));
        list.add(new Model2("F",3));
        list.add(new Model2("G",3));
        list.add(new Model2("H",3));
        list2.add(new Model(1,3));
        list2.add(new Model(2,2));
        list2.add(new Model(3,3));

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewMain);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        Adapter1 adapter1 = new Adapter1(list2,list,getApplicationContext());
        recyclerView.setAdapter(adapter1);
    }
}
