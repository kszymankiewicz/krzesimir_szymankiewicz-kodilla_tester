package com.kodilla.spring.basic.spring_configuration.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void shouldGetTheCarTypeCabrio() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car cabrio = (Car) context.getBean("getCar");
        //when
        String result = cabrio.getCarType("Summer");
        //then
        assertEquals("Cabrio", result);

    }

    @Test
    public void shouldGetTheCarTypeSuv() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car suv = (Car) context.getBean("getCar");
        //when
        String result = suv.getCarType("Winter");
        //then
        assertEquals("SUV", result);

    }

    @Test
    public void shouldGetTheCarTypeSedan() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car sedan = (Car) context.getBean("getCar");
        //when
        String result = sedan.getCarType("Summer");
        //then
        assertEquals("Sedan", result);

    }

    @Test
    public void shouldTurnLightsOffBetween6And20() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("getCar");
        //when
        boolean result = car.hasHeadlightsTurnedOn(LocalTime.of(2, 15));
        Assertions.assertEquals(false, result);

    }

    @Test
    public void shouldTurnLightsOffBetween20And6() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("getCar");
        //when
        boolean result = car.hasHeadlightsTurnedOn(LocalTime.of(22, 15));
        Assertions.assertEquals(true, result);

    }
}