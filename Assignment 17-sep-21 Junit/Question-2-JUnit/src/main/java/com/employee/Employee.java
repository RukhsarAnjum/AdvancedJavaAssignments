package com.employee;

import javax.persistence.criteria.CriteriaBuilder;

public class Employee {
    private Integer empId;
    private String empName;
    private String empCity;

    public Employee(){

    }
    public Employee(Integer id,String name,String city){
        empId=id;
        empName=name;
        empCity=city;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empCity='" + empCity + '\'' +
                '}';
    }
}
