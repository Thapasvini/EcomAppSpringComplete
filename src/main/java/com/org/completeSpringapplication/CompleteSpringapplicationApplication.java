package com.org.completeSpringapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
//@ComponentScan(basePackages={"com.org.completeSpringapplication","EmployeeUtility"})
public class CompleteSpringapplicationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationcontext= SpringApplication.run(CompleteSpringapplicationApplication.class, args);
		System.out.println("all beans created");

		//applicationcontext.close();

	}

}
