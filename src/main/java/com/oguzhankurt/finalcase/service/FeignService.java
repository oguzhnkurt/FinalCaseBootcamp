package com.oguzhankurt.finalcase.service;

import com.oguzhankurt.finalcase.dto.WeatherDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Feign",url = "https://api.openweathermap.org/data/2.5/forecast")

public interface FeignService {
    @GetMapping
    WeatherDto getWeather(@RequestParam String q, @RequestParam String appid, @RequestParam String units);

}

