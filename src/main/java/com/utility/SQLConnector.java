package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnector {
                   
	public static void getParticularData() throws SQLException {
		
		
		
		String url="jdbc:mysql://localhost:3306/employees";
		String username= "root";
		String password= "password";
		
		
		Connection connection=DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(password);
		result.next();
		
		int empno = result.getInt(0);
		System.out.println(empno);
		
		
	
	}
}
