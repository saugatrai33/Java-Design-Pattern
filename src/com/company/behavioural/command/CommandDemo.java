package com.company.behavioural.command;

import com.company.behavioural.command.order.BuyStock;
import com.company.behavioural.command.order.SellStock;

public class CommandDemo {
    public static void main(String[] args) {
        var nicAsia = new Stock("NIC Asia", 100);
        var miteriHydropower = new Stock("Miteri Hydropower", 500);

        var buyStock = new BuyStock(nicAsia);
        var sellStock = new SellStock(miteriHydropower);

        var broker = new Broker();
        broker.takeOrders(buyStock);
        broker.takeOrders(sellStock);
        broker.placeOrder();
    }
}
