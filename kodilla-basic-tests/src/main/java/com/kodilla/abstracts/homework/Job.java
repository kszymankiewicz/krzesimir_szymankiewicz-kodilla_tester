package com.kodilla.abstracts.homework;

public abstract class Job  {
    private int salary;
    private String responsibilities;
    private String firstName;

    public Job(String firstName) {
        this.firstName=firstName;
    }


    public String getFirstName() {
        return firstName;

    }

    public abstract void personResponsibilities();


}

