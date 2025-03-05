package com.solid.srp.examples.v2.after;

public class EmailService {

    public void sendConfirmationEmail(String email, double total){
        System.out.println("Enviando email para "+email+" com valor de "+total);
    }

}
