package com.UrlShortener.UrlShortener.services;

import com.UrlShortener.UrlShortener.models.Url;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UrlService {

    Url save(Url url);
    Url save(String url);
    Url findById(String id);
    List<Url> findAll();
    void delete(String id);
}
