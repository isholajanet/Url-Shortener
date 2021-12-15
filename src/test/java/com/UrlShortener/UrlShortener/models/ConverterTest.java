package com.UrlShortener.UrlShortener;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
public class test {


    @Test
    void tes(){

        String id = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
        StringBuilder generatedId = new StringBuilder();
        int number = 10;

        for(int i = 0; i<number; i++){
            int index = (int)(id.length() * Math.random());
            generatedId.append(id.charAt(index));
        }
        System.out.println(generatedId);


    }
}
