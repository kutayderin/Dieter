package com.example.final0;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.final0.ui.dashboard.DashboardFragment;
import com.example.final0.ui.home.HomeFragment;
import com.example.final0.ui.notifications.NotificationsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class deneme extends AppCompatActivity {

    BottomNavigationView nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_deneme);
        BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selected = null;
                switch(menuItem.getItemId()) {
                    case R.id.navigation_home:
                        selected = new HomeFragment();
                        break;
                    case R.id.navigation_program:
                        selected = new DashboardFragment();
                        break;
                    case R.id.navigation_exercises:
                        selected = new NotificationsFragment();
                        break;
                }
                return true;
            }
        };
    }
}
