package org.example.lesson1.store.InMemoryModule;

import org.example.lesson1.store.ModuleElements.Order;

import java.util.Collection;
import java.util.HashSet;

public class Store {
    private Collection<Order> orders = new HashSet<>();
    public boolean addOrder(Order order){
        orders.add(order);
        return true;
    }

    public boolean cancelOrder(int id){
        return true;
    }

    public boolean paymentOrder(int id){
        return true;
    }

}
