package com.company.factorypattern;

import com.company.factorypattern.shape.*;

public class ShapeFactory {
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        } else if (shape.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        }
        return null;
    }
}
