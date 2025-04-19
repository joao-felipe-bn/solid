package com.solid.dip.examples.v1.before;

public class EmailService {

    public void send(String message){
        System.out.println(String.format("Enviando e-mail: ",message));
    }


}
