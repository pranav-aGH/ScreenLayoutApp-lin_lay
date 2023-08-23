package com.example.screenlayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
    Create a method that can be called when the user clicks on the button
    In order for this method to be called, it MUST have a specific method
    signature must be public void must take ONLY one parameter of type View
     */

    public void switchScreens(View v){
        // first make a reference to the EditText by locating its element in the xml file
        EditText nameET = findViewById(R.id.NameEditText);
        //extract the text from this EditText and make the text uneditable
        //by calling the toString() method
        String name = nameET.getText().toString();

        EditText ageET = findViewById(R.id.AgeEditText);
        String age = ageET.getText().toString();

        EditText hobbyET = findViewById((R.id.HobbyEditText));
        String hobby = hobbyET.getText().toString();

        String fullText = name + ", " + age + "\n" + hobby;
        Log.i("Omkar", "user input: "  + fullText);

        //don't forget to CALL this method with the OnClick attribute
        //if the method name is greyed out, it is NOT being called

        Intent intent = new Intent(this, ShowInfoActivity.class);
    }
}