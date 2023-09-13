package com.example.screenlayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ShowInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAMETEXT");
        String age = intent.getStringExtra("AGETEXT");
        String hobby = intent.getStringExtra("HOBBYTEXT");

        TextView nameTV = findViewById(R.id.infoNameText);
        nameTV.setText("Name: " + name);

        TextView ageTV = findViewById(R.id.infoAgeText);
        ageTV.setText("Age: " + age);

        TextView hobbyTV = findViewById(R.id.infoHobbyText);
        hobbyTV.setText("Hobby: " + hobby);
    }

}