package com.company.creational.builderpattern.colddrink;

import com.company.creational.builderpattern.Item;
import com.company.creational.builderpattern.packing.Bottle;
import com.company.creational.builderpattern.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
