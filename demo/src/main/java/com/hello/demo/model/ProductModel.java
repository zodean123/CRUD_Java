package com.hello.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;


@Component
@Entity
public class ProductModel {

    @Id
    private int prodId;
    private String prodName;
    private int price;

    public ProductModel() {

    }

    public ProductModel(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProdId() {
        return prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }
}
