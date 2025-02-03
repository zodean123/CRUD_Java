package com.hello.demo.service;

import com.hello.demo.model.ProductModel;
import com.hello.demo.repository.ProductRepo;
import org.hibernate.annotations.JavaTypeRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Product {

    @Autowired
    ProductRepo repo;

//    List<ProductModel> products = new ArrayList<>(
//            Arrays.asList(
//                    new ProductModel(101, "Iphone", 50000),
//                    new ProductModel(102, "Samsung TV", 100000),
//                    new ProductModel(102, "MI TV", 400000)
//            )
//    );


    public List<ProductModel> getProducts() {
        return repo.findAll();

    }

    public ProductModel getProductById(int prodId) {
//        return products.stream().filter(p -> p.getProdId() == prodId).findFirst().orElse(new ProductModel(100, "None", 0));
        return repo.findById(prodId).orElse(new ProductModel());
    }

    public void addProduct(ProductModel prod) {
        repo.save(prod);
    }

    public void updateProduct(ProductModel prod) {
//        int index = 0;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProdId() == prod.getProdId())
//                index = i;
//
//            products.set(index, prod);
//        }

        repo.save(prod);
    }


    public void deleteProduct(int prodId) {
//        int index = 0;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProdId() == prodId)
//                index = i;
//
//            products.remove(index);
//        }

        repo.deleteById(prodId);
    }
}
