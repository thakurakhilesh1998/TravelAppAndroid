package com.example.travelapp.Data;

import android.content.Context;

import com.example.travelapp.Modal.Location;
import com.example.travelapp.R;

import java.util.ArrayList;

public class LocatonRandomData {

    public static ArrayList<Location> getLocationData(Context context) {
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(context.getResources().getString(R.string.locname1), context.getResources().getString(R.string.locaddress1), R.drawable.banner6));
        locations.add(new Location(context.getResources().getString(R.string.locname2), context.getResources().getString(R.string.locaddress2), R.drawable.bandladhar));
        locations.add(new Location(context.getResources().getString(R.string.locname3), context.getResources().getString(R.string.locaddress3), R.drawable.naina_devi));
        locations.add(new Location(context.getResources().getString(R.string.locname4), context.getResources().getString(R.string.locaddress4), R.drawable.govind_sagar));
        locations.add(new Location(context.getResources().getString(R.string.locname1), context.getResources().getString(R.string.locaddress1), R.drawable.banner6));
        locations.add(new Location(context.getResources().getString(R.string.locname2), context.getResources().getString(R.string.locaddress2), R.drawable.bandladhar));
        locations.add(new Location(context.getResources().getString(R.string.locname3), context.getResources().getString(R.string.locaddress3), R.drawable.naina_devi));
        locations.add(new Location(context.getResources().getString(R.string.locname4), context.getResources().getString(R.string.locaddress4), R.drawable.govind_sagar));
        return locations;
    }
}
