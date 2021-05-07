package com.promineo.tech.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SakilaRepository {
	private Connection conn;
	private final String Username = "root";
	private final String Password = "root";
	private final String Database = "sakila";

	public SakilaRepository()
	{
		
	}
	
	public Connection getConnection() {

		try
		{
			String connString = "jdbc:mysql://localhost:3306/" + Database;
			if (conn == null || conn.isClosed()) {
				conn = DriverManager.getConnection(connString, Username, Password);
			}
			
			return conn;
		} 
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
			return conn;
		}

	}
}
