package com.company;
public class Car extends Vehicle {

    public Car(){
        super();
    }

    public Car(String name){
        super(VehicleType.CAR,name);
    }

    @Override
    public String toString() {
        return "Car{}";
    }
}
