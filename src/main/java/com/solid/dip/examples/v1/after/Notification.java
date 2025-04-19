package com.solid.dip.examples.v1.after;

public class Notification {

    private MessageService messageService;

    public Notification(MessageService messageService){
        this.messageService = messageService;
    }

    public void sendMessage(String message){
        messageService.send(message);
    }
}
