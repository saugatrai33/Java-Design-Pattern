package com.company.creational.prototypepattern;

import com.company.creational.prototypepattern.shape.Shape;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape shape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape:: " + shape.getType());

        var shape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape: " + shape2.getType());

        var shape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape:: " + shape3.getType());
    }
}
