package com.kodilla.collections.adv.exercises.homework;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class FlightFinder {
    private List<Flight> flightList = new LinkedList<>();

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> depertures = new ArrayList<>();
        for (Flight a : flightList) {
            if (departure.equals(a.getDeparture())) {
                depertures.add(a);
            }
        }

        return depertures;

    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> arrivals = new ArrayList<>();
        for (Flight a : flightList) {
            if (arrival.equals(a.getArrival())) {
                arrivals.add(a);
            }
        }

        return arrivals;
    }
}
