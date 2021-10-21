package com.kodluyoruz.homework.service;

import com.kodluyoruz.homework.model.dto.UserDto;
import com.kodluyoruz.homework.model.entity.User;
import com.kodluyoruz.homework.model.request.CreateUpdateUserRequest;
import com.kodluyoruz.homework.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import static com.kodluyoruz.homework.model.mapper.UserMapper.USER_MAPPER;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public UserDto createUser(CreateUpdateUserRequest request) {
        User user = USER_MAPPER.createUser(request);
        return USER_MAPPER.toUserDto(repository.save(user));
    }


    public UserDto getUser(int id) {
        User user = getUserEntity(id);
        return USER_MAPPER.toUserDto(user);
    }

    private User getUserEntity(int id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }

    public UserDto updateUser(int id, CreateUpdateUserRequest request) {
        User user = getUserEntity(id);
        USER_MAPPER.updateUser(user, request);

        User updatedUser = repository.save(user);
        return USER_MAPPER.toUserDto(updatedUser);
    }

    public List<UserDto> getUsers() {
        return USER_MAPPER.toUserDtoList(repository.findAll());
    }

    public void deleteUser(int id) {
        repository.deleteById(id);
    }


}
