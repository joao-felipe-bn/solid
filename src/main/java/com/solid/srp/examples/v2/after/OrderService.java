package com.solid.srp.examples.v2.after;

import java.util.List;

public class OrderService {

    private DiscountService discountService;
    private OrderRepository orderRepository;
    private EmailService emailService;

    public OrderService(DiscountService discountService, OrderRepository orderRepository, EmailService emailService) {
        this.discountService = discountService;
        this.orderRepository = orderRepository;
        this.emailService = emailService;
    }

    public void processOrder(List<String> items, String email){
         double total = items.size()*50;
         total = discountService.applyDiscount(total);
         var order = new Order(items,total,email);
         orderRepository.saveOrder(items,total,email);
         emailService.sendConfirmationEmail(email,total);
    }

}
