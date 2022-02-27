package com.company.creational.prototypepattern.shape;

public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override

    public void draw() {
        System.out.println("Square drawing.");
    }
}
