package com.student.dao;

import com.student.model.StudentPOJO;

import java.util.List;

public interface StudentDao {
    public StudentPOJO getStudentById(Integer id);
    public List<StudentPOJO> getAllStudent();
    public Integer insertStudent(StudentPOJO studentPOJO);
    public Integer updateStudent(StudentPOJO studentPOJO);
    public Integer deleteStudent(Integer id);
    public List<StudentPOJO> getStudentCityWise(String city);
}
