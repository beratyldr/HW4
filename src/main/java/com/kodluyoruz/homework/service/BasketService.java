package com.kodluyoruz.homework.service;

import com.kodluyoruz.homework.model.entity.Basket;
import com.kodluyoruz.homework.model.entity.Product;
import com.kodluyoruz.homework.repository.BasketRepository;
import com.kodluyoruz.homework.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BasketService {

    private final ProductRepository productRepository;
    private final BasketRepository basketRepository;

    public void addToBasket(int productId,Basket basket){

        Product product = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("not found"));
        basket.setProduct(product);
        basketRepository.save(basket);

    }
}
