package com.company;

import java.util.*;

public class Problem {

    List<Depot> depotList;

    public Problem(){
        this.depotList = new ArrayList<>();
    }

    public void simulation() {
        Vehicle V1 = new Car("V1");
        Vehicle V2 = new Truck("V2");
        Vehicle V3 = new Drone("V3");
        Depot D1 = new Depot("D1");
        Depot D2 = new Depot("D2");
        depotList.add(D1);
        depotList.add(D2);
        D1.addVehicle(V1);
        D1.addVehicle(V2);
        D2.addVehicle(V3);
        V3.setName("V3");
        V2.setName("V2");
        Client C1 = new Client(1,"C1");
        Client C2 = new Client(1,"C2");
        Client C3 = new Client(2,"C3");
        Client C4 = new Client(2,"C4");
        Client C5 = new Client(3,"C5");
        List<Client> simClientList = new ArrayList<>(Arrays.asList(C1,C2,C3,C4,C5));
        Solution solution = generateSolution(depotList,simClientList);
        System.out.println(solution);
    }

    public List<Vehicle> getVehicles() {
        List<Vehicle> vehicleList = new ArrayList<>();
        depotList.forEach(d -> vehicleList.addAll(d.getVehicles()));
        return vehicleList;
    }

    public Solution generateSolution(List<Depot> depotList, List<Client> clientList) {
        Map<Vehicle, List<Client>> schedule = new HashMap<>();
        for (int currentDepotIndex = 0; currentDepotIndex < depotList.size() && !clientList.isEmpty(); currentDepotIndex++) {
            Depot currentDepot = depotList.get(currentDepotIndex);
            List<Vehicle> vehicleList = currentDepot.getVehicles();
            for (int currentVehicleIndex = 0; currentVehicleIndex < vehicleList.size() && !clientList.isEmpty(); currentVehicleIndex++) {
                Vehicle currentVehicle = vehicleList.get(currentVehicleIndex);
                if(!schedule.containsKey(currentVehicle)){
                    schedule.put(currentVehicle,new ArrayList<>());
                }
                List<Client> currentVehicleSchedule = schedule.get(currentVehicle);
                ListIterator<Client> iter = clientList.listIterator();
                while (iter.hasNext()) {
                    Client currentClient = iter.next();
                    boolean isScheduled = true;
                    for (Client client : currentVehicleSchedule) {
                        if (client.getTime() == currentClient.getTime()) {
                            isScheduled = false;
                            break;
                        }
                    }
                    if (isScheduled) {
                        currentVehicleSchedule.add(currentClient);
                        iter.remove();
                    }
                }
                schedule.put(currentVehicle, currentVehicleSchedule);
            }
        }
        return new Solution(depotList,schedule);
    }

    @Override
    public String toString() {
        return "Problem{}";
    }
}
