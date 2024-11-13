package com.xworkz.jdbc.assignment;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;
public class TrainRunner {

		public static void main(String[] args) {
			
			String url="jdbc:mysql://localhost:3306/demo";
			String userName="root";
			String password="charan";
			
			String url1 = "jdbc:mysql://localhost:3306/demo";
			String userName1 = "root";
			String password1 = "charan";
			Connection connection;
			
		try {
			connection=	(Connection) DriverManager.getConnection(url1, userName1, password1);
			
			if(connection!=null) {
				System.out.println("connection created ");
			}
			else {
				System.out.println("connection not created");
			try {
				connection = (Connection) DriverManager.getConnection(url1, userName1, password1);
				if (connection != null)
					System.out.println("connection created ");
				else
					System.out.println("connection not created");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
