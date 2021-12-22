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
       String result = urlService.save("www.google.com");
       assertThat(result).isNotNull();
       System.out.println(result);
    }
    @Test
    void saveUrlTestWithAnObject(){
        Url url = Url.builder().url("www.facebook.com").build();
        urlService.save(url);
        assertThat(url.getId()).isNotNull();
        assertThat(url.getUrl()).isEqualTo("www.facebook.com");
    }

    @Test
    void findByIdTest(){
        Url url = Url.builder().url("www.talent.com").build();
        urlService.save(url);
        Url foundedUrl = urlService.findById(url.getId());
        assertThat(foundedUrl).isNotNull();
    }

    @Test
    void findAllUrlTest(){
//        Url url = Url.builder().url("www.twitter.com").build();
//        urlService.save(url);
        assertThat(urlService.findAll()).isNotNull();
        assertThat(urlService.findAll().size()).isEqualTo(4);
    }
    @Test
    void deleteUrlById(){
        Url url = Url.builder().url("www.talent.com").build();
        urlService.save(url);
        assertThat(urlService.findAll().size()).isEqualTo(5);
        urlService.delete(url.getId());
        assertThat(urlService.findAll().size()).isEqualTo(4);

    }

}