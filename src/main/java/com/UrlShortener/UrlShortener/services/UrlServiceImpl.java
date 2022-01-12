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

    private String generateLink(){
        String id = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
        StringBuilder generatedId = new StringBuilder();

        for(int i = 0; i<8; i++){
            int index = (int)(id.length() * Math.random());
            generatedId.append(id.charAt(index));
        }
        return String.valueOf(generatedId);
    }
    @Override
    public Url save(Url url) {
        url.setGeneratedLink(generateLink());
        urlRepository.save(url);
        return url;
    }

    @Override
    public Url save(String link) {
        Url newConverter = Url.builder().link(link).build();
        System.out.println(newConverter.getId());
        urlRepository.save(newConverter);
        return newConverter;
    }

    @Override
    public Url findById(long id) {
        return urlRepository.findById(id).orElse(null);
    }

    @Override
    public List<Url> findAll() {
        return urlRepository.findAll();
    }
    @Override
    public void delete(long id) {
        urlRepository.deleteById(id);
    }

    @Override
    public Url findByShortUrl(String id) {
        return urlRepository.findByGeneratedLink(id);
    }

}
