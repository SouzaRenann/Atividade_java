
package com.auth.spring_security.controller;

import com.auth.spring_security.model.Product;
import com.auth.spring_security.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping
    public String teste() {
        return "API funcionando";
    }
}
