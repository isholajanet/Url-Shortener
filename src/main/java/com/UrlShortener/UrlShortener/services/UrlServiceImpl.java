package com.UrlShortener.UrlShortener.services;

import com.UrlShortener.UrlShortener.Repository.UrlRepository;
import com.UrlShortener.UrlShortener.models.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UrlServiceImpl implements UrlService {
    @Autowired
    private UrlRepository urlRepository;
    @Override
    public String save(String url) {
        Url newConverter = Url.builder().url(url).build();
        System.out.println(newConverter.getId());
        urlRepository.save(newConverter);
        return newConverter.getId();
    }

}
