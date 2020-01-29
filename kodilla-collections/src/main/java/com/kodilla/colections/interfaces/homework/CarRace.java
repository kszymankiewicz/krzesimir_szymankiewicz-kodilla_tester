package com.kodilla.colections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(80);
        doRace(ford);
        getCarSpeed(ford);

        Opel opel = new Opel(90);
        doRace(opel);
        getCarSpeed(opel);

        Volvo volvo = new Volvo(85);
        doRace(volvo);
        getCarSpeed(volvo);


    }

    public static void doRace(Car car) {

        System.out.println(car.increaseSpeed() + car.decreaseSpeed() + car.increaseSpeed() + car.decreaseSpeed() + car.increaseSpeed());
    }

    public static void getCarSpeed(Car car){

        System.out.println(car.getSpeed());
    }


    }

