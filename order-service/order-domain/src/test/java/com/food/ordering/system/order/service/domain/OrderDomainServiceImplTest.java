package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.order.service.domain.entity.Order;
import com.food.ordering.system.order.service.domain.event.OrderPaidEvent;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class OrderDomainServiceImplTest {

    OrderDomainServiceImpl testClass = new OrderDomainServiceImpl();

    @Test
    void payOrder() {
        // Given
        Order order = mock(Order.class);
        doNothing().when(order).pay();
        // When
        OrderPaidEvent orderPaidEvent = testClass.payOrder(order);
        // Then
        assertThat(orderPaidEvent).isNotNull();
    }
}