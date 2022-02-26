package com.company.builderpattern;

import com.company.builderpattern.packing.Bottle;
import com.company.builderpattern.packing.Packing;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Bottle.Wrapper();
    }

    @Override
    public abstract float price();
}
