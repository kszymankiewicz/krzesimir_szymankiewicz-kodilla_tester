package com.kodilla.colections.interfaces.homework;

public class Volvo implements Car {
    private int speed;

    public Volvo(int speed) {
        this.speed = speed;
    }
        @Override
        public int getSpeed () {
            return speed + 3*increaseSpeed() + 2*decreaseSpeed();
        }

        @Override
        public int increaseSpeed () {

            return  + 15;
        }

        @Override
        public int decreaseSpeed() {

            return  -25;
        }
    }
