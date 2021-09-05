package com.employee.org;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainEmployees {
    public static void main(String[] args) {
        Employees empOne = new Employees(1,"Mani",28,150000,"Manager","IT");
        Employees empTwo = new Employees(2,"Binay",29,160000,"Senior Associate","IT");
        Employees empThree = new Employees(4,"Rahul",32,170000,"Senior Manager","Marketing");
        Employees empFour = new Employees(3,"Abhishek",24,80000,"Associate","Finance");
        Employees empFive = new Employees(5,"Rajesh",38,250000,"Director","IT");
        Employees empSix = new Employees(6,"Venkat",29,100000,"Associate","Admin");
        Employees empSeven = new Employees(4,"Ram",32,140000,"Senior Manager","Marketing");
        Employees empEight= new Employees(3,"Robert",24,110000,"Associate","Finance");


        List<Employees> employeesList= new ArrayList<Employees>();
        employeesList.add(empOne);
        employeesList.add(empTwo);
        employeesList.add(empThree);
        employeesList.add(empFour);
        employeesList.add(empFive);
        employeesList.add(empSix);
        employeesList.add(empSeven);
        employeesList.add(empEight);

        System.out.println("Departments are");
        Map<String , List<Employees>> filteredOrdered = employeesList.stream().collect(Collectors.groupingBy(Employees::getDept));
        System.out.println(filteredOrdered);

        System.out.println("---------------------------------------------");
        System.out.println("Job titles are");
        Map<String , List<Employees>> filteredOrdered1 = employeesList.stream().collect(Collectors.groupingBy(Employees::getJobTitle));
        System.out.println(filteredOrdered1);

        System.out.println("----------------------------------------------");
        System.out.println("Maximum salary are");
        System.out.println("Maximum salary : " +employeesList.stream().max(Comparator.comparing(Employees::getSalary)));

        System.out.println("-----------------------------------------------");
        System.out.println("top 5 paid employees");
        employeesList.stream()
                .sorted(Comparator.comparing(Employees::getSalary)
                        .reversed()).limit(5).forEach(System.out::println);

        System.out.println("------------------------------------------------");
        System.out.println("director");
        employeesList.stream().filter(p->p.getJobTitle().equals("Director"))
                .forEach(System.out::println);

//Matching------------------------------
        System.out.println("---------------------------Matching---------------------------------------------------------");
        boolean allDepartment=employeesList.stream().allMatch(o->o.getDept().equals("IT"));
        System.out.println(allDepartment);
        boolean allDepartment1=employeesList.stream().anyMatch(o->o.getDept().equals("IT"));
        System.out.println(allDepartment1);
        boolean allDepartment3=employeesList.stream().noneMatch(o->o.getJobTitle().equals("executive"));
        System.out.println(allDepartment3);


//finding---------------------------------
        System.out.println("-------------------------finding----------------------------------------------------");
        Optional<Employees> employee1=employeesList.stream().filter(o->o.getJobTitle().equals("Associative")).findAny();
        System.out.println(employee1);

        Optional<Employees> employee=employeesList.stream().filter(o->o.getJobTitle().equals("Executive")).findAny();
        System.out.println(employee);

        employeesList.stream().filter(o->o.getJobTitle().equals("Executive")).findAny().ifPresent(System.out::println);
        employeesList.stream().filter(o->o.getJobTitle().equals("Manager")).findAny().ifPresent(System.out::println);
        employeesList.stream().filter(o->o.getJobTitle().equals("Associate")).findFirst().ifPresent(System.out::println);

//Reusing stream---------------
        System.out.println("---------------Reusing stream--------------------");
        Stream<Employees> empStream=employeesList.stream().filter(o->o.getDept().equals("IT"));
        //empStream.anyMatch(o->o.getJobTitle().equals("Executive"));
        //empStream.forEach(System.out::println);

//-------collector summing--------------
        System.out.println("------------Collector summing----------------------------------");
        Map<String,DoubleSummaryStatistics> salaryTotalByDept= employeesList.stream().collect(Collectors.groupingBy(Employees::getDept,Collectors.summarizingDouble(Employees::getSalary)));
        System.out.println(salaryTotalByDept);
     //Supplier stream----------------------
//       Supplier<Stream<Employees>> streamSupplier=Stream
    }
    }

