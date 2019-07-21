package com.example.yuklesguru;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class location extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);


    }
    public void Pindah4 (View view) {
        Intent intent = new Intent(location.this, onmyway.class);
        startActivity(intent);
    }
}
