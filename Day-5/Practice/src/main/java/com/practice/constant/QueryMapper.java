package com.practice.constant;

public interface QueryMapper {
    public static final String GET_CUSTOMER_BY_ID=
            "select * from customer where customerId=?;";
    public static  final String GET_ALL_CUSTOMER=
            "select * from customer;";
    public static final String ADD_CUSTOMER=
            "insert into customer values(?,?,?,?,?);";
    public static final String UPDATE_CUSTOMER=
            "update customer set customerName=?,birthdate=?mobileNumber=?,email=? where customerId=?;";
    public static final String DELETE_CUSTOMER=
            "delete customer where customerId=?;";
}
