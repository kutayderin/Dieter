package com.example.final0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CurWeight extends AppCompatActivity {

    SharedPreferences shared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cur_weight);

        shared = this.getSharedPreferences("com.example.final0", Context.MODE_PRIVATE);
    }

    public void onClick(View view) {
        Button button = findViewById(R.id.button4);
        EditText editText3 = findViewById(R.id.editText3);

        if(editText3.getText().length() == 0) {
            Toast.makeText(this, "current weight is empty", Toast.LENGTH_LONG).show();
            return;
        }

/*
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText = findViewById(R.id.editText);
        RadioButton radioGain = findViewById(R.id.radioGain);
        RadioButton radioFit = findViewById(R.id.radioFit);
        RadioButton radioLose = findViewById(R.id.radioLose);
        RadioButton radioMale = findViewById(R.id.radioMale);
        RadioButton radioFemale = findViewById(R.id.radioFemale);

        String gender = "";
        if(radioFemale.isChecked())
            gender = "female";
        if(radioMale.isChecked())
            gender = "male";
        int age = Integer.parseInt(editText.getText().toString());
        String goal = "";
        if(radioFit.isChecked())
            goal = "stay fit";
        if(radioGain.isChecked())
            goal = "gain weight";
        if(radioLose.isChecked())
            goal = "lose weight";
        int aim = Integer.parseInt(editText2.getText().toString());
        int cur = Integer.parseInt(editText3.getText().toString());

        Person user = new Person(gender, age, goal, aim, cur);

        File file;
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            file = new File(getExternalFilesDir(null), "user.tmp");
            file.createNewFile();
            fos = new FileOutputStream(file, true);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(user);
            oos.flush();
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        Intent intent = new Intent(this, AnaEkran.class);
        startActivity(intent);
    }
}
