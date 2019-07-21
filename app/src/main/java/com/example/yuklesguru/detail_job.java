package com.example.yuklesguru;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class detail_job extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_job);

        }

    public void Pindah2 (View view){
        Intent intent = new Intent(detail_job.this, location.class);
        startActivity(intent);

    }

    public void Pindah3 (View view) {
        Intent intent = new Intent(detail_job.this, home.class);
        startActivity(intent);
    }
}
