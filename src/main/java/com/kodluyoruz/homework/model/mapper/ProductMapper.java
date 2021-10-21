package com.kodluyoruz.homework.model.mapper;

import com.kodluyoruz.homework.model.dto.ProductDto;
import com.kodluyoruz.homework.model.entity.Product;
import com.kodluyoruz.homework.model.request.CreateUpdateProductRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductMapper PRODUCT_MAPPER = Mappers.getMapper(ProductMapper.class);

    ProductDto toProductDto(Product product);

    List<ProductDto> toProductDtoList(List<Product> products);

    Product createProduct(CreateUpdateProductRequest request);

    void updateProduct(@MappingTarget Product product, CreateUpdateProductRequest request);
}
