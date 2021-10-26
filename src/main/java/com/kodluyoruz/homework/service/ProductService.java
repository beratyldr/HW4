package com.kodluyoruz.homework.service;

import com.kodluyoruz.homework.model.dto.CategoryDto;
import com.kodluyoruz.homework.model.dto.ProductDto;
import com.kodluyoruz.homework.model.entity.Category;
import com.kodluyoruz.homework.model.entity.Product;
import com.kodluyoruz.homework.model.request.CreateUpdateProductRequest;
import com.kodluyoruz.homework.repository.CategoryRepository;
import com.kodluyoruz.homework.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.kodluyoruz.homework.model.mapper.CategoryMapper.CATEGORY_MAPPER;
import static com.kodluyoruz.homework.model.mapper.ProductMapper.PRODUCT_MAPPER;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;
    private final CategoryRepository categoryRepository;

    public ProductDto createProduct(CreateUpdateProductRequest request) {
        Product product = PRODUCT_MAPPER.createProduct(request);
        return PRODUCT_MAPPER.toProductDto(repository.save(product));
    }


    public ProductDto getProduct(int id) {
        Product product = getProductEntity(id);
        return PRODUCT_MAPPER.toProductDto(product);
    }

    private Product getProductEntity(int id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }

    public ProductDto updateProduct(int id, CreateUpdateProductRequest request) {
        Product product = getProductEntity(id);
        PRODUCT_MAPPER.updateProduct(product, request);

        Product updatedProduct = repository.save(product);
        return PRODUCT_MAPPER.toProductDto(updatedProduct);
    }

    public List<ProductDto> getProducts(String name) {
        if (name != null) {
            return PRODUCT_MAPPER.toProductDtoList(repository.findAllByNameContainsOrDescriptionContains(name, name));
        }

        return PRODUCT_MAPPER.toProductDtoList(repository.findAll());
    }

    public void deleteProduct(int id) {
        repository.deleteById(id);
    }

    public CategoryDto getProductsCategory(int id) {
        Product product = repository.findById(id).orElseThrow(() -> new RuntimeException("not found"));

        Category category=categoryRepository.findById(product.getCategoryId()).orElseThrow(() -> new RuntimeException("not found"));
        return CATEGORY_MAPPER.toCategoryDto(category);
    }
}
