package com.internshala.fitnesstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void gotoBMI(View view) {
        Intent i1 = new Intent(home_screen.this, BMI.class);
        startActivity(i1);
    }

    public void gotAbout(View view) {
        Intent i2 = new Intent(home_screen.this, about.class);
        startActivity(i2);
    }

    public void gotocalories(View view) {
        Intent i3 = new Intent(home_screen.this, calories_counter.class);
        startActivity(i3);
    }

    public void gotopedo(View view) {
        Intent i4 = new Intent(home_screen.this, pedometer.class);
        startActivity(i4);
    }
}