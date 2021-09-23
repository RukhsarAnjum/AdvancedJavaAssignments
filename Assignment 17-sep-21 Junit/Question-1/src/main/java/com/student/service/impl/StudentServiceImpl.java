package com.student.service.impl;

import com.student.dao.StudentDao;
import com.student.dao.impl.StudentDaoImpl;
import com.student.model.StudentPOJO;
import com.student.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    StudentDao studentDao=new StudentDaoImpl();
    @Override
    public StudentPOJO getStudentById(Integer id) {
        try{
            return studentDao.getStudentById(id);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<StudentPOJO> getAllStudent() {
        try{
            return studentDao.getAllStudent();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer insertStudent(StudentPOJO studentPOJO) {
        try{
            return studentDao.insertStudent(studentPOJO);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer updateStudent(StudentPOJO studentPOJO) {
        try{
            return studentDao.updateStudent(studentPOJO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer deleteStudent(Integer id) {
        try{
            studentDao.deleteStudent(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public List<StudentPOJO> getStudentCityWise(String city) {
        try{
            return studentDao.getStudentCityWise(city);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
