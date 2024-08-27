package com.jah.demoapp.sb_demo_app.controller;

// handle requests from the client

import com.jah.demoapp.sb_demo_app.model.Product;
import com.jah.demoapp.sb_demo_app.service.IProductService;
import com.jah.demoapp.sb_demo_app.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {

    // injection, need the final
    private final ProductService prodservice; // will be initialized by Spring

    // injection, need the final.
    // same as : ipservice = new ProductService(); -->> instantiate the class using the interface
    private final IProductService ipservice;


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


    // @PathVariable: used to get the variable from the url mapping
    @GetMapping("/{id}/product")
    public Product getProductById(@PathVariable Long id){
        return prodservice.getProductById(id);

    }

    // http://localhost:9192/products/add
    @PostMapping("/add")
    public Product addProduct(@RequestBody Product p){
        return prodservice.addProduct(p);
    }

    // in postman select Put -  http://localhost:9192/products/update?id=1
    @PutMapping("/update")
    public Product updatedProduct(@RequestBody Product p, @RequestParam  Long id){
        return prodservice.updatedProduct(p, id);
    }


    // @PathVariable: used to get the variable from the url mapping
    @DeleteMapping("/{id}/delete")
    public void deleteProduct(@PathVariable Long id){
         prodservice.deleteProduct(id);
    }
}
