//package com.kodluyoruz.homework.service;
//
//import com.kodluyoruz.homework.model.dto.ProductDto;
//import com.kodluyoruz.homework.model.dto.UserDto;
//import com.kodluyoruz.homework.model.entity.Basket;
//import com.kodluyoruz.homework.model.entity.Product;
//import com.kodluyoruz.homework.model.entity.User;
//import com.kodluyoruz.homework.model.request.CreateUpdateProductRequest;
//import com.kodluyoruz.homework.model.request.CreateUpdateUserRequest;
//import com.kodluyoruz.homework.repository.BasketRepository;
//import com.kodluyoruz.homework.repository.ProductRepository;
//import com.kodluyoruz.homework.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//import static com.kodluyoruz.homework.model.mapper.BasketMapper.BASKET_MAPPER;
//import static com.kodluyoruz.homework.model.mapper.ProductMapper.PRODUCT_MAPPER;
//import static com.kodluyoruz.homework.model.mapper.UserMapper.USER_MAPPER;
//
//
//@Service
//@RequiredArgsConstructor
//public class BasketService {
//    private final ProductRepository productRepository;
//    private final UserRepository userRepository;
//    private final BasketRepository basketRepository;
//
//    public List<ProductDto> getProductsBasket() {
//         return PRODUCT_MAPPER.toProductDtoList(basketRepository.findAllProduct());
//    }
//
//    public void addProduct(int userId, int productId) {
//        Product product=getProductEntity(productId);
//        User user=getUserEntity(userId);
//        basketRepository.addProductUser(product,user);
//    }
//    private Product getProductEntity(int id) {
//        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
//    }
//    private User getUserEntity(int id) {
//        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
//    }
//
//    public void deleteProductFromBasket(int id) {
//
//            basketRepository.deleteByProductId(id);
//
//    }
//
//
//}
