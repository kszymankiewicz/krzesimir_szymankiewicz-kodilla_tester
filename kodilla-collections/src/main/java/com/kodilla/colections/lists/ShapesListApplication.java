package com.kodilla.colections.lists;

import com.kodilla.colections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {


    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>();
        Square sq1 = new Square(5);
        Square sq2 = new Square(10);
        Square sq3 = new Square(3);
        Square sq4 = new Square(0);
        shapes.add(new Square(4));
        shapes.add(new Square(0));
        shapes.add(new Square(5));
        shapes.add(new Square(6));
        shapes.add(sq1);

        for ( Square square : shapes) {
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());


        }
    }
}