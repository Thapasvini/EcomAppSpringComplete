package com.org.completeSpringapplication.DBConnection;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(prefix="noSQLConnection",value="enabled",havingValue ="yes",matchIfMissing = false)
@Profile("prod")
public class noSQLConnection
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
    public noSQLConnection()
    {
        System.out.println("noSQLConnection init");
    }
}
