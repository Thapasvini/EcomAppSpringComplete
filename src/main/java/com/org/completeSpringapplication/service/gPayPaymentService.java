package com.org.completeSpringapplication.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;


@ConditionalOnProperty()
public class gPayPaymentService implements PaymentService
{
    @Override
    public String paymentMethod()
    {
        return "gpay card";
    }
}
