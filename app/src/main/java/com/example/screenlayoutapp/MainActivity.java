package com.example.screenlayoutapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout mainLayout;
    int snackBarCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainLayout = findViewById(R.id.mainLayout);
        snackBarCount = 0;
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

        Intent intent = new Intent(this, ShowInfoActivity.class);
        intent.putExtra("NAMETEXT", name);
        intent.putExtra("AGETEXT", age);
        intent.putExtra("HOBBYTEXT", hobby);//optional
        startActivity(intent); //switches screens to ShowInfoActivity

    }

    public void snackbarClicked(View v) {
        Snackbar.make(mainLayout, "How many snackbars?", Snackbar.LENGTH_LONG)
                .setAction("Answer", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        snackBarCount++;
                        Snackbar.make(mainLayout, "Count: " + snackBarCount,
                                        Snackbar.LENGTH_SHORT)
                                .show();
                    }
                })
                .show();
    }

}