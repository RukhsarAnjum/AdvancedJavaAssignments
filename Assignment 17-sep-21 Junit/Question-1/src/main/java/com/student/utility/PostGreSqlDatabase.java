package com.student.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostGreSqlDatabase {
    public static Connection getDBConnection(){
        Connection connection=null;
        try{
            connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/training", "postgres", "Abbammi20#");
            if(connection!=null){
                System.out.println("Database connected");
            }
            else{
                System.out.println("Unable to connect");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        return connection;
    }
}
