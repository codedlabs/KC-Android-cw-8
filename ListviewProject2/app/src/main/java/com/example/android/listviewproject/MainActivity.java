package com.example.android.listviewproject;

import android.content.Intent;
import android.graphics.drawable.shapes.Shape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<Items> shopItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Items cheese = new Items("cheese", R.drawable.cheese, 2);
        shopItems.add(cheese);

        Items chocolate = new Items("chocolate", R.drawable.chocolate, 1);
        shopItems.add(chocolate);

        Items coffee = new Items("coffee", R.drawable.coffee, 4);
        shopItems.add(coffee);

        Items donut = new Items("donut", R.drawable.donut, 3);
        shopItems.add(donut);

        Items fries = new Items("fries", R.drawable.fries, 4);
        shopItems.add(fries);

        Items honey = new Items("honey", R.drawable.honey, 1);
        shopItems.add(honey);

        ListView listView = findViewById(R.id.list);

        ItemAdapter itemAdapter = new ItemAdapter(this, 0, shopItems);
        listView.setAdapter(itemAdapter);





    }


}