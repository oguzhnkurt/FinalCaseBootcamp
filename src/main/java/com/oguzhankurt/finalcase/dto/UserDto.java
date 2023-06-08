package com.oguzhankurt.finalcase.dto;

import com.oguzhankurt.finalcase.entity.City;
import com.oguzhankurt.finalcase.entity.Role;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class UserDto {

    private String username;
    private Set<City> city;
    private String password;
    private Role role;
}