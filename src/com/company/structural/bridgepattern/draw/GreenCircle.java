package com.company.structural.bridgepattern.draw;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("draw green circle with x: " + x + ", y: " + y + ", radius: " + radius);
    }
}
