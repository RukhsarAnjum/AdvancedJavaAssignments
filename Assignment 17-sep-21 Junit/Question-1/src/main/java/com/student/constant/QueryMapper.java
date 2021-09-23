package com.student.constant;

public interface QueryMapper {
    public static final String GET_STUDENT_BY_ID=
            "select * from student where id=?;";
    public static  final String GET_ALL_STUDENT=
            "select * from student;";
    public static final String INSERT_STUDENT=
            "insert into student values(?,?,?);";
    public static final String UPDATE_STUDENT=
            "update student set name=?,city=? where id=?" ;
    public static final String DELETE_STUDENT=
            "delete from student where id=?;";
    public static final String GET_STUDENT_CITY_WISE=
            "select * from student where city=?";
}
