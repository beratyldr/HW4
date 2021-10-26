package com.kodluyoruz.homework.repository;

import com.kodluyoruz.homework.model.entity.Basket;
import com.kodluyoruz.homework.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasketRepository extends JpaRepository<Basket, Integer> {

}
