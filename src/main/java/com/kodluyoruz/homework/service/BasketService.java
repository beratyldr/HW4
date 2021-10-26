package com.kodluyoruz.homework.service;

import com.kodluyoruz.homework.model.dto.BasketDto;
import com.kodluyoruz.homework.model.dto.ProductDto;
import com.kodluyoruz.homework.model.dto.UserDto;
import com.kodluyoruz.homework.model.entity.Basket;
import com.kodluyoruz.homework.model.request.BasketRequest;
import com.kodluyoruz.homework.repository.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.kodluyoruz.homework.model.mapper.BasketMapper.BASKET_MAPPER;
import static com.kodluyoruz.homework.model.mapper.ProductMapper.PRODUCT_MAPPER;
import static com.kodluyoruz.homework.model.mapper.UserMapper.USER_MAPPER;


@Service
@RequiredArgsConstructor
public class BasketService {
    private final BasketRepository basketRepository;
    public BasketDto addToBasket(BasketRequest request){
        Basket basket = BASKET_MAPPER.createBasket(request);
        return BASKET_MAPPER.toBasketDto(basketRepository.save(basket));

    }

}
