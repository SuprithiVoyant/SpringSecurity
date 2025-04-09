package com.ivoyant.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/all")
    public String welcome(){
        return "Welcome";
    }
}