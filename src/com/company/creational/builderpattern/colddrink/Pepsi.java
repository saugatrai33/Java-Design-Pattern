package com.company.creational.builderpattern.colddrink;

public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.5f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
