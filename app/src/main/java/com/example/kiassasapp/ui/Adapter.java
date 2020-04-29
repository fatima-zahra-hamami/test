package com.example.kiassasapp.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kiassasapp.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    LayoutInflater layoutInflater;
    private List<String> data;
    public Adapter(Context context, List<String> data){
        this.layoutInflater=LayoutInflater.from(context);
        this.data=data;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= layoutInflater.inflate(R.layout.custom_view,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        //bind the textView with data received
        String title=data.get(i);
        viewHolder.CardNumber.setText(title);
        // also you can set image and description for every card


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
TextView CardNumber;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            CardNumber=itemView.findViewById(R.id.cardNumber);
        }
    }
}
