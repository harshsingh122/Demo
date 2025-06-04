package state_eg;
import java.sql.SQLException;
import java.sql.Statement;

import bck.Connection;
public class insert {
	public static void main(String[] args) throws SQLException {
		Statement statement=Connection.getConnection().createStatement();
		statement.executeUpdate("insert into emp values(2,'tom')");
		System.out.println("inserted");
	}

}