package com.service.microservice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("Paypal")
public class PaypalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("payPal payment processed for amount: $" + amount);
    }
}
