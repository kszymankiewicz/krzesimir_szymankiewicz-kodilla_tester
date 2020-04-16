package com.kodilla.spring.basic.spring_configuration.homework;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Configuration
public class CarFactory {

    private String season;
    private LocalTime time;

    public Car createSedan() {
        return new Sedan();
    }


    public Car createSUV() {
        return new SUV();
    }


    public Car createCabrio() {
        return new Cabrio();
    }

@Bean
  public Car getCar() {
    this.season = season;
    this.time = time;
    Car car = getCar(season);

        if (time.isAfter(LocalTime.of(6, 0)) && time.isBefore(LocalTime.of(20, 0))) {
            car.setLight(false);
        } else {
            car.setLight(true);
        }
        return car;
    }


    private Car getCar(String season) {
        switch (season) {
            case "Spring":
            case "Autumn":
                return createSedan();

            case "Winter":
                return createSUV();
            case "Summer":
                return createCabrio();
            default:
                return null;
        }


    }

}

