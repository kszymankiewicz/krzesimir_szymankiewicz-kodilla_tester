package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {
    @Test
    public void addFlightDeparture() {

        //given
        FlightFinder flights= new FlightFinder();
        flights.findFlightsFrom("Warsaw");
        flights.findFlightsFrom("Moscow");
        flights.findFlightsFrom("Barcelona");

        //when
        List<Flight>  departures = flights.findFlightsFrom("Warsaw");
        //then
        assertEquals(3,departures.size());
}

@Test
    public void addFlightArrival() {

    //given
    FlightFinder flights = new FlightFinder();
    flights.findFlightsFrom("Barcelona");
    flights.findFlightsFrom("Berlin");
    flights.findFlightsFrom("Moscow");
    //when
    List<Flight> arrivals = flights.findFlightsTo("Berlin");
    //then
    assertEquals(3, arrivals.size());

}

}
