package com.example.final0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Goal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal);
    }

    public void onClick(View view) {
        Button button = findViewById(R.id.button2);
        RadioButton radioGain = findViewById(R.id.radioGain);
        RadioButton radioLose = findViewById(R.id.radioLose);
        RadioButton radioFit = findViewById(R.id.radioFit);

        if(!radioGain.isChecked())
            if(!radioLose.isChecked())
                if(!radioFit.isChecked()) {
                    Toast.makeText(this, "choice is empty", Toast.LENGTH_LONG).show();
                    return;
                }

        if(radioFit.isChecked()) {
            Intent i = new Intent(this, CurWeight.class);
            startActivity(i);
            return;
        }

        Intent intent = new Intent(this, AimWight.class);
        startActivity(intent);
    }

    public void gainClick(View view) {
        RadioButton radioGain = findViewById(R.id.radioGain);
        RadioButton radioLose = findViewById(R.id.radioLose);
        RadioButton radioFit = findViewById(R.id.radioFit);
        if(radioLose.isChecked() || radioFit.isChecked()) {
            radioLose.setChecked(false);
            radioFit.setChecked(false);
        }
    }

    public void loseClick(View view) {
        RadioButton radioGain = findViewById(R.id.radioGain);
        RadioButton radioLose = findViewById(R.id.radioLose);
        RadioButton radioFit = findViewById(R.id.radioFit);
        if(radioGain.isChecked() || radioFit.isChecked()) {
            radioGain.setChecked(false);
            radioFit.setChecked(false);
        }
    }

    public void fitClick(View view) {
        RadioButton radioGain = findViewById(R.id.radioGain);
        RadioButton radioLose = findViewById(R.id.radioLose);
        RadioButton radioFit = findViewById(R.id.radioFit);
        if(radioLose.isChecked() || radioGain.isChecked()) {
            radioLose.setChecked(false);
            radioGain.setChecked(false);
        }
    }
}
