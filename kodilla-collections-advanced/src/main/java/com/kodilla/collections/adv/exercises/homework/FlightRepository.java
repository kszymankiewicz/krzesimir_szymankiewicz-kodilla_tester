package com.kodilla.collections.adv.exercises.homework;

public class FlightRepository {


    private static final Flight[] flights = new Flight[]{
            new Flight("Warsaw", "Barcelona"),
            new Flight("Warsaw", "Berlin"),
            new Flight("Warsaw", "Moscow")
    };

    public static Flight[] getFlightTable() {

        for (int i = 0; i < flights.length; i++) {
            System.out.println(flights[i]);
        }
        return flights;
    }
}




