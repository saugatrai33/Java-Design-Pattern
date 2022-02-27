package com.company.creational.builderpattern.burger;

public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
