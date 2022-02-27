package com.company.creational.factorypattern;

public class ShapeMain {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        var circle = factory.getShape("Circle");
        circle.draw();

        var triangle = factory.getShape("Triangle");
        triangle.draw();

        var square = factory.getShape("Square");
        square.draw();

        var rectangle = factory.getShape("Recatangle");
        rectangle.draw();
    }
}
