package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VerifyJdbcConnection {

    // --- Replace with your database details ---
    private static final String DB_URL = "jdbc:mysql://localhost:3306/acts1";
    private static final String USER = "root";
    private static final String PASS = "dbda";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            // 1. Load the driver class (optional in modern JDBC, but good for explicit testing)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Attempt to establish the connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // 3. If connection is successful, print a success message
            if (conn != null) {
                System.out.println("✅ Connection successful! Your JDBC setup is verified.");
            }

        } catch (ClassNotFoundException e) {
            System.err.println("❌ Verification failed: MySQL JDBC Driver not found.");
            System.err.println("Please ensure the mysql-connector-j JAR is in your classpath.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("❌ Verification failed: Could not connect to the database.");
            System.err.println("Check your DB_URL, username, password, and ensure the database is running.");
            e.printStackTrace();
        } finally {
            // 4. Close the connection
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}