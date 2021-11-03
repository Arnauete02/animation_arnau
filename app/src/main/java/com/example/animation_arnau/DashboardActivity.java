package com.example.animation_arnau;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    ImageView logo_d;
    TextView title_d;
    TextView subtitle_d;
    ImageView plane1;
    ImageView plane2;
    ImageView plane3;
    ImageView plane4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        logo_d = findViewById(R.id.logo_d);
        title_d = findViewById(R.id.title_d);
        subtitle_d = findViewById(R.id.subtitle_d);
        plane1 = findViewById(R.id.plane1);
        plane2 = findViewById(R.id.plane2);
        plane3 = findViewById(R.id.plane3);
        plane4 = findViewById(R.id.plane4);


    }
}
