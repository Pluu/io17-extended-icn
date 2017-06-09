package com.example.pluu.myapplication;

import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(android.R.id.text1);
        Typeface font = ResourcesCompat.getFont(this, R.font.arizonia);
        tv.setTypeface(font);
    }
}
