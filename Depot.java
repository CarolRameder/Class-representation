package com.company;

import java.util.ArrayList;
import java.util.List;

public class Depot {


    private String name;
    private List<Vehicle> vehicles;

    public Depot() {
        this.vehicles = new ArrayList<>();
    }

    public Depot(String name){
        this.vehicles = new ArrayList<>();
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle v) {
        if (!(vehicles.contains(v))){
            vehicles.add(v);
        }

    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * Method for checking equality between two depots
     * It first checks for the name and then compares the list of vehicles
     * @param obj - the object to be checked equality with
     * @return if they are equal
     */
    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Depot)){
            return false;
        }

        Depot other = (Depot) obj;
        if(this.name.equals(other.name)){
            return this.vehicles.containsAll(other.vehicles)
                    && other.vehicles.containsAll(this.vehicles);
        }
        return false;
    }
}