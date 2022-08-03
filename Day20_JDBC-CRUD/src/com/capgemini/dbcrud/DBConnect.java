package com.capgemini.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static void main(String[] args) {
		String dbURL="jdbc:mysql//localhost:3360/capgemini";
		String dbUsernamr="root";
		String dbPassword="jenny";
		try
		{
			Connection c=DriveManager.getConnection(dbURL, dbUsername, dbPassword);
			if()
			
		}
		
	}
	
	
	
	

}
