package com.codersait;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ICustomerDao customerService = context.getBean("database", ICustomerDao.class);
        customerService.add();

    }
}
