package com.company.abstractfactorypattern.colddrink;

import com.company.builderpattern.Item;
import com.company.builderpattern.packing.Bottle;
import com.company.builderpattern.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
