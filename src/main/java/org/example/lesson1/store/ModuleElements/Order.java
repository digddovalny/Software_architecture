package org.example.lesson1.store.ModuleElements;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Order {

    public Order(String address, String phone, Buyer buyer, Collection<OrderItem> items) {
        this.address = address;
        this.phone = phone;
        this.buyer = buyer;
        this.items = items;
    }

    {
        id = ++counter;
    }
    public int getId() {
        return id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Collection<OrderItem> getItems() {
        return items;
    }

    private static int counter = 0;
    private int id;
    private Date orderDate;
    private String address;
    private String phone;
    private Buyer buyer;
    private Collection<OrderItem> items = new HashSet<>();

}
