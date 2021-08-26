package com.example.my_hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int setnum;
    private TextView result;
    private String actions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        findViewById(R.id.key_1).setOnClickListener(view -> {
            setnum *= 10;
            setnum += 1;
            update();
        });
        findViewById(R.id.key_2).setOnClickListener(view -> {
            setnum *= 10;
            setnum += 2;
            update();
        });
        findViewById(R.id.key_3).setOnClickListener(view -> {
            setnum *= 10;
            setnum += 3;
            update();
        });
        findViewById(R.id.key_4).setOnClickListener(view -> {
            setnum *= 10;
            setnum += 4;
            update();
        });
        findViewById(R.id.key_5).setOnClickListener(view -> {
            setnum *= 10;
            setnum += 5;
            update();
        });
        findViewById(R.id.key_6).setOnClickListener(view -> {
            setnum *= 10;
            setnum += 6;
            update();
        });
        findViewById(R.id.key_7).setOnClickListener(view -> {
            setnum *= 10;
            setnum += 7;
            update();
        });
        findViewById(R.id.key_8).setOnClickListener(view -> {
            setnum *= 10;
            setnum += 8;
            update();
        });
        findViewById(R.id.key_9).setOnClickListener(view -> {
            setnum *= 10;
            setnum += 9;
            update();
        });
        findViewById(R.id.key_0).setOnClickListener(view -> {
            setnum *= 10;
            setnum += 0;
            update();
        });
        findViewById(R.id.key_clear).setOnClickListener(view -> {
            setnum=0;
            update();
        });


    }


    private void update() {
        result.setText(String.valueOf(setnum));
    }
    }
