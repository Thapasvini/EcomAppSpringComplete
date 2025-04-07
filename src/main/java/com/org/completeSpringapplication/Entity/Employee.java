package com.org.completeSpringapplication.Entity;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Entity
@Scope("session")
public class Employee
{

    public Employee()
    {
        System.out.println("Employee Initialized");
    }
    @PostConstruct
    public void init()
    {
        System.out.println("Employee HashCode "+this.hashCode());
    }


}
