package com.example.final0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*
        Person user = null;
        FileInputStream fis;
        ObjectInputStream ois;
        try {
            File file = new File("user.tmp");
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            user = (Person) ois.readObject();
            ois.close();
        } catch(Exception e) {
            System.err.println("an error occured");
        }

        if(user.getGender().length() != 0) {
            Intent intent = new Intent(this, TheScreen.class);
            startActivity(intent);
        }

 */
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Button button = findViewById(R.id.goBtn);
        Intent intent = new Intent(this, GenderAge.class);
        startActivity(intent);
    }
}
