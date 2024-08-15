package com.jah.demoapp.sb_demo_app.controller;

// handle requests from the client

import com.jah.demoapp.sb_demo_app.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private List<Product> products =  Arrays.asList(
            new Product(1L, "Samsung", 100, "smart phone"),

            new Product(2L, "Samsung", 100, "S10 smart phone"),
            new Product(3L, "Samsung", 500, "s20 smart phone"),
            new Product(4L, "iPhone", 900, "iPhone 10x smart phone"),
            new Product(5L, "Dell", 550, "laptop"),
            new Product(6L, "HP", 750, "Laptop"),
            new Product(7L, "Lenovo", 850, "Laptop")
            );

    // url: http://localhost:9192/products/hello
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello jah";
    }

    // url: http://localhost:9192/products/getall
    @GetMapping("/getall")
    public List<Product> getAllProducts(){

        return products;
    }
}
