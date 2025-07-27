package com.service.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
	ApplicationContext context= SpringApplication.run(StoreApplication.class, args);
	var orderService = context.getBean(OrderService.class);
	orderService.placeOrder("Order for 2 pizzas and 1 soda",100.00);
	}

}
