package com.codersait;

public class MsSqlCustomerDao implements ICustomerDao{
    private String connectionString;

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    @Override
    public void add() {
        System.out.println("Connection String: "+connectionString);
        System.out.println("MsSql veritabanina eklendi");
    }
}
