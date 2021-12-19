package com.UrlShortener.UrlShortener.services;

import org.springframework.stereotype.Service;

@Service
public interface UrlService {

    String save(String url);
}
