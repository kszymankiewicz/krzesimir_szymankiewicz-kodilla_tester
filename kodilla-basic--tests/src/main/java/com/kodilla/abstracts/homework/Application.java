package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {

        Square square = new Square();
        square.surfaceArea();
        square.circuit();

        Traingle traingle = new Traingle();
        traingle.circuit();
        traingle.surfaceArea();

        Rectangle rectangle = new Rectangle();
        rectangle.circuit();
        rectangle.surfaceArea();

        Shape smallSquare = new Square();
        smallSquare.circuit();
        smallSquare.surfaceArea();

        System.out.println();
        Scientist scientist = new Scientist();
        scientist.personResponsibilities();

        System.out.println();
        Teacher teacher = new Teacher();
        teacher.personResponsibilities();
        teacher.getFirstName();

        System.out.println();
        Pilot pilot = new Pilot();
        pilot.personResponsibilities();






    }
}
