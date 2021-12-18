package com.UrlShortener.UrlShortener.services;

import com.UrlShortener.UrlShortener.models.Converter;

import java.util.ArrayList;

public class ConverterServiceImpl implements ConverterService{
    private ArrayList <Converter> converter = new ArrayList<>();
    @Override
    public String urlConverter(String url) {
        Converter newConverter = Converter.builder().url(url).build();
        System.out.println(newConverter.getId());
        converter.add(newConverter);
        return newConverter.getId();
    }
}
