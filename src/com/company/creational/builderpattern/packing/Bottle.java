package com.company.creational.builderpattern.packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }

    public static class Wrapper implements Packing {
        @Override
        public String pack() {
            return "Wrapper";
        }
    }
}
