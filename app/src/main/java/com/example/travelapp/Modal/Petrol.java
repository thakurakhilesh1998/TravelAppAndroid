package com.example.travelapp.Modal;

public class Petrol {
    String name;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Petrol(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
