package com.kodluyoruz.homework.model.mapper;

import com.kodluyoruz.homework.model.dto.BasketDto;
import com.kodluyoruz.homework.model.dto.OrderDto;
import com.kodluyoruz.homework.model.dto.ProductDto;
import com.kodluyoruz.homework.model.dto.UserDto;
import com.kodluyoruz.homework.model.entity.*;
import com.kodluyoruz.homework.model.request.BasketRequest;
import com.kodluyoruz.homework.model.request.CreateUpdateCategoryRequest;
import com.kodluyoruz.homework.model.request.CreateUpdateProductRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderMapper ORDER_MAPPER = Mappers.getMapper(OrderMapper.class);

     OrderDto toOrderDto(Order order);
}
