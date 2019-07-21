package com.example.yuklesguru;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Maintenance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance);
    }

    public void Pindah7 (View view) {
        Intent intent = new Intent(Maintenance.this, home.class);
        startActivity(intent);
    }
}
