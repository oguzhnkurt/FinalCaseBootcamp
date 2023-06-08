package com.oguzhankurt.finalcase.controller;

import com.oguzhankurt.finalcase.config.JwtService;
import com.oguzhankurt.finalcase.repository.UserRepository;
import com.oguzhankurt.finalcase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class UserRegister {
    @RestController
    @RequestMapping("/api/v1/auth/user-registrations")
    public class UserRegistrationController {

        @Autowired
        private JwtService jwtService;

        @Autowired
        private AuthenticationManager authenticationManager;

        @Autowired
        private UserRepository userRepository;

        @Autowired
        private UserService userService;

    }
}
