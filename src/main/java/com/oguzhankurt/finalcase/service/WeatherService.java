package com.oguzhankurt.finalcase.service;

import com.oguzhankurt.finalcase.dto.WeatherDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherService {
    @Value("${Weather.Api.Key}")
    private String apikey;
    @Value("${Weather.Units}")
    private String units;
    private final FeignService feignService;

    public WeatherDto getweather (String cityname){
        WeatherDto restresponse = feignService.getWeather(cityname,apikey,units);
        return restresponse;
    }

}
