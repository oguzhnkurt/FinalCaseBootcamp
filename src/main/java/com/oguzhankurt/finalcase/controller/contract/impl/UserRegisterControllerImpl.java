package com.oguzhankurt.finalcase.controller.contract.impl;

import com.oguzhankurt.finalcase.controller.contract.UserRegisterController;
import com.oguzhankurt.finalcase.dto.UserRegisterRequestDto;
import com.oguzhankurt.finalcase.entity.User;
import com.oguzhankurt.finalcase.mapper.UserMapper;
import com.oguzhankurt.finalcase.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRegisterControllerImpl implements UserRegisterController {
    private final UserService userService;

    @Override
    public void register(UserRegisterRequestDto request) {
        User user = UserMapper.INSTANCE.toUser(request);
        userService.save(user);
    }
}
