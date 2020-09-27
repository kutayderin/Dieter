package com.example.final0;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnaEkran extends AppCompatActivity {

    TextView txt;
    Person user;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_ekran);
        button = (Button) findViewById(R.id.btnUp);
        txt = (TextView) findViewById(R.id.txtWater);
        user = new Person(0);
        String water = "You have drinked "  + " bottle of water for today.";
        txt.setText("You have drinked "  + user.getWater() + " bottle of water for today.");

    }

    public void btnUp(View view) {
        user.setWater(user.getWater() + 1);
        int a = user.getWater();
        txt.setText("You have drinked " + a + " bottle of water for today.");
    }

    public void btnDown(View view) {
        user.setWater(user.getWater() - 1);
        int a = user.getWater();
        txt.setText("You have drinked " + a + " bottle of water for today.");
    }

    public void btnProg(View view) {
        Intent intent = new Intent(this, Programs.class);
        startActivity(intent);
    }

    public void btnEx(View view) {
        Intent intent = new Intent(this, Exercises.class);
        startActivity(intent);
    }

    public void btnRec(View view) {
        Intent intent = new Intent(this, Recipes.class);
        startActivity(intent);
    }
}
