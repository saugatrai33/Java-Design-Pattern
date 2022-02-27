package com.company.structural.bridgepattern;

import com.company.structural.bridgepattern.draw.DrawAPI;

public class Circle extends Shape {
    private int x, y, radius;

    Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(x, y, radius);
    }
}
