package com.UrlShortener.UrlShortener.services;

import com.UrlShortener.UrlShortener.Repository.UserRepository;
import com.UrlShortener.UrlShortener.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User save(User user);
    User findById(long id);
    List<User> findAll();
    void deleteById(long id);

}
