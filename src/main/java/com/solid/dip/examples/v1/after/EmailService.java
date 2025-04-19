package com.solid.dip.examples.v1.after;

public class EmailService implements MessageService {


    @Override
    public void send(String message) {
        System.out.println(String.format("Enviando e-mail: ",message));
    }
}
