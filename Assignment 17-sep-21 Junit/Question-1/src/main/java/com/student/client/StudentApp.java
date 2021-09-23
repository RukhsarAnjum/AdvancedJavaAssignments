package com.student.client;

import com.student.model.StudentPOJO;
import com.student.service.StudentService;
import com.student.service.impl.StudentServiceImpl;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentApp {
    StudentService studentService=new StudentServiceImpl() ;
    StudentPOJO studentPOJO=new StudentPOJO();
    Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        StudentApp studentApp=new StudentApp();
        studentApp.clientCall();
    }


    public void clientCall(){

        boolean flag=true;
        try{
            while(flag){
                System.out.println("Enter 1. get student 2. get all student 3. add student 4. update student 5. delete student " +
                        "6.city's wise student 7.sorted details by name 8.sorted details by city 8.exit");
                Integer option=scanner.nextInt();

                switch (option){
                    case 1:
                        System.out.println("Enter customer id");
                        Integer id=scanner.nextInt();
                        studentPOJO =studentService.getStudentById(id);
                        if(studentPOJO!=null){
                            System.out.println("Details are : "+studentPOJO);
                        }
                        else{
                            System.out.println("Invalid id");
                        }
                        break;
                    case 2:
                        List<StudentPOJO> list=studentService.getAllStudent();
                        System.out.println(list);
                        break;
                    case 3:

                        System.out.println("Enter student id");
                        id=scanner.nextInt();
                        studentPOJO.setId(id);

                        System.out.println("Enter student name");
                        String name=scanner.next();
                        studentPOJO.setName(name);

                        System.out.println("Enter city");
                        String city=scanner.next();
                        studentPOJO.setCity(city);
                        Integer n=studentService.insertStudent(studentPOJO);
//                System.out.println(n);
                        if(n==1){
                            System.out.println("Data inserted successfully");
                        }else{
                            System.out.println("Data insertion failed");
                        }
                        break;

                    case 4:
                        try{
                            System.out.println("Enter student id");
                            id=scanner.nextInt();
                            studentPOJO.setId(id);

                            System.out.println("Enter student name");
                            name=scanner.next();
                            studentPOJO.setName(name);

                            System.out.println("Enter city");
                            city=scanner.next();
                            studentPOJO.setCity(city);
                            n=studentService.updateStudent(studentPOJO);
                            if(n==1){
                                System.out.println("Data updated successfully");
                            }else{
                                System.out.println("Id is invalid");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 5:
                        System.out.println("Enter customer id");
                        id=scanner.nextInt();
                        n =studentService.deleteStudent(id);
//                    System.out.println(n);
                        if(n==1){
                            System.out.println("Student data deleted successfully");
                        }else{
                            System.out.println("Id is invalid");
                        }
                        break;
                    case 6:

                        System.out.println("Enter city");
                        city=scanner.next();
//                studentPOJO.setCity(city);
                        list=studentService.getStudentCityWise(city);
                        System.out.println(list);
                        break;

                    case 7:
                        list=studentService.getAllStudent();
                        List<StudentPOJO> sortedlistByName=list.stream().
                                sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());

                        System.out.println(sortedlistByName);
                        break;

                    case 8:
                        list=studentService.getAllStudent();
                        List<StudentPOJO> sortedlistByCity=list.stream().
                                sorted((o1, o2) -> o1.getCity().compareTo(o2.getCity())).collect(Collectors.toList());

                        System.out.println(sortedlistByCity);
                        break;


                    default:
                        System.out.println("Wrong input");
                        break;
                }
            }



        } catch (Exception e) {
            e.printStackTrace();
        }


        }
    }

