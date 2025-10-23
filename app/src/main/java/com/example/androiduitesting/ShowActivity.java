package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    public static final String EXTRA_CITY_NAME = "extra_city_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView tv = findViewById(R.id.text_city_name);
        Button back = findViewById(R.id.button_back);

        Intent i = getIntent();
        String name = i.getStringExtra(EXTRA_CITY_NAME);
        tv.setText(name == null ? "" : name);

        back.setOnClickListener(v -> finish());
    }
}
