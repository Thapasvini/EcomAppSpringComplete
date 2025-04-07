package com.org.completeSpringapplication.Utility;

import EmployeeUtility.DeprecatedEmployeeUtilityService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "EmployeeUtility",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {DeprecatedEmployeeUtilityService.class})

)
public class EmployeeConfig
{

}
