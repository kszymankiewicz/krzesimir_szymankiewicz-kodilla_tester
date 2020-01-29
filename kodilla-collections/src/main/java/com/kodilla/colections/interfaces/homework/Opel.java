package com.kodilla.colections.interfaces.homework;

public class Opel implements Car {
    private int speed;

    public Opel(int speed) {
        this.speed = speed;
    }


        @Override
        public int getSpeed () {
            return speed + 3*increaseSpeed() + 2*decreaseSpeed();
        }

        @Override
        public int increaseSpeed () {

            return  + 10;
        }

        @Override
        public int decreaseSpeed () {

            return -30;
        }
    }
