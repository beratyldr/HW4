package com.kodluyoruz.homework.service;

import com.kodluyoruz.homework.model.entity.Basket;
import com.kodluyoruz.homework.model.entity.Product;
import com.kodluyoruz.homework.model.entity.User;
import com.kodluyoruz.homework.repository.BasketRepository;
import com.kodluyoruz.homework.repository.ProductRepository;
import com.kodluyoruz.homework.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class BasketService {

    private final ProductRepository productRepository;
    private final BasketRepository basketRepository;
    private final UserRepository userRepository;

    public void addToBasket(int userId,int productId,Basket basket){

        Product product = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("not found"));
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("not found"));
        basket.setUser(user);
        basket.setProduct(product);
        basketRepository.save(basket);

    }
}
