//package com.kodluyoruz.homework.model.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;
//import java.util.List;
//
//@Entity
//@Table(name = "categories")
//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//public class Basket extends BaseEntity{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    private Integer quantity;
//
//    @Column(name = "category_id")
//    private Integer categoryId;
//
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "category")
//    private List<Product> productList;
//
//
//
//
//}
