package com.pavelpotapov.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final String WEATHER = "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=7b7de927047026f2f798a4f49f92c528&lang=ru&units=metric";
    private EditText editTextCity;
    private TextView textViewWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextCity = findViewById(R.id.editTextCity);
        textViewWeather = findViewById(R.id.textViewWeather);
    }
}