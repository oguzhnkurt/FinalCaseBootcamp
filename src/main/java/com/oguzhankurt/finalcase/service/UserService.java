package com.oguzhankurt.finalcase.service;

import com.oguzhankurt.finalcase.controller.UserRegister;
import com.oguzhankurt.finalcase.dto.UserRegisterRequestDto;
import com.oguzhankurt.finalcase.entity.User;
import com.oguzhankurt.finalcase.general.BaseEntityService;
import com.oguzhankurt.finalcase.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class UserService extends BaseEntityService<User, UserRepository> {
    private final UserRepository repository;
    public UserService(UserRepository repository, UserRepository repository1) {
        super(repository);
        this.repository = repository1;
    }

    public void save(User user){
        repository.saveUser(user);
    }


}
