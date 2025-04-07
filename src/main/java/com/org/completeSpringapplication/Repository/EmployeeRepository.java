package com.org.completeSpringapplication.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository
{
    public String getEmployee(Integer Id)
    {
        return "employee";
    }
}
