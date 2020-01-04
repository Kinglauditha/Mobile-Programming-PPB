package lauditha.ananda.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

            Button btnjoin = findViewById(R.id.btnJoin);
            btnjoin.setOnClickListener(this);
        }

        @Override
        public void onClick(View V) {
            switch (V.getId()){
                case R.id.btnJoin:
                Intent moveDaftar = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(moveDaftar);
                break;
            }
        }
    }



