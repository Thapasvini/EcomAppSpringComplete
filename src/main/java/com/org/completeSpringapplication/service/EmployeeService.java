package com.org.completeSpringapplication.service;

import com.org.completeSpringapplication.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService
{
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    PaymentService p;


    public String getEmployee(Integer id)
    {
       // Employee e= employeeRepository.getEmployee(id);
       // EmployeeDTO employeeDTO1=new EmployeeDTO();
        return "employee";

    }

    public String getPaymentType()
    {
        return p.paymentMethod();
    }
}
