package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.jdbc.constants.UserAccountConstant;

public class NameByIdRunner {

	public static void main(String[] args) {
		String nameQuery1 = "select name from useraccount_table where id>10";

		try (Connection connection = DriverManager.getConnection(UserAccountConstant.URL.getValue(),
				UserAccountConstant.USER.getValue(), UserAccountConstant.PASSWORD.getValue())) {
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(nameQuery1);

			while (resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
