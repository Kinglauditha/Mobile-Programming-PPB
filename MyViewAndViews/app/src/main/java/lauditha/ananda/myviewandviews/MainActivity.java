package lauditha.ananda.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button donasibutton = findViewById(R.id.buttondonasi);
        donasibutton.setOnClickListener(this);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Donasi Pesawat R80");
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttondonasi:
                Intent Donasi = new Intent(MainActivity.this, DonasiActivity.class);
                startActivity(Donasi);
                break;
        }
    }
}
