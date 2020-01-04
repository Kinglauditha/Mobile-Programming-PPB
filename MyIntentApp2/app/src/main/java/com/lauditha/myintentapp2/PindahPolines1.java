package com.lauditha.myintentapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PindahPolines1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah_polines1);

        Button btnhalaman = findViewById(R.id.btnHalaman2);
        btnhalaman.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnHalaman2 :
                Intent movehalaman2 = new Intent(PindahPolines1.this, PindahPolines2.class);
                startActivity(movehalaman2);
                break;
        }
    }
}