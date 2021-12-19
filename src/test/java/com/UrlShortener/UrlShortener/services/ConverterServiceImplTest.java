package com.UrlShortener.UrlShortener.services;

import com.UrlShortener.UrlShortener.Repository.UrlRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConverterServiceImplTest {
    @Autowired
    private UrlService urlService;


    @Test
    void convertUrl(){
       String result = urlService.save("www.google.com");
       assertThat(result).isNotNull();
       System.out.println(result);
    }
}