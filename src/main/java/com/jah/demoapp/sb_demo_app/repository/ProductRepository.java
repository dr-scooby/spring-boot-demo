package com.jah.demoapp.sb_demo_app.repository;

import com.jah.demoapp.sb_demo_app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// interacts with the DB
public interface ProductRepository extends JpaRepository<Product, Long> {
}
