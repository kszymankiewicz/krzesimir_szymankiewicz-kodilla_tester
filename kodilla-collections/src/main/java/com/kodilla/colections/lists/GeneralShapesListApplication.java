package com.kodilla.colections.lists;

import com.kodilla.colections.interfaces.Circle;
import com.kodilla.colections.interfaces.Shape;
import com.kodilla.colections.interfaces.Square;
import com.kodilla.colections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();

        Square square= new Square(10);
        shapes.add(square);

        shapes.add(new Square(5));
        shapes.add(new Triangle(3,4,5));
        shapes.add(new Circle(4));

        shapes.remove(2);
        shapes.remove(square);
        Triangle triangle = new Triangle(3,4,5);
        shapes.remove(triangle);
        for (Shape shape :shapes){
            System.out.println(shape + ", area :" + shape.getArea()+ ", perimeter :" + shape.getPerimeter());
        }
    }
}
