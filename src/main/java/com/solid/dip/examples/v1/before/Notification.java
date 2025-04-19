package com.solid.dip.examples.v1.before;

public class Notification {

    private EmailService emailService;

    public Notification(){
        this.emailService = new EmailService(); // forte acoplamento
    }

    public void sendMessage(String message) {
        emailService.send(message);
    }
}
