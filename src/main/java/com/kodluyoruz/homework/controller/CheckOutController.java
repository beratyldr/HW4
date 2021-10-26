package com.kodluyoruz.homework.controller;

import com.kodluyoruz.homework.model.dto.OrderDto;
import com.kodluyoruz.homework.model.entity.Order;
import com.kodluyoruz.homework.service.CheckoutService;
import com.kodluyoruz.homework.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("checkout")
@RequiredArgsConstructor
public class CheckOutController {
    private final CheckoutService service;
    private final OrderService orderService;
    @GetMapping("{id}")
    public String getBill(@PathVariable int id) {
        return service.getBill(id);
    }

    @PostMapping("{userId}/order")
    @ResponseStatus(HttpStatus.CREATED)
    public OrderDto createOrder(@PathVariable int userId){
        return orderService.createOrder(userId);
    }

}
