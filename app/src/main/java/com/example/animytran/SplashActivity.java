package com.example.animytran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView splash1 = findViewById(R.id.iV1);

        Animation fadeIn = new AlphaAnimation(0,1);
        fadeIn.setDuration(2000);
        splash1.startAnimation(fadeIn);

        splash1.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent irAHome = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(irAHome);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
    protected void OnDestroy(){
        super.onDestroy();
        ImageView splash1 = findViewById(R.id.iV1);
        splash1.removeCallbacks(null);
    }
}