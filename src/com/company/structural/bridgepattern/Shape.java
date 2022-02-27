package com.company.structural.bridgepattern;

import com.company.structural.bridgepattern.draw.DrawAPI;

public abstract class Shape {
    protected DrawAPI drawAPI;

    Shape(DrawAPI draw) {
        this.drawAPI = draw;
    }

    public abstract void draw();
}
