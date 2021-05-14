package com.raccoon.androidcafe;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainCourseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        RecyclerView mainCoursesList=findViewById(R.id.main_courses_list);

        Dish maincourseDishes[]={
                new Dish("Dal Makhani",140),
                new Dish("Dal Fry",120),
                new Dish("Shahi Paneer",160),
                new Dish("Paneer Butter Masala",180),
                new Dish("Paalak Paneer",160),
                new Dish("Chilli Paneer",200),
                new Dish("Dum Aloo",140),
                new Dish("Bharwa Dum Aloo",160),
                new Dish("Butter Chicken",200),
                new Dish("Chicken Korma",220),
                new Dish("Karhai Chicken",220),
                new Dish("Chilli Chicken",240),
                new Dish("Mushroom in Gravy",180)
        };
       DishAdapter maincourseAdapter=new DishAdapter(maincourseDishes);
       mainCoursesList.setAdapter(maincourseAdapter);
    }
}
