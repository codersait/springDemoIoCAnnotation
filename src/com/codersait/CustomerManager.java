package com.codersait;

public class CustomerManager implements ICustomerService {
    private ICustomerDao customerDao;

    //constructor injection
    public CustomerManager(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }


    public void add() {
        // is kurallari gectiyse veri erisimini cagir.
        customerDao.add();
    }
}
