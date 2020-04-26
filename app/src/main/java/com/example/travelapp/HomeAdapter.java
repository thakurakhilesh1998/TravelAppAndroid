package com.example.travelapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelapp.Modal.Location;

import java.util.ArrayList;

class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.Holder> {
    Context context;
    ArrayList<Location> locationData;
    public HomeAdapter(Context context, ArrayList<Location> locationData) {
        this.context=context;
        this.locationData=locationData;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        holder.img.setImageResource(locationData.get(position).getImage());
        holder.tvName.setText(locationData.get(position).getNameLocation());
        holder.tvDesc.setText(locationData.get(position).getDescription());

    }

    @Override
    public int getItemCount() {

        return locationData.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tvName;
        TextView tvDesc;
        public Holder(@NonNull View itemView) {
            super(itemView);
             img=itemView.findViewById(R.id.ivImage);
             tvName=itemView.findViewById(R.id.tvName);
             tvDesc=itemView.findViewById(R.id.tvDesc);
        }
    }
}
