package com.company.behavioural.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public float executeStrategy(float a, float b) {
        return strategy.calculate(a, b);
    }
}
