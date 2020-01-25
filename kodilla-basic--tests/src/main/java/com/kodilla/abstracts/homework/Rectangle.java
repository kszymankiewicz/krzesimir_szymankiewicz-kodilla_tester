package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle() {
        super(2, 4);
    }

    @Override
    public void surfaceArea() {
        int surfaceArea = (getHeight() * getWidth());
        System.out.println("Pole prostokąta wynosi " + surfaceArea + " cm2");

    }

    @Override
    public void circuit() {
        int circuit = (2 * getHeight() + 2 * getWidth());
        System.out.println("Obwód prostokata wynosi " + circuit+ " cm");
    }
}
