package com.example.busmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                SharedPreferences pref = getSharedPreferences("login",MODE_PRIVATE);
                Boolean check = pref.getBoolean("flag",false);
                Intent i;
                if(check)
                {
                    i = new Intent(getBaseContext(), LoginPage.class);
                }
                else {
                    i = new Intent(getBaseContext(), HomePage.class);
                }
                startActivity(i);
                finish();
            }
        },5000);
    }
}
