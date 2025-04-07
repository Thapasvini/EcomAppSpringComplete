package com.org.completeSpringapplication.DBConnection;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class deployment
{
    @Value("${username}")
    String username;
    @Value("${password}")
    String password;

    @PostConstruct
    public void init()
    {
        System.out.println("user name:"+username+" password:"+password);
    }
}
