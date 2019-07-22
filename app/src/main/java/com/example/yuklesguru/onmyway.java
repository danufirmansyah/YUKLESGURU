package com.example.yuklesguru;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class onmyway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onmyway);
    }

    public void Pindah5 (View view) {
        Intent intent = new Intent(onmyway.this, teachingprocess.class);
        startActivity(intent);
    }
}
