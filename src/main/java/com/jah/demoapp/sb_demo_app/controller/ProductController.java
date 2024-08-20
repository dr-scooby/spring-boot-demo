package com.jah.demoapp.sb_demo_app.controller;

// handle requests from the client

import com.jah.demoapp.sb_demo_app.model.Product;
import com.jah.demoapp.sb_demo_app.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService prodservice; // will be initialized by the lombok RequiredArgsConstructor



    // url: http://localhost:9192/products/hello
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello jah";
    }

    // url: http://localhost:9192/products/getall
    @GetMapping("/getall")
    public List<Product> getAllProducts(){

        return prodservice.getProducts();
    }
}
