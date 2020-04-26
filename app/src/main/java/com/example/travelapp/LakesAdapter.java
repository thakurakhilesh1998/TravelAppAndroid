package com.example.travelapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelapp.Modal.Lake;

import java.util.ArrayList;

class LakesAdapter extends RecyclerView.Adapter<LakesAdapter.Holder> {
    Context context;
    ArrayList<Lake> lakeData;

    public LakesAdapter(Context context, ArrayList<Lake> lakeData) {
        this.context = context;
        this.lakeData = lakeData;
    }

    @NonNull
    @Override
    public LakesAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LakesAdapter.Holder holder, int position) {
        holder.tvName.setText(lakeData.get(position).getLakeName());
        holder.tvDesc.setText(lakeData.get(position).getDescription());
        holder.ivImage.setImageResource(lakeData.get(position).getLakePhoto());
    }

    @Override
    public int getItemCount() {
        return lakeData.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvDesc;
        ImageView ivImage;

        public Holder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvDesc = itemView.findViewById(R.id.tvDesc);
            ivImage = itemView.findViewById(R.id.ivImage);
        }
    }
}


