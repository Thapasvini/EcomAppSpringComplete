package com.org.completeSpringapplication.controller;

import com.org.completeSpringapplication.Entity.User;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Scope("session")
public class EmployeeController
{
    @Autowired
    User user;

    public EmployeeController()
    {
        System.out.println("Employee Controller Init");
    }

    @GetMapping("/fetchUser")
    public ResponseEntity<String> getUserDetails()
    {
        System.out.println("Fetech user api");
        return ResponseEntity.status(HttpStatus.OK).body("ok");
    }

    @PostConstruct
    public void init()
    {
        System.out.println("Employee Controller hash "+this.hashCode()+
                " User Object Hash "+user.hashCode());
    }



    @GetMapping("/logout")
    public ResponseEntity<String> logout(HttpServletRequest request)
    {

        request.getSession().invalidate();
        System.out.println("Logout intitialized");
        return ResponseEntity.status(HttpStatus.OK).body("ok");
    }
}
