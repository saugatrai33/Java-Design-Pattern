package com.company.abstractfactory;

public class FactoryProducer {
    public AbstractShapeFactory getFactory(boolean rounded) {
        return rounded ? new RoundedShapeFactory() : new ShapeFactory();
    }
}
