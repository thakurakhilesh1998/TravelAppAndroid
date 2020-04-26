package com.example.travelapp.Data;

import com.example.travelapp.Modal.Petrol;

import java.util.ArrayList;

public class PetrolData {

    public static ArrayList<Petrol> getPetrolData() {
        ArrayList<Petrol> petrolsData = new ArrayList<>();
        petrolsData.add(new Petrol("Hindustan Petroleum", "Near Dakri Chowk Ghumarwin Bilaspur-174021"));
        petrolsData.add(new Petrol("Reliance Petroleum", "AwdhaniGhat Ghumarwin Bilaspur-174021"));
        petrolsData.add(new Petrol("Assam Petrol", "Awari Near Ghumani Chowk Bilaspur"));
        petrolsData.add(new Petrol("India Oil", "Nihari Ghumarwin Bilaspur 174026"));
        petrolsData.add(new Petrol("Hindustan Petroleum", "Near College Chowk Bilaspur-174001"));
        petrolsData.add(new Petrol("Reliance Petroleum", "AwdhaniGhat Ghumarwin Bilaspur-174021"));
        petrolsData.add(new Petrol("Assam Petrol", "Awari Near Ghumani Chowk Bilaspur"));
        return petrolsData;
    }

    public static ArrayList<Petrol> getHospitalData() {
        ArrayList<Petrol> hospitals = new ArrayList<>();
        hospitals.add(new Petrol("Civil Hospital Ghumarwin", "Near Dakri Chowk Ghumarwin Bilaspur"));
        hospitals.add(new Petrol("Primary Health Center Panol", "Panol PO Amarpur Teh. Ghumarwin Bilaspur"));
        hospitals.add(new Petrol("Zonal Hospital Bilaspur", "Bilaspur Himachal Pradesh"));
        hospitals.add(new Petrol("Civil Hospital Ghumarwin", "Near Dakri Chowk Ghumarwin Bilaspur"));
        hospitals.add(new Petrol("Primary Health Center Panol", "Panol PO Amarpur Teh. Ghumarwin Bilaspur"));
        hospitals.add(new Petrol("Zonal Hospital Bilaspur", "Bilaspur Himachal Pradesh"));
        hospitals.add(new Petrol("Civil Hospital Ghumarwin", "Near Dakri Chowk Ghumarwin Bilaspur"));
        hospitals.add(new Petrol("Primary Health Center Panol", "Panol PO Amarpur Teh. Ghumarwin Bilaspur"));
        hospitals.add(new Petrol("Zonal Hospital Bilaspur", "Bilaspur Himachal Pradesh"));
        return hospitals;
    }
}
