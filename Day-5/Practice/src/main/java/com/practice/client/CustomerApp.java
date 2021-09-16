package com.practice.client;

import com.practice.model.CustomerDto;
import com.practice.service.CustomerService;
import com.practice.service.impl.CustomerServiceImpl;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerApp {

    private CustomerService customerService=new CustomerServiceImpl();
//    private static Logger uiLogger= Logger.getLogger(CustomerApp.class);
    private static Scanner scanner=new Scanner(System.in);

    public static  void main(String[] args) throws SQLException {

        CustomerApp customerApp=new CustomerApp();
        customerApp.clientCall();

    }

    public void clientCall(){
        Boolean  flag=true;

        try {
            while (flag) {
                System.out.println("Enter 1. get customer 2. get all customers 3. add customer 4. update customer 5. delete customer 6. exit");
                Integer option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Enter Customer ID");
                        Integer customerId = scanner.nextInt();
                        CustomerDto customer = customerService.getCustomerById(customerId);
                        if(customer!=null){
                            System.out.println("Details are : " +customer);
                        }
                        else{
                            System.out.println("Invalid customer id");
                        }
                        break;
                    case 2:
                        List<CustomerDto> customerList=new ArrayList<CustomerDto>();

                }

            }
        }catch(Exception e){
            e.getMessage();
        }
    }

}
