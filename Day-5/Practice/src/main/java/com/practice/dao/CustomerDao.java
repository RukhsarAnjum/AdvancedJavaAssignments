package com.practice.dao;

import com.practice.model.CustomerDto;

public interface CustomerDao {
    public CustomerDto getCustomerById(Integer CustomerId);
}
