package com.aghdami.falltest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    imageAdapter imageAdapter;
    ArrayList<images>imagesArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);

        imagesArrayList=new ArrayList<>();
        String imgurl="https://images.unsplash.com/photo-1572540796210-ac1ff11c2705?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTYxfHxBdXR1bW58ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60";
        String imgurl2="https://images.unsplash.com/photo-1603174381969-28cd173a9661?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTgwfHxBdXR1bW58ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60";
        String imgurl3="https://images.unsplash.com/photo-1520305795465-0e97a0e6a711?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjQ3fHxBdXR1bW58ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60";
        String imgurl4="https://images.unsplash.com/photo-1567801097531-70294b7afbdc?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MzAxfHxBdXR1bW58ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60";
        String imgurl5="https://images.unsplash.com/photo-1569257673845-91882b5a6eba?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NDYzfHxBdXR1bW58ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60";
        imagesArrayList.add(new images(imgurl));
        imagesArrayList.add(new images(imgurl2));
        imagesArrayList.add(new images(imgurl3));
        imagesArrayList.add(new images(imgurl4));
        imagesArrayList.add(new images(imgurl5));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        imageAdapter=new imageAdapter(MainActivity.this,imagesArrayList);
        recyclerView.setAdapter(imageAdapter);
    }
}