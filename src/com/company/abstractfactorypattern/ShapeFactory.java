package com.company.abstractfactory;

import com.company.abstractfactory.shape.Rectangle;
import com.company.abstractfactory.shape.Shape;
import com.company.abstractfactory.shape.Square;

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
