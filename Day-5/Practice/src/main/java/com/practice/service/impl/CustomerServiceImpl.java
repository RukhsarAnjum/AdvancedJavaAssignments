package com.practice.service.impl;

import com.practice.dao.CustomerDao;
import com.practice.dao.impl.CustomerDaoImpl;
import com.practice.model.CustomerDto;
import com.practice.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    CustomerDao customerDao=new CustomerDaoImpl();
    public CustomerDto getCustomerById(Integer customerId){
        return customerDao.getCustomerById(customerId);
    }


}
