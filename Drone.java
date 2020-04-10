package com.company;

public class Drone extends Vehicle{

    public Drone(){

    }

    public Drone(String name){
        super(VehicleType.DRONE,name);
    }

    @Override
    public String toString() {
        return "Drone{}";
    }
}
