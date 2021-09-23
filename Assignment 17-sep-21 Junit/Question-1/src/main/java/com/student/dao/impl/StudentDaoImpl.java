package com.student.dao.impl;

import com.student.constant.QueryMapper;
import com.student.dao.StudentDao;
import com.student.model.StudentPOJO;
import com.student.utility.PostGreSqlDatabase;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    public StudentPOJO getStudentById(Integer id) {
        try (Connection connection = PostGreSqlDatabase.getDBConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(QueryMapper.GET_STUDENT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                StudentPOJO studentPOJO = new StudentPOJO();
                populateStudent(studentPOJO, resultSet);
                return studentPOJO;
            } else {
               // System.out.println("Student id is invalid");
                throw new RuntimeException("Student id is invalid");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;

    }

    private void populateStudent(StudentPOJO studentPOJO, ResultSet resultSet) throws SQLException {
        studentPOJO.setId(resultSet.getInt("id"));
        studentPOJO.setName(resultSet.getString("name"));
        studentPOJO.setCity(resultSet.getString("city"));
    }

    public List<StudentPOJO> getAllStudent() {
        List<StudentPOJO> studentList = new ArrayList<>();
        try (Connection connection = PostGreSqlDatabase.getDBConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(QueryMapper.GET_ALL_STUDENT);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                StudentPOJO studentPOJO = new StudentPOJO();
                populateStudent(studentPOJO, resultSet);
                studentList.add(studentPOJO);
            }
            return studentList;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public Integer insertStudent(StudentPOJO studentPOJO) {
        Integer result = 0;
        try (Connection connection = PostGreSqlDatabase.getDBConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(QueryMapper.INSERT_STUDENT);
            preparedStatement.setInt(1, studentPOJO.getId());
            preparedStatement.setString(2, studentPOJO.getName());
            preparedStatement.setString(3, studentPOJO.getCity());

            result = preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }

    public Integer updateStudent(StudentPOJO studentPOJO) {
        Integer result = 1;
        try (Connection connection = PostGreSqlDatabase.getDBConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(QueryMapper.UPDATE_STUDENT);
            preparedStatement.setString(1, studentPOJO.getName());
            preparedStatement.setString(2, studentPOJO.getCity());
            preparedStatement.setInt(3, studentPOJO.getId());
            result = preparedStatement.executeUpdate();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Integer deleteStudent(Integer id) {
        Integer result = 1;
        try (Connection connection = PostGreSqlDatabase.getDBConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(QueryMapper.DELETE_STUDENT);
            preparedStatement.setInt(1, id);
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<StudentPOJO> getStudentCityWise(String city) {
        StudentPOJO studentPOJO = null;
        List<StudentPOJO> cityWiseStudentList = new ArrayList<>();
        try (Connection connection = PostGreSqlDatabase.getDBConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(QueryMapper.GET_STUDENT_CITY_WISE);
            preparedStatement.setString(1,city);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                studentPOJO = new StudentPOJO();
                populateStudent(studentPOJO, resultSet);
                cityWiseStudentList.add(studentPOJO);
            }
            return cityWiseStudentList;


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}

