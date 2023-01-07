package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public void save(String name) {
        this.productRepository.save(new Product(name));
    }

    public void save(String name, String description) {
        this.productRepository.save(new Product(name, description));
    }

    public List<Product> findAll(){
        return this.productRepository.findAll();
    }

    public List<Product> findByName(String name){
        return this.productRepository.findByName(name);
    }
}
