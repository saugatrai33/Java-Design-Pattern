package com.company.creational.prototypepattern.shape;

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle drawing.");
    }
}
