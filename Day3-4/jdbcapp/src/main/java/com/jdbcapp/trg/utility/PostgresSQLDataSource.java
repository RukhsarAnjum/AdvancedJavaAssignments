/**
 * 
 */
package com.jdbcapp.trg.utility;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author admi
 *
 */

public class PostgresSQLDataSource {
//	public static DataSource getPostgresSQLDataSource() {
//		Properties props = new Properties();
//		FileInputStream fis = null;
//		PostgresSQLDataSource postgressqlDS = null;
//		try {
//			fis = new FileInputStream("resource/jdbc.properties");
//			props.load(fis);
//			postgressqlDS = new PostgresSQLDataSource();
//			postgressqlDS.setURL(props.getProperty("Postgres_URL"));
//			postgressqlDS.setUser(props.getProperty("Postgres_USERNAME"));
//			postgressqlDS.setPassword(props.getProperty("Postgres_PASSWORD"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return postgressqlDS;
//	}
	public static Connection getDBConnection() {
		Connection connection = null;
		try {
				connection = DriverManager.getConnection(
						"jdbc:postgresql://localhost:5432/training",
						"postgres", "Abbammi20#");

			if (connection != null) {
				System.out.println("Connected..");
			} else {
				System.out.println("Unable to connect");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
