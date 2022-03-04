package com.company.behavioural.chainofresponsibility.logger;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }
    @Override
    void write(String message) {
        System.out.println("ConsoleLogger:: message -> " + message);
    }
}
