package day11;

import java.sql.*;

public class BasicOps {
	public static void executeSelect(Connection con,String query) {
		try {
			Statement st = con.createStatement()	;
			ResultSet records = st.executeQuery(query);
			while(records.next()) {
				System.out.println(records.getInt(1));
			}
		}catch (SQLException e) {
			System.out.println(e);
		}
	}

	public static void executeInsert(Connection con,String query, int rollno, String firstname, String lastname) {
		try {
			Statement st = con.createStatement()	;
			ResultSet records = st.executeQuery(query);
			while(records.next()) {
				System.out.println(records.getInt(1));
			}
		}catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public static void executeDelete(Connection con, String query) {
		try (Statement st = con.createStatement()) { 
			int rowsAffected = st.executeUpdate(query);
			System.out.println(rowsAffected + " row(s) deleted successfully.");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/acts1";
		Class.forName("com.mysql.cj.jdbc.Driver");
		String selectquery = "Select * from student";
		try {
			con = DriverManager.getConnection(url, "root", "dbda");
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}

	}

}
