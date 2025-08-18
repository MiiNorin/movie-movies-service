package org.example.movieservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class HomeController {
    @GetMapping("")
    public String FrontController() {
        return "Hello Movie Service";
    }
}
