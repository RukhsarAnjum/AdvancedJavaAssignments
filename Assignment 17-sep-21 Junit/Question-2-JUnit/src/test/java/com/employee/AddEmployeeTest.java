package com.employee;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AddEmployeeTest {
    AddEmployee addEmployee = new AddEmployee();
    Employee employee1= null;
    @Test
    public void addEmployeeTest(){
        Employee employee=new Employee();
        employee1=new Employee(2,"Rukhdar","Bhilai");
        employee.setEmpId(1);
        employee.setEmpName("Raj");
        employee.setEmpCity("Bokaro");

        addEmployee.addEmployee(employee);
        addEmployee.addEmployee(employee1);
    }

    @Test
    public void getEmployeeTest(){
        employee1=new Employee(2,"Rukhdar","Bhilai");
        //employee1 - 121
        addEmployee.addEmployee(employee1);
        assertEquals(addEmployee.getEmployee(2),employee1);
    }
    @Test
    public void getEmployeeNullTest(){
        employee1=new Employee(3,"Rukhdar","Bhilai");
    //    addEmployee.addEmployee(employee1);
        assertNull(addEmployee.getEmployee(3));
    }
}
