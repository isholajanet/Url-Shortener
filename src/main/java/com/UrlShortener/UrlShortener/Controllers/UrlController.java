package com.UrlShortener.UrlShortener.Controllers;

import com.UrlShortener.UrlShortener.models.Url;
import com.UrlShortener.UrlShortener.services.UrlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

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
    public Url getUrl(@PathVariable long id){
        return urlService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        urlService.delete(id);
    }

    @GetMapping("/redirect")
    public ModelAndView redirectWithUsingForwardPrefix(ModelMap model, @PathVariable long id) {
        Url url = urlService.findById(id);
        model.addAttribute("attribute", url.getId());
        return new ModelAndView("forward:/redirectedUrl", model);
    }
    @PostMapping("/{id}")
    public RedirectView redirect(@PathVariable long id){
        Url url = urlService.findById(id);
        System.out.println(id);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(url.getLink());
        return redirectView;
    }

}
