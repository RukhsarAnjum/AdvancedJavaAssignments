package com.employee;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
    List<Employee> employeeList=new ArrayList<>();
    //added in list with reference 121

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public Employee getEmployee(Integer id){
        for(Employee emp:employeeList){
            if(id==emp.getEmpId()){
                return emp;
                //returned emp with ref 121
            }
        }
        return null;
    }
}
