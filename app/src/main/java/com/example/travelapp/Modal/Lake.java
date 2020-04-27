package com.example.travelapp.Modal;

public class Lake {

    String lakeName;
    int lakePhoto;
    String description;

    public Lake(String lakeName, int lakePhoto, String description) {
        this.lakeName = lakeName;
        this.lakePhoto = lakePhoto;
        this.description = description;
    }

    public String getLakeName() {
        return lakeName;
    }

    public int getLakePhoto() {
        return lakePhoto;
    }

    public String getDescription() {
        return description;
    }

}
