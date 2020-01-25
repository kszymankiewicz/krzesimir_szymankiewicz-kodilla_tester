package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearProduction;

    public OperatingSystem(int yearProduction) {
        this.yearProduction = yearProduction;
    }


    public void turnOn() {
        System.out.println("Program włączony");

    }

    public void turnOff() {
        System.out.println("program wyłaczony");

    }

    public int getYearProduction() {
        System.out.println(" Wyprodukowany w " + yearProduction);
        return yearProduction;
    }
}
