package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {
    boolean light;

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return light;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }

    @Override
    public boolean setLight(boolean value) {
        return value;

    }
}
