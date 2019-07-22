package com.example.yuklesguru;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class teachingprocess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachingprocess);
    }

    public void Pindah6 (View view) {
        Intent intent = new Intent(teachingprocess.this, home.class);
        startActivity(intent);
    }
}
