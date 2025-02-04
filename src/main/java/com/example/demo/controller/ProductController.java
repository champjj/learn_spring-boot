package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;

@RestController
@RequestMapping("/products")
public class ProductController {
    
        @GetMapping("")
    public Product[] getProductsAsArray() {
        Product[] products = new Product[]{
            new Product(1L, "Laptop", 1200.00),
            new Product(2L, "Smartphone", 500.00),
            new Product(3L, "Tablet", 300.00)
        };
        return products;
    }

}
