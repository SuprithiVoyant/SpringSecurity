package com.ivoyant.security.service;

import com.ivoyant.security.model.Product;
import com.ivoyant.security.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public ResponseEntity<?> getProducts() {
        List<Product> products = repository.findAll();
        return ResponseEntity.status(HttpStatus.FOUND).body(products);
    }

    public ResponseEntity<?> postProducts(Product product) {
        repository.save(product);
        return ResponseEntity.status(HttpStatus.OK).body("Product saved");
    }
}
