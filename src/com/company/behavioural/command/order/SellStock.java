package com.company.behavioural.command.order;

import com.company.behavioural.command.Stock;

public class SellStock implements Order {
    private final Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        System.out.println("SellStock: execute(): sell stock sommand");
        stock.sell();
    }
}
