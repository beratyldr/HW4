package com.kodluyoruz.homework.model.mapper;

import com.kodluyoruz.homework.model.dto.ProductDto;
import com.kodluyoruz.homework.model.dto.UserDto;
import com.kodluyoruz.homework.model.entity.Product;
import com.kodluyoruz.homework.model.entity.User;
import com.kodluyoruz.homework.model.request.CreateUpdateProductRequest;
import com.kodluyoruz.homework.model.request.CreateUpdateUserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper USER_MAPPER = Mappers.getMapper(UserMapper.class);

    UserDto toUserDto(User User);

    List<UserDto> toUserDtoList(List<User> users);

    User createUser(CreateUpdateUserRequest request);

    void updateUser(@MappingTarget User User, CreateUpdateUserRequest request);
}
