package com.raccoon.androidcafe;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.recyclerview.widget.RecyclerView;

public class BeveragesActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages);

        RecyclerView beverageList = findViewById(R.id.beverages_list);

        Dish beverageDishes[] = {
                new Dish("Cold Drinks", 40),
                new Dish("Hot Chocolate", 80),
                new Dish("Oreo Shake", 100),
                new Dish("Lemonade", 60),
                new Dish("Mojito", 80)
        };
        DishAdapter beverageAdapter=new DishAdapter(beverageDishes);
        beverageList.setAdapter(beverageAdapter);
    }
}
