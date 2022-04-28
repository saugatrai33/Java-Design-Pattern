package com.company.behavioural.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new Addition());
        System.out.println(context.executeStrategy(10, 20)); // 30.0
    }
}
