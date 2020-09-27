package com.example.final0;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class GenderAge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender_age);
    }

    public void onClick(View view) {
        Button button = findViewById(R.id.button);
        RadioButton radioMale = findViewById(R.id.radioMale);
        RadioButton radioFemale = findViewById(R.id.radioFemale);
        EditText editText = findViewById(R.id.editText);

        if(editText.getText().length() == 0) {
            Toast.makeText(this, "age is empty", Toast.LENGTH_LONG).show();
            return;
        }
        if(!radioFemale.isChecked())
            if(!radioMale.isChecked()) {
                Toast.makeText(this, "gender is empty", Toast.LENGTH_LONG).show();
                return;
            }

        Intent intent = new Intent(this, Goal.class);
        startActivity(intent);
    }

    public void maleClick(View view) {
        RadioButton radioMale = findViewById(R.id.radioMale);
        RadioButton radioFemale = findViewById(R.id.radioFemale);
        if(radioFemale.isChecked()) {
            radioFemale.setChecked(false);
            radioMale.setChecked(true);
        }
    }

    public void femaleClick(View view) {
        RadioButton radioMale = findViewById(R.id.radioMale);
        RadioButton radioFemale = findViewById(R.id.radioFemale);
        if(radioMale.isChecked()) {
            radioMale.setChecked(false);
            radioFemale.setChecked(true);
        }
    }
}
