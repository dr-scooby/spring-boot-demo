package com.jah.demoapp.sb_demo_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

// product class
// Entity used for the database creation, remove the @Data when using @Entity
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // product id
    private String name; // product name
    private double price; // price of product
    private String description ; // description of product


}
