package com.kodilla.colections.interfaces.homework;

public class Ford implements Car {
    private int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
       return speed + 3*increaseSpeed() + 2*decreaseSpeed();
    }

    @Override
    public int increaseSpeed() {
        return  +9;

    }

    @Override
    public int decreaseSpeed() {
        return  -40;

    }

    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                '}';
    }
}
