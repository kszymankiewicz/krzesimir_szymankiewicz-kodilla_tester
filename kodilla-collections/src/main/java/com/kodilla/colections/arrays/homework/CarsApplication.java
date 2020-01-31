package com.kodilla.colections.arrays.homework;



import com.kodilla.colections.interfaces.homework.Car;
import com.kodilla.colections.interfaces.homework.Ford;
import com.kodilla.colections.interfaces.homework.Opel;
import com.kodilla.colections.interfaces.homework.Volvo;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 1; n < cars.length; n++) {
            cars[n] = drawCar();
        }
        for ( Car car : cars) {
            CarUtils.describeCar(car);
        }
    }

    private static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int increaseSpeed = random.nextInt() * 100 + 1;

        if (drawnCarKind == 0) {
            return new Ford(increaseSpeed);
        }
        else if (drawnCarKind == 1){
            return new Opel(increaseSpeed);
        }
        else {
            return new Volvo(increaseSpeed);
        }
    }
}