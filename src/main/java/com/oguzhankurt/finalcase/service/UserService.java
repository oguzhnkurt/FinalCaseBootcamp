package com.oguzhankurt.finalcase.service;

import com.oguzhankurt.finalcase.dto.WeatherDto;
import com.oguzhankurt.finalcase.entity.City;
import com.oguzhankurt.finalcase.entity.User;
import com.oguzhankurt.finalcase.exceptions.UsersNotFoundException;
import com.oguzhankurt.finalcase.repository.CityRepository;
import com.oguzhankurt.finalcase.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final WeatherService weatherService;

    private final CityRepository cityRepository;


    public User getUser() {
        User user = extractUser();
        return user;
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public void deleteUser() {
        User user = extractUser();
        this.cityRepository.deleteAll(user.getCity());
        this.userRepository.delete(user);
    }

    public Map<String, WeatherDto> getUsersSavedCitiesWeatherData() {
        User user = extractUser();
        Set<City> cities = user.getCity();
        Map<String, WeatherDto> citiesData = new HashMap<>();

        for (City city : cities) {
            String a = city.getName();
            citiesData.put(city.getName(), weatherService.getweather(city.getName()));
        }
        return citiesData;
    }

    public User addSavedCityToUser(String city,String users) {
        User user = extractUser();
        Set<City> cities = new HashSet<>();
        City cityEntity = new City(null,city,user);
        if (cities == null) {
            cities = new HashSet<>();
        }
        cities.add(cityEntity);

        //user.setCity(cities);
        cityRepository.save(cityEntity);
        return user;
    }

    public User deleteSavedCityFromUser(String city) {
        User user = extractUser();
        Set<City> cities = user.getCity();
        List<City> deletedcity = cities.stream().filter(c -> c.name.contains(city)).collect(Collectors.toList());
        if(deletedcity.size()>0 ){
            this.cityRepository.deleteAll(deletedcity);
        }
        return user;
    }

    private User extractUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication.getPrincipal() instanceof UserDetails){
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            User user = userRepository.findUserByUsername(userDetails.getUsername()).orElseThrow();
            return user;
        }
        else{
            throw new UsersNotFoundException("User cannot be found");
        }
    }

}
