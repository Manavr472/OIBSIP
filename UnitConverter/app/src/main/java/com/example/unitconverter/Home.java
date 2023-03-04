package com.example.unitconverter;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Home extends AppCompatActivity {


    CardView cv_tmp;
    CardView cv_weight;
    CardView cv_speed;
    CardView cv_length;
    CardView cv_area;
    CardView cv_volume;
    CardView cv_pressure;

    CardView cv_current;
    CardView cv_force;

    CardView cv_resistance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cv_tmp = findViewById(R.id.cv_temp);
        cv_weight = findViewById(R.id.cv_weight);
        cv_length = findViewById(R.id.cv_length);
        cv_speed = findViewById(R.id.cv_Speed);
        cv_area = findViewById(R.id.cv_Area);
        cv_volume = findViewById(R.id.cv_Volume);
        cv_pressure = findViewById(R.id.cv_Pressure);
        cv_current = findViewById(R.id.cv_Current);
        cv_force=findViewById(R.id.cv_Force);
        cv_resistance = findViewById(R.id.cv_Resistance);




        cv_tmp.setOnClickListener(v -> startActivity(new Intent(Home.this, Temperature_calc.class)));
        cv_weight.setOnClickListener(v -> startActivity(new Intent(Home.this, Weight_calc.class)));
        cv_length.setOnClickListener(v -> startActivity(new Intent(Home.this,Length_calc.class)));
        cv_speed.setOnClickListener(v -> startActivity(new Intent(Home.this, Speed_calc.class)));
        cv_area.setOnClickListener(v -> startActivity(new Intent(Home.this, Area_calc.class)));
        cv_volume.setOnClickListener(v -> startActivity(new Intent(Home.this, Volume_calc.class)));
        cv_pressure.setOnClickListener(v -> startActivity(new Intent(Home.this, Pressure_calc.class)));
        cv_current.setOnClickListener(v -> startActivity(new Intent(Home.this, Current_calc.class)));
        cv_force.setOnClickListener(v -> startActivity(new Intent(Home.this, Force_calc.class)));
        cv_resistance.setOnClickListener(v -> startActivity(new Intent(Home.this, Resistance_calc.class)));




    }
}