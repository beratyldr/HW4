package com.kodluyoruz.homework.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private int id;
    private Integer quantity;
    private Double unitPrice;
    private Double totalPrice;
    private Integer productId;
    private Integer userId;
}
