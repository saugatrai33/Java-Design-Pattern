package com.company.behavioural.command;

import com.company.behavioural.command.order.BuyStock;
import com.company.behavioural.command.order.Order;
import com.company.behavioural.command.order.SellStock;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Broker broker = new Broker();
        Order buyStock = new BuyStock(stock);
        Order sellStock = new SellStock(stock);
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}
