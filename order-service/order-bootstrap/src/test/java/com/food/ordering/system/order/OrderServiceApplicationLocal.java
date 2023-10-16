package com.food.ordering.system.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderServiceApplicationLocal {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(OrderServiceApplication.class);
        application.setAdditionalProfiles("local");
        application.run(args);
    }
}
