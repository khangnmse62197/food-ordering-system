package com.food.ordering.system.order.application.ports.input.message.listener.customer;

import com.food.ordering.system.order.application.dto.message.CustomerModel;

public interface CustomerMessageListener {

    void customerCreated(CustomerModel customerModel);
}
