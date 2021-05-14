package com.raccoon.androidcafe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        RecyclerView startersList=findViewById(R.id.starters_list);



        Dish starterDishes[]={
                new Dish("Paneer Tikka",100),
                new Dish("Bhel Puri",50),
                new Dish("Honey Chilli Potato",80),
                new Dish("Veg Momos",60),
                new Dish("Chicken Momos",80),
                new Dish("Chicken Tikka",140),
                new Dish("Spiced Corn",60),
                new Dish("Cheese Garlic Bread",80),
                new Dish("Chicken Popcorn",100)
        };
        DishAdapter startersAdapter=new DishAdapter(starterDishes);
        startersList.setAdapter(startersAdapter);
        
    }
}