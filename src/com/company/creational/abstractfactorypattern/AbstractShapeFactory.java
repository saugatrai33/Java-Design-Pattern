package com.company.creational.abstractfactorypattern;

import com.company.creational.abstractfactorypattern.shape.Shape;

public abstract class AbstractShapeFactory {
    abstract Shape getShape(String shapeName);
}
