package com.kodilla.abstracts.homework;

public class Pilot extends Job {
    public Pilot() {
        super("Jolanta");
    }

    @Override
    public void personResponsibilities() {
        String[] responsibilities = new String[4];
        responsibilities[0] = "Performing pre and post-flight inspections of fuel, equipment, and navigational systems.";
        responsibilities[1] = "Operating the aircraft safely and maintaining a good degree of professionalism at all times.";
        responsibilities[2] = "Monitoring weather conditions and communicating with air traffic control during flights.";
        responsibilities[3] = "Liaising with co-pilots and flight crew throughout the flight.";
        System.out.println(getFirstName() + " is a pilot with responsibility:");
        for (int i = 0; i < responsibilities.length; i++) {

            System.out.println(responsibilities[i]);
        }
    }

}
