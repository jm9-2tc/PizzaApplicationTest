package com.marmucki.pizzaapplicationtest.remote.rest.dto.request;

import com.marmucki.pizzaapplicationtest.remote.rest.dto.common.PersonDto;

import java.util.List;

public class OrderDto {
    private List<OrderPizzaDto> pizzas;
    private PersonDto person;
}
