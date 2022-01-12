package com.UrlShortener.UrlShortener.services;

import com.UrlShortener.UrlShortener.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    void saveUserTest(){
        User user = User.builder().name("janet").email("janet@email.com").build();
        User newUser = userService.save(user);
        assertThat(user).isEqualTo(newUser);
        assertThat(user.getName()).isEqualTo("janet");
        assertThat(user.getId()).isEqualTo(1);
    }
    @Test
    void findUserByIdTest(){
        User foundedUser = userService.findById(1L);
        assertThat(foundedUser).isNotNull();
        assertThat(foundedUser.getName()).isEqualTo("janet");
        assertThat(foundedUser.getEmail()).isEqualTo("janet@email.com");
    }
    @Test
    void findAllUserTest(){
        User user = User.builder().name("shola").email("shola.gmail.com").build();
        userService.save(user);
        assertThat(userService.findAll().size()).isEqualTo(2);
        assertThat(userService.findAll()).isNotNull();
    }
    @Test
    void deleteUserTest(){
        User foundedUser = userService.findById(2);
        assertThat(foundedUser).isNotNull();
        userService.deleteById(2);
        User foundedUser2 = userService.findById(2);
        assertThat(foundedUser2).isNull();
    }

}