package com.org.completeSpringapplication.controller;

import com.org.completeSpringapplication.Entity.User;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Scope("request")
public class UserController
{
    @Autowired
    User user;

    public UserController()
    {
        System.out.println("User Controller Init");
    }
    @PostConstruct
    public void init()
    {
        System.out.println("User Controller hash "+this.hashCode()+
                " User Object Hash "+user.hashCode());
    }

    @GetMapping("/fetchUser1")
    public ResponseEntity<String> getUserDetails()
    {
        System.out.println("Fetech user api");
        return ResponseEntity.status(HttpStatus.OK).body("ok");
    }
}