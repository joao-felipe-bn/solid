package com.solid.srp.examples.v2.before;

import java.util.List;

public class OrderService {

    public void processOrder(List<String> items, String email){

        double total = calculateTotal(items);
        total = applyDiscound(total);
        saveOrder(items,total,email);
        sendConfirmationEmail(email,total);
    }

    private double calculateTotal(List<String> items){
        return items.size()*50;
    }

    private double applyDiscound(double total){
        return total *0.9;
    }

    private void saveOrder(List<String> items, double total, String email){
        System.out.println("Salvando pedido no banco de dados.");
    }

    private void sendConfirmationEmail(String email, double total){
        System.out.println("Enviando email para "+email+" com valor de "+total);
    }
}
