
package com.ivoyant.security.controller;

import com.ivoyant.security.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final ProductService productService;

    @GetMapping("/greetings")
    public String greetingUser(){
        return "Hello user, Have a good day!";
    }

    @GetMapping("/questions")
    public String askQuestion(){
        return "How was your day, user?";
    }

    @GetMapping("/products")
    public ResponseEntity<?> getProducts(){
        return productService.getProducts();
    }
}
