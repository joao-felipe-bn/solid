package com.solid.srp.examples.v2.after;

import java.util.List;

public class OrderRepository {


    public void saveOrder(List<String> items, double total, String email){
        System.out.println("Salvando pedido no banco de dados.");
    }



}
