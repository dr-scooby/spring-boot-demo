package com.jah.demoapp.sb_demo_app.service;

// handle all the logic for Product

import com.jah.demoapp.sb_demo_app.model.Product;
import com.jah.demoapp.sb_demo_app.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

// make it a service, use as injection class to use anywhere
@Service
@RequiredArgsConstructor
public class ProductService {

    // using the JpaRepository to interact with the DB
    private final ProductRepository prodrepos;

    // list of products, testing only, move to DB
    private List<Product> products =  Arrays.asList(
            new Product(1L, "Samsung", 100, "smart phone"),

            new Product(2L, "Samsung", 100, "S10 smart phone"),
            new Product(3L, "Samsung", 500, "s20 smart phone"),
            new Product(4L, "iPhone", 900, "iPhone 10x smart phone"),
            new Product(5L, "Dell", 550, "laptop"),
            new Product(6L, "HP", 750, "Laptop"),
            new Product(7L, "Lenovo", 850, "Laptop"),
            new Product(8L, "Lenovo", 150, "Laptop x390"),
            new Product(9L, "Lenovo", 150, "Laptop T15"),
            new Product(10L, "Lenovo", 150, "Laptop T14")
    );



    // getProducts from the JpaRepository, DB
    public List<Product> getProducts(){
        return prodrepos.findAll();
    }


    // call the postconstruct to run this method when this class is created to save data, testing only.
    @PostConstruct
    public List<Product> saveProduct(){
        return prodrepos.saveAll(products);
    }
}
