package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public Square() {

        super(5, 5);
    }


    @Override
    public void surfaceArea() {
        int surfaceArea = (getHeight() * getWidth());
        System.out.println("Pole kwadratu równa się " + surfaceArea+ " cm2");
    }

    @Override
    public void circuit() {
        int circuit = (4 * getWidth());
        System.out.println("Obwód kwadratu równa się  " + circuit+ " cm");
    }
}
