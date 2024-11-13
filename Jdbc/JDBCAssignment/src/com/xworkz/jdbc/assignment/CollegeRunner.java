package com.xworkz.jdbc.assignment;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

public class CollegeRunner {
		public static void main(String[] args) {
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String userName = "root";
			String password = "charan";
			Connection connection = null;
			try {
				 connection = (Connection) DriverManager.getConnection(url, userName, password);
				if (connection != null)
					System.out.println("connection created ");
				else
					System.out.println("connection not created");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


