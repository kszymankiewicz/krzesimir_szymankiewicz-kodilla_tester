package com.kodilla.colections.lists.homework;

import com.kodilla.colections.arrays.homework.CarUtils;
import com.kodilla.colections.interfaces.homework.Car;
import com.kodilla.colections.interfaces.homework.Ford;
import com.kodilla.colections.interfaces.homework.Opel;
import com.kodilla.colections.interfaces.homework.Volvo;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Volvo volvo2 = new Volvo(35);

        Car opel = new Opel(50);
        cars.add(opel);
        Car ford = new Ford(35);
        cars.add(ford);
        Car volvo = new Volvo(46);
        cars.add(volvo);

        for (Car car : cars) {
            CarUtils.describeCar(car);
            System.out.println("after addCar");
        }

        cars.remove(1);
        cars.remove(volvo2);

        for (Car car : cars) {
            CarUtils.describeCar(car);
            System.out.println(" after delete Car");

        }

    }
}
