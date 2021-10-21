//package com.kodluyoruz.homework.repository;
//
//
//import com.kodluyoruz.homework.model.dto.ProductDto;
//import com.kodluyoruz.homework.model.entity.Basket;
//import com.kodluyoruz.homework.model.entity.Product;
//import com.kodluyoruz.homework.model.entity.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface BasketRepository extends JpaRepository<Basket, Integer> {
//
//    void deleteByProductId(int id);
//    List<Product> findAllProduct();
//    Product addProductUser(Product product,User user);
//}
