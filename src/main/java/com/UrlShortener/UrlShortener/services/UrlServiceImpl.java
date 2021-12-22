package com.UrlShortener.UrlShortener.services;

import com.UrlShortener.UrlShortener.Repository.UrlRepository;
import com.UrlShortener.UrlShortener.models.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UrlServiceImpl implements UrlService {
    @Autowired
    private UrlRepository urlRepository;

    @Override
    public String save(Url url) {
        urlRepository.save(url);
        return url.getId();
    }

    @Override
    public String save(String url) {
        Url newConverter = Url.builder().url(url).build();
        System.out.println(newConverter.getId());
        urlRepository.save(newConverter);
        return newConverter.getId();
    }

    @Override
    public Url findById(String id) {
        return urlRepository.findById(id).orElse(null);
    }

    @Override
    public List<Url> findAll() {
        return urlRepository.findAll();
    }

    @Override
    public void delete(String id) {
        urlRepository.deleteById(id);
    }

}
