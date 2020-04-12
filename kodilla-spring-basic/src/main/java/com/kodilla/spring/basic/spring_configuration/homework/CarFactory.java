package com.kodilla.spring.basic.spring_configuration.homework;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class CarFactory {
    @Bean
    public Car createSedan() {
        return new Sedan();
    }

    @Bean
    public Car createSUV() {
        return new SUV();
    }

    @Bean
    public Car createCabrio() {
        return new Cabrio();
    }



    public Car getCar(String season, LocalTime time) {
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

