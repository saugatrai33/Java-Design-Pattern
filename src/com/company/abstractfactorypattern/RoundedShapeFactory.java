package com.company.abstractfactory;

import com.company.abstractfactory.shape.RoundedRectangle;
import com.company.abstractfactory.shape.RoundedSquare;
import com.company.abstractfactory.shape.Shape;

public class RoundedShapeFactory extends AbstractShapeFactory {
    @Override
    Shape getShape(String shapeName) {
        if (shapeName == null) {
            return null;
        } else if (shapeName.equalsIgnoreCase("RoundedRectangle")) {
            return new RoundedRectangle();
        } else if (shapeName.equalsIgnoreCase("RoundedSquare")) {
            return new RoundedSquare();
        }
        return null;
    }
}
