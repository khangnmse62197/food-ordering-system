package com.food.ordering.system.order.bootstrap;

import com.food.ordering.system.order.domain.OrderDomainService;
import com.food.ordering.system.order.domain.OrderDomainServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public OrderDomainService orderDomainService() {
        return new OrderDomainServiceImpl();
    }
}
