package com.example.travelapp.Data;

import android.content.Context;

import com.example.travelapp.Modal.Petrol;
import com.example.travelapp.R;

import java.util.ArrayList;

public class PetrolData {

    public static ArrayList<Petrol> getPetrolData(Context context) {
        ArrayList<Petrol> petrolsData = new ArrayList<>();
        petrolsData.add(new Petrol(context.getResources().getString(R.string.petrol1), context.getResources().getString(R.string.petroladd1)));
        petrolsData.add(new Petrol(context.getResources().getString(R.string.petrol2), context.getResources().getString(R.string.petroladd2)));
        petrolsData.add(new Petrol(context.getResources().getString(R.string.petrol3), context.getResources().getString(R.string.petroladd3)));
        petrolsData.add(new Petrol(context.getResources().getString(R.string.petrol4), context.getResources().getString(R.string.petroladd4)));
        petrolsData.add(new Petrol(context.getResources().getString(R.string.petrol1), context.getResources().getString(R.string.petroladd1)));
        petrolsData.add(new Petrol(context.getResources().getString(R.string.petrol2), context.getResources().getString(R.string.petroladd2)));
        petrolsData.add(new Petrol(context.getResources().getString(R.string.petrol3), context.getResources().getString(R.string.petroladd3)));
        return petrolsData;
    }

    public static ArrayList<Petrol> getHospitalData(Context context) {
        ArrayList<Petrol> hospitals = new ArrayList<>();
        hospitals.add(new Petrol(context.getResources().getString(R.string.hospitalna1), context.getResources().getString(R.string.hosadd1)));
        hospitals.add(new Petrol(context.getResources().getString(R.string.hospitalna2), context.getResources().getString(R.string.hosadd2)));
        hospitals.add(new Petrol(context.getResources().getString(R.string.hospitalna3), context.getResources().getString(R.string.hosadd3)));
        hospitals.add(new Petrol(context.getResources().getString(R.string.hospitalna1), context.getResources().getString(R.string.hosadd1)));
        hospitals.add(new Petrol(context.getResources().getString(R.string.hospitalna2), context.getResources().getString(R.string.hosadd2)));
        hospitals.add(new Petrol(context.getResources().getString(R.string.hospitalna3), context.getResources().getString(R.string.hosadd3)));
        hospitals.add(new Petrol(context.getResources().getString(R.string.hospitalna1), context.getResources().getString(R.string.hosadd1)));
        hospitals.add(new Petrol(context.getResources().getString(R.string.hospitalna2), context.getResources().getString(R.string.hosadd2)));
        hospitals.add(new Petrol(context.getResources().getString(R.string.hospitalna3), context.getResources().getString(R.string.hosadd3)));
        return hospitals;
    }
}
