package com.UrlShortener.UrlShortener.Controllers;

import com.UrlShortener.UrlShortener.models.User;
import com.UrlShortener.UrlShortener.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable long id){
        return userService.findById(id);
    }
    @GetMapping("/")
    public List<User> findAll(){
        return userService.findAll();
    }
    @DeleteMapping("/")
    public void deleteById(@PathVariable long id){
        userService.deleteById(id);
    }
}
