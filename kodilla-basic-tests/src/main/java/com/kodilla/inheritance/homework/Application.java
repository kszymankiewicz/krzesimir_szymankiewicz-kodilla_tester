package com.kodilla.inheritance.homework;

import com.kodilla.inheritance.Car;

public class Application {
    public static void main(String[] args) {

        OperatingSystem system = new OperatingSystem(1988);
        system.getYearProduction();
        system.turnOn();

        Linux linux = new Linux(1975);
        linux.getYearProduction();
        linux.turnOff();

        Windows windows = new Windows(1985);
        windows.turnOn();
        windows.getYearProduction();
    }
}