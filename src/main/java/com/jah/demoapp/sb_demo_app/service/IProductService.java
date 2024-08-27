package com.jah.demoapp.sb_demo_app.service;

import com.jah.demoapp.sb_demo_app.model.Product;

import java.util.List;

public interface IProductService {

    Product addProduct(Product p);
    Product updatedProduct(Product p, Long prodId);

    void deleteProduct(Long prodId);

    List<Product> getProducts();
    Product getProductById(Long id);
}
