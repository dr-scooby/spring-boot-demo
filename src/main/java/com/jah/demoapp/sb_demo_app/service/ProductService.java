package com.jah.demoapp.sb_demo_app.service;

// handle all the logic for Product

import com.jah.demoapp.sb_demo_app.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

// make it a service, use as injection class to use anywhere
@Service
public class ProductService {

    // list of products
    private List<Product> products =  Arrays.asList(
            new Product(1L, "Samsung", 100, "smart phone"),

            new Product(2L, "Samsung", 100, "S10 smart phone"),
            new Product(3L, "Samsung", 500, "s20 smart phone"),
            new Product(4L, "iPhone", 900, "iPhone 10x smart phone"),
            new Product(5L, "Dell", 550, "laptop"),
            new Product(6L, "HP", 750, "Laptop"),
            new Product(7L, "Lenovo", 850, "Laptop")
    );



    public List<Product> getProducts(){
        return products;
    }
}
