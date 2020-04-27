package com.example.travelapp.Modal;

public class Location {

    String nameLocation;
    String description;
    int image;

    public Location(String nameLocation, String description, int image) {
        this.nameLocation = nameLocation;
        this.description = description;
        this.image = image;
    }

    public String getNameLocation() {
        return nameLocation;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

}
