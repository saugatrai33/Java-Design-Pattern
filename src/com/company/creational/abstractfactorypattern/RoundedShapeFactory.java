package com.company.creational.abstractfactorypattern;

import com.company.creational.abstractfactorypattern.shape.RoundedRectangle;
import com.company.creational.abstractfactorypattern.shape.RoundedSquare;
import com.company.creational.abstractfactorypattern.shape.Shape;

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
