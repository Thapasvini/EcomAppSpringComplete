package com.org.completeSpringapplication.service;

import com.org.completeSpringapplication.Entity.Product;
import com.org.completeSpringapplication.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService
{
    ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository)
    {
        this.productRepository=productRepository;
    }

    public Optional<Product> findById(@PathVariable Integer id)
    {
        return productRepository.findById(id);
    }

    public Optional<Product> findByName( String name)
    {
        return productRepository.findByName(name);

    }
    public Product addProduct(Product product)
    {
        System.out.println("Product Service");
        return productRepository.save(product);
    }

    public Product updateProduct(Product product)
    {
        System.out.println("Product Service");
        return productRepository.save(product);
    }

    public List<Product> getAllProducts()
    {
        return productRepository.findAll();
    }











}
