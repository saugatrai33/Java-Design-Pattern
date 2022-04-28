package com.company.behavioural.state;

public class Sales implements Connection {
    @Override
    public void open() {
        System.out.println("sales database open.");
    }

    @Override
    public void close() {
        System.out.println("sales db close.");
    }

    @Override
    public void log() {
        System.out.println("sales db log");
    }

    @Override
    public void update() {
        System.out.println("sales db update.");
    }
}
