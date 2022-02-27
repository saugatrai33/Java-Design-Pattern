package com.company.creational.builderpattern.burger;

import com.company.creational.builderpattern.Item;
import com.company.creational.builderpattern.packing.Bottle;
import com.company.creational.builderpattern.packing.Packing;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Bottle.Wrapper();
    }

    @Override
    public abstract float price();
}
