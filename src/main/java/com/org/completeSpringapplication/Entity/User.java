package com.org.completeSpringapplication.Entity;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "request",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class User
{

    public User()
    {
        System.out.println("User Initialized");
    }
    @PostConstruct
    public void init()
    {
        System.out.println("User HashCode "+this.hashCode());
    }
}
