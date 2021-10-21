package com.kodluyoruz.homework.model.mapper;

import com.kodluyoruz.homework.model.dto.CategoryDto;
import com.kodluyoruz.homework.model.entity.Category;
import com.kodluyoruz.homework.model.request.CreateUpdateCategoryRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryMapper CATEGORY_MAPPER = Mappers.getMapper(CategoryMapper.class);

    CategoryDto toCategoryDto(Category category);

    List<CategoryDto> toCategoryDtoList(List<Category> category);

    Category createCategory(CreateUpdateCategoryRequest request);
//
//    void updateProduct(@MappingTarget Product product, CreateUpdateProductRequest request);
}
