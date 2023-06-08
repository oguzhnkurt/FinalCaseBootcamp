/*package com.oguzhankurt.finalcase.service;

import com.oguzhankurt.finalcase.entity.City;
import com.oguzhankurt.finalcase.entity.User;
import com.oguzhankurt.finalcase.repository.CityRepository;
import com.oguzhankurt.finalcase.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private WeatherService weatherService;

    @Mock
    private CityRepository cityRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetUser() {
        // Mock authentication
        User authenticatedUser = new User();
        authenticatedUser.setUsername("john");
        when(userRepository.findUserByUsername("john")).thenReturn(Optional.of(authenticatedUser));

        User user = userService.getUser();

        assertEquals(authenticatedUser, user);
        verify(userRepository, times(1)).findUserByUsername("john");
    }

    @Test
    void testGetAllUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(new User());
        userList.add(new User());

        when(userRepository.findAll()).thenReturn(userList);

        List<User> users = userService.getAllUsers();

        assertEquals(userList.size(), users.size());
        verify(userRepository, times(1)).findAll();
    }

    @Test
    void testDeleteUser() {
        // Mock authentication
        User authenticatedUser = new User();
        authenticatedUser.setUsername("john");
        Set<City> cities = new HashSet<>();
        cities.add(new City());
        authenticatedUser.setCity(cities);
        when(userRepository.findUserByUsername("john")).thenReturn(Optional.of(authenticatedUser));

        userService.deleteUser();

        verify(cityRepository, times(1)).deleteAll(cities);
        verify(userRepository, times(1)).delete(authenticatedUser);
    }


    @Test
    void testAddSavedCityToUser() {
        // Mock authentication
        User authenticatedUser = new User();
        authenticatedUser.setUsername("john");
        when(userRepository.findUserByUsername("john")).thenReturn(Optional.of(authenticatedUser));

        User user = userService.addSavedCityToUser("", "john");

        assertNotNull(user.getCity());
        assertEquals(1, user.getCity().size());
        verify(cityRepository);
    }
}
*/