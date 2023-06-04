package com.oguzhankurt.finalcase.mapper;

import com.oguzhankurt.finalcase.dto.UserRegisterRequestDto;
import com.oguzhankurt.finalcase.entity.User;
import org.apache.logging.log4j.CloseableThreadContext;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User toUser(UserRegisterRequestDto userRegisterRequestDto);
}


