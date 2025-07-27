package com.service.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {


    private PaymentService paymentService;

    @Autowired
    public OrderService(@Qualifier("Paypal") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(String orderDetails, double amount) {
        paymentService.processPayment(amount);
        System.out.println("Order placed with details: " + orderDetails);
    }
}
