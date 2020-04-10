package com.company;

import java.util.ArrayList;
import java.util.List;

public class Tour {

    private Depot depot;
    private Vehicle vehicle;
    private List<Client> clients;
//const
    public Tour(Vehicle vehicle) {
        this.clients = new ArrayList<>();
        this.vehicle = vehicle;
    }
    public Tour() {
        this.clients = new ArrayList<>();
    }

    //getter
    public Depot getDepot() {
        return this.depot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public List<Client> getClients() {
        return clients;
    }
//setter
    public void setDepot(Depot depot) {
        this.depot = depot;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    //method
    public void addClient(Client c)
    {
        clients.add(c);
    }

    @Override
    public String toString() {
        return vehicle +" : "+depot + " -> "+ clients+ " -> " + depot;

    }
}