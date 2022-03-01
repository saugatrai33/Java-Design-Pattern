package com.company.structural.decoratorpattern;

import com.company.structural.decoratorpattern.shape.Circle;
import com.company.structural.decoratorpattern.shape.Rectangle;
import com.company.structural.decoratorpattern.shape.Shape;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape shape = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        shape.draw();
        System.out.println("\nred circle border");
        redCircle.draw();
        System.out.println("\nred rectangle border");
        redRectangle.draw();
    }
}
