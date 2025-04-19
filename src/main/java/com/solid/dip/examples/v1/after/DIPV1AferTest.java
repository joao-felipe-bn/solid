package com.solid.dip.examples.v1.after;

public class DIPV1AferTest {


    public void iniciar(){
        MessageService service = new EmailService();
        Notification notification = new Notification(service);
        notification.sendMessage("Dependecy Inversion Principle");
    }

}
