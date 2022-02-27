package com.company.structural.bridgepattern.draw;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("draw red circle with x: " + x + ", y: " + y + ", radius: " + radius);
    }
}
