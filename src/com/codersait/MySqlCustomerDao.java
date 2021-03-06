package com.codersait;

import org.springframework.beans.factory.annotation.Value;

public class MySqlCustomerDao implements ICustomerDao {
    @Value("${database.ConnectionString}")
    private String connectionString;

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    @Override
    public void add() {
        System.out.println("Connection String: " + connectionString);
        System.out.println("MySql veri tabanina eklendi");
    }
}
