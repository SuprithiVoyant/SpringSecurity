
package com.ivoyant.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/greetings")
    public String greetingUser(){
        return "Hello user, Have a good day!";
    }

    @GetMapping("/questions")
    public String askQuestion(){
        return "How was your day, user?";
    }
}
