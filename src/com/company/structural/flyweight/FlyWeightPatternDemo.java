package com.company.structural.flyweight;

import com.company.structural.flyweight.shape.Circle;
import com.company.structural.flyweight.shape.ShapeFactory;

public class FlyWeightPatternDemo {
    private static final String colors[] = {"Red", "Green", "Black", "Blue", "Orange"};

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Circle circle = (Circle) factory.getCircle(getRandomColor());
        circle.setX(getRandomX());
        circle.setY(getRandomY());
        circle.setRadius(getRandomRadius());
        circle.draw();
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomRadius() {
        return (int) (Math.random() * 10);
    }

}
