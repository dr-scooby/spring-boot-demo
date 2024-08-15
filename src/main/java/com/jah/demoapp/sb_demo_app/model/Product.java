package com.jah.demoapp.sb_demo_app.model;

import lombok.*;

// product class
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Long id; // product id
    private String name; // product name
    private double price; // price of product
    private String description ; // description of product


}
