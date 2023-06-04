package com.oguzhankurt.finalcase.controller.contract;

import com.oguzhankurt.finalcase.dto.UserRegisterRequestDto;

import java.util.List;

public interface UserRegisterController {

    void register(UserRegisterRequestDto request);

}
