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
public class ProductService implements IProductService{

    // using the JpaRepository to interact with the DB
    private final ProductRepository prodrepos;

    // list of products, testing only, move to DB
   private List<Product> products =  Arrays.asList(
            new Product(1L, "Samsung", 100, "smart phone", 1),

            new Product(2L, "Samsung", 100, "S10 smart phone", 1),
            new Product(3L, "Samsung", 500, "s20 smart phone", 2),
            new Product(4L, "iPhone", 900, "iPhone 10x smart phone", 2),
            new Product(5L, "Dell", 550, "laptop", 3),
            new Product(6L, "HP", 750, "Laptop", 3),
            new Product(7L, "Lenovo", 850, "Laptop", 3),
            new Product(8L, "Lenovo", 150, "Laptop x390", 4),
            new Product(9L, "Lenovo", 150, "Laptop T15", 5),
            new Product(10L, "Lenovo", 150, "Laptop T14", 6)
    );


   // add product to the DB
    @Override
    public Product addProduct(Product p) {
        return prodrepos.save(p);
    }

    // updated the product with new info
    @Override
    public Product updatedProduct(Product p, Long prodId) {
        // check if product is in the DB:
        // update with info:
        return prodrepos.findById(prodId).map(oldProduct ->{
                oldProduct.setName(p.getName());
                oldProduct.setDescription(p.getDescription());
                oldProduct.setPrice(p.getPrice());
                oldProduct.setQty(p.getQty());
                return prodrepos.save(oldProduct);
        }).orElseThrow( () -> new RuntimeException("product not found with id: " + prodId) );

        // this block works as well
        //if(prodrepos.findById(prodId).isPresent()){
         //   return prodrepos.save(p);
       // }
        //return null;
    }

    // delete by Id
    @Override
    public void deleteProduct(Long prodId) {

        // check if exists, then delete:
        if(prodrepos.findById(prodId).isPresent()){
            prodrepos.deleteById(prodId);
        }


    }

    // getProducts from the JpaRepository, DB
    @Override
    public List<Product> getProducts(){
        return prodrepos.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return prodrepos.findById(id).orElseThrow(null);
    }


    // call the postconstruct to run this method when this class is created to save data, testing only.
    /*@PostConstruct
    public List<Product> saveProduct(){
        return prodrepos.saveAll(products);
    }*/
}
