package com.marmucki.pizzaapplicationtest.remote.rest.dto.response;

import java.util.List;

public class OrdersCollectionDto {
    private List<OrderDto> orders;

    public OrdersCollectionDto() {
    }

    public OrdersCollectionDto(List<OrderDto> orders) {
        this.orders = orders;
    }

    public List<OrderDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDto> orders) {
        this.orders = orders;
    }
}
