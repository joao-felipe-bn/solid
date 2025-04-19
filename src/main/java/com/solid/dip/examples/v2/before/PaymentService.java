package com.solid.dip.examples.v2.before;

public class PaymentService {
    private PayPalPaymentProcessor processor;

    public PaymentService() {
        this.processor = new PayPalPaymentProcessor();
    }

    public void pay(double amount) {
        processor.processPayment(amount);
    }

}
