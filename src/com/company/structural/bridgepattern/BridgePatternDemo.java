package com.company.structural.bridgepattern;

import com.company.structural.bridgepattern.draw.GreenCircle;
import com.company.structural.bridgepattern.draw.RedCircle;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
