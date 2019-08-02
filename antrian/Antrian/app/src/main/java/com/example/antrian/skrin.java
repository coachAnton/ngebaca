package com.example.antrian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class skrin extends AppCompatActivity {
    private int waktu_splash = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skrin);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(skrin.this, MainActivity.class);
                startActivity(i);
                finish();

            }
                    } , waktu_splash);

    }
}
