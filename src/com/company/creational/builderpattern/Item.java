package com.company.creational.builderpattern;

import com.company.creational.builderpattern.packing.Packing;

public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
