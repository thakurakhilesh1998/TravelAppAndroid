package com.example.travelapp.Data;

import android.content.Context;

import com.example.travelapp.Modal.Lake;
import com.example.travelapp.R;

import java.util.ArrayList;

public class LakeData {

    public static ArrayList<Lake> getLakeData(Context context) {
        ArrayList<Lake> lake = new ArrayList<Lake>();
        lake.add(new Lake(context.getResources().getString(R.string.lakename1), R.drawable.banner6, context.getResources().getString(R.string.lakdes1)));
        lake.add(new Lake(context.getResources().getString(R.string.lakename2), R.drawable.sir_khad, context.getResources().getString(R.string.lakedes2)));
        lake.add(new Lake(context.getResources().getString(R.string.lakename3), R.drawable.markanda, context.getResources().getString(R.string.lakedes3)));
        lake.add(new Lake(context.getResources().getString(R.string.lakename4), R.drawable.rukmani_kund, context.getResources().getString(R.string.lakedes4)));
        return lake;
    }
}
