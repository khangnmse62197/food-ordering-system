package com.food.ordering.system.order.application;

import com.food.ordering.system.order.application.dto.message.CustomerModel;
import com.food.ordering.system.order.application.ports.output.repository.CustomerRepository;
import com.food.ordering.system.order.domain.entity.Customer;
import com.food.ordering.system.order.domain.exception.OrderDomainException;
import com.food.ordering.system.order.application.mapper.OrderDataMapper;
import com.food.ordering.system.order.application.ports.input.message.listener.customer.CustomerMessageListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerMessageListenerImpl implements CustomerMessageListener {

    private final CustomerRepository customerRepository;
    private final OrderDataMapper orderDataMapper;

    public CustomerMessageListenerImpl(CustomerRepository customerRepository, OrderDataMapper orderDataMapper) {
        this.customerRepository = customerRepository;
        this.orderDataMapper = orderDataMapper;
    }

    @Override
    public void customerCreated(CustomerModel customerModel) {
        Customer customer = customerRepository.save(orderDataMapper.customerModelToCustomer(customerModel));
        if (customer == null) {
            log.error("Customer could not be created in order database with id: {}", customerModel.getId());
            throw new OrderDomainException("Customer could not be created in order database with id " +
                    customerModel.getId());
        }
        log.info("Customer is created in order database with id: {}", customer.getId());
    }
}
