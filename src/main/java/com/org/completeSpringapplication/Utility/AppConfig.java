package com.org.completeSpringapplication.Utility;

import com.org.completeSpringapplication.Entity.OnlineOrder;
import com.org.completeSpringapplication.service.PaymentService;
import com.org.completeSpringapplication.service.creditCardPaymentService;
import com.org.completeSpringapplication.service.gPayPaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
@Configuration
public class AppConfig
{
    @Bean
    @Primary
    public PaymentService creditCardpaymentServiceBean()
    {
        return new creditCardPaymentService();
    }
    @Bean
    public PaymentService gPaypaymentServiceBean()
    {
        return new gPayPaymentService();
    }

    @Bean
    @Qualifier("OrderBeanWithParams")
    public OnlineOrder createOrder()
    {
        return new OnlineOrder("Lappy","16");
    }
}
