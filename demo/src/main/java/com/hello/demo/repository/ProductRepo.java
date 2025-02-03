package com.hello.demo.repository;


import com.hello.demo.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<ProductModel,Integer> {
}
