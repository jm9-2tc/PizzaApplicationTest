package com.marmucki.pizzaapplicationtest.remote.rest.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.marmucki.pizzaapplicationtest.domain.model.OrderStatusType;

import java.util.Date;

public class OrderStatusDto {
    private OrderStatusType status;

    @JsonFormat(pattern = "yyyy:MM:dd HH:mm:ss")
    private Date createdAt;

    @JsonFormat(pattern = "yyyy:MM:dd HH:mm:ss")
    private Date updatedAt;

    @JsonFormat(pattern = "yyyy:MM:dd HH:mm:ss")
    private Date expectedAt;
}
