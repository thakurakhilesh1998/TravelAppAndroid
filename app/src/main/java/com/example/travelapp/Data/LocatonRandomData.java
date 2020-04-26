package com.example.travelapp.Data;

import com.example.travelapp.Modal.Location;
import com.example.travelapp.R;

import java.util.ArrayList;

public class LocatonRandomData {

    public static ArrayList<Location> getLocationData() {
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location("Bilaspur", "It is distric headquater and situated on the bank of river staluj", R.drawable.banner6));
        locations.add(new Location("Bandladhar", "It is one of the highest peak in Bilaspur. It is famous for  its Paragliding activities.", R.drawable.bandladhar));
        locations.add(new Location("Naina Devi Mata Mandir","It is very auspicious temple for Hindus. It is one of the Saktipith situate in Bilaspur Distric",R.drawable.naina_devi));
        locations.add(new Location("Govind Sagar Lake","I added to the beauty of the Bilaspur, It is made due to dam on Satluj River called as Bhakra Dam",R.drawable.govind_sagar));
        locations.add(new Location("Bilaspur", "It is distric headquater and situated on the bank of river staluj", R.drawable.banner6));
        locations.add(new Location("Bandladhar", "It is one of the highest peak in Bilaspur. It is famous for  its Paragliding activities.", R.drawable.bandladhar));
        locations.add(new Location("Naina Devi Mata Mandir","It is very auspicious temple for Hindus. It is one of the Saktipith situate in Bilaspur Distric",R.drawable.naina_devi));
        locations.add(new Location("Govind Sagar Lake","I added to the beauty of the Bilaspur, It is made due to dam on Satluj River called as Bhakra Dam",R.drawable.govind_sagar));
        return locations;
    }
}
