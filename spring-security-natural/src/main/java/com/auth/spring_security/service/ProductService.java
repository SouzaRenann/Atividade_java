package com.auth.spring_security.service;

import com.auth.spring_security.model.Product;
import com.auth.spring_security.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;


    public Product createProduct(Product product){
        return productRepository.save(product);
    }



}
