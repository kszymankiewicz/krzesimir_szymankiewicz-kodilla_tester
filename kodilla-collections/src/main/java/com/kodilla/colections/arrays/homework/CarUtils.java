package com.kodilla.colections.arrays.homework;



import com.kodilla.colections.interfaces.homework.Car;
import com.kodilla.colections.interfaces.homework.Ford;
import com.kodilla.colections.interfaces.homework.Opel;
import com.kodilla.colections.interfaces.homework.Volvo;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("----------------");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Car speed" + car.getSpeed());
        System.out.println("Car increase speed" + car.increaseSpeed());
        System.out.println("Car decrease speed" + car.decreaseSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Ford) {
            return "Ford";
        }
        else if (car instanceof Opel) {
            return "Opel";
        }
        else if (car instanceof Volvo) {
            return "Volvo";
        }
        else {
            return "Unknown car name";
        }
    }
}