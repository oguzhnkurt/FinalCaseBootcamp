package com.oguzhankurt.finalcase.mapper;

import com.oguzhankurt.finalcase.dto.UserDto;
import com.oguzhankurt.finalcase.dto.UserRegisterRequestDto;
import com.oguzhankurt.finalcase.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User toUser(UserRegisterRequestDto userRegisterRequestDto);
    UserDto toUserDto(User user);
}


