package com.example.travelapp.Modal;

public class Lake {

    String lakeName;
    int lakePhoto;
    String description;

    public String getLakeName() {
        return lakeName;
    }

    public void setLakeName(String lakeName) {
        this.lakeName = lakeName;
    }

    public int getLakePhoto() {
        return lakePhoto;
    }

    public void setLakePhoto(int lakePhoto) {
        this.lakePhoto = lakePhoto;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Lake(String lakeName, int lakePhoto, String description) {
        this.lakeName = lakeName;
        this.lakePhoto = lakePhoto;
        this.description = description;
    }
}
