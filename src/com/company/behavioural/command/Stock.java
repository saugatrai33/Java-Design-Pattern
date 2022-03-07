package com.company.behavioural.command;

public class Stock {
    private final String name;
    private final int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("Buying stock:: name -> " + name + ", quantity -> " + quantity);
    }

    public void sell() {
        System.out.println("Selling stock:: name -> " + name + ", quantity -> " + quantity);
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
