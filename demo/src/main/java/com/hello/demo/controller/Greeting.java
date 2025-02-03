package com.hello.demo.controller;

import com.hello.demo.model.ProductModel;
import com.hello.demo.service.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RequestMapping("/")

@RestController
public class Greeting{

    @Autowired
    Product service;

    @GetMapping("/products")
    public List<ProductModel> getProducts(){
        return service.getProducts();
    }


    @GetMapping("/products/{prodId}")
    public ProductModel getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody ProductModel prod){
        System.out.println(prod);
        service.addProduct(prod);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody ProductModel prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}


