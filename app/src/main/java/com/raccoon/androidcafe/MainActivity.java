package com.raccoon.androidcafe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CardView starterCard,mainCard,dessertCard,beverageCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        starterCard=findViewById(R.id.card_starters);
        mainCard=findViewById(R.id.card_main);
        dessertCard=findViewById(R.id.card_dessert);
        beverageCard=findViewById(R.id.card_beverages);

        starterCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startersActivityIntent=new Intent(MainActivity.this, StartersActivity.class);
                startActivity(startersActivityIntent);
            }
        });
        mainCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainCourseActivityIntent=new Intent(MainActivity.this,MainCourseActivity.class);
                startActivity(mainCourseActivityIntent);
            }
        });
        dessertCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent desertActivityIntent=new Intent(MainActivity.this,DessertsActivity.class);
                startActivity(desertActivityIntent);
            }
        });
        beverageCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent beverageActivityIntent=new Intent(MainActivity.this,BeveragesActivity.class);
                startActivity(beverageActivityIntent);
            }
        });

        TextView emailID=findViewById(R.id.email);

        emailID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchEmail=new Intent(Intent.ACTION_SENDTO);
                launchEmail.setData(Uri.parse("mailto:androidcafe@raccoon.com"));
                startActivity(launchEmail);
            }
        });
        
    }
}