package com.kodluyoruz.homework.service;


import com.kodluyoruz.homework.model.dto.BasketDto;
import com.kodluyoruz.homework.model.entity.Basket;
import com.kodluyoruz.homework.repository.BasketRepository;
import com.kodluyoruz.homework.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.kodluyoruz.homework.model.mapper.BasketMapper.BASKET_MAPPER;

@Service
@RequiredArgsConstructor
public class CheckoutService {
    private final BasketRepository basketRepository;

    public String getBill(int userId) {// fatura değişecek.
        double price=0;
        List<Basket> basketList = basketRepository.findAllByUserId(userId);
        for (Basket item: basketList
             ) {
               price+=item.getQuantity()*item.getProduct().getPrice();
        }
        return "Total Price: "+price+" Product Name:"+basketList.get(0).getProduct().getName();
    }
}
