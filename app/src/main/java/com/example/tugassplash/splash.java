package com.example.tugassplash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {

    ImageView logo;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        logo = findViewById(R.id.logo);
        text = findViewById(R.id.Aksi);

        logo.animate().translationX(-4000).setDuration(1000).setStartDelay(2300);
        text.animate().translationX(-4000).setDuration(1000).setStartDelay(2300);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splash.this, MainActivity2.class);
                startActivity(i);
                finish();
            }
        }, 5000);

    }
}