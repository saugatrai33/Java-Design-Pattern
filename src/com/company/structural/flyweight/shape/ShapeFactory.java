package com.company.structural.flyweight.shape;

import java.util.HashMap;

public class ShapeFactory {
    private HashMap circleMap = new HashMap();

    public Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }
        return circle;
    }
}
