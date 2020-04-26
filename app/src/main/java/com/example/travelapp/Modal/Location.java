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

    public void setNameLocation(String nameLocation) {
        this.nameLocation = nameLocation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
