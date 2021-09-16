package com.practice.dao.impl;


import com.practice.constant.QueryMapper;
import com.practice.dao.CustomerDao;
import com.practice.model.CustomerDto;
import com.practice.utility.PostGresSqlDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDaoImpl implements CustomerDao {
    public CustomerDto getCustomerById(Integer customerId){
    try{
        Connection connection= PostGresSqlDatabase.getDBConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(QueryMapper.GET_CUSTOMER_BY_ID);
        //Integer customerId=0;
        preparedStatement.setInt(1,customerId);

        ResultSet resultSet=preparedStatement.executeQuery();
        CustomerDto customerDto=new CustomerDto();
        if(resultSet.next()){
            populateCustomer(customerDto,resultSet);
            return customerDto;
        }
        else{
            System.out.println("invalid customer id");
        }
    }catch(Exception e){
        e.printStackTrace();
    }
        return null;
    }

    private void populateCustomer(CustomerDto customerDto,ResultSet resultSet)throws SQLException {
        customerDto.setCustomerId(resultSet.getInt("customerId"));
        customerDto.setCustomerName(resultSet.getString("customerName"));
        customerDto.setBirthDate(resultSet.getDate("birthDate"));
        customerDto.setMobileNumber(resultSet.getLong("mobile"));
        customerDto.setEmail(resultSet.getString("email"));

    }

}
