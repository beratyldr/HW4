package com.kodluyoruz.homework.service;

import com.kodluyoruz.homework.model.dto.CategoryDto;
import com.kodluyoruz.homework.model.dto.OrderDto;
import com.kodluyoruz.homework.model.entity.Basket;
import com.kodluyoruz.homework.model.entity.Category;
import com.kodluyoruz.homework.model.entity.Order;
import com.kodluyoruz.homework.model.request.CreateUpdateCategoryRequest;
import com.kodluyoruz.homework.repository.BasketRepository;
import com.kodluyoruz.homework.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

import static com.kodluyoruz.homework.model.mapper.CategoryMapper.CATEGORY_MAPPER;
import static com.kodluyoruz.homework.model.mapper.OrderMapper.ORDER_MAPPER;

@Service
@AllArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final BasketRepository basketRepository;

    public OrderDto createOrder(int id) {// Sepet sistemi nasıl olmalı. geçici kod düzeltilecek
        Integer quantity=0;
        Double totalPrice=0.0;
        Integer productId=0;
        Integer userId=0;
        List<Basket> allByUserId = basketRepository.findAllByUserId(id);
        for (Basket item: allByUserId
             ) {
                userId= item.getUserId();
                quantity= item.getQuantity();
                totalPrice+=item.getProduct().getPrice();
                productId= item.getProductId();
        }
        return  ORDER_MAPPER.toOrderDto(orderRepository.save(Order.builder()
                .userId(userId)
                .totalPrice(totalPrice)
                .unitPrice(totalPrice/quantity)
                .quantity(quantity)
                .productId(productId)
                .build()));
    }
}
