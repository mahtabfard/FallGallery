package com.aghdami.falltest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class imageAdapter extends RecyclerView.Adapter<imageAdapter.imageViewHolder> {
    Context context;
    ArrayList<images> imagesArrayList;

    public imageAdapter(Context context, ArrayList<images> imagesArrayList) {
        this.context = context;
        this.imagesArrayList = imagesArrayList;
    }

    @NonNull
    @Override
    public imageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.images_card,parent,false);
        return new imageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull imageViewHolder holder, int position) {
        images images=imagesArrayList.get(position);
        String imgurl;
        imgurl=images.getImg();
       Picasso.get().load(imgurl).into(holder.imageview);

    }

    @Override
    public int getItemCount() {

        return imagesArrayList.size();
    }

    public class imageViewHolder extends RecyclerView.ViewHolder{
        ImageView imageview;

        public imageViewHolder(@NonNull View itemView) {
            super(itemView);
            imageview=itemView.findViewById(R.id.img);
        }
    }
}