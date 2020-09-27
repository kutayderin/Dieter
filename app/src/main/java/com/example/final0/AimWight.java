package com.example.final0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AimWight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aim_wight);
    }

    public void onClick(View view) {
        Button button = findViewById(R.id.button3);
        EditText editText2 = findViewById(R.id.editText2);

        if(editText2.getText().length() == 0) {
            Toast.makeText(this, "aim weight is empty", Toast.LENGTH_LONG).show();
            return;
        }

        Intent intent = new Intent(this, CurWeight.class);
        startActivity(intent);
    }
}
