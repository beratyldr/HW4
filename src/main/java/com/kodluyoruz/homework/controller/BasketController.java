package com.kodluyoruz.homework.controller;

import com.kodluyoruz.homework.model.entity.Basket;
import com.kodluyoruz.homework.service.BasketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("basket")
@RequiredArgsConstructor
public class BasketController {

    private final BasketService basketService;
    @PostMapping("{usertId}/user/{productId}")
    public String addToCart(@PathVariable int usertId,@PathVariable int productId,@ModelAttribute Basket basket){

        //to save to cartItem table.
        basketService.addToBasket(usertId,productId,basket);

        return "products";
    }
}
