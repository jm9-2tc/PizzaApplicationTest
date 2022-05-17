package com.marmucki.pizzaapplicationtest.remote.rest.dto.response;

import com.marmucki.pizzaapplicationtest.domain.model.OrderStatusType;
import com.marmucki.pizzaapplicationtest.remote.rest.dto.common.PersonDto;

import java.util.List;

public class OrderDto {
    private Integer id;
    private OrderStatusType status;
    private List<OrderPizzaDto> pizzas;
    private PersonDto personDto;

    public OrderDto() {
    }

    public OrderDto(Integer id, OrderStatusType status, List<OrderPizzaDto> pizzas, PersonDto personDto) {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.personDto = personDto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public List<OrderPizzaDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<OrderPizzaDto> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonDto getPersonDto() {
        return personDto;
    }

    public void setPersonDto(PersonDto personDto) {
        this.personDto = personDto;
    }
}
