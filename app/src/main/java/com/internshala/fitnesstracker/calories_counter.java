package com.internshala.fitnesstracker;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class calories_counter extends AppCompatActivity {
    EditText tartgetWeight_et;
    EditText currentWeight_et;
    TextView calorieTarget;
    TextView calorieCurrent;
    Button calculateDayCalories;
    Button getStarted;
    static double parameter;
    int currentWeight;
    int targetWeight;
    int currentCalories;
    int targetCalories;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories_counter);

        tartgetWeight_et = findViewById(R.id.targetWeight);
        currentWeight_et = findViewById(R.id.currentWeight);
        calorieTarget = findViewById(R.id.calorieTarget);
        calorieCurrent = findViewById(R.id.calorieCurrent);
        calculateDayCalories = findViewById(R.id.calculateDayCal);


    }

    //man : kg * 1 * 24
    //woman : kg * 0.9 * 24

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        Button button = findViewById(R.id.calculateDayCal);


        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_other:
                if (checked)
                    parameter = 0.95;
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        currentWeight = Integer.valueOf(String.valueOf(currentWeight_et.getText()));
                        currentCalories = (int)(currentWeight* parameter * 24);
                        calorieCurrent.setText(String.valueOf((int) currentCalories));

                        targetWeight = Integer.valueOf(String.valueOf(tartgetWeight_et.getText()));
                        targetCalories =  (int)(targetWeight* parameter * 24);
                        calorieTarget.setText(String.valueOf((targetCalories)));
                    }
                });
                break;

            case R.id.radio_female:
                if (checked)
                    parameter = 0.9;
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        currentWeight = Integer.valueOf(String.valueOf(currentWeight_et.getText()));
                        currentCalories = (int)(currentWeight* parameter * 24);
                        calorieCurrent.setText(String.valueOf((int) currentCalories));

                        targetWeight = Integer.valueOf(String.valueOf(tartgetWeight_et.getText()));
                        targetCalories =  (int)(targetWeight* parameter * 24);
                        calorieTarget.setText(String.valueOf((targetCalories)));
                    }
                });
                break;
            case R.id.radio_male:
                if (checked)
                    parameter = 1.0;
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        currentWeight = Integer.valueOf(String.valueOf(currentWeight_et.getText()));
                        currentCalories = (int)(currentWeight* parameter * 24);
                        calorieCurrent.setText(String.valueOf((int) currentCalories));

                        targetWeight = Integer.valueOf(String.valueOf(tartgetWeight_et.getText()));
                        targetCalories =  (int)(targetWeight* parameter * 24);
                        calorieTarget.setText(String.valueOf((targetCalories)));

                    }
                });
                break;

        }
    }
}