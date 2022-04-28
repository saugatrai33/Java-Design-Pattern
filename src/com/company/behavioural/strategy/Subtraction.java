package com.company.behavioural.strategy;

public class Subtraction implements Strategy {
    @Override
    public float calculate(float a, float b) {
        return a - b;
    }
}
