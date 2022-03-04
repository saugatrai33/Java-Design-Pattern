package com.company.behavioural.chainofresponsibility.logger;

public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("FileLogger:: message -> " + message);
    }
}
