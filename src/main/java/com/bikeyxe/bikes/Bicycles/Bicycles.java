package com.bikeyxe.bikes.Bicycles;

import javax.xml.stream.Location;

public class Bicycles {

    public Location getLocation() {
        return location;
    }

    private Location location;
    private int bikeID;

    public Bicycles(int bikeID) {
        this.location = location;
        this.bikeID = bikeID;
    }

    public int getBikeID() {
        return bikeID;
    }
}