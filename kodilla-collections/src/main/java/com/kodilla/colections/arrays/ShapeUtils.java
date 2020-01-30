package com.kodilla.colections.arrays;

import com.kodilla.colections.interfaces.Circle;
import com.kodilla.colections.interfaces.Shape;
import com.kodilla.colections.interfaces.Square;
import com.kodilla.colections.interfaces.Triangle;

public class ShapeUtils {
    public static void displayShapeInfo(Shape shape) {
        System.out.println("----------------");
        System.out.println("Shape kind: " + getShapeName(shape));
        System.out.println("Shape area: " + shape.getArea());
        System.out.println("Shape perimeters: " + shape.getPerimeter());


    }

    private static String getShapeName(Shape shape) {
        if (shape instanceof Circle)
            return "Circle";
        else if (shape instanceof Triangle)
            return "Triangle";
        else if (shape instanceof Square)
            return "Square";
        else
            return "Unknown shape name";

    }
}
