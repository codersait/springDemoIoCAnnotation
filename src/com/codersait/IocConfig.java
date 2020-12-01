package com.codersait;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.codersait")
public class IocConfig {
    @Bean
    public ICustomerDao database(){
        return new MySqlCustomerDao();
    }
    @Bean
    public ICustomerService service(){
        return new CustomerManager(database());
    }
}
