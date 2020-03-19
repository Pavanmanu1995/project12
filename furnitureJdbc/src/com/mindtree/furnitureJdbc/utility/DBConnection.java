package com.mindtree.furnitureJdbc.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection con;
	public static Connection getConnection()
	{
		String url="jdbc:mysql://localhost:3306/furnituremanagement";
		String username="root";
		String pass="Welcome123";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,username,pass);
			if(con!=null)
			{
				System.out.println("connection is successfull");
			}
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("something went wrong");
		}
		return con;
		
	}
	
	

}
