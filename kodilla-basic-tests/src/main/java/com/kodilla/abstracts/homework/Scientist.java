package com.kodilla.abstracts.homework;

public class Scientist extends Job {
    public Scientist() {
        super("Kamila");

    }


    @Override
    public void personResponsibilities() {
        String[] responsibilities = new String[4];
        responsibilities[0] = "Develop and issue educational content including notes, tests, and assignments";
        responsibilities[1] = "Supervise classes to ensure all students are learning in a safe and productive environment.";
        responsibilities[2] = "Organize supplies and resources for lectures and presentations.";
        responsibilities[3] = "Plan and implement educational activities and events.";
        System.out.println(getFirstName()  + " is a scientist with responsibility:");

        for (int i = 0; i < responsibilities.length; i++) {

            System.out.println(responsibilities[i]);
        }
    }


}

