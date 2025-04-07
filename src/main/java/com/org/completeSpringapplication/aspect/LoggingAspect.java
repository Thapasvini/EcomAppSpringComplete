package com.org.completeSpringapplication.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect
{
    @Pointcut("execution(* com.org.completeSpringapplication.service.ProductService.*(..))")
    public void firstPointcut(){}

    @Before("firstPointcut()")
    public void loggingmethodbefore()
    {
        System.out.println("Before Logging");
    }

    @After("execution(* com.org.completeSpringapplication.service.ProductService.*(..))")
    public void loggingmethodafter()
    {
        System.out.println("After Logging");
    }
    @Around("execution(* com.org.completeSpringapplication.service.ProductService.*(..))")
    public Object loggingmethodaround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        System.out.println("Around Before Logging");
        Object o=proceedingJoinPoint.proceed();
        System.out.println("Around After Logging");
        return o;
    }

}
