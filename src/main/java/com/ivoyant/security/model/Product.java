package com.ivoyant.security.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Product {
    @Id
    int id;
    String name;
    int quantity;
    double price;
}
