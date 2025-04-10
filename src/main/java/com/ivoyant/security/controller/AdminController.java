package com.ivoyant.security.controller;

import com.ivoyant.security.model.Product;
import com.ivoyant.security.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final ProductService productService;

    @GetMapping("/users")
    public String users(){
        return "User list";
    }

    @PostMapping("/products")
    public ResponseEntity<?> postProducts(@RequestBody Product product){
        return productService.postProducts(product);
    }

}
