package com.kodluyoruz.homework.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "basket")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Basket extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //private int quantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


}
