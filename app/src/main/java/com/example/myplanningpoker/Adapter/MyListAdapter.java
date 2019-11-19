package com.example.myplanningpoker.Adapter;

import android.view.View;
import android.widget.TextView;

import com.example.myplanningpoker.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyListAdapter extends  RecyclerView.ViewHolder {


    TextView tv_group;

    public MyListAdapter(@NonNull View itemView) {
        super(itemView);
        tv_group=itemView.findViewById(R.id.tv_group);
    }
}
