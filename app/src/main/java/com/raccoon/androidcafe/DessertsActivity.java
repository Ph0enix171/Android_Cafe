package com.raccoon.androidcafe;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.recyclerview.widget.RecyclerView;

public class DessertsActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        RecyclerView dessertsList=findViewById(R.id.desserts_list);

        Dish dessertDishes[]={
                new Dish("Gulaab Jaamun",25),
                new Dish("Brownie(Hot Chocolate and Ice Cream)",80),
                new Dish("Gajar Halwa(seasonal)",50),
                new Dish ("Fruit Cream",40),
                new Dish("Rajbhog",35)
        };
        DishAdapter DessertsAdapter=new DishAdapter(dessertDishes);
        dessertsList.setAdapter(DessertsAdapter);
    }
}
