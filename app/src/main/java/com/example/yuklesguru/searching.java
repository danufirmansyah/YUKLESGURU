package com.example.yuklesguru;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

public class searching extends AppCompatActivity {

    private int waktu_loading = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_searching);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent detail_job = new Intent(searching.this, detail_job.class);
                startActivity(detail_job);
                finish();
            }
        },waktu_loading);
    }
}
