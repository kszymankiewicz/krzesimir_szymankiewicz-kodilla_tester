package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car {
    boolean light;

    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime of) {
        return light;
    }

    @Override
    public String getCarType(String summer) {
        return "Cabrio";
    }

    @Override
    public boolean setLight(boolean value) {
        return value;
    }
}
