package com.UrlShortener.UrlShortener.Controllers;

import com.UrlShortener.UrlShortener.models.Url;
import com.UrlShortener.UrlShortener.services.UrlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/url")
public class UrlController {
    @Autowired
    private UrlService urlService;

    @PostMapping("/")
    public Url save(@RequestBody Url url){
        return urlService.save(url);
    }

    @GetMapping("/{id}")
    public Url getUrl(@PathVariable String id){
        return urlService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        urlService.delete(id);
    }

}
