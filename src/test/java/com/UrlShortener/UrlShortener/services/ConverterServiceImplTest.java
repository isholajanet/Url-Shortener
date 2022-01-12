package com.UrlShortener.UrlShortener.services;

import com.UrlShortener.UrlShortener.Repository.UrlRepository;
import com.UrlShortener.UrlShortener.models.Url;
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
    void saveUrlTest(){
       Url url = Url.builder().link("www.google.com").build();
       urlService.save(url);
       assertThat(url).isNotNull();

    }
    @Test
    void saveUrlTestWithAnObject(){
        Url url = Url.builder().link("https://github.com/isholajanet").build();
        urlService.save(url);
        assertThat(url.getId()).isNotNull();
        assertThat(url.getLink()).isEqualTo("https://github.com/isholajanet");
    }

    @Test
    void findByIdTest(){
        Url url = Url.builder().link("www.talentq.com").build();
        urlService.save(url);
        Url foundedUrl = urlService.findById(url.getId());
        assertThat(foundedUrl).isNotNull();
    }

    @Test
    void findAllUrlTest(){
        assertThat(urlService.findAll()).isNotNull();
        assertThat(urlService.findAll().size()).isEqualTo(2);
    }
    @Test
    void deleteUrlById(){
        assertThat(urlService.findAll().size()).isEqualTo(2);
        urlService.delete(2);
        assertThat(urlService.findAll().size()).isEqualTo(1);

    }

}