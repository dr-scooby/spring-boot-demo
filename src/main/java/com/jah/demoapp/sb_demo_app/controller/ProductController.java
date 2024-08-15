package com.jah.demoapp.sb_demo_app.controller;

// handle requests from the client

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    // url: http://localhost:9192/products/hello
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello jah";
    }
}
