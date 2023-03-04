package com.example.stopwatch;


import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Chronometer chronometer;
    private long PauseOffSet = 0;
    private boolean isPlaying = false;
    private Button start_btn;
    private Button stop_btn;
    private Button reset_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Let's select our element
        chronometer = findViewById(R.id.chronometer);
        start_btn= findViewById(R.id.btnStart);
        stop_btn = findViewById(R.id.btnStop);
        reset_btn = findViewById(R.id.btnReset);

        start_btn.setOnClickListener(v -> {
                    chronometer.setBase(SystemClock.elapsedRealtime()- PauseOffSet);
                    chronometer.start();
                    isPlaying = true;
        });


        stop_btn.setOnClickListener(v -> {
                if(isPlaying){
                    chronometer.stop();
                    isPlaying = false;
                }
        });

        reset_btn.setOnClickListener(v -> {
            chronometer.setBase(SystemClock.elapsedRealtime());
        });
    }
}