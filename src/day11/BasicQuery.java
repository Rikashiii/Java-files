package day11;

import java.sql.*;

public class BasicQuery {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/acts1";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String query = "create table student (\r\n"
				+ "rollNo int not null, \r\n"
				+ "firstname varchar(20) not null,\r\n"
				+ "lastname varchar(20) not null);";
		
		try {
			con = DriverManager.getConnection(url, "root", "dbda");
			System.out.println("Connection Successful");
			Statement st = con.createStatement()	;
			int count = st.executeUpdate(query);
			System.out.println(count+ "row(s) affected");
			String deleteQuery = "DELETE FROM student WHERE id = 105";
			BasicOps.executeDelete(con, deleteQuery);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}	
	}
	

}
