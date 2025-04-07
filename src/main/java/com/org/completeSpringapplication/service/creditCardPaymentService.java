package com.org.completeSpringapplication.service;

public class creditCardPaymentService implements PaymentService
{
    @Override
    public String paymentMethod()
    {
        return "credit card";
    }
}
