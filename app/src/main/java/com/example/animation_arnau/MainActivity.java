package com.example.animation_arnau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView logo;
    TextView title1;
    TextView subtitle1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.logo);
        title1 = findViewById(R.id.title1);
        subtitle1 = findViewById(R.id.subtitle1);
    }
}