package com.org.completeSpringapplication.DBConnection;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
//@ConditionalOnProperty(prefix="mySQLConnection",value="enabled",havingValue ="yes",matchIfMissing = false)
@Profile("dev")
public class mySQLConnection
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
    public mySQLConnection()
    {
        System.out.println("mySQLConnection init");
    }
}
