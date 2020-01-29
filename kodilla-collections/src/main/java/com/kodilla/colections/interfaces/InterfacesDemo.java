package com.kodilla.colections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        Square square = new Square(10.0);
        showShapewDetails(square);

        Circle circle = new Circle(7.0);
        showShapewDetails(circle);

        Triangle triangle = new Triangle(6.0, 4.0, 7.211);
        showShapewDetails(triangle);
    }

    private static void showShapewDetails(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }


}
