package com.example.rinanitip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.rinanitip.helper.SharedPref;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (SharedPref.getInstance(SplashActivity.this).isLogin()){
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            }

        }, 2000);
    }
}
