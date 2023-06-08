package com.oguzhankurt.finalcase.controller;

import com.oguzhankurt.finalcase.dto.SaveCityDto;
import com.oguzhankurt.finalcase.general.GenericApiResponse;
import com.oguzhankurt.finalcase.kafka.Producer;
import com.oguzhankurt.finalcase.mapper.UserMapper;
import com.oguzhankurt.finalcase.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/appuser")
@AllArgsConstructor
public class UserController {

    private UserService userService;
    private final Producer producer;

    @GetMapping
    public GenericApiResponse getUser(){
        var response = UserMapper.INSTANCE.toUserDto(userService.getUser());
        producer.sendMessage("All users are here.", "test");
        return new GenericApiResponse(200, "Success", "68486946646", response);
    }

    @DeleteMapping
    public GenericApiResponse deleteUser(){
        userService.deleteUser();
        producer.sendMessage("User Deleted.", "test");
        return new GenericApiResponse(200, "Success", "879874");
    }

    @GetMapping("/weatherdata/savedcities/{users}")
    public GenericApiResponse getSavedCitiesWeatherDataOfUser(@PathVariable String users){
        var response = userService.getUsersSavedCitiesWeatherData();
        producer.sendMessage("Users cit.", "test");
        return new GenericApiResponse(200, "Success", "81941816", response);
    }

    @PostMapping("/new/savedcities/{users}")
    public GenericApiResponse addSavedCityToUser(@PathVariable String users,@RequestBody SaveCityDto requestDto){
        var response = userService.addSavedCityToUser(requestDto.getCity(),users);
        return new GenericApiResponse(200, "Success", "6549846654", response);
    }

    @DeleteMapping("/savedcities/")
    public GenericApiResponse deleteSavedCityFromUser(@RequestBody SaveCityDto requestDto){
        var response = userService.deleteSavedCityFromUser(requestDto.getCity());
        return new GenericApiResponse(200, "Success", "564681351", response);
    }
}