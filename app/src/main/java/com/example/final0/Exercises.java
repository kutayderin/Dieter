package com.example.final0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Exercises extends AppCompatActivity {

    EditText txtRun, txtSwim, txtSoccer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        txtRun = findViewById(R.id.editText4);
        txtSwim = findViewById(R.id.editText5);
        txtSoccer = findViewById(R.id.editText6);

        if(txtSoccer.isFocused())
            txtSoccer.setText("");

        if(txtRun.isFocused())
            txtSwim.setText("");
    }

    public void swimClick(View view) {
        if(txtSwim.isFocused())
            txtSwim.setText("");
    }
}
