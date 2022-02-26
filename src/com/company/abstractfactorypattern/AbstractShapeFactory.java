package com.company.abstractfactory;

import com.company.abstractfactory.shape.Shape;

public abstract class AbstractShapeFactory {
    abstract Shape getShape(String shapeName);
}
