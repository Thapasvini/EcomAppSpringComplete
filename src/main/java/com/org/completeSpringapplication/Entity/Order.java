package com.org.completeSpringapplication.Entity;

import org.springframework.stereotype.Component;

@Component
public class Order
{
    User u;
    public Order()
    {
        System.out.println("Initializing Order");
    }

    public void setOrder(User u)
    {
        this.u=u;
    }
    public String typeOfOrder()
    {
        return "Order type is";
    }



}
