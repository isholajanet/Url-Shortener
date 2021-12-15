package com.UrlShortener.UrlShortener.services;

import com.UrlShortener.UrlShortener.models.Converter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConverterServiceImplTest {
    private ConverterService converterService;
    @BeforeEach
    void setUp() {
        converterService = new ConverterServiceImpl();
    }

    @Test
    void convertUrl(){
       String result = converterService.urlConverter("www.google.com");
       assertNotNull(result);
        System.out.println(result);

    }
}