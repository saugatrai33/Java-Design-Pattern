package com.company.behavioural.state;

public class Account implements Connection {
    @Override
    public void open() {
        System.out.println("account db open.");
    }

    @Override
    public void close() {
        System.out.println("account db close.");
    }

    @Override
    public void log() {
        System.out.println("account db log");
    }

    @Override
    public void update() {
        System.out.println("account db update.");
    }
}
