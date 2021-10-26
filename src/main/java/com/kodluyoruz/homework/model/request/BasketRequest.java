package com.kodluyoruz.homework.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BasketRequest {
    @NotNull
    private Integer userId;
    @NotNull
    private Integer productId;

    private Integer quantity;
}
