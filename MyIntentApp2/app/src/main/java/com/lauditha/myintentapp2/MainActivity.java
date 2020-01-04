package com.lauditha.myintentapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMoveActivity;
    Button btnMoveData;
    Button btnDial;
    Button btnLink;
    Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveData = findViewById(R.id.btn_move_data);
        btnMoveData.setOnClickListener(this);

        btnDial = findViewById(R.id.BtnDial);
        btnDial.setOnClickListener(this);

        btnLink = findViewById(R.id.btnLink);
        btnLink.setOnClickListener(this);

        btnMove = findViewById(R.id.btnHalaman2);
        btnMove.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_move_activity:
                Intent moveActivity = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveActivity);
                break;
            case R.id.btn_move_data:
                Intent moveDataActivity = new Intent(MainActivity.this, MoveActivityWithData.class);
                moveDataActivity.putExtra(MoveActivityWithData.EXTRA_NAME, "Lauditha Anands Mura");
                moveDataActivity.putExtra(MoveActivityWithData.EXTRA_AGE, 19);
                startActivity(moveDataActivity);
                break;
            case R.id.BtnDial:
                String phoneNumber = "081901148693";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhone);
                break;
            case R.id.btnLink:
                Uri webpage = Uri.parse("https://www.polines.ac.id");
                Intent urlweb = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(urlweb);
                break;
            case R.id.btnHalaman2:
                Intent Pindah1 = new Intent(MainActivity.this, PindahPolines1.class);
                startActivity(Pindah1);
                break;
        }

    }
}