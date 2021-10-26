package com.kodluyoruz.homework.controller;

import com.kodluyoruz.homework.model.dto.BasketDto;
import com.kodluyoruz.homework.model.entity.Basket;
import com.kodluyoruz.homework.model.request.BasketRequest;
import com.kodluyoruz.homework.service.BasketService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("basket")
@RequiredArgsConstructor
public class BasketController {

    private final BasketService basketService;
    @PostMapping("{userId}/user/{productId}")
    public BasketDto addToCart(@RequestBody BasketRequest request){
        //to save to cartItem table.
           return  basketService.addToBasket(request);
    }

}
