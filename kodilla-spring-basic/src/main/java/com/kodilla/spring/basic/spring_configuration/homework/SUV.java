package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car {
    boolean light;

    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime of) {
        return light;
    }

    @Override
    public String getCarType(String summer) {
        return "SUV";
    }

    @Override
    public boolean setLight(boolean value) {
        return value;

    }
}
