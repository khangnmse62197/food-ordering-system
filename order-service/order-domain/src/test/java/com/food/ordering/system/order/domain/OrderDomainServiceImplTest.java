package com.food.ordering.system.order.domain;

import com.food.ordering.system.domain.valueobject.OrderId;
import com.food.ordering.system.order.domain.entity.Order;
import com.food.ordering.system.order.domain.event.OrderPaidEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OrderDomainServiceImplTest {

    @InjectMocks
    private OrderDomainServiceImpl testClass;

    @Test
    void payOrder() {
        // Given
        Order order = mock(Order.class);
        doNothing().when(order).pay();
        when(order.getId()).thenReturn(new OrderId(UUID.randomUUID()));
        // When
        OrderPaidEvent orderPaidEvent = testClass.payOrder(order);
        // Then
        assertThat(orderPaidEvent).isNotNull();
    }
}