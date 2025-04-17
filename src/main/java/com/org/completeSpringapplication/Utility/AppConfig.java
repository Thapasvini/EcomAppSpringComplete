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

/*
    @Bean
    public DataSource dataSource()
    {
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:testdb");
        dataSource.setUsername("root");
        dataSource.setPassword("thap");
        return dataSource;
    }
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource)
    {
        return new DataSourceTransactionManager(dataSource);
    }
    @Bean
    public TransactionTemplate transactionTemplate(PlatformTransactionManager transactionManager)
    {
        return new TransactionTemplate(transactionManager);
    }*/
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
