package com.company.behavioural.command;

import com.company.behavioural.command.order.Order;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orders = new ArrayList<>();

    public void takeOrders(Order order) {
        orders.add(order);
    }

    public void placeOrder() {
        for (Order order : orders) {
            order.execute();
        }
    }
}
