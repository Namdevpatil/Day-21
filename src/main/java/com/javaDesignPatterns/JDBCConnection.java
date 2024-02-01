package com.javaDesignPatterns;

import java.sql.Connection;
import java.sql.DriverManager;

//singleton class: we can able to create only one instance or object
public class JDBCConnection 
{
	
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/productdb";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "DeV@1990";
	
	//private static field
	//private static JDBCConnection connection;
	
	
	//private constructor
	private JDBCConnection() 
	{
		
	}
		
	//static factory method
	public static Connection getDatabaseConnection()
	{		
		
		Connection connection = null;
		
		try
		{
			//step-1: load/register the mysql driver
			Class.forName(DRIVER_NAME);
			
			//step-2: create connection object
			connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			
		}
		catch (Exception e) 
		{
			e.getMessage();
		}		
		
		return connection;
		
	}

}
