package com.food.ordering.system.order.application.ports.input.message.listener.restaurantapproval;

import com.food.ordering.system.order.application.dto.message.RestaurantApprovalResponse;

public interface RestaurantApprovalResponseMessageListener {

    void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse);

    void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse);
}
