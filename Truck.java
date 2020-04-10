package com.company;

public class Truck extends Vehicle{

    public Truck(){

    }

    public Truck(String name){
        super(VehicleType.TRUCK,name);
    }

    @Override
    public String toString() {
        return "Truck{}";
    }
}
