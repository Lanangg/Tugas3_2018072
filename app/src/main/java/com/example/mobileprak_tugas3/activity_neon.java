package com.example.mobileprak_tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_neon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neon);
    }
    public void entry_stopkontak(View view) {
        Intent a = new Intent(activity_neon.this, activity_stopkontak.class);
        startActivity(a);
    }
    public void entry_fitting(View view) {
        Intent a = new Intent(activity_neon.this, activity_fitting.class);
        startActivity(a);
    }
    public void entry_strip(View view) {
        Intent a = new Intent(activity_neon.this, activity_strip.class);
        startActivity(a);
    }
}