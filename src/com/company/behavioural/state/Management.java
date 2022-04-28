package com.company.behavioural.state;

public class Management implements Connection {
    @Override
    public void open() {
        System.out.println("management open");
    }

    @Override
    public void close() {
        System.out.println("management close");
    }

    @Override
    public void log() {
        System.out.println("management log");
    }

    @Override
    public void update() {
        System.out.println("management update");
    }
}
