package com.service.microservice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("Stripe")
@Primary
public class StripePaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe payment processed for amount: $" + amount);
    }
}
