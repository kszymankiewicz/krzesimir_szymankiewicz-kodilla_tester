package com.kodilla.abstracts.homework;

public class Traingle extends Shape {

    public Traingle() {

        super(5, 4);
    }

    @Override
    public void surfaceArea() {
        int surfaceArea = (getHeight() * getWidth());
        System.out.println("Pole trójkąta wynosi " + surfaceArea+ " cm2");

    }

    @Override
    public void circuit() {
        int circuit = (getHeight() + getWidth() + getWidth());
        System.out.println("Obwód trójkąta wynosi " + circuit+ " cm");
    }
}
