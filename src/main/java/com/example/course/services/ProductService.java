package com.example.course.services;

import com.example.course.entities.Product;
import com.example.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();

    }
  
}
