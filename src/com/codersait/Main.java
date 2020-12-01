package com.codersait;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
        ICustomerDao customerService = context.getBean("database", ICustomerDao.class);
        customerService.add();

    }
}
