package com.oguzhankurt.finalcase.controller;

import com.oguzhankurt.finalcase.dto.WeatherDto;
import com.oguzhankurt.finalcase.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/weather")
public class WeatherController {
    private WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
    @GetMapping
    public WeatherDto getweather(@RequestParam String cityname){

        return weatherService.getweather(cityname);
    }
}
