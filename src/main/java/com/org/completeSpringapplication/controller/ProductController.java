package com.org.completeSpringapplication.controller;

import com.org.completeSpringapplication.Entity.Product;
import com.org.completeSpringapplication.Exception.ProductNotFoundException;
import com.org.completeSpringapplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/getProductById/{productId}")
    public ResponseEntity<?> getProductById(@PathVariable("productId") Integer id)
    {
        Product product = productService.findById(id).
                    orElseThrow(() -> new ProductNotFoundException("Product not found with id: " + id));
            return ResponseEntity.ok(product);
    }
    @GetMapping("/getProductByName/{productName}")
    public ResponseEntity<?> getProductByName(@PathVariable("productName") String name)
    {
            Product product = productService.findByName(name).
                    orElseThrow(() -> new ProductNotFoundException("Product not found with name: " + name));
            return ResponseEntity.ok(product);
    }

    @PostMapping("/addProduct")
    public ResponseEntity<Product> addProduct(@RequestBody Product product)
    {

        Product productCreated=productService.addProduct(product);
        System.out.println("ProductController");
        return new ResponseEntity<>(productCreated,HttpStatus.CREATED);
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product)
    {

        Product productupdated=productService.updateProduct(product);
        System.out.println("ProductController");
        return new ResponseEntity<>(productupdated,HttpStatus.OK);
    }

}
