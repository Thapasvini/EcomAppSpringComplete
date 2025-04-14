package com.org.completeSpringapplication.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

@Component
public class SecondProgrammaticApproach
{
    TransactionTemplate transactionTemplate;


    public SecondProgrammaticApproach(TransactionTemplate transactionTemplate)//to inject this bean, create a bean in appconfig
    {
        this.transactionTemplate=transactionTemplate;
    }

    public void updateUser()
    {
        TransactionCallback<TransactionStatus> dbOperation=(TransactionStatus status)->
        {
            System.out.println("Do Operation");
            return status;
        };
         transactionTemplate.execute(dbOperation);
    }
}
