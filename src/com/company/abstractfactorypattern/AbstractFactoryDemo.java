package com.company.abstractfactory;

import com.company.abstractfactory.shape.Shape;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractShapeFactory abstractShapeFactory = new FactoryProducer().getFactory(false);

        Shape nonRoundedShape = abstractShapeFactory.getShape("Rectangle");
        nonRoundedShape.draw();
        Shape nonRoundedShape2 = abstractShapeFactory.getShape("Square");
        nonRoundedShape2.draw();

        AbstractShapeFactory roundedShapeFactory = new FactoryProducer().getFactory(true);
        Shape roundedRectangle = roundedShapeFactory.getShape("RoundedRectangle");
        roundedRectangle.draw();
        Shape roundedSquare = roundedShapeFactory.getShape("RoundedSquare");
        roundedSquare.draw();
    }
}
