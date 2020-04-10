package com.company;

public abstract class Vehicle {

    private String name;
    private VehicleType type;

    public Vehicle(VehicleType type, String name) {
        this.type = type;
        this.name = name;
    }

    public Vehicle() {
    }

    public String getName() {
        return name;
    }

    public VehicleType getType() {
        return type;
    }

    void setName(String name) {
        this.name = name;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Vehicle)){
            return false;
        }
        Vehicle other = (Vehicle) obj;

        if(this.type == other.type)
            return this.name.equals(other.name);

        return false;
    }
}