package com.example.travelapp.Data;

import com.example.travelapp.Modal.Lake;
import com.example.travelapp.R;

import java.util.ArrayList;

public class LakeData {

    public static ArrayList<Lake> getLakeData() {
        ArrayList<Lake> lake = new ArrayList<Lake>();
        lake.add(new Lake("Govind Sagar Lake", R.drawable.banner6, "It is main attraction of the Bilaspur, It is famous for its trout fish and water sports and transportation"));
        lake.add(new Lake("Sir Khad", R.drawable.sir_khad, "It is main trubutory of the satluj river, It is life line for many places in Bilaspur as its water has many water supply built on it."));
        lake.add(new Lake("Markanda", R.drawable.markanda, "It is very religious place. It is present on the shadow of the BandlaDhar and also gets its water form bandla dhar"));
        lake.add(new Lake("Rukmni Kund", R.drawable.rukmani_kund, "It is sign of sacrifice sign of one sacrifice her life for the betterment of his State"));

        return lake;
    }
}
