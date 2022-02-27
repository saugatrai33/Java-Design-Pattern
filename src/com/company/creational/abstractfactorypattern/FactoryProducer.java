package com.company.creational.abstractfactorypattern;

public class FactoryProducer {
    public AbstractShapeFactory getFactory(boolean rounded) {
        return rounded ? new RoundedShapeFactory() : new ShapeFactory();
    }
}
