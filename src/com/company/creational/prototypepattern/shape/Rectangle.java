package com.company.creational.prototypepattern.shape;

public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("Recantangle draw");
    }
}
