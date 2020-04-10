package com.company;

import java.util.List;
import java.util.Map;

public class Solution {

    List<Depot> depotList;
    Map<Vehicle, List<Client>> schedule;

    public Solution(List<Depot> depotList, Map<Vehicle, List<Client>> schedule) {
        this.depotList = depotList;
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        StringBuilder solutionPrint = new StringBuilder();
        for (Depot depot : depotList) {
            for (Vehicle vehicle : depot.getVehicles()) {
                if (schedule.containsKey(vehicle)) {
                    solutionPrint.append(vehicle.getName())
                            .append(": ")
                            .append(depot.toString())
                            .append(" ->");

                    schedule.get(vehicle)
                            .forEach(c -> solutionPrint.append(" ")
                                    .append(c.getName())
                                    .append(" ->"));

                    solutionPrint.append(" ").append(depot.toString()).append('\n');
                }
            }
        }
        return solutionPrint.toString();
    }
}
