package com.jah.demoapp.sb_demo_app.service;

// handle all the logic for Product

import com.jah.demoapp.sb_demo_app.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

// make it a service, use as injection class to use anywhere
@Service
public class ProductService {


    public List<Product> getProducts(){
        return null;
    }
}
