package bck;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.sql.Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_01", "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (Connection) connection;

	}

	public Statement createStatement() {
		// TODO Auto-generated method stub
		return null;
	}

}