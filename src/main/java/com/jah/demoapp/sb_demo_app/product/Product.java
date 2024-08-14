package com.jah.demoapp.sb_demo_app.product;

import lombok.*;

// product class
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Long id; // product id
    private String name; // product name
    private double price; // price of product
    private String description ; // description of product


}
