package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public interface Car {

    boolean hasHeadlightsTurnedOn(LocalTime of);
    String getCarType(String season);
    boolean setLight(boolean value);


}