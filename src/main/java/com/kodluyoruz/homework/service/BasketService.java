package com.kodluyoruz.homework.service;

import com.kodluyoruz.homework.model.dto.BasketDto;
import com.kodluyoruz.homework.model.dto.ProductDto;
import com.kodluyoruz.homework.model.dto.UserDto;
import com.kodluyoruz.homework.model.entity.Basket;
import com.kodluyoruz.homework.model.request.BasketRequest;
import com.kodluyoruz.homework.repository.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.kodluyoruz.homework.model.mapper.BasketMapper.BASKET_MAPPER;
import static com.kodluyoruz.homework.model.mapper.ProductMapper.PRODUCT_MAPPER;
import static com.kodluyoruz.homework.model.mapper.UserMapper.USER_MAPPER;


@Service
@RequiredArgsConstructor
public class BasketService {

    private final ProductService productService;
    private final BasketRepository basketRepository;
    private final UserService userService;

    public BasketDto addToBasket(BasketRequest request){

        Basket basket = BASKET_MAPPER.createBasket(request);
        return BASKET_MAPPER.toBasketDto(basketRepository.save(basket));

    }

    /*public List<ProductDto> getBasket(int userId) {
        List<Basket> baskets = basketRepository.findAllByUserId(userId);
        List<Product> products=new ArrayList<>();
        for (Basket item:baskets
             ) {
            products.add(item.getProduct());
        }
        return PRODUCT_MAPPER.toProductDtoList(products);

    }*/
}
