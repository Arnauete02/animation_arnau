package com.example.animation_arnau;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static int SPLASH_SCREEN = 2;

    private ImageView logo;
    private TextView title1;
    private TextView subtitle1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.logo);
        title1 = findViewById(R.id.title1);
        subtitle1 = findViewById(R.id.subtitle1);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //Intent
                Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<View,String>(logo, "logo_origen");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,
                        pairs);
                startActivity(intent, options.toBundle());
            }
        };

        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(runnable,SPLASH_SCREEN);
    }
}