package com.company.behavioural.command;

public class Stock {
    private final String name = "iPhone";
    private final int quantity = 100;

    public void buy() {
        System.out.println("Stock:: buy(): name ->" + name + ", quantity -> " + quantity);
    }

    public void sell() {
        System.out.println("Stock:: sell(): name -> " + name + ", quantity -> " + quantity);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
