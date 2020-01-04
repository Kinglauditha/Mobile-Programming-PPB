package com.lauditha.utslauditha;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardBookAdapter extends RecyclerView.Adapter<CardBookAdapter.ListViewHolder> {
    private ArrayList<book> listBook;
    private Context context;

    public CardBookAdapter(Context context, ArrayList<book> listBook) {
        this.listBook = listBook;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final book buku = listBook.get(position);
        Glide.with(holder.itemView.getContext())
                .load(buku.getPhoto())
                .apply(new RequestOptions ().fitCenter())
                .into(holder.imgPhoto);
        holder.tvName.setText(buku.getName());
        holder.tvDesc.setText(buku.getDescription());
        holder.cv.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        } );

        holder.cv.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailList.class);
                intent.putExtra("book_id", buku.getId());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public  int getItemCount () { return listBook.size(); }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_list);
            tvName = itemView.findViewById(R.id.nama_list);
            tvDesc = itemView.findViewById(R.id.desc_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}