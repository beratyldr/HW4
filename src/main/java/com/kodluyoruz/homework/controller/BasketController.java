//package com.kodluyoruz.homework.controller;
//
//import com.kodluyoruz.homework.model.dto.ProductDto;
//import com.kodluyoruz.homework.model.dto.UserDto;
//import com.kodluyoruz.homework.model.entity.Basket;
//import com.kodluyoruz.homework.model.entity.Product;
//import com.kodluyoruz.homework.model.request.CreateUpdateProductRequest;
//import com.kodluyoruz.homework.model.request.CreateUpdateUserRequest;
//import com.kodluyoruz.homework.service.BasketService;
//import com.kodluyoruz.homework.service.ProductService;
//import com.kodluyoruz.homework.service.UserService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("basket")
//@RequiredArgsConstructor
//@Slf4j
//public class BasketController {
//
//    @Autowired
//    private final BasketService service;
//
//    @PutMapping("{userId}/users/{productId}")
//    public void addProductUser(@PathVariable int userId, @PathVariable int productId) {
//        service.addProduct(userId, productId);
//    }
//
//    @GetMapping
//    public List<ProductDto> getProductsBasket() {
//        return service.getProductsBasket();
//    }
//
//    @DeleteMapping("{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteProductFromBasket(@PathVariable int id) {
//        service.deleteProductFromBasket(id);
//    }
//}
