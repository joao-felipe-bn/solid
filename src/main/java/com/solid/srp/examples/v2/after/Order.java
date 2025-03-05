package com.solid.srp.examples.v2.after;

import java.util.List;

public class Order {

    private List<String> items;
    private double total;
    private String email;


    public Order(List<String> items, double total, String email) {
        this.items = items;
        this.total = total;
        this.email = email;
    }

    public List<String> getItems() {
        return items;
    }

    public double getTotal() {
        return total;
    }

    public String getEmail() {
        return email;
    }
}
