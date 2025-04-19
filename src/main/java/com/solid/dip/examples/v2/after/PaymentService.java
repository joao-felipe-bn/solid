package com.solid.dip.examples.v2.after;

public class PaymentService {
    private PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public void pay(double amount){
        paymentProcessor.processPayment(amount);
    }
}
