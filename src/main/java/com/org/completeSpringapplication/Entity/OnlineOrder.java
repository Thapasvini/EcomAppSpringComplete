package com.org.completeSpringapplication.Entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OnlineOrder
{

    public OnlineOrder()
    {
        System.out.println("Online Order default constr");
    }

    public OnlineOrder( String name,String paymentType)
    {
        System.out.println("Online Order with " + name + " and " + paymentType);
    }




}
