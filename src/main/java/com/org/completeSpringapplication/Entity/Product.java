package com.org.completeSpringapplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Product
{
    @jakarta.persistence.Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer Id;
    String name;

    Double price;
    String description;

    public Product()
    {

    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
