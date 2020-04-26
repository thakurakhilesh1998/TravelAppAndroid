package com.example.travelapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelapp.Modal.Petrol;

import java.util.ArrayList;

class HospitalAdapter extends RecyclerView.Adapter<HospitalAdapter.Holder> {
    Context context;
    ArrayList<Petrol> petrolData;

    public HospitalAdapter(Context context, ArrayList<Petrol> petrolData) {
        this.context = context;
        this.petrolData = petrolData;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.hospital, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.tvName.setText(petrolData.get(position).getName());
        holder.tvAddress.setText(petrolData.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return petrolData.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvAddress;

        public Holder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvAddress = itemView.findViewById(R.id.tvAddress);
        }
    }
}
