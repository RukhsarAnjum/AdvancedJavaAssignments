package com.jdbcapp.trg.dao;

import com.jdbcapp.trg.model.Customer;
import com.jdbcapp.trg.utility.PostgresSQLDataSource;
import org.apache.log4j.Logger;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDAO {
	private Logger daoLogger = Logger.getLogger(CustomerDaoImpl.class);

	@Override
	public Customer getCustomerById(Integer customerId) throws SQLException {
		//try (Connection connection = MySQLDataSource.getMySQLDataSource().getConnection();
				//PreparedStatement preparedStatement = connection.prepareStatement(QueryMapper.GET_CUSTOMER_BY_ID);)
		/**
		try (Connection connection =  DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/<nameofdb>", "<username>", "<password>");
			 PreparedStatement preparedStatement = connection.prepareStatement(QueryMapper.GET_CUSTOMER_BY_ID);){
		*/
//		 try (Connection connection =  DriverManager.getConnection(
//                "jdbc:postgresql://127.0.0.1:5432/customer", "postgres", "password");
//				PreparedStatement preparedStatement = connection.prepareStatement(QueryMapper.GET_CUSTOMER_BY_ID);)
//

		 try{
			 Connection connection = PostgresSQLDataSource.getDBConnection();
			 PreparedStatement preparedStatement = connection.prepareStatement(QueryMapper.GET_CUSTOMER_BY_ID);
			 preparedStatement.setInt(1, customerId);

			 ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				Customer customer = new Customer();
				populateCustomer(customer, resultSet);
				daoLogger.info(customerId + " customer retrieved");
				return customer;
			} else {
				daoLogger.error("Customer Not found");
				throw new SQLException("Invalid CustomerId");

			}

		} catch (SQLException e) {
			daoLogger.error(e.getMessage(), e);
			e.printStackTrace();
		} catch (Exception e) {
			daoLogger.error(e.getMessage(), e);
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		Customer customer;
		List<Customer> customerList = new ArrayList<>();
//		try (Connection connection = DriverManager.getConnection(
//				"jdbc:postgresql://127.0.0.1:5432/customer", "postgres", "password");
//			 Statement statement = connection.createStatement();)
		Connection connection = PostgresSQLDataSource.getDBConnection();
		ResultSet resultSet = null;
		try
		{
			Statement statement = connection.createStatement();
			resultSet = statement.executeQuery(QueryMapper.GET_ALL_CUSTOMERS);

			while (resultSet.next()) {
				customer = new Customer();
				populateCustomer(customer, resultSet);
				customerList.add(customer);
			}
			if (customerList.size() > 0) {
				daoLogger.info("Retrieving all customers from database");
				return customerList;
			} else {
				throw new Exception("Customer table is empty");
			}
			//return;
		} catch (SQLException sqle) {
			sqle.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return customerList;
	}

	@Override
	public Integer addCustomer(Customer customer) throws SQLException {
//		try (Connection connection = DriverManager.getConnection(
//				"jdbc:postgresql://127.0.0.1:5432/customer", "postgres", "Abbammi20#");
//			 CallableStatement callableStatement = connection.prepareCall(QueryMapper.ADD_CUSTOMER)) {

		Connection connection = PostgresSQLDataSource.getDBConnection();
		ResultSet resultSet = null;

		try{
			CallableStatement callableStatement = connection.prepareCall(QueryMapper.ADD_CUSTOMER);
			callableStatement.executeQuery(QueryMapper.ADD_CUSTOMER);

			callableStatement.setInt(1, customer.getCustomerId());
			callableStatement.setString(2, customer.getCustomerName());
			// convert LocalDate to java.sql.Date
			callableStatement.setDate(3, java.sql.Date.valueOf(customer.getBirthdate()));
			callableStatement.setLong(4, customer.getMobile());
			callableStatement.setString(5, customer.getEmail());
			int n = callableStatement.executeUpdate();
			return n;
		} catch (SQLException e) {
			daoLogger.error(e.getMessage(), e);
			e.printStackTrace();
		} catch (Exception e) {
			daoLogger.error(e.getMessage(), e);
			e.printStackTrace();
		}
		return null;

	}


	private void populateCustomer(Customer customer, ResultSet resultSet) throws SQLException {
		customer.setCustomerId(resultSet.getInt("customerid"));
		customer.setCustomerName(resultSet.getString("customername"));
		customer.setBirthdate(resultSet.getDate("birthdate").toLocalDate());
		customer.setMobile(resultSet.getLong("mobile"));
		customer.setEmail(resultSet.getString("email"));

	}


	@Override
	public Integer updateCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteCustomer(Integer customerId) throws SQLException {
		Connection connection = PostgresSQLDataSource.getDBConnection();
		Integer result = -1;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QueryMapper.DELETE_CUSTOMER);
			preparedStatement.setInt(1, customerId);
			result = preparedStatement.executeUpdate();
		}catch (SQLException sqle) {
			sqle.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return result;
	}

//	public static void main(String[] args) throws SQLException {
//		System.out.println(new CustomerDaoImpl().deleteCustomer(1));
//	}

}
