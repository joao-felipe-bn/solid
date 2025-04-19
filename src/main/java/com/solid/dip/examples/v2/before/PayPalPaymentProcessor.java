package com.solid.dip.examples.v2.before;

public class PayPalPaymentProcessor {

    public void processPayment(double amount){
        System.out.println(String.format("Processando pagamento via Paypal: R$: %s",amount));
    }



}
