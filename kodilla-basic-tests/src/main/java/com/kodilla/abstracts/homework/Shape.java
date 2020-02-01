package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int height;
    private int width;

    public Shape(int height, int width) {
        this.height = height;
        this.width = width;

    }
    public int getHeight(){
        return height;
    }
    public int getWidth() {
        return width;
    }

    public abstract void surfaceArea();

    public abstract void circuit();
}
