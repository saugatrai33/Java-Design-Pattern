package com.company.creational.abstractfactorypattern;

import com.company.creational.abstractfactorypattern.shape.Rectangle;
import com.company.creational.abstractfactorypattern.shape.Shape;
import com.company.creational.abstractfactorypattern.shape.Square;

public class ShapeFactory extends AbstractShapeFactory {
    @Override
    Shape getShape(String shapeName) {
        if (shapeName == null) {
            return null;
        } else if (shapeName.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeName.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }
}
