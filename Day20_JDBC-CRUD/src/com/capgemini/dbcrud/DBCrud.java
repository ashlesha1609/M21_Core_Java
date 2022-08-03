package com.capgemini.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBCrud {
		public static void main(String[] args) {
			String dbURL="jdbc:mysql://localhost:3360/capgemini";
			String dbUsername="root";
			String dbPassword="jenny";
			try
			{
				Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
				String query="INSERT INTO EMPLOYEE(ID,NAME,EMAIL_ID,PASSWOR)VALUES(?,?,?,?)";
				PreparedStatement p=c.prepareStatement(query);
				int r=p.executeUpdate();
				p.setInt(1, 358);
				p.setString(2, "john");
				p.setString(3, "john@gmail.com");
				p.setString(4, "john@123");
				//if row is greater than zero means at least some rows are there
				if(r>0)
				{
					System.out.println("A new user is inserted Successfully");
				}
				c.close();
			
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			
			

	}

}
