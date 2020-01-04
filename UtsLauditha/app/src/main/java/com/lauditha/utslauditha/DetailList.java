package com.lauditha.utslauditha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailList extends AppCompatActivity {

    private int book_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<book> listBook = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list);

        book_id = getIntent().getIntExtra("book_id", 0);
        tvName = findViewById(R.id.nama_book);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listBook.addAll(BookData.getListData());

        setLayout();
    }

    private void setLayout() {
        tvName.setText(listBook.get(book_id).getName());
        tvDesc.setText(listBook.get(book_id).getDescription());
        Glide.with(this)
                .load(listBook.get(book_id).getPhoto())
                .apply(new RequestOptions ().fitCenter())
                .into(imgDetail);
    }
}

