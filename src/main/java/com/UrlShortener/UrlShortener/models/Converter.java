package com.UrlShortener.UrlShortener.models;

import lombok.Builder;


@Builder
public class Converter {

    private final String id = generateRandomId(10);
    private String url;

    private String generateRandomId(int number){
        String id = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
        StringBuilder generatedId = new StringBuilder();

        for(int i = 0; i<number; i++){
            int index = (int)(id.length() * Math.random());
            generatedId.append(id.charAt(index));
        }
        return String.valueOf(generatedId);
    }


    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
