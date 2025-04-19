package com.solid.dip.examples.v2.after;

public class PaypalPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processando pagamento via PayPal: R$" + amount);
    }
}
